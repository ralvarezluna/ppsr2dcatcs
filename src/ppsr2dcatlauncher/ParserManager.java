package ppsr2dcatlauncher;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.JSONArray;
import org.json.JSONObject;

import ppsr_coremetamodel.*;





public class ParserManager {
	
	ProgramOrCampaign program;
	CSProject csproject;
	DmmCoreTerms dct;
	ContactPoint cp;
	ProjectMedia pm;
	ProjectGeographicLocation pgeo;
	Activity act;
	DatasetMetadataSchema dt;
	MethodSpecification method;
	DmmExtensionTerms dextt;
	
	private static final Pattern urlPattern = Pattern.compile(
	        "(?:^|[\\W])((ht|f)tp(s?):\\/\\/|www\\.)"
	                + "(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)*"
	                + "[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)",
	        Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);

	public ParserManager() {
		
		program = ppsrmetamodelFactory.eINSTANCE.createProgramOrCampaign();
		
		
	}
	
	public void runTransfJSON2XMI(String jsource,String ecore, String xmiOut) 
			throws IOException, DatatypeConfigurationException
	{
		//Remember that this step is customized for the json schema implemented by 
		//Scitarter for PPSR, you will need to adjust it if the structure or terms change.

		JSONObject jobject;
		if(validatePath(jsource)) {
			jobject= loadJSON(jsource);
			buildModel(jobject);
			createModelInstance(ecore, xmiOut);
		}
		
	}
	
