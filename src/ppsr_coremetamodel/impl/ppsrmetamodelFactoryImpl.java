/**
 */
package ppsr_coremetamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ppsr_coremetamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ppsrmetamodelFactoryImpl extends EFactoryImpl implements ppsrmetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ppsrmetamodelFactory init() {
		try {
			ppsrmetamodelFactory theppsrmetamodelFactory = (ppsrmetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(ppsrmetamodelPackage.eNS_URI);
			if (theppsrmetamodelFactory != null) {
				return theppsrmetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ppsrmetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ppsrmetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ppsrmetamodelPackage.DMM_CORE_TERMS: return createDmmCoreTerms();
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN: return createProgramOrCampaign();
			case ppsrmetamodelPackage.CONTACT_POINT: return createContactPoint();
			case ppsrmetamodelPackage.PROJECT_MEDIA: return createProjectMedia();
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION: return createProjectGeographicLocation();
			case ppsrmetamodelPackage.ACTIVITY: return createActivity();
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA: return createDatasetMetadataSchema();
			case ppsrmetamodelPackage.METHOD_SPECIFICATION: return createMethodSpecification();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS: return createDmmExtensionTerms();
			case ppsrmetamodelPackage.CS_PROJECT: return createCSProject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmmCoreTerms createDmmCoreTerms() {
		DmmCoreTermsImpl dmmCoreTerms = new DmmCoreTermsImpl();
		return dmmCoreTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramOrCampaign createProgramOrCampaign() {
		ProgramOrCampaignImpl programOrCampaign = new ProgramOrCampaignImpl();
		return programOrCampaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPoint createContactPoint() {
		ContactPointImpl contactPoint = new ContactPointImpl();
		return contactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectMedia createProjectMedia() {
		ProjectMediaImpl projectMedia = new ProjectMediaImpl();
		return projectMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectGeographicLocation createProjectGeographicLocation() {
		ProjectGeographicLocationImpl projectGeographicLocation = new ProjectGeographicLocationImpl();
		return projectGeographicLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetMetadataSchema createDatasetMetadataSchema() {
		DatasetMetadataSchemaImpl datasetMetadataSchema = new DatasetMetadataSchemaImpl();
		return datasetMetadataSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodSpecification createMethodSpecification() {
		MethodSpecificationImpl methodSpecification = new MethodSpecificationImpl();
		return methodSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmmExtensionTerms createDmmExtensionTerms() {
		DmmExtensionTermsImpl dmmExtensionTerms = new DmmExtensionTermsImpl();
		return dmmExtensionTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSProject createCSProject() {
		CSProjectImpl csProject = new CSProjectImpl();
		return csProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ppsrmetamodelPackage getppsrmetamodelPackage() {
		return (ppsrmetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ppsrmetamodelPackage getPackage() {
		return ppsrmetamodelPackage.eINSTANCE;
	}

} //ppsrmetamodelFactoryImpl
