package ppsr2dcatlauncher;

import java.io.IOException;

import javax.xml.datatype.DatatypeConfigurationException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;


import ualberta.edu.guana.tools.atl.ATLLauncher;

public class Runner {
	
	boolean part1done = false;
	boolean part2done = false;
	boolean part3done = false;
	InputStream input;
	String jsonIN;
	String xmiOUT;
	String ecoreIN;
	String ecoreOUT;
	String dcatcsXMI;
	String atlEsp;
	String atlModule;
	String path;
		//Path for the origin JSON file from PPSR 
		
	
	/**
	 * 
	 */
	public Runner(String path){

		this.path = path;		
		try {
			input = new FileInputStream(path + "/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jsonIN = path + prop.getProperty("ppsr.json");
		System.out.println("JSON file to load from: " + jsonIN);
		//Path for writing the XMI instance loaded from the JSON
		xmiOUT = path + prop.getProperty("ppsr.minstance");
		System.out.println("PPSR M Instance file to load from: " + xmiOUT);
		//PPSR metamodel ecore file path
		ecoreIN = path + prop.getProperty("ppsr.mm");
		//DCATCS metamodel ecore file path
		ecoreOUT = path + prop.getProperty("dcatcs.mm");
		//XMI of DCATCS obtained by the transformation
		dcatcsXMI = path + prop.getProperty("dcatcs.minstance");
		//Path of the transformation ATL rules
		atlEsp = path + prop.getProperty("transf.dir");
		//Name of the ATL module
		atlModule = "ppsr2dcatcs";
	}
		
	public synchronized void part1() throws IOException, DatatypeConfigurationException
    {
        System.out.println("STEP1: Loading and transform from JSON to XMI as instance of PPSR metamodel");
		//Loading and transform from JSON to XMI as instance of PPSR metamodel
		ParserManager pm = new ParserManager();
		pm.runTransfJSON2XMI(jsonIN,ecoreIN, xmiOUT);
        part1done = true;
        System.out.println(
            "Thread STEP1 about to surrender lock");
        // notify the waiting thread, if any
        notify();
    }

	public synchronized void part2()
    {
        // loop to prevent spurious wake-up
        while (!part1done) {
            try {
                System.out.println("Thread STEP2 waiting");
                // wait till notify is called
                wait();
                System.out.println(
                    "Thread STEP2 running again");
            }
            catch (Exception e) {
                System.out.println(e.getClass());
            }
        }
		ATLLauncher launcher = new ATLLauncher();
				//Registering metamodels
				launcher.registerInputMetamodel(ecoreIN);
				launcher.registerOutputMetamodel(ecoreOUT);
			
				//Launching ATL transformation between metamodels
				launcher.launch(ecoreIN,xmiOUT, ecoreOUT, dcatcsXMI, atlEsp, atlModule);
				System.out.println("Transformation success, file generated: " + dcatcsXMI );
        //System.out.println("Do visit Taj Mahal");
		part2done = true;
		System.out.println(
                    "Thread STEP2 completed");
		notify();
    }

	public synchronized void part3() throws IOException
    {
        // loop to prevent spurious wake-up
        while (!part2done) {
            try {
                System.out.println("Thread STEP3 waiting");
                // wait till notify is called
                wait();
                System.out.println(
                    "Thread STEP3 running again");
            }
            catch (Exception e) {
                System.out.println(e.getClass());
            }
        }
        try {
			LoadFromXMI.main(null);
		} catch (Exception e) {
			System.out.println("An error has ocurred executing STEP3");
			return;
		}
		
		part3done = true;
		System.out.println("Finishing STEP3 - DCATCS serialized generated");
		notify();
    }

	public synchronized void part4()
    {
        // loop to prevent spurious wake-up
        while (!part3done) {
            try {
                System.out.println("Thread STEP4 waiting");
                // wait till notify is called
                wait();
				
                System.out.println(
                    "Thread t4 running again");
            }
            catch (Exception e) {
                System.out.println(e.getClass());
            }
        }
		try {
			ShaclValidator.main(new String[0]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("STEP4 completed RDF output was validated");
		notify();
    }
	
}