	private JSONObject loadJSON(String jsource) throws IOException
	{
        	InputStream is = new FileInputStream(jsource);
            String jsonTxt = IOUtils.toString(is, "UTF-8");
            System.out.println(jsonTxt);
            JSONObject json = new JSONObject(jsonTxt);       
            return json;    
	}
	
	
	private void buildModel(JSONObject json) throws DatatypeConfigurationException
	{
		//Creating ProgramOrCampaign instance
		program.setProgramName(json.getString("name"));
        program.setLanguage("en");
        program.setProgramId("Generate ID");
        
        JSONArray ja =(JSONArray)json.get("entities");
        
		for (int i = 0; i < ja.length(); i++) {
				JSONObject aux = ja.getJSONObject(i);
				csproject = ppsrmetamodelFactory.eINSTANCE.createCSProject();
				csproject.setProjectId(aux.getString("guid"));
				Long date = aux.getLong("created");
				csproject.setProjectDateCreated(new Date(date));
				date = aux.getLong("updated");
				csproject.setProjectLastUpdatedDate(new Date(date));
				csproject.setProjectName(aux.getString("name"));
				csproject.setProjectAim(aux.getString("goal"));
				csproject.setProjectDescription(aux.getString("description"));
				csproject.setHasTag(readJSONComplexObjects(aux, "topics","label"));
				csproject.setDifficultyLevel(readJSONComplexObjects(aux,"difficulty","label"));
				csproject.setProjectStatus(readJSONComplexObjects(aux,"status","label"));
				if(!aux.get("begin").equals(null))
				date = aux.getLong("begin");
				csproject.setProjectStartDate(new Date(date));
				if(!aux.get("end").equals(null))
				date = aux.getLong("end");
				csproject.setProjectEndDate(new Date(date));
				// project duration, as calculate value is not necesary to calc here
				csproject.setProjectScienceType(readJSONComplexObjects(aux, "fields_of_science","label"));
				csproject.setProjectUrl(aux.getString("url"));
				csproject.setProjectScienceType(readJSONComplexObjects(aux, "united_nations_region","label"));
				csproject.setLanguage(program.getLanguage());
				csproject.setKeywords(readJSONComplexObjects(aux, "tags",""));
				csproject.setProjectResponsiblePartyName(aux.getString("presenter"));
				
				//Adding project media references to csproject
				ProjectMedia pmedia = ppsrmetamodelFactory.eINSTANCE.createProjectMedia();
				pmedia.setProjectMediaCredit(aux.getString("image_credit"));
				pmedia.setProjectMediaFile(aux.getString("image"));
				pmedia.setProjectMediaType("Image");
				ProjectMedia pmedia1 = ppsrmetamodelFactory.eINSTANCE.createProjectMedia();
				pmedia1.setProjectMediaCredit(aux.getString("presenter"));
				pmedia1.setProjectMediaFile(aux.getString("video_url"));
				pmedia1.setProjectMediaType("Video");
				
				csproject.getProjectmedia().add(pmedia);
				csproject.getProjectmedia().add(pmedia1);
				
				//Adding geographic references to csproject
				//The model loaded only defines a coordinate point, for that reason is repeated for both attributes
				ProjectGeographicLocation pgeo = ppsrmetamodelFactory.eINSTANCE.createProjectGeographicLocation();
				pgeo.setProjectPinLatitude(readJSONDecimalObjects(aux, "point",0));
				pgeo.setProjectPinLongitude(readJSONDecimalObjects(aux, "point",1));
				if(!aux.get("regions").equals(null))
				pgeo.setProjectGeographicCoverage(aux.getString("regions"));
				else pgeo.setProjectGeographicCoverage("undefined");
				pgeo.setProjectGeographicCoverageCentroidLatitude(readJSONDecimalObjects(aux, "point",0));
				pgeo.setProjectGeographicCoverageCentroidLongitude(readJSONDecimalObjects(aux, "point",0));
	
				csproject.getProjectgeographiclocation().add(pgeo);
				
				ContactPoint pcontact = ppsrmetamodelFactory.eINSTANCE.createContactPoint();
				ContactPoint pcontact1 = ppsrmetamodelFactory.eINSTANCE.createContactPoint();
				ContactPoint pcontact2 = ppsrmetamodelFactory.eINSTANCE.createContactPoint();
				if(!aux.get("twitter_name").equals(null))
				{
				pcontact.setContactDetails(aux.getString("twitter_name"));
				pcontact.setContactName(aux.getString("presenter"));
				pcontact.setContactPointType("Twitter");
				pcontact.setMeansOfContact(aux.getString("twitter_name"));
				}
				
				if(!aux.get("facebook_page").equals(null))
				{
				pcontact1.setContactDetails(aux.getString("facebook_page"));
				pcontact1.setContactName(aux.getString("presenter"));
				pcontact1.setContactPointType("Facebook");
				pcontact1.setMeansOfContact(aux.getString("facebook_page"));
				}
				
				if(!aux.get("instagram_page").equals(null))
				{
				pcontact2.setContactDetails(aux.getString("instagram_page"));
				pcontact2.setContactName(aux.getString("presenter"));
				pcontact2.setContactPointType("Instagram");
				pcontact2.setMeansOfContact(aux.getString("instagram_page"));
				}
				
				csproject.getContactpoint().add(pcontact);
				csproject.getContactpoint().add(pcontact1);
				csproject.getContactpoint().add(pcontact2);
				
				Activity pactivity = ppsrmetamodelFactory.eINSTANCE.createActivity();
				//Activity ID must be a unique identifier, but the json defines an string
				if(!aux.get("task").equals(null))
				pactivity.setActivityId(aux.getString("task"));
				
				DatasetMetadataSchema dschema = ppsrmetamodelFactory.eINSTANCE.createDatasetMetadataSchema();
				if(!aux.get("metadata_publication_url").equals(null))
				dschema.setObservationalDataModel(aux.getString("metadata_publication_url"));
				
				DmmCoreTerms dmm = ppsrmetamodelFactory.eINSTANCE.createDmmCoreTerms();
				dmm.setDataAccessMethod(readJSONComplexObjects(aux, "data_aggregation", "label"));
				if(!aux.get("data_publication_url").equals(null))
				dmm.setIdentifier(aux.getString("data_publication_url"));
				dmm.setLicense(aux.getString("data_license"));
				dmm.setAccessRights(readJSONComplexObjects(aux, "data_access", "label"));
				dmm.setDataAccessMethod(readJSONComplexObjects(aux, "data_consent", "label"));
				dmm.setAbstract(aux.getString("data_results"));
				
			
				DmmExtensionTerms dmmext = ppsrmetamodelFactory.eINSTANCE.createDmmExtensionTerms();
				Boolean b = aux.getBoolean("data_quality");
				if(!aux.get("data_publication_url").equals(null))
				dmmext.setDownloadURL(aux.getString("data_publication_url"));
				dmmext.setDataQualityAssuranceMethod(b.toString());
				
				
				MethodSpecification method = ppsrmetamodelFactory.eINSTANCE.createMethodSpecification();
						
				String s="";
				if(!aux.get("participant_files").equals(null)) {
					s = readJSONComplexObjects(aux, "participant_files", "Time to Restore priority species");
					method.setMethodDocUrl(extractURL(s));
				}
				method.setSamplingProtocolMethod(readJSONComplexObjects(aux, "practices", "label"));
				method.setMethodAbstract(aux.getString("practices_how"));
				
				dschema.getDmmcoreterms().add(dmm);
				dschema.getDmmextensionterms().add(dmmext);
				dschema.setMethodspecification(method);
				pactivity.setDatasetmetadataschema(dschema);
				
				csproject.getActivity().add(pactivity);
				//Adding csproject instance to program collection
				program.getCsproject().add(csproject);
				
		}
        System.out.println("Proyectos cargados"); 
        System.out.println(program.getCsproject().size()); 
        
	}
 
