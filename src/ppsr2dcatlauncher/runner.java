package ppsr2dcatlauncher;

import java.io.IOException;

import javax.xml.datatype.DatatypeConfigurationException;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


import ualberta.edu.guana.tools.atl.ATLLauncher;

public class runner {

	public static void main(String[] args) throws IOException {
		
		ParserManager pm = new ParserManager();
		//Path for the origin JSON file from PPSR 
		String path = new File("").getAbsolutePath();
		InputStream input = new FileInputStream(path + "/config.properties");
		Properties prop = new Properties();
		prop.load(input);
		String jsonIN = path + prop.getProperty("ppsr.json");
		System.out.println("JSON file to load from: " + jsonIN);
		//Path for writing the XMI instance loaded from the JSON
		String xmiOUT = path + prop.getProperty("ppsr.minstance");
		System.out.println("PPSR M Instance file to load from: " + xmiOUT);
		//PPSR metamodel ecore file path
		String ecoreIN = path + prop.getProperty("ppsr.mm");
		//DCATCS metamodel ecore file path
		String ecoreOUT = path + prop.getProperty("dcatcs.mm");
		//XMI of DCATCS obtained by the transformation
		String dcatcsXMI = path + prop.getProperty("dcatcs.minstance");
		//Path of the transformation ATL rules
		String atlEsp = path + prop.getProperty("transf.dir");
		//Name of the ATL module
		String atlModule = "ppsr2dcatcs";
		ATLLauncher launcher = new ATLLauncher();
		
	
		try {
			//Loading and transform from JSON to XMI 
			pm.runTransfJSON2XMI(jsonIN,ecoreIN, xmiOUT);
			//Registering metamodels
			
			launcher.registerInputMetamodel(ecoreIN);
			launcher.registerOutputMetamodel(ecoreOUT);
			//Launching ATL transformation
			launcher.launch(ecoreIN,xmiOUT, ecoreOUT, dcatcsXMI, atlEsp, atlModule);
			System.out.println("Transformation success, file generated: " + dcatcsXMI );
		} catch (IOException | DatatypeConfigurationException e) {
			
			e.printStackTrace();
		}
		//If you require load more than 1 file, put in args all the file paths
		args = new String[1];
		args[0] = dcatcsXMI;
		LoadFromXMI.main(args);
	
		
	}
	
	
}
