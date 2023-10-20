/**
 */
package ppsr2dcatlauncher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Properties;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.util.ModelBuilder;
import org.eclipse.rdf4j.model.vocabulary.DCAT;
import org.eclipse.rdf4j.model.vocabulary.DCTERMS;
import org.eclipse.rdf4j.model.vocabulary.FOAF;
import org.eclipse.rdf4j.model.vocabulary.GEO;
import org.eclipse.rdf4j.model.vocabulary.LOCN;
import org.eclipse.rdf4j.model.vocabulary.PROV;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;


import dcatcs.CSCatalog;
import dcatcs.CSDataset;
import dcatcs.CatalogRecord;
import dcatcs.Dataset;
import dcatcs.DcatcsFactory;
import dcatcs.DcatcsPackage;
import dcatcs.Distribution;
/**
 * <!-- begin-user-doc -->
 * A sample utility for the '<em><b>dcatcs</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadFromXMI {
	/**
	 * <!-- begin-user-doc -->
	 * Load all the argument file paths or URIs as instances of the model.
	 * <!-- end-user-doc -->
	 * @param args the file paths or URIs.
	 * @throws IOException 
	 * @generated
	 */
	static String path;
	static Properties prop;
	
	public static void main(String[] args) throws IOException {

		path = "/home/rey/eclipse-workspace/ppsr2dcatcs";
		
		
		InputStream input = new FileInputStream(path + "/config.properties");
		prop = new Properties();
		prop.load(input);
		args = new String[1];
		args[0] = path + prop.getProperty("dcatcs.minstance");
		String rdfout = path + prop.getProperty("dcatcs.rdf");
		// Create a resource set to hold the resources.
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(DcatcsPackage.eNS_URI, 
			 DcatcsPackage.eINSTANCE);
        
		// If there are no arguments, emit an appropriate usage message.
		//
		if (args.length == 0) {
			System.out.println("Enter a list of file paths or URIs that have content like this:");
			try {
				Resource resource = resourceSet.createResource(URI.createURI("http:///My.dcatcs"));
				Dataset root = DcatcsFactory.eINSTANCE.createDataset();
				resource.getContents().add(root);
				resource.save(System.out, null);
			}
			catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		else {
			// Iterate over all the arguments.
			//
			for (int i = 0; i < args.length; ++i) {
				// Construct the URI for the instance file.
				// The argument is treated as a file path only if it denotes an existing file.
				// Otherwise, it's directly treated as a URL.
				//
				File file = new File(args[i]);
				URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(args[i]);

				try {
					// Demand load resource for this file.
					//
					Resource resource = resourceSet.getResource(uri, true);
					System.out.println("Loaded " + uri);

					//Loading XMI file to a Resource Set
					ResourceSet resSet = new ResourceSetImpl();      
					resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
					XMIResource updatedModel =(XMIResource)resSet.getResource(uri, true);
					
					//Creating the model Builder for creating RDF support
					ModelBuilder builder = new ModelBuilder();
					builder.setNamespace(FOAF.NS);
					builder.setNamespace(DCAT.NS);
					builder.setNamespace(DCTERMS.NS);
					builder.setNamespace(PROV.NS);
					builder.setNamespace(LOCN.NS);
					builder.setNamespace("geosparql", "http://www.opengis.net/ont/geosparql#");
					builder.setNamespace("proj:ResearchProject", "https://linked.data.gov.au/def/project#ResearchProject");
					
					//The xmi model has a CSCatalog with they projects, Datasets and Distributions
					CSCatalog cat = (CSCatalog) updatedModel.getContents().get(0);
					builder.namedGraph("cs:catalog").subject("cs:"+ cat.getIdentifier().toString())
					.add(RDF.TYPE, DCAT.CATALOG)
					.add(DCTERMS.TITLE, cat.getTitle());
					builder.defaultGraph().subject("cs:"+ cat.getIdentifier().toString());
					//iteration over csprojects collection
					cat.getCsproject().forEach(projectElement -> {
						String pjSubject = "cs:"+ projectElement.getIdentifier().toString();
						builder.namedGraph("cs:catalog").subject("cs:"+ cat.getIdentifier().toString()).add("cs:project", projectElement.getIdentifier().toString());
						builder.namedGraph("cs:project").subject(pjSubject).add(RDF.TYPE, "cs:project")
						.add(DCTERMS.ABSTRACT, projectElement.getProjectAim());
						if(projectElement.getProjectDateCreated()!=null)
							builder.namedGraph("cs:project").subject(pjSubject)
							.add(DCTERMS.ISSUED, projectElement.getProjectDateCreated().toString());
						if(projectElement.getProjectStartDate()!=null)
							builder.namedGraph("cs:project").subject(pjSubject)
							.add(PROV.STARTED_AT_TIME, projectElement.getProjectStartDate().toString());
						//adding contacts
						projectElement.getContacts().forEach(contact -> {
							builder.namedGraph("cs:project").subject(pjSubject)
							.add(DCAT.CONTACT_POINT, "contact")
							.add(DCTERMS.CREATOR, contact.getContactName())
							.add(FOAF.ONLINE_ACCOUNT, contact.getContactDetails())
							;
						});
						
						//adding geographic location
						projectElement.getProjectgeographiclocation().forEach(geo -> {
							builder.namedGraph("cs:project").subject(pjSubject)
							.add(DCTERMS.LOCATION, "geographicLocation")
							.add(GEO.WKT_LITERAL, geo.getProjectPinLatitude().toPlainString() + " "+ geo.getProjectPinLongitude().toPlainString())
							.add(GEO.WKT_LITERAL, geo.getProjectGeographicCoverage())
							;
						});
						
						////adding project media
						projectElement.getProjectmedia().forEach(media -> {
							builder.namedGraph("cs:project").subject(pjSubject)
							.add(FOAF.IMAGE, "projectMedia")
							.add(DCTERMS.MEDIA_TYPE_OR_EXTENT, media.getProjectMediaType())
							.add(DCTERMS.SOURCE, media.getProjectMediaFile())
							.add(DCTERMS.CREATOR, media.getProjectMediaCredit())
							;
						});
					});
					
					for (int j = 1; j < updatedModel.getContents().size(); j++) {	
						Object modelElem = updatedModel.getContents().get(j);
							//adding datasets
							if (modelElem instanceof CSDataset) {
							CSDataset data = (CSDataset) modelElem;
							builder.namedGraph("cs:catalog").subject("cs:"+ cat.getIdentifier().toString())
							.add(DCAT.DATASET, data.getIdentifier());
							builder.namedGraph("dcat:Dataset").subject(":"+data.getIdentifier())
							.add(RDF.TYPE, DCAT.DATASET)
							.add(PROV.WAS_GENERATED_BY, data.getIdentifier())
							.add(DCTERMS.ABSTRACT, data.getAbstract())
							//.add(DCAT.TEMPORAL_RESOLUTION, data.getAccrualPeriodicity());
							.add(DCTERMS.DESCRIPTION, data.getDescription())
							.add(FOAF.PLAN, data.getDataQualityAssuranceMethod());
							//adding distributions
							
							data.getDistribution().forEach(dist -> {
								builder.namedGraph("dcat:Dataset").subject(":"+data.getIdentifier())
								.add(RDF.TYPE, DCAT.DISTRIBUTION)
								.add(DCAT.DOWNLOAD_URL, dist.getDownloadURL())
								.add(DCTERMS.LICENSE, dist.getLicense())
								.add(DCTERMS.FORMAT, dist.getFormat());
								try {
									checkDataService(dist, builder);
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							});
							
							data.getDistribution().forEach(dist -> {
								
							});
						}
							if (modelElem instanceof CatalogRecord) {
								CatalogRecord record = (CatalogRecord) modelElem;
								//Define if properties are well defined as this class is optional in DCAT
							}
					}
				   
				    // return and serialize the Model object
				    Model m = builder.build();
				    FileOutputStream out1 = new FileOutputStream(rdfout);
				    Rio.write(m, out1, RDFFormat.TURTLE);
					for (EObject eObject : resource.getContents()) {
						Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
						if (diagnostic.getSeverity() != Diagnostic.OK) {
							printDiagnostic(diagnostic, "");
						}
						else 
							System.out.println("Valid content: " + eObject.eClass().getName());
					}
				}
				catch (RuntimeException exception) {
					System.out.println("Problem loading " + uri);
					exception.printStackTrace();
				}
			}
		}
		
	}
	
	private  static void checkDataService(Distribution dist, ModelBuilder builder) throws IOException {
		if(dist.getFormat().equals("CSV")) {
			String title = dist.getTitle().replaceAll(" ", "");
			System.out.print(title);
			builder.namedGraph("dcat:Dataservice").subject(":"+dist.getDownloadURL())
			.add(RDF.TYPE, DCAT.DATA_SERVICE)
			.add(DCAT.ENDPOINT_DESCRIPTION, dist.getDescription())
			.add(DCAT.ACCESS_SERVICE, prop.getProperty("api.basedir") + title);
			URL website = new URL(dist.getDownloadURL());
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(dist.getTitle().concat(".csv"));
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			fos.close();
			//Calling the java proccess for generating the APIs from the CSVs downloaded
			Process proc = Runtime.getRuntime().exec("java -jar "+ path + "/apigen/ag.jar csv2api" + title.concat(".csv"));
			proc.destroy();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Prints diagnostics with indentation.
	 * <!-- end-user-doc -->
	 * @param diagnostic the diagnostic to print.
	 * @param indent the indentation for printing.
	 * @generated
	 */
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}

} //DcatcsExample