	private boolean createModelInstance(String ecore, String xout) throws IOException
	{	
		ResourceSet resourseSet = new ResourceSetImpl();
		
		resourseSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		    ("*", new XMIResourceFactoryImpl());
	   
	    Resource res = resourseSet.createResource(URI.createFileURI(ecore));
	    res.load(null);
	    
	    EPackage metapackage = (EPackage)res.getContents().get(0);
	    System.out.println("Meta Package Name "+metapackage.getName());
	    
	    resourseSet.getPackageRegistry().put(metapackage.getNsURI(), 
	    metapackage); 
	   
	   
	    
		try {
			File xmiFile = new File(xout);
			xmiFile.createNewFile();
			FileOutputStream oFile = new FileOutputStream(xmiFile, false);
			res = resourseSet.createResource(URI.createURI(xout));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res.getContents().add(program);
	    
	    Map options = new HashMap();
	    options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
	    try 
	    {
	        res.save(options);
	    } catch (IOException e) {
	        // TODO: handle exception
	        e.printStackTrace();
	    }
	    
		return false;
		
	}
	
	private boolean validatePath(final String source) {
		File f = new File(source);
		return f.exists();
		
	}
	
	private String readJSONComplexObjects(JSONObject forRead, String entity, String subEntity)
	{
		ArrayList<String> res = new ArrayList<>();
		Object readed = forRead.get(entity);
		if(readed instanceof JSONObject)
		{ 
			JSONObject jo = forRead.getJSONObject(entity);
			if(!jo.isEmpty()) {
				res.add(jo.getString(subEntity));
		}
							 	
		}
		else
		{
			JSONArray jaux = forRead.getJSONArray(entity);
			if(!jaux.isEmpty())
			{
				for (int j = 0; j < jaux.length(); j++) {
					if(jaux.get(j) instanceof JSONObject)
					res.add(jaux.getJSONObject(j).getString(subEntity));
					else
						res.add(jaux.getString(j));
				}
			}
		}
		return (res.size()!=1)?res.toString():res.get(0);
	}
	
	private BigDecimal readJSONDecimalObjects(JSONObject forRead, String entity,int index)
	{
			ArrayList<BigDecimal> res = new ArrayList<>();
			JSONArray jaux = null;
			if(!forRead.get(entity).equals(null)) {
			jaux = forRead.getJSONArray(entity);
			if(!jaux.isEmpty())
			{
				for (int j = 0; j < jaux.length(); j++) {
						res.add(jaux.getBigDecimal(j));
				}
			}
			}
		
		return (!res.isEmpty())?res.get(index):new BigDecimal("0");
	}
	
	private String extractURL(String text)
	{
		int matchStart = 0,matchEnd = 0;
		
		Matcher matcher = urlPattern.matcher(text);
		while (matcher.find()) {
		    matchStart = matcher.start(1);
		    matchEnd = matcher.end();
		    // now you have the offsets of a URL match
		}
		return text.substring(matchStart, matchEnd);
	}
	
}
