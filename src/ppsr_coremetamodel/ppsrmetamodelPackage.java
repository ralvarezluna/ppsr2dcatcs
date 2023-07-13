/**
 */
package ppsr_coremetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ppsr_coremetamodel.ppsrmetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface ppsrmetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ppsr_coremetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ppsr_coremetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ppsr_coremetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ppsrmetamodelPackage eINSTANCE = ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl <em>Dmm Core Terms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppsr_coremetamodel.impl.DmmCoreTermsImpl
	 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getDmmCoreTerms()
	 * @generated
	 */
	int DMM_CORE_TERMS = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Date Submitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__DATE_SUBMITTED = 1;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__MODIFIED = 2;

	/**
	 * The feature id for the '<em><b>Dataset Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__DATASET_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__TITLE = 4;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__ABSTRACT = 5;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__ACCESS_RIGHTS = 6;

	/**
	 * The feature id for the '<em><b>Bibliographic Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__BIBLIOGRAPHIC_CITATION = 7;

	/**
	 * The feature id for the '<em><b>Rights Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__RIGHTS_HOLDER = 8;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__LICENSE = 9;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__LANGUAGE = 10;

	/**
	 * The feature id for the '<em><b>Dateset Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__DATESET_START_DATE = 11;

	/**
	 * The feature id for the '<em><b>Dataset End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__DATASET_END_DATE = 12;

	/**
	 * The feature id for the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__METHOD_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Data Access Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS__DATA_ACCESS_METHOD = 14;

	/**
	 * The number of structural features of the '<em>Dmm Core Terms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_CORE_TERMS_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link ppsr_coremetamodel.impl.ProgramOrCampaignImpl <em>Program Or Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppsr_coremetamodel.impl.ProgramOrCampaignImpl
	 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getProgramOrCampaign()
	 * @generated
	 */
	int PROGRAM_OR_CAMPAIGN = 1;

	/**
	 * The feature id for the '<em><b>Program Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OR_CAMPAIGN__PROGRAM_ID = 0;

	/**
	 * The feature id for the '<em><b>Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OR_CAMPAIGN__PROGRAM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OR_CAMPAIGN__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Csproject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OR_CAMPAIGN__CSPROJECT = 3;

	/**
	 * The number of structural features of the '<em>Program Or Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OR_CAMPAIGN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ppsr_coremetamodel.impl.ContactPointImpl <em>Contact Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppsr_coremetamodel.impl.ContactPointImpl
	 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getContactPoint()
	 * @generated
	 */
	int CONTACT_POINT = 2;

	/**
	 * The feature id for the '<em><b>Contact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__CONTACT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Means Of Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__MEANS_OF_CONTACT = 1;

	/**
	 * The feature id for the '<em><b>Contact Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__CONTACT_DETAILS = 2;

	/**
	 * The feature id for the '<em><b>Contact Point Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__CONTACT_POINT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Contact Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__CONTACT_EMAIL = 4;

	/**
	 * The number of structural features of the '<em>Contact Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ppsr_coremetamodel.impl.ProjectMediaImpl <em>Project Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppsr_coremetamodel.impl.ProjectMediaImpl
	 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getProjectMedia()
	 * @generated
	 */
	int PROJECT_MEDIA = 3;

	/**
	 * The feature id for the '<em><b>Project Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MEDIA__PROJECT_MEDIA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Project Media File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MEDIA__PROJECT_MEDIA_FILE = 1;

	/**
	 * The feature id for the '<em><b>Project Media Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MEDIA__PROJECT_MEDIA_CREDIT = 2;

	/**
	 * The number of structural features of the '<em>Project Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MEDIA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ppsr_coremetamodel.impl.ProjectGeographicLocationImpl <em>Project Geographic Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppsr_coremetamodel.impl.ProjectGeographicLocationImpl
	 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getProjectGeographicLocation()
	 * @generated
	 */
	int PROJECT_GEOGRAPHIC_LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Project Pin Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Project Pin Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Project Geographic Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE = 2;

	/**
	 * The feature id for the '<em><b>Project Geographic Coverage Centroid Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE = 3;

	/**
	 * The feature id for the '<em><b>Project Geographic Coverage Centroid Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE = 4;

	/**
	 * The number of structural features of the '<em>Project Geographic Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_GEOGRAPHIC_LOCATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ppsr_coremetamodel.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppsr_coremetamodel.impl.ActivityImpl
	 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIVITY_ID = 0;

	/**
	 * The feature id for the '<em><b>Datasetmetadataschema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DATASETMETADATASCHEMA = 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ppsr_coremetamodel.impl.DatasetMetadataSchemaImpl <em>Dataset Metadata Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppsr_coremetamodel.impl.DatasetMetadataSchemaImpl
	 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getDatasetMetadataSchema()
	 * @generated
	 */
	int DATASET_METADATA_SCHEMA = 6;

	/**
	 * The feature id for the '<em><b>Observational Data Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_METADATA_SCHEMA__OBSERVATIONAL_DATA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Dmmcoreterms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_METADATA_SCHEMA__DMMCORETERMS = 1;

	/**
	 * The feature id for the '<em><b>Methodspecification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_METADATA_SCHEMA__METHODSPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Dmmextensionterms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_METADATA_SCHEMA__DMMEXTENSIONTERMS = 3;

	/**
	 * The number of structural features of the '<em>Dataset Metadata Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_METADATA_SCHEMA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ppsr_coremetamodel.impl.MethodSpecificationImpl <em>Method Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppsr_coremetamodel.impl.MethodSpecificationImpl
	 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getMethodSpecification()
	 * @generated
	 */
	int METHOD_SPECIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Sampling Protocol Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__SAMPLING_PROTOCOL_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Sampling Protocol Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__SAMPLING_PROTOCOL_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Method Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__METHOD_ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Method Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__METHOD_URL = 3;

	/**
	 * The feature id for the '<em><b>Method Doc Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__METHOD_DOC_URL = 4;

	/**
	 * The number of structural features of the '<em>Method Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ppsr_coremetamodel.impl.DmmExtensionTermsImpl <em>Dmm Extension Terms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppsr_coremetamodel.impl.DmmExtensionTermsImpl
	 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getDmmExtensionTerms()
	 * @generated
	 */
	int DMM_EXTENSION_TERMS = 8;

	/**
	 * The feature id for the '<em><b>Dataset Update Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_EXTENSION_TERMS__DATASET_UPDATE_FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Dataset External Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_EXTENSION_TERMS__DATASET_EXTERNAL_URL = 1;

	/**
	 * The feature id for the '<em><b>Download URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_EXTENSION_TERMS__DOWNLOAD_URL = 2;

	/**
	 * The feature id for the '<em><b>Data Quality Assurance Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Data Quality Assurance Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Usage Guide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_EXTENSION_TERMS__USAGE_GUIDE = 5;

	/**
	 * The feature id for the '<em><b>Data Management Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_EXTENSION_TERMS__DATA_MANAGEMENT_PLAN = 6;

	/**
	 * The number of structural features of the '<em>Dmm Extension Terms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMM_EXTENSION_TERMS_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link ppsr_coremetamodel.impl.CSProjectImpl <em>CS Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ppsr_coremetamodel.impl.CSProjectImpl
	 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getCSProject()
	 * @generated
	 */
	int CS_PROJECT = 9;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_ID = 0;

	/**
	 * The feature id for the '<em><b>Project Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_DATE_CREATED = 1;

	/**
	 * The feature id for the '<em><b>Project Last Updated Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_LAST_UPDATED_DATE = 2;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Project Aim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_AIM = 4;

	/**
	 * The feature id for the '<em><b>Project Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Has Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__HAS_TAG = 6;

	/**
	 * The feature id for the '<em><b>Difficulty Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__DIFFICULTY_LEVEL = 7;

	/**
	 * The feature id for the '<em><b>Project Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_STATUS = 8;

	/**
	 * The feature id for the '<em><b>Project Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_START_DATE = 9;

	/**
	 * The feature id for the '<em><b>Project End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_END_DATE = 10;

	/**
	 * The feature id for the '<em><b>Project Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_DURATION = 11;

	/**
	 * The feature id for the '<em><b>Project Science Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_SCIENCE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Project Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_URL = 13;

	/**
	 * The feature id for the '<em><b>Un Regions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__UN_REGIONS = 14;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__LANGUAGE = 15;

	/**
	 * The feature id for the '<em><b>Projectgeographiclocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECTGEOGRAPHICLOCATION = 16;

	/**
	 * The feature id for the '<em><b>Projectmedia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECTMEDIA = 17;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__ACTIVITY = 18;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__KEYWORDS = 19;

	/**
	 * The feature id for the '<em><b>Contactpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__CONTACTPOINT = 20;

	/**
	 * The feature id for the '<em><b>Project Responsible Party Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_RESPONSIBLE_PARTY_NAME = 21;

	/**
	 * The number of structural features of the '<em>CS Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT_FEATURE_COUNT = 22;


	/**
	 * Returns the meta object for class '{@link ppsr_coremetamodel.DmmCoreTerms <em>Dmm Core Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dmm Core Terms</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms
	 * @generated
	 */
	EClass getDmmCoreTerms();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getIdentifier()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getDateSubmitted <em>Date Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Submitted</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getDateSubmitted()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_DateSubmitted();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getModified()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_Modified();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getDatasetStatus <em>Dataset Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataset Status</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getDatasetStatus()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_DatasetStatus();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getTitle()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_Title();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getAbstract()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getAccessRights <em>Access Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Rights</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getAccessRights()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_AccessRights();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getBibliographicCitation <em>Bibliographic Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bibliographic Citation</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getBibliographicCitation()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_BibliographicCitation();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getRightsHolder <em>Rights Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rights Holder</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getRightsHolder()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_RightsHolder();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getLicense()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_License();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getLanguage()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_Language();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getDatesetStartDate <em>Dateset Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dateset Start Date</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getDatesetStartDate()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_DatesetStartDate();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getDatasetEndDate <em>Dataset End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataset End Date</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getDatasetEndDate()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_DatasetEndDate();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getMethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Type</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getMethodType()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_MethodType();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmCoreTerms#getDataAccessMethod <em>Data Access Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Access Method</em>'.
	 * @see ppsr_coremetamodel.DmmCoreTerms#getDataAccessMethod()
	 * @see #getDmmCoreTerms()
	 * @generated
	 */
	EAttribute getDmmCoreTerms_DataAccessMethod();

	/**
	 * Returns the meta object for class '{@link ppsr_coremetamodel.ProgramOrCampaign <em>Program Or Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Or Campaign</em>'.
	 * @see ppsr_coremetamodel.ProgramOrCampaign
	 * @generated
	 */
	EClass getProgramOrCampaign();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ProgramOrCampaign#getProgramId <em>Program Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Id</em>'.
	 * @see ppsr_coremetamodel.ProgramOrCampaign#getProgramId()
	 * @see #getProgramOrCampaign()
	 * @generated
	 */
	EAttribute getProgramOrCampaign_ProgramId();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ProgramOrCampaign#getProgramName <em>Program Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Name</em>'.
	 * @see ppsr_coremetamodel.ProgramOrCampaign#getProgramName()
	 * @see #getProgramOrCampaign()
	 * @generated
	 */
	EAttribute getProgramOrCampaign_ProgramName();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ProgramOrCampaign#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see ppsr_coremetamodel.ProgramOrCampaign#getLanguage()
	 * @see #getProgramOrCampaign()
	 * @generated
	 */
	EAttribute getProgramOrCampaign_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link ppsr_coremetamodel.ProgramOrCampaign#getCsproject <em>Csproject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Csproject</em>'.
	 * @see ppsr_coremetamodel.ProgramOrCampaign#getCsproject()
	 * @see #getProgramOrCampaign()
	 * @generated
	 */
	EReference getProgramOrCampaign_Csproject();

	/**
	 * Returns the meta object for class '{@link ppsr_coremetamodel.ContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Point</em>'.
	 * @see ppsr_coremetamodel.ContactPoint
	 * @generated
	 */
	EClass getContactPoint();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ContactPoint#getContactName <em>Contact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Name</em>'.
	 * @see ppsr_coremetamodel.ContactPoint#getContactName()
	 * @see #getContactPoint()
	 * @generated
	 */
	EAttribute getContactPoint_ContactName();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ContactPoint#getMeansOfContact <em>Means Of Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Means Of Contact</em>'.
	 * @see ppsr_coremetamodel.ContactPoint#getMeansOfContact()
	 * @see #getContactPoint()
	 * @generated
	 */
	EAttribute getContactPoint_MeansOfContact();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ContactPoint#getContactDetails <em>Contact Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Details</em>'.
	 * @see ppsr_coremetamodel.ContactPoint#getContactDetails()
	 * @see #getContactPoint()
	 * @generated
	 */
	EAttribute getContactPoint_ContactDetails();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ContactPoint#getContactPointType <em>Contact Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Point Type</em>'.
	 * @see ppsr_coremetamodel.ContactPoint#getContactPointType()
	 * @see #getContactPoint()
	 * @generated
	 */
	EAttribute getContactPoint_ContactPointType();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ContactPoint#getContactEmail <em>Contact Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Email</em>'.
	 * @see ppsr_coremetamodel.ContactPoint#getContactEmail()
	 * @see #getContactPoint()
	 * @generated
	 */
	EAttribute getContactPoint_ContactEmail();

	/**
	 * Returns the meta object for class '{@link ppsr_coremetamodel.ProjectMedia <em>Project Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Media</em>'.
	 * @see ppsr_coremetamodel.ProjectMedia
	 * @generated
	 */
	EClass getProjectMedia();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ProjectMedia#getProjectMediaType <em>Project Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Media Type</em>'.
	 * @see ppsr_coremetamodel.ProjectMedia#getProjectMediaType()
	 * @see #getProjectMedia()
	 * @generated
	 */
	EAttribute getProjectMedia_ProjectMediaType();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ProjectMedia#getProjectMediaFile <em>Project Media File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Media File</em>'.
	 * @see ppsr_coremetamodel.ProjectMedia#getProjectMediaFile()
	 * @see #getProjectMedia()
	 * @generated
	 */
	EAttribute getProjectMedia_ProjectMediaFile();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ProjectMedia#getProjectMediaCredit <em>Project Media Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Media Credit</em>'.
	 * @see ppsr_coremetamodel.ProjectMedia#getProjectMediaCredit()
	 * @see #getProjectMedia()
	 * @generated
	 */
	EAttribute getProjectMedia_ProjectMediaCredit();

	/**
	 * Returns the meta object for class '{@link ppsr_coremetamodel.ProjectGeographicLocation <em>Project Geographic Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Geographic Location</em>'.
	 * @see ppsr_coremetamodel.ProjectGeographicLocation
	 * @generated
	 */
	EClass getProjectGeographicLocation();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectPinLatitude <em>Project Pin Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Pin Latitude</em>'.
	 * @see ppsr_coremetamodel.ProjectGeographicLocation#getProjectPinLatitude()
	 * @see #getProjectGeographicLocation()
	 * @generated
	 */
	EAttribute getProjectGeographicLocation_ProjectPinLatitude();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectPinLongitude <em>Project Pin Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Pin Longitude</em>'.
	 * @see ppsr_coremetamodel.ProjectGeographicLocation#getProjectPinLongitude()
	 * @see #getProjectGeographicLocation()
	 * @generated
	 */
	EAttribute getProjectGeographicLocation_ProjectPinLongitude();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverage <em>Project Geographic Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Geographic Coverage</em>'.
	 * @see ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverage()
	 * @see #getProjectGeographicLocation()
	 * @generated
	 */
	EAttribute getProjectGeographicLocation_ProjectGeographicCoverage();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLatitude <em>Project Geographic Coverage Centroid Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Geographic Coverage Centroid Latitude</em>'.
	 * @see ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLatitude()
	 * @see #getProjectGeographicLocation()
	 * @generated
	 */
	EAttribute getProjectGeographicLocation_ProjectGeographicCoverageCentroidLatitude();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLongitude <em>Project Geographic Coverage Centroid Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Geographic Coverage Centroid Longitude</em>'.
	 * @see ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLongitude()
	 * @see #getProjectGeographicLocation()
	 * @generated
	 */
	EAttribute getProjectGeographicLocation_ProjectGeographicCoverageCentroidLongitude();

	/**
	 * Returns the meta object for class '{@link ppsr_coremetamodel.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see ppsr_coremetamodel.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.Activity#getActivityId <em>Activity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Id</em>'.
	 * @see ppsr_coremetamodel.Activity#getActivityId()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_ActivityId();

	/**
	 * Returns the meta object for the containment reference '{@link ppsr_coremetamodel.Activity#getDatasetmetadataschema <em>Datasetmetadataschema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datasetmetadataschema</em>'.
	 * @see ppsr_coremetamodel.Activity#getDatasetmetadataschema()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Datasetmetadataschema();

	/**
	 * Returns the meta object for class '{@link ppsr_coremetamodel.DatasetMetadataSchema <em>Dataset Metadata Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Metadata Schema</em>'.
	 * @see ppsr_coremetamodel.DatasetMetadataSchema
	 * @generated
	 */
	EClass getDatasetMetadataSchema();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DatasetMetadataSchema#getObservationalDataModel <em>Observational Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observational Data Model</em>'.
	 * @see ppsr_coremetamodel.DatasetMetadataSchema#getObservationalDataModel()
	 * @see #getDatasetMetadataSchema()
	 * @generated
	 */
	EAttribute getDatasetMetadataSchema_ObservationalDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ppsr_coremetamodel.DatasetMetadataSchema#getDmmcoreterms <em>Dmmcoreterms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dmmcoreterms</em>'.
	 * @see ppsr_coremetamodel.DatasetMetadataSchema#getDmmcoreterms()
	 * @see #getDatasetMetadataSchema()
	 * @generated
	 */
	EReference getDatasetMetadataSchema_Dmmcoreterms();

	/**
	 * Returns the meta object for the containment reference '{@link ppsr_coremetamodel.DatasetMetadataSchema#getMethodspecification <em>Methodspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Methodspecification</em>'.
	 * @see ppsr_coremetamodel.DatasetMetadataSchema#getMethodspecification()
	 * @see #getDatasetMetadataSchema()
	 * @generated
	 */
	EReference getDatasetMetadataSchema_Methodspecification();

	/**
	 * Returns the meta object for the containment reference list '{@link ppsr_coremetamodel.DatasetMetadataSchema#getDmmextensionterms <em>Dmmextensionterms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dmmextensionterms</em>'.
	 * @see ppsr_coremetamodel.DatasetMetadataSchema#getDmmextensionterms()
	 * @see #getDatasetMetadataSchema()
	 * @generated
	 */
	EReference getDatasetMetadataSchema_Dmmextensionterms();

	/**
	 * Returns the meta object for class '{@link ppsr_coremetamodel.MethodSpecification <em>Method Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Specification</em>'.
	 * @see ppsr_coremetamodel.MethodSpecification
	 * @generated
	 */
	EClass getMethodSpecification();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.MethodSpecification#getSamplingProtocolDomain <em>Sampling Protocol Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling Protocol Domain</em>'.
	 * @see ppsr_coremetamodel.MethodSpecification#getSamplingProtocolDomain()
	 * @see #getMethodSpecification()
	 * @generated
	 */
	EAttribute getMethodSpecification_SamplingProtocolDomain();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.MethodSpecification#getSamplingProtocolMethod <em>Sampling Protocol Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling Protocol Method</em>'.
	 * @see ppsr_coremetamodel.MethodSpecification#getSamplingProtocolMethod()
	 * @see #getMethodSpecification()
	 * @generated
	 */
	EAttribute getMethodSpecification_SamplingProtocolMethod();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.MethodSpecification#getMethodAbstract <em>Method Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Abstract</em>'.
	 * @see ppsr_coremetamodel.MethodSpecification#getMethodAbstract()
	 * @see #getMethodSpecification()
	 * @generated
	 */
	EAttribute getMethodSpecification_MethodAbstract();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.MethodSpecification#getMethodUrl <em>Method Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Url</em>'.
	 * @see ppsr_coremetamodel.MethodSpecification#getMethodUrl()
	 * @see #getMethodSpecification()
	 * @generated
	 */
	EAttribute getMethodSpecification_MethodUrl();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.MethodSpecification#getMethodDocUrl <em>Method Doc Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Doc Url</em>'.
	 * @see ppsr_coremetamodel.MethodSpecification#getMethodDocUrl()
	 * @see #getMethodSpecification()
	 * @generated
	 */
	EAttribute getMethodSpecification_MethodDocUrl();

	/**
	 * Returns the meta object for class '{@link ppsr_coremetamodel.DmmExtensionTerms <em>Dmm Extension Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dmm Extension Terms</em>'.
	 * @see ppsr_coremetamodel.DmmExtensionTerms
	 * @generated
	 */
	EClass getDmmExtensionTerms();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmExtensionTerms#getDatasetUpdateFrequency <em>Dataset Update Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataset Update Frequency</em>'.
	 * @see ppsr_coremetamodel.DmmExtensionTerms#getDatasetUpdateFrequency()
	 * @see #getDmmExtensionTerms()
	 * @generated
	 */
	EAttribute getDmmExtensionTerms_DatasetUpdateFrequency();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmExtensionTerms#getDatasetExternalUrl <em>Dataset External Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataset External Url</em>'.
	 * @see ppsr_coremetamodel.DmmExtensionTerms#getDatasetExternalUrl()
	 * @see #getDmmExtensionTerms()
	 * @generated
	 */
	EAttribute getDmmExtensionTerms_DatasetExternalUrl();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmExtensionTerms#getDownloadURL <em>Download URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download URL</em>'.
	 * @see ppsr_coremetamodel.DmmExtensionTerms#getDownloadURL()
	 * @see #getDmmExtensionTerms()
	 * @generated
	 */
	EAttribute getDmmExtensionTerms_DownloadURL();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmExtensionTerms#getDataQualityAssuranceMethod <em>Data Quality Assurance Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Quality Assurance Method</em>'.
	 * @see ppsr_coremetamodel.DmmExtensionTerms#getDataQualityAssuranceMethod()
	 * @see #getDmmExtensionTerms()
	 * @generated
	 */
	EAttribute getDmmExtensionTerms_DataQualityAssuranceMethod();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmExtensionTerms#getDataQualityAssuranceDescription <em>Data Quality Assurance Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Quality Assurance Description</em>'.
	 * @see ppsr_coremetamodel.DmmExtensionTerms#getDataQualityAssuranceDescription()
	 * @see #getDmmExtensionTerms()
	 * @generated
	 */
	EAttribute getDmmExtensionTerms_DataQualityAssuranceDescription();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmExtensionTerms#getUsageGuide <em>Usage Guide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Guide</em>'.
	 * @see ppsr_coremetamodel.DmmExtensionTerms#getUsageGuide()
	 * @see #getDmmExtensionTerms()
	 * @generated
	 */
	EAttribute getDmmExtensionTerms_UsageGuide();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.DmmExtensionTerms#getDataManagementPlan <em>Data Management Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Management Plan</em>'.
	 * @see ppsr_coremetamodel.DmmExtensionTerms#getDataManagementPlan()
	 * @see #getDmmExtensionTerms()
	 * @generated
	 */
	EAttribute getDmmExtensionTerms_DataManagementPlan();

	/**
	 * Returns the meta object for class '{@link ppsr_coremetamodel.CSProject <em>CS Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS Project</em>'.
	 * @see ppsr_coremetamodel.CSProject
	 * @generated
	 */
	EClass getCSProject();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectId()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectDateCreated <em>Project Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Date Created</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectDateCreated()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectDateCreated();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectLastUpdatedDate <em>Project Last Updated Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Last Updated Date</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectLastUpdatedDate()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectLastUpdatedDate();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectName()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectAim <em>Project Aim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Aim</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectAim()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectAim();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectDescription <em>Project Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Description</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectDescription()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectDescription();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getHasTag <em>Has Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Tag</em>'.
	 * @see ppsr_coremetamodel.CSProject#getHasTag()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_HasTag();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getDifficultyLevel <em>Difficulty Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty Level</em>'.
	 * @see ppsr_coremetamodel.CSProject#getDifficultyLevel()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_DifficultyLevel();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectStatus <em>Project Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Status</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectStatus()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectStatus();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectStartDate <em>Project Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Start Date</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectStartDate()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectStartDate();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectEndDate <em>Project End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project End Date</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectEndDate()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectEndDate();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectDuration <em>Project Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Duration</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectDuration()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectDuration();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectScienceType <em>Project Science Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Science Type</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectScienceType()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectScienceType();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectUrl <em>Project Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Url</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectUrl()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectUrl();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getUnRegions <em>Un Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Un Regions</em>'.
	 * @see ppsr_coremetamodel.CSProject#getUnRegions()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_UnRegions();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see ppsr_coremetamodel.CSProject#getLanguage()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link ppsr_coremetamodel.CSProject#getProjectgeographiclocation <em>Projectgeographiclocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projectgeographiclocation</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectgeographiclocation()
	 * @see #getCSProject()
	 * @generated
	 */
	EReference getCSProject_Projectgeographiclocation();

	/**
	 * Returns the meta object for the containment reference list '{@link ppsr_coremetamodel.CSProject#getProjectmedia <em>Projectmedia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projectmedia</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectmedia()
	 * @see #getCSProject()
	 * @generated
	 */
	EReference getCSProject_Projectmedia();

	/**
	 * Returns the meta object for the containment reference list '{@link ppsr_coremetamodel.CSProject#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see ppsr_coremetamodel.CSProject#getActivity()
	 * @see #getCSProject()
	 * @generated
	 */
	EReference getCSProject_Activity();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see ppsr_coremetamodel.CSProject#getKeywords()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_Keywords();

	/**
	 * Returns the meta object for the containment reference list '{@link ppsr_coremetamodel.CSProject#getContactpoint <em>Contactpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contactpoint</em>'.
	 * @see ppsr_coremetamodel.CSProject#getContactpoint()
	 * @see #getCSProject()
	 * @generated
	 */
	EReference getCSProject_Contactpoint();

	/**
	 * Returns the meta object for the attribute '{@link ppsr_coremetamodel.CSProject#getProjectResponsiblePartyName <em>Project Responsible Party Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Responsible Party Name</em>'.
	 * @see ppsr_coremetamodel.CSProject#getProjectResponsiblePartyName()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectResponsiblePartyName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ppsrmetamodelFactory getppsrmetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl <em>Dmm Core Terms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppsr_coremetamodel.impl.DmmCoreTermsImpl
		 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getDmmCoreTerms()
		 * @generated
		 */
		EClass DMM_CORE_TERMS = eINSTANCE.getDmmCoreTerms();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__IDENTIFIER = eINSTANCE.getDmmCoreTerms_Identifier();

		/**
		 * The meta object literal for the '<em><b>Date Submitted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__DATE_SUBMITTED = eINSTANCE.getDmmCoreTerms_DateSubmitted();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__MODIFIED = eINSTANCE.getDmmCoreTerms_Modified();

		/**
		 * The meta object literal for the '<em><b>Dataset Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__DATASET_STATUS = eINSTANCE.getDmmCoreTerms_DatasetStatus();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__TITLE = eINSTANCE.getDmmCoreTerms_Title();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__ABSTRACT = eINSTANCE.getDmmCoreTerms_Abstract();

		/**
		 * The meta object literal for the '<em><b>Access Rights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__ACCESS_RIGHTS = eINSTANCE.getDmmCoreTerms_AccessRights();

		/**
		 * The meta object literal for the '<em><b>Bibliographic Citation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__BIBLIOGRAPHIC_CITATION = eINSTANCE.getDmmCoreTerms_BibliographicCitation();

		/**
		 * The meta object literal for the '<em><b>Rights Holder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__RIGHTS_HOLDER = eINSTANCE.getDmmCoreTerms_RightsHolder();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__LICENSE = eINSTANCE.getDmmCoreTerms_License();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__LANGUAGE = eINSTANCE.getDmmCoreTerms_Language();

		/**
		 * The meta object literal for the '<em><b>Dateset Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__DATESET_START_DATE = eINSTANCE.getDmmCoreTerms_DatesetStartDate();

		/**
		 * The meta object literal for the '<em><b>Dataset End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__DATASET_END_DATE = eINSTANCE.getDmmCoreTerms_DatasetEndDate();

		/**
		 * The meta object literal for the '<em><b>Method Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__METHOD_TYPE = eINSTANCE.getDmmCoreTerms_MethodType();

		/**
		 * The meta object literal for the '<em><b>Data Access Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_CORE_TERMS__DATA_ACCESS_METHOD = eINSTANCE.getDmmCoreTerms_DataAccessMethod();

		/**
		 * The meta object literal for the '{@link ppsr_coremetamodel.impl.ProgramOrCampaignImpl <em>Program Or Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppsr_coremetamodel.impl.ProgramOrCampaignImpl
		 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getProgramOrCampaign()
		 * @generated
		 */
		EClass PROGRAM_OR_CAMPAIGN = eINSTANCE.getProgramOrCampaign();

		/**
		 * The meta object literal for the '<em><b>Program Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_OR_CAMPAIGN__PROGRAM_ID = eINSTANCE.getProgramOrCampaign_ProgramId();

		/**
		 * The meta object literal for the '<em><b>Program Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_OR_CAMPAIGN__PROGRAM_NAME = eINSTANCE.getProgramOrCampaign_ProgramName();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_OR_CAMPAIGN__LANGUAGE = eINSTANCE.getProgramOrCampaign_Language();

		/**
		 * The meta object literal for the '<em><b>Csproject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_OR_CAMPAIGN__CSPROJECT = eINSTANCE.getProgramOrCampaign_Csproject();

		/**
		 * The meta object literal for the '{@link ppsr_coremetamodel.impl.ContactPointImpl <em>Contact Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppsr_coremetamodel.impl.ContactPointImpl
		 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getContactPoint()
		 * @generated
		 */
		EClass CONTACT_POINT = eINSTANCE.getContactPoint();

		/**
		 * The meta object literal for the '<em><b>Contact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_POINT__CONTACT_NAME = eINSTANCE.getContactPoint_ContactName();

		/**
		 * The meta object literal for the '<em><b>Means Of Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_POINT__MEANS_OF_CONTACT = eINSTANCE.getContactPoint_MeansOfContact();

		/**
		 * The meta object literal for the '<em><b>Contact Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_POINT__CONTACT_DETAILS = eINSTANCE.getContactPoint_ContactDetails();

		/**
		 * The meta object literal for the '<em><b>Contact Point Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_POINT__CONTACT_POINT_TYPE = eINSTANCE.getContactPoint_ContactPointType();

		/**
		 * The meta object literal for the '<em><b>Contact Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_POINT__CONTACT_EMAIL = eINSTANCE.getContactPoint_ContactEmail();

		/**
		 * The meta object literal for the '{@link ppsr_coremetamodel.impl.ProjectMediaImpl <em>Project Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppsr_coremetamodel.impl.ProjectMediaImpl
		 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getProjectMedia()
		 * @generated
		 */
		EClass PROJECT_MEDIA = eINSTANCE.getProjectMedia();

		/**
		 * The meta object literal for the '<em><b>Project Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_MEDIA__PROJECT_MEDIA_TYPE = eINSTANCE.getProjectMedia_ProjectMediaType();

		/**
		 * The meta object literal for the '<em><b>Project Media File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_MEDIA__PROJECT_MEDIA_FILE = eINSTANCE.getProjectMedia_ProjectMediaFile();

		/**
		 * The meta object literal for the '<em><b>Project Media Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_MEDIA__PROJECT_MEDIA_CREDIT = eINSTANCE.getProjectMedia_ProjectMediaCredit();

		/**
		 * The meta object literal for the '{@link ppsr_coremetamodel.impl.ProjectGeographicLocationImpl <em>Project Geographic Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppsr_coremetamodel.impl.ProjectGeographicLocationImpl
		 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getProjectGeographicLocation()
		 * @generated
		 */
		EClass PROJECT_GEOGRAPHIC_LOCATION = eINSTANCE.getProjectGeographicLocation();

		/**
		 * The meta object literal for the '<em><b>Project Pin Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LATITUDE = eINSTANCE.getProjectGeographicLocation_ProjectPinLatitude();

		/**
		 * The meta object literal for the '<em><b>Project Pin Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LONGITUDE = eINSTANCE.getProjectGeographicLocation_ProjectPinLongitude();

		/**
		 * The meta object literal for the '<em><b>Project Geographic Coverage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE = eINSTANCE.getProjectGeographicLocation_ProjectGeographicCoverage();

		/**
		 * The meta object literal for the '<em><b>Project Geographic Coverage Centroid Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE = eINSTANCE.getProjectGeographicLocation_ProjectGeographicCoverageCentroidLatitude();

		/**
		 * The meta object literal for the '<em><b>Project Geographic Coverage Centroid Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE = eINSTANCE.getProjectGeographicLocation_ProjectGeographicCoverageCentroidLongitude();

		/**
		 * The meta object literal for the '{@link ppsr_coremetamodel.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppsr_coremetamodel.impl.ActivityImpl
		 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Activity Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ACTIVITY_ID = eINSTANCE.getActivity_ActivityId();

		/**
		 * The meta object literal for the '<em><b>Datasetmetadataschema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__DATASETMETADATASCHEMA = eINSTANCE.getActivity_Datasetmetadataschema();

		/**
		 * The meta object literal for the '{@link ppsr_coremetamodel.impl.DatasetMetadataSchemaImpl <em>Dataset Metadata Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppsr_coremetamodel.impl.DatasetMetadataSchemaImpl
		 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getDatasetMetadataSchema()
		 * @generated
		 */
		EClass DATASET_METADATA_SCHEMA = eINSTANCE.getDatasetMetadataSchema();

		/**
		 * The meta object literal for the '<em><b>Observational Data Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_METADATA_SCHEMA__OBSERVATIONAL_DATA_MODEL = eINSTANCE.getDatasetMetadataSchema_ObservationalDataModel();

		/**
		 * The meta object literal for the '<em><b>Dmmcoreterms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_METADATA_SCHEMA__DMMCORETERMS = eINSTANCE.getDatasetMetadataSchema_Dmmcoreterms();

		/**
		 * The meta object literal for the '<em><b>Methodspecification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_METADATA_SCHEMA__METHODSPECIFICATION = eINSTANCE.getDatasetMetadataSchema_Methodspecification();

		/**
		 * The meta object literal for the '<em><b>Dmmextensionterms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_METADATA_SCHEMA__DMMEXTENSIONTERMS = eINSTANCE.getDatasetMetadataSchema_Dmmextensionterms();

		/**
		 * The meta object literal for the '{@link ppsr_coremetamodel.impl.MethodSpecificationImpl <em>Method Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppsr_coremetamodel.impl.MethodSpecificationImpl
		 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getMethodSpecification()
		 * @generated
		 */
		EClass METHOD_SPECIFICATION = eINSTANCE.getMethodSpecification();

		/**
		 * The meta object literal for the '<em><b>Sampling Protocol Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_SPECIFICATION__SAMPLING_PROTOCOL_DOMAIN = eINSTANCE.getMethodSpecification_SamplingProtocolDomain();

		/**
		 * The meta object literal for the '<em><b>Sampling Protocol Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_SPECIFICATION__SAMPLING_PROTOCOL_METHOD = eINSTANCE.getMethodSpecification_SamplingProtocolMethod();

		/**
		 * The meta object literal for the '<em><b>Method Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_SPECIFICATION__METHOD_ABSTRACT = eINSTANCE.getMethodSpecification_MethodAbstract();

		/**
		 * The meta object literal for the '<em><b>Method Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_SPECIFICATION__METHOD_URL = eINSTANCE.getMethodSpecification_MethodUrl();

		/**
		 * The meta object literal for the '<em><b>Method Doc Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_SPECIFICATION__METHOD_DOC_URL = eINSTANCE.getMethodSpecification_MethodDocUrl();

		/**
		 * The meta object literal for the '{@link ppsr_coremetamodel.impl.DmmExtensionTermsImpl <em>Dmm Extension Terms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppsr_coremetamodel.impl.DmmExtensionTermsImpl
		 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getDmmExtensionTerms()
		 * @generated
		 */
		EClass DMM_EXTENSION_TERMS = eINSTANCE.getDmmExtensionTerms();

		/**
		 * The meta object literal for the '<em><b>Dataset Update Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_EXTENSION_TERMS__DATASET_UPDATE_FREQUENCY = eINSTANCE.getDmmExtensionTerms_DatasetUpdateFrequency();

		/**
		 * The meta object literal for the '<em><b>Dataset External Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_EXTENSION_TERMS__DATASET_EXTERNAL_URL = eINSTANCE.getDmmExtensionTerms_DatasetExternalUrl();

		/**
		 * The meta object literal for the '<em><b>Download URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_EXTENSION_TERMS__DOWNLOAD_URL = eINSTANCE.getDmmExtensionTerms_DownloadURL();

		/**
		 * The meta object literal for the '<em><b>Data Quality Assurance Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_METHOD = eINSTANCE.getDmmExtensionTerms_DataQualityAssuranceMethod();

		/**
		 * The meta object literal for the '<em><b>Data Quality Assurance Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_DESCRIPTION = eINSTANCE.getDmmExtensionTerms_DataQualityAssuranceDescription();

		/**
		 * The meta object literal for the '<em><b>Usage Guide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_EXTENSION_TERMS__USAGE_GUIDE = eINSTANCE.getDmmExtensionTerms_UsageGuide();

		/**
		 * The meta object literal for the '<em><b>Data Management Plan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMM_EXTENSION_TERMS__DATA_MANAGEMENT_PLAN = eINSTANCE.getDmmExtensionTerms_DataManagementPlan();

		/**
		 * The meta object literal for the '{@link ppsr_coremetamodel.impl.CSProjectImpl <em>CS Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ppsr_coremetamodel.impl.CSProjectImpl
		 * @see ppsr_coremetamodel.impl.ppsrmetamodelPackageImpl#getCSProject()
		 * @generated
		 */
		EClass CS_PROJECT = eINSTANCE.getCSProject();

		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_ID = eINSTANCE.getCSProject_ProjectId();

		/**
		 * The meta object literal for the '<em><b>Project Date Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_DATE_CREATED = eINSTANCE.getCSProject_ProjectDateCreated();

		/**
		 * The meta object literal for the '<em><b>Project Last Updated Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_LAST_UPDATED_DATE = eINSTANCE.getCSProject_ProjectLastUpdatedDate();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_NAME = eINSTANCE.getCSProject_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Project Aim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_AIM = eINSTANCE.getCSProject_ProjectAim();

		/**
		 * The meta object literal for the '<em><b>Project Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_DESCRIPTION = eINSTANCE.getCSProject_ProjectDescription();

		/**
		 * The meta object literal for the '<em><b>Has Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__HAS_TAG = eINSTANCE.getCSProject_HasTag();

		/**
		 * The meta object literal for the '<em><b>Difficulty Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__DIFFICULTY_LEVEL = eINSTANCE.getCSProject_DifficultyLevel();

		/**
		 * The meta object literal for the '<em><b>Project Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_STATUS = eINSTANCE.getCSProject_ProjectStatus();

		/**
		 * The meta object literal for the '<em><b>Project Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_START_DATE = eINSTANCE.getCSProject_ProjectStartDate();

		/**
		 * The meta object literal for the '<em><b>Project End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_END_DATE = eINSTANCE.getCSProject_ProjectEndDate();

		/**
		 * The meta object literal for the '<em><b>Project Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_DURATION = eINSTANCE.getCSProject_ProjectDuration();

		/**
		 * The meta object literal for the '<em><b>Project Science Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_SCIENCE_TYPE = eINSTANCE.getCSProject_ProjectScienceType();

		/**
		 * The meta object literal for the '<em><b>Project Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_URL = eINSTANCE.getCSProject_ProjectUrl();

		/**
		 * The meta object literal for the '<em><b>Un Regions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__UN_REGIONS = eINSTANCE.getCSProject_UnRegions();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__LANGUAGE = eINSTANCE.getCSProject_Language();

		/**
		 * The meta object literal for the '<em><b>Projectgeographiclocation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_PROJECT__PROJECTGEOGRAPHICLOCATION = eINSTANCE.getCSProject_Projectgeographiclocation();

		/**
		 * The meta object literal for the '<em><b>Projectmedia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_PROJECT__PROJECTMEDIA = eINSTANCE.getCSProject_Projectmedia();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_PROJECT__ACTIVITY = eINSTANCE.getCSProject_Activity();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__KEYWORDS = eINSTANCE.getCSProject_Keywords();

		/**
		 * The meta object literal for the '<em><b>Contactpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_PROJECT__CONTACTPOINT = eINSTANCE.getCSProject_Contactpoint();

		/**
		 * The meta object literal for the '<em><b>Project Responsible Party Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_RESPONSIBLE_PARTY_NAME = eINSTANCE.getCSProject_ProjectResponsiblePartyName();

	}

} //ppsrmetamodelPackage
