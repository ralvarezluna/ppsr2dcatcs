package ppsr2dcatlauncher;

import java.io.IOException;

import javax.xml.datatype.DatatypeConfigurationException;

import java.io.FileOutputStream;

import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.model.util.ModelBuilder;
import org.eclipse.rdf4j.model.vocabulary.DCAT;
import org.eclipse.rdf4j.model.vocabulary.FOAF;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.RDFHandlerException;
import org.eclipse.rdf4j.rio.RDFWriter;
import org.eclipse.rdf4j.rio.Rio;

import ualberta.edu.guana.tools.atl.ATLLauncher;

public class runner {

	public static void main(String[] args) throws IOException {
		
		ParserManager pm = new ParserManager();
		//Path for the origin JSON file from PPSR 
		String jsonIN = "/home/rey/eclipse-workspace/ppsr2dcatlauncher/testfiles/input_projects.json";
		//Path for writing the XMI instance loaded from the JSON
		String xmiOUT = "/home/rey/eclipse-workspace/ppsr2dcatlauncher/testfiles/ppsrcore.xmi";
		//PPSR metamodel ecore file path
		String ecoreIN = "/home/rey/eclipse-workspace/ppsr2dcatlauncher/metamodels/ppsr_metamodel.ecore";
		//DCATCS metamodel ecore file path
		String ecoreOUT = "/home/rey/eclipse-workspace/ppsr2dcatlauncher/metamodels/dcatcs_metamodel.ecore";
		//XMI of DCATCS obtained by the transformation
		String dcatcsXMI = "/home/rey/eclipse-workspace/ppsr2dcatlauncher/testfiles/dcatcs.xmi";
		//Path of the transformation ATL rules
		String atlEsp = "/home/rey/eclipse-workspace/ppsr2dcatlauncher/transf/";
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
			
		} catch (IOException | DatatypeConfigurationException e) {
			
			e.printStackTrace();
		}
		
	

	}
	
	
}
