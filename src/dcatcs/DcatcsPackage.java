/**
 */
package dcatcs;

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
 * @see dcatcs.DcatcsFactory
 * @model kind="package"
 * @generated
 */
public interface DcatcsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dcatcs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.dcatcs.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dcatcs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DcatcsPackage eINSTANCE = dcatcs.impl.DcatcsPackageImpl.init();

	/**
	 * The meta object id for the '{@link dcatcs.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.ResourceImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTACT_POINT = 0;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__KEYWORD = 1;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LANDING_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONFORMS_TO = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RELEASE_DATE = 7;

	/**
	 * The feature id for the '<em><b>Update Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__UPDATE_MODIFICATION_DATE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TITLE = 9;

	/**
	 * The feature id for the '<em><b>Has Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_PART = 10;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__STATUS = 11;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link dcatcs.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.DatasetImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 1;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__CONTACT_POINT = RESOURCE__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__KEYWORD = RESOURCE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__LANDING_PAGE = RESOURCE__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__CONFORMS_TO = RESOURCE__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__IDENTIFIER = RESOURCE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__LANGUAGE = RESOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__RELEASE_DATE = RESOURCE__RELEASE_DATE;

	/**
	 * The feature id for the '<em><b>Update Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__UPDATE_MODIFICATION_DATE = RESOURCE__UPDATE_MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__TITLE = RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Has Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__HAS_PART = RESOURCE__HAS_PART;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__STATUS = RESOURCE__STATUS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DISTRIBUTION = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accrual Periodicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__ACCRUAL_PERIODICITY = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Spatial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__SPATIAL = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__TEMPORAL = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Was Generated By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__WAS_GENERATED_BY = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link dcatcs.impl.DataServiceImpl <em>Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.DataServiceImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getDataService()
	 * @generated
	 */
	int DATA_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__CONTACT_POINT = RESOURCE__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__KEYWORD = RESOURCE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__LANDING_PAGE = RESOURCE__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__CONFORMS_TO = RESOURCE__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__IDENTIFIER = RESOURCE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__LANGUAGE = RESOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__RELEASE_DATE = RESOURCE__RELEASE_DATE;

	/**
	 * The feature id for the '<em><b>Update Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__UPDATE_MODIFICATION_DATE = RESOURCE__UPDATE_MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__TITLE = RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Has Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__HAS_PART = RESOURCE__HAS_PART;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__STATUS = RESOURCE__STATUS;

	/**
	 * The feature id for the '<em><b>Endpoint Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__ENDPOINT_DESCRIPTION = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoint URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__ENDPOINT_URL = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__ACCESS_RIGHTS = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__LICENSE = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dcatcs.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.DistributionImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 3;

	/**
	 * The feature id for the '<em><b>Datadistributionservice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__DATADISTRIBUTIONSERVICE = 0;

	/**
	 * The feature id for the '<em><b>Access URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__ACCESS_URL = 1;

	/**
	 * The feature id for the '<em><b>Byte Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__BYTE_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Download URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__DOWNLOAD_URL = 3;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__MEDIA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__CONFORMS_TO = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__FORMAT = 7;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__ISSUED = 8;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__LICENSE = 9;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__MODIFIED = 10;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__RIGHTS = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__TITLE = 12;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link dcatcs.impl.DataDistributionServiceImpl <em>Data Distribution Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.DataDistributionServiceImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getDataDistributionService()
	 * @generated
	 */
	int DATA_DISTRIBUTION_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__CONTACT_POINT = DATA_SERVICE__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__KEYWORD = DATA_SERVICE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__LANDING_PAGE = DATA_SERVICE__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__CONFORMS_TO = DATA_SERVICE__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__DESCRIPTION = DATA_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__IDENTIFIER = DATA_SERVICE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__LANGUAGE = DATA_SERVICE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__RELEASE_DATE = DATA_SERVICE__RELEASE_DATE;

	/**
	 * The feature id for the '<em><b>Update Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__UPDATE_MODIFICATION_DATE = DATA_SERVICE__UPDATE_MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__TITLE = DATA_SERVICE__TITLE;

	/**
	 * The feature id for the '<em><b>Has Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__HAS_PART = DATA_SERVICE__HAS_PART;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__STATUS = DATA_SERVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Endpoint Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__ENDPOINT_DESCRIPTION = DATA_SERVICE__ENDPOINT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Endpoint URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__ENDPOINT_URL = DATA_SERVICE__ENDPOINT_URL;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__ACCESS_RIGHTS = DATA_SERVICE__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__LICENSE = DATA_SERVICE__LICENSE;

	/**
	 * The number of structural features of the '<em>Data Distribution Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE_FEATURE_COUNT = DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dcatcs.impl.DiscoveryServiceImpl <em>Discovery Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.DiscoveryServiceImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getDiscoveryService()
	 * @generated
	 */
	int DISCOVERY_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__CONTACT_POINT = DATA_DISTRIBUTION_SERVICE__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__KEYWORD = DATA_DISTRIBUTION_SERVICE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__LANDING_PAGE = DATA_DISTRIBUTION_SERVICE__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__CONFORMS_TO = DATA_DISTRIBUTION_SERVICE__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__DESCRIPTION = DATA_DISTRIBUTION_SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__IDENTIFIER = DATA_DISTRIBUTION_SERVICE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__LANGUAGE = DATA_DISTRIBUTION_SERVICE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__RELEASE_DATE = DATA_DISTRIBUTION_SERVICE__RELEASE_DATE;

	/**
	 * The feature id for the '<em><b>Update Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__UPDATE_MODIFICATION_DATE = DATA_DISTRIBUTION_SERVICE__UPDATE_MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__TITLE = DATA_DISTRIBUTION_SERVICE__TITLE;

	/**
	 * The feature id for the '<em><b>Has Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__HAS_PART = DATA_DISTRIBUTION_SERVICE__HAS_PART;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__STATUS = DATA_DISTRIBUTION_SERVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Endpoint Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__ENDPOINT_DESCRIPTION = DATA_DISTRIBUTION_SERVICE__ENDPOINT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Endpoint URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__ENDPOINT_URL = DATA_DISTRIBUTION_SERVICE__ENDPOINT_URL;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__ACCESS_RIGHTS = DATA_DISTRIBUTION_SERVICE__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__LICENSE = DATA_DISTRIBUTION_SERVICE__LICENSE;

	/**
	 * The number of structural features of the '<em>Discovery Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_FEATURE_COUNT = DATA_DISTRIBUTION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dcatcs.impl.CSDatasetImpl <em>CS Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.CSDatasetImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getCSDataset()
	 * @generated
	 */
	int CS_DATASET = 6;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__CONTACT_POINT = DATASET__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__KEYWORD = DATASET__KEYWORD;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__LANDING_PAGE = DATASET__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__CONFORMS_TO = DATASET__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__DESCRIPTION = DATASET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__IDENTIFIER = DATASET__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__LANGUAGE = DATASET__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__RELEASE_DATE = DATASET__RELEASE_DATE;

	/**
	 * The feature id for the '<em><b>Update Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__UPDATE_MODIFICATION_DATE = DATASET__UPDATE_MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__TITLE = DATASET__TITLE;

	/**
	 * The feature id for the '<em><b>Has Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__HAS_PART = DATASET__HAS_PART;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__STATUS = DATASET__STATUS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__DISTRIBUTION = DATASET__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Accrual Periodicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__ACCRUAL_PERIODICITY = DATASET__ACCRUAL_PERIODICITY;

	/**
	 * The feature id for the '<em><b>Spatial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__SPATIAL = DATASET__SPATIAL;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__TEMPORAL = DATASET__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Was Generated By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__WAS_GENERATED_BY = DATASET__WAS_GENERATED_BY;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__ABSTRACT = DATASET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bibliographic Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__BIBLIOGRAPHIC_CITATION = DATASET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__METHOD_TYPE = DATASET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__METHOD_SPECIFICATION = DATASET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Hypothesis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__HAS_HYPOTHESIS = DATASET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Instrument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__HAS_INSTRUMENT = DATASET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Quality Assurance Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__DATA_QUALITY_ASSURANCE_METHOD = DATASET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Data Management Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET__DATA_MANAGEMENT_PLAN = DATASET_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>CS Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_DATASET_FEATURE_COUNT = DATASET_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link dcatcs.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.CatalogImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 7;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CONTACT_POINT = DATASET__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__KEYWORD = DATASET__KEYWORD;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__LANDING_PAGE = DATASET__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CONFORMS_TO = DATASET__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DESCRIPTION = DATASET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__IDENTIFIER = DATASET__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__LANGUAGE = DATASET__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__RELEASE_DATE = DATASET__RELEASE_DATE;

	/**
	 * The feature id for the '<em><b>Update Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__UPDATE_MODIFICATION_DATE = DATASET__UPDATE_MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__TITLE = DATASET__TITLE;

	/**
	 * The feature id for the '<em><b>Has Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__HAS_PART = DATASET__HAS_PART;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__STATUS = DATASET__STATUS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DISTRIBUTION = DATASET__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Accrual Periodicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ACCRUAL_PERIODICITY = DATASET__ACCRUAL_PERIODICITY;

	/**
	 * The feature id for the '<em><b>Spatial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__SPATIAL = DATASET__SPATIAL;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__TEMPORAL = DATASET__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Was Generated By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__WAS_GENERATED_BY = DATASET__WAS_GENERATED_BY;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DATASET = DATASET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dataservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DATASERVICE = DATASET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CATALOG = DATASET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Catalogrecord</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CATALOGRECORD = DATASET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Home Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__HOME_PAGE = DATASET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = DATASET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link dcatcs.impl.CatalogRecordImpl <em>Catalog Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.CatalogRecordImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getCatalogRecord()
	 * @generated
	 */
	int CATALOG_RECORD = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__ISSUED = 1;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__MODIFIED = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD__RESOURCE = 4;

	/**
	 * The number of structural features of the '<em>Catalog Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RECORD_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link dcatcs.impl.CSCatalogImpl <em>CS Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.CSCatalogImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getCSCatalog()
	 * @generated
	 */
	int CS_CATALOG = 9;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__CONTACT_POINT = CATALOG__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__KEYWORD = CATALOG__KEYWORD;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__LANDING_PAGE = CATALOG__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__CONFORMS_TO = CATALOG__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__DESCRIPTION = CATALOG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__IDENTIFIER = CATALOG__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__LANGUAGE = CATALOG__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__RELEASE_DATE = CATALOG__RELEASE_DATE;

	/**
	 * The feature id for the '<em><b>Update Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__UPDATE_MODIFICATION_DATE = CATALOG__UPDATE_MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__TITLE = CATALOG__TITLE;

	/**
	 * The feature id for the '<em><b>Has Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__HAS_PART = CATALOG__HAS_PART;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__STATUS = CATALOG__STATUS;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__DISTRIBUTION = CATALOG__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Accrual Periodicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__ACCRUAL_PERIODICITY = CATALOG__ACCRUAL_PERIODICITY;

	/**
	 * The feature id for the '<em><b>Spatial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__SPATIAL = CATALOG__SPATIAL;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__TEMPORAL = CATALOG__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Was Generated By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__WAS_GENERATED_BY = CATALOG__WAS_GENERATED_BY;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__DATASET = CATALOG__DATASET;

	/**
	 * The feature id for the '<em><b>Dataservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__DATASERVICE = CATALOG__DATASERVICE;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__CATALOG = CATALOG__CATALOG;

	/**
	 * The feature id for the '<em><b>Catalogrecord</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__CATALOGRECORD = CATALOG__CATALOGRECORD;

	/**
	 * The feature id for the '<em><b>Home Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__HOME_PAGE = CATALOG__HOME_PAGE;

	/**
	 * The feature id for the '<em><b>Csproject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__CSPROJECT = CATALOG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Program Or Campaign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG__PROGRAM_OR_CAMPAIGN = CATALOG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CS Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_CATALOG_FEATURE_COUNT = CATALOG_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dcatcs.impl.CSProjectImpl <em>CS Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.CSProjectImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getCSProject()
	 * @generated
	 */
	int CS_PROJECT = 10;

	/**
	 * The feature id for the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__CONTACT_POINT = RESOURCE__CONTACT_POINT;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__KEYWORD = RESOURCE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Landing Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__LANDING_PAGE = RESOURCE__LANDING_PAGE;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__CONFORMS_TO = RESOURCE__CONFORMS_TO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__IDENTIFIER = RESOURCE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__LANGUAGE = RESOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__RELEASE_DATE = RESOURCE__RELEASE_DATE;

	/**
	 * The feature id for the '<em><b>Update Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__UPDATE_MODIFICATION_DATE = RESOURCE__UPDATE_MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__TITLE = RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Has Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__HAS_PART = RESOURCE__HAS_PART;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__STATUS = RESOURCE__STATUS;

	/**
	 * The feature id for the '<em><b>Project Aim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_AIM = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Difficulty Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__DIFFICULTY_LEVEL = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Project Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_START_DATE = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Project End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_END_DATE = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Project Science Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_SCIENCE_TYPE = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Un Regions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__UN_REGIONS = RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Project Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_LOCALITY = RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Projectmedia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECTMEDIA = RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_ID = RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Project Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECT_DATE_CREATED = RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Projectgeographiclocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__PROJECTGEOGRAPHICLOCATION = RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT__CONTACTS = RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>CS Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PROJECT_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link dcatcs.impl.ProjectMediaImpl <em>Project Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.ProjectMediaImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getProjectMedia()
	 * @generated
	 */
	int PROJECT_MEDIA = 11;

	/**
	 * The feature id for the '<em><b>Project Media File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MEDIA__PROJECT_MEDIA_FILE = 0;

	/**
	 * The feature id for the '<em><b>Project Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MEDIA__PROJECT_MEDIA_TYPE = 1;

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
	 * The meta object id for the '{@link dcatcs.impl.ProjectGeographicLocationImpl <em>Project Geographic Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.ProjectGeographicLocationImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getProjectGeographicLocation()
	 * @generated
	 */
	int PROJECT_GEOGRAPHIC_LOCATION = 12;

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
	 * The meta object id for the '{@link dcatcs.impl.ContactPointImpl <em>Contact Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dcatcs.impl.ContactPointImpl
	 * @see dcatcs.impl.DcatcsPackageImpl#getContactPoint()
	 * @generated
	 */
	int CONTACT_POINT = 13;

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
	 * Returns the meta object for class '{@link dcatcs.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see dcatcs.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Resource#getContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Point</em>'.
	 * @see dcatcs.Resource#getContactPoint()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ContactPoint();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Resource#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see dcatcs.Resource#getKeyword()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Resource#getLandingPage <em>Landing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Landing Page</em>'.
	 * @see dcatcs.Resource#getLandingPage()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_LandingPage();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Resource#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conforms To</em>'.
	 * @see dcatcs.Resource#getConformsTo()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ConformsTo();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Resource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dcatcs.Resource#getDescription()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Description();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Resource#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see dcatcs.Resource#getIdentifier()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Resource#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see dcatcs.Resource#getLanguage()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Language();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Resource#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see dcatcs.Resource#getReleaseDate()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ReleaseDate();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Resource#getUpdateModificationDate <em>Update Modification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Modification Date</em>'.
	 * @see dcatcs.Resource#getUpdateModificationDate()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_UpdateModificationDate();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Resource#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dcatcs.Resource#getTitle()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Title();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Resource#getHasPart <em>Has Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Part</em>'.
	 * @see dcatcs.Resource#getHasPart()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_HasPart();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Resource#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see dcatcs.Resource#getStatus()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Status();

	/**
	 * Returns the meta object for class '{@link dcatcs.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see dcatcs.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the containment reference list '{@link dcatcs.Dataset#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distribution</em>'.
	 * @see dcatcs.Dataset#getDistribution()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Dataset#getAccrualPeriodicity <em>Accrual Periodicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accrual Periodicity</em>'.
	 * @see dcatcs.Dataset#getAccrualPeriodicity()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_AccrualPeriodicity();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Dataset#getSpatial <em>Spatial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spatial</em>'.
	 * @see dcatcs.Dataset#getSpatial()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Spatial();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Dataset#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see dcatcs.Dataset#getTemporal()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Temporal();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Dataset#getWasGeneratedBy <em>Was Generated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Was Generated By</em>'.
	 * @see dcatcs.Dataset#getWasGeneratedBy()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_WasGeneratedBy();

	/**
	 * Returns the meta object for class '{@link dcatcs.DataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Service</em>'.
	 * @see dcatcs.DataService
	 * @generated
	 */
	EClass getDataService();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.DataService#getEndpointDescription <em>Endpoint Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Description</em>'.
	 * @see dcatcs.DataService#getEndpointDescription()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_EndpointDescription();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.DataService#getEndpointURL <em>Endpoint URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint URL</em>'.
	 * @see dcatcs.DataService#getEndpointURL()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_EndpointURL();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.DataService#getAccessRights <em>Access Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Rights</em>'.
	 * @see dcatcs.DataService#getAccessRights()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_AccessRights();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.DataService#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see dcatcs.DataService#getLicense()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_License();

	/**
	 * Returns the meta object for class '{@link dcatcs.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see dcatcs.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for the containment reference list '{@link dcatcs.Distribution#getDatadistributionservice <em>Datadistributionservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datadistributionservice</em>'.
	 * @see dcatcs.Distribution#getDatadistributionservice()
	 * @see #getDistribution()
	 * @generated
	 */
	EReference getDistribution_Datadistributionservice();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Distribution#getAccessURL <em>Access URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access URL</em>'.
	 * @see dcatcs.Distribution#getAccessURL()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_AccessURL();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Distribution#getByteSize <em>Byte Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Size</em>'.
	 * @see dcatcs.Distribution#getByteSize()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_ByteSize();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Distribution#getDownloadURL <em>Download URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download URL</em>'.
	 * @see dcatcs.Distribution#getDownloadURL()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_DownloadURL();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Distribution#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see dcatcs.Distribution#getMediaType()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_MediaType();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Distribution#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conforms To</em>'.
	 * @see dcatcs.Distribution#getConformsTo()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_ConformsTo();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Distribution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dcatcs.Distribution#getDescription()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_Description();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Distribution#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see dcatcs.Distribution#getFormat()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_Format();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Distribution#getIssued <em>Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issued</em>'.
	 * @see dcatcs.Distribution#getIssued()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_Issued();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Distribution#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see dcatcs.Distribution#getLicense()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_License();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Distribution#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see dcatcs.Distribution#getModified()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_Modified();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Distribution#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rights</em>'.
	 * @see dcatcs.Distribution#getRights()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_Rights();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Distribution#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dcatcs.Distribution#getTitle()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_Title();

	/**
	 * Returns the meta object for class '{@link dcatcs.DataDistributionService <em>Data Distribution Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Distribution Service</em>'.
	 * @see dcatcs.DataDistributionService
	 * @generated
	 */
	EClass getDataDistributionService();

	/**
	 * Returns the meta object for class '{@link dcatcs.DiscoveryService <em>Discovery Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovery Service</em>'.
	 * @see dcatcs.DiscoveryService
	 * @generated
	 */
	EClass getDiscoveryService();

	/**
	 * Returns the meta object for class '{@link dcatcs.CSDataset <em>CS Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS Dataset</em>'.
	 * @see dcatcs.CSDataset
	 * @generated
	 */
	EClass getCSDataset();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSDataset#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see dcatcs.CSDataset#getAbstract()
	 * @see #getCSDataset()
	 * @generated
	 */
	EAttribute getCSDataset_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSDataset#getBibliographicCitation <em>Bibliographic Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bibliographic Citation</em>'.
	 * @see dcatcs.CSDataset#getBibliographicCitation()
	 * @see #getCSDataset()
	 * @generated
	 */
	EAttribute getCSDataset_BibliographicCitation();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSDataset#getMethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Type</em>'.
	 * @see dcatcs.CSDataset#getMethodType()
	 * @see #getCSDataset()
	 * @generated
	 */
	EAttribute getCSDataset_MethodType();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSDataset#getMethodSpecification <em>Method Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Specification</em>'.
	 * @see dcatcs.CSDataset#getMethodSpecification()
	 * @see #getCSDataset()
	 * @generated
	 */
	EAttribute getCSDataset_MethodSpecification();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSDataset#getHasHypothesis <em>Has Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Hypothesis</em>'.
	 * @see dcatcs.CSDataset#getHasHypothesis()
	 * @see #getCSDataset()
	 * @generated
	 */
	EAttribute getCSDataset_HasHypothesis();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSDataset#getHasInstrument <em>Has Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Instrument</em>'.
	 * @see dcatcs.CSDataset#getHasInstrument()
	 * @see #getCSDataset()
	 * @generated
	 */
	EAttribute getCSDataset_HasInstrument();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSDataset#getDataQualityAssuranceMethod <em>Data Quality Assurance Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Quality Assurance Method</em>'.
	 * @see dcatcs.CSDataset#getDataQualityAssuranceMethod()
	 * @see #getCSDataset()
	 * @generated
	 */
	EAttribute getCSDataset_DataQualityAssuranceMethod();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSDataset#getDataManagementPlan <em>Data Management Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Management Plan</em>'.
	 * @see dcatcs.CSDataset#getDataManagementPlan()
	 * @see #getCSDataset()
	 * @generated
	 */
	EAttribute getCSDataset_DataManagementPlan();

	/**
	 * Returns the meta object for class '{@link dcatcs.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see dcatcs.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link dcatcs.Catalog#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset</em>'.
	 * @see dcatcs.Catalog#getDataset()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Dataset();

	/**
	 * Returns the meta object for the reference '{@link dcatcs.Catalog#getDataservice <em>Dataservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataservice</em>'.
	 * @see dcatcs.Catalog#getDataservice()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Dataservice();

	/**
	 * Returns the meta object for the containment reference list '{@link dcatcs.Catalog#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalog</em>'.
	 * @see dcatcs.Catalog#getCatalog()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Catalog();

	/**
	 * Returns the meta object for the containment reference list '{@link dcatcs.Catalog#getCatalogrecord <em>Catalogrecord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalogrecord</em>'.
	 * @see dcatcs.Catalog#getCatalogrecord()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Catalogrecord();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.Catalog#getHomePage <em>Home Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Page</em>'.
	 * @see dcatcs.Catalog#getHomePage()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_HomePage();

	/**
	 * Returns the meta object for class '{@link dcatcs.CatalogRecord <em>Catalog Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Record</em>'.
	 * @see dcatcs.CatalogRecord
	 * @generated
	 */
	EClass getCatalogRecord();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CatalogRecord#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dcatcs.CatalogRecord#getDescription()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EAttribute getCatalogRecord_Description();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CatalogRecord#getIssued <em>Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issued</em>'.
	 * @see dcatcs.CatalogRecord#getIssued()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EAttribute getCatalogRecord_Issued();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CatalogRecord#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see dcatcs.CatalogRecord#getModified()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EAttribute getCatalogRecord_Modified();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CatalogRecord#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dcatcs.CatalogRecord#getTitle()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EAttribute getCatalogRecord_Title();

	/**
	 * Returns the meta object for the reference '{@link dcatcs.CatalogRecord#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see dcatcs.CatalogRecord#getResource()
	 * @see #getCatalogRecord()
	 * @generated
	 */
	EReference getCatalogRecord_Resource();

	/**
	 * Returns the meta object for class '{@link dcatcs.CSCatalog <em>CS Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS Catalog</em>'.
	 * @see dcatcs.CSCatalog
	 * @generated
	 */
	EClass getCSCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link dcatcs.CSCatalog#getCsproject <em>Csproject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Csproject</em>'.
	 * @see dcatcs.CSCatalog#getCsproject()
	 * @see #getCSCatalog()
	 * @generated
	 */
	EReference getCSCatalog_Csproject();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSCatalog#getProgramOrCampaign <em>Program Or Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Or Campaign</em>'.
	 * @see dcatcs.CSCatalog#getProgramOrCampaign()
	 * @see #getCSCatalog()
	 * @generated
	 */
	EAttribute getCSCatalog_ProgramOrCampaign();

	/**
	 * Returns the meta object for class '{@link dcatcs.CSProject <em>CS Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS Project</em>'.
	 * @see dcatcs.CSProject
	 * @generated
	 */
	EClass getCSProject();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSProject#getProjectAim <em>Project Aim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Aim</em>'.
	 * @see dcatcs.CSProject#getProjectAim()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectAim();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSProject#getDifficultyLevel <em>Difficulty Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty Level</em>'.
	 * @see dcatcs.CSProject#getDifficultyLevel()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_DifficultyLevel();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSProject#getProjectStartDate <em>Project Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Start Date</em>'.
	 * @see dcatcs.CSProject#getProjectStartDate()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectStartDate();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSProject#getProjectEndDate <em>Project End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project End Date</em>'.
	 * @see dcatcs.CSProject#getProjectEndDate()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectEndDate();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSProject#getProjectScienceType <em>Project Science Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Science Type</em>'.
	 * @see dcatcs.CSProject#getProjectScienceType()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectScienceType();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSProject#getUnRegions <em>Un Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Un Regions</em>'.
	 * @see dcatcs.CSProject#getUnRegions()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_UnRegions();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSProject#getProjectLocality <em>Project Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Locality</em>'.
	 * @see dcatcs.CSProject#getProjectLocality()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectLocality();

	/**
	 * Returns the meta object for the containment reference list '{@link dcatcs.CSProject#getProjectmedia <em>Projectmedia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projectmedia</em>'.
	 * @see dcatcs.CSProject#getProjectmedia()
	 * @see #getCSProject()
	 * @generated
	 */
	EReference getCSProject_Projectmedia();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSProject#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see dcatcs.CSProject#getProjectId()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.CSProject#getProjectDateCreated <em>Project Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Date Created</em>'.
	 * @see dcatcs.CSProject#getProjectDateCreated()
	 * @see #getCSProject()
	 * @generated
	 */
	EAttribute getCSProject_ProjectDateCreated();

	/**
	 * Returns the meta object for the containment reference list '{@link dcatcs.CSProject#getProjectgeographiclocation <em>Projectgeographiclocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projectgeographiclocation</em>'.
	 * @see dcatcs.CSProject#getProjectgeographiclocation()
	 * @see #getCSProject()
	 * @generated
	 */
	EReference getCSProject_Projectgeographiclocation();

	/**
	 * Returns the meta object for the containment reference list '{@link dcatcs.CSProject#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contacts</em>'.
	 * @see dcatcs.CSProject#getContacts()
	 * @see #getCSProject()
	 * @generated
	 */
	EReference getCSProject_Contacts();

	/**
	 * Returns the meta object for class '{@link dcatcs.ProjectMedia <em>Project Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Media</em>'.
	 * @see dcatcs.ProjectMedia
	 * @generated
	 */
	EClass getProjectMedia();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ProjectMedia#getProjectMediaFile <em>Project Media File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Media File</em>'.
	 * @see dcatcs.ProjectMedia#getProjectMediaFile()
	 * @see #getProjectMedia()
	 * @generated
	 */
	EAttribute getProjectMedia_ProjectMediaFile();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ProjectMedia#getProjectMediaType <em>Project Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Media Type</em>'.
	 * @see dcatcs.ProjectMedia#getProjectMediaType()
	 * @see #getProjectMedia()
	 * @generated
	 */
	EAttribute getProjectMedia_ProjectMediaType();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ProjectMedia#getProjectMediaCredit <em>Project Media Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Media Credit</em>'.
	 * @see dcatcs.ProjectMedia#getProjectMediaCredit()
	 * @see #getProjectMedia()
	 * @generated
	 */
	EAttribute getProjectMedia_ProjectMediaCredit();

	/**
	 * Returns the meta object for class '{@link dcatcs.ProjectGeographicLocation <em>Project Geographic Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Geographic Location</em>'.
	 * @see dcatcs.ProjectGeographicLocation
	 * @generated
	 */
	EClass getProjectGeographicLocation();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ProjectGeographicLocation#getProjectPinLatitude <em>Project Pin Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Pin Latitude</em>'.
	 * @see dcatcs.ProjectGeographicLocation#getProjectPinLatitude()
	 * @see #getProjectGeographicLocation()
	 * @generated
	 */
	EAttribute getProjectGeographicLocation_ProjectPinLatitude();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ProjectGeographicLocation#getProjectPinLongitude <em>Project Pin Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Pin Longitude</em>'.
	 * @see dcatcs.ProjectGeographicLocation#getProjectPinLongitude()
	 * @see #getProjectGeographicLocation()
	 * @generated
	 */
	EAttribute getProjectGeographicLocation_ProjectPinLongitude();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ProjectGeographicLocation#getProjectGeographicCoverage <em>Project Geographic Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Geographic Coverage</em>'.
	 * @see dcatcs.ProjectGeographicLocation#getProjectGeographicCoverage()
	 * @see #getProjectGeographicLocation()
	 * @generated
	 */
	EAttribute getProjectGeographicLocation_ProjectGeographicCoverage();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLatitude <em>Project Geographic Coverage Centroid Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Geographic Coverage Centroid Latitude</em>'.
	 * @see dcatcs.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLatitude()
	 * @see #getProjectGeographicLocation()
	 * @generated
	 */
	EAttribute getProjectGeographicLocation_ProjectGeographicCoverageCentroidLatitude();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLongitude <em>Project Geographic Coverage Centroid Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Geographic Coverage Centroid Longitude</em>'.
	 * @see dcatcs.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLongitude()
	 * @see #getProjectGeographicLocation()
	 * @generated
	 */
	EAttribute getProjectGeographicLocation_ProjectGeographicCoverageCentroidLongitude();

	/**
	 * Returns the meta object for class '{@link dcatcs.ContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Point</em>'.
	 * @see dcatcs.ContactPoint
	 * @generated
	 */
	EClass getContactPoint();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ContactPoint#getContactName <em>Contact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Name</em>'.
	 * @see dcatcs.ContactPoint#getContactName()
	 * @see #getContactPoint()
	 * @generated
	 */
	EAttribute getContactPoint_ContactName();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ContactPoint#getMeansOfContact <em>Means Of Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Means Of Contact</em>'.
	 * @see dcatcs.ContactPoint#getMeansOfContact()
	 * @see #getContactPoint()
	 * @generated
	 */
	EAttribute getContactPoint_MeansOfContact();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ContactPoint#getContactDetails <em>Contact Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Details</em>'.
	 * @see dcatcs.ContactPoint#getContactDetails()
	 * @see #getContactPoint()
	 * @generated
	 */
	EAttribute getContactPoint_ContactDetails();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ContactPoint#getContactPointType <em>Contact Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Point Type</em>'.
	 * @see dcatcs.ContactPoint#getContactPointType()
	 * @see #getContactPoint()
	 * @generated
	 */
	EAttribute getContactPoint_ContactPointType();

	/**
	 * Returns the meta object for the attribute '{@link dcatcs.ContactPoint#getContactEmail <em>Contact Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Email</em>'.
	 * @see dcatcs.ContactPoint#getContactEmail()
	 * @see #getContactPoint()
	 * @generated
	 */
	EAttribute getContactPoint_ContactEmail();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DcatcsFactory getDcatcsFactory();

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
		 * The meta object literal for the '{@link dcatcs.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.ResourceImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Contact Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__CONTACT_POINT = eINSTANCE.getResource_ContactPoint();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__KEYWORD = eINSTANCE.getResource_Keyword();

		/**
		 * The meta object literal for the '<em><b>Landing Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__LANDING_PAGE = eINSTANCE.getResource_LandingPage();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__CONFORMS_TO = eINSTANCE.getResource_ConformsTo();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DESCRIPTION = eINSTANCE.getResource_Description();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__IDENTIFIER = eINSTANCE.getResource_Identifier();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__LANGUAGE = eINSTANCE.getResource_Language();

		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__RELEASE_DATE = eINSTANCE.getResource_ReleaseDate();

		/**
		 * The meta object literal for the '<em><b>Update Modification Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__UPDATE_MODIFICATION_DATE = eINSTANCE.getResource_UpdateModificationDate();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TITLE = eINSTANCE.getResource_Title();

		/**
		 * The meta object literal for the '<em><b>Has Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__HAS_PART = eINSTANCE.getResource_HasPart();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__STATUS = eINSTANCE.getResource_Status();

		/**
		 * The meta object literal for the '{@link dcatcs.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.DatasetImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__DISTRIBUTION = eINSTANCE.getDataset_Distribution();

		/**
		 * The meta object literal for the '<em><b>Accrual Periodicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__ACCRUAL_PERIODICITY = eINSTANCE.getDataset_AccrualPeriodicity();

		/**
		 * The meta object literal for the '<em><b>Spatial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__SPATIAL = eINSTANCE.getDataset_Spatial();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__TEMPORAL = eINSTANCE.getDataset_Temporal();

		/**
		 * The meta object literal for the '<em><b>Was Generated By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__WAS_GENERATED_BY = eINSTANCE.getDataset_WasGeneratedBy();

		/**
		 * The meta object literal for the '{@link dcatcs.impl.DataServiceImpl <em>Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.DataServiceImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getDataService()
		 * @generated
		 */
		EClass DATA_SERVICE = eINSTANCE.getDataService();

		/**
		 * The meta object literal for the '<em><b>Endpoint Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SERVICE__ENDPOINT_DESCRIPTION = eINSTANCE.getDataService_EndpointDescription();

		/**
		 * The meta object literal for the '<em><b>Endpoint URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SERVICE__ENDPOINT_URL = eINSTANCE.getDataService_EndpointURL();

		/**
		 * The meta object literal for the '<em><b>Access Rights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SERVICE__ACCESS_RIGHTS = eINSTANCE.getDataService_AccessRights();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SERVICE__LICENSE = eINSTANCE.getDataService_License();

		/**
		 * The meta object literal for the '{@link dcatcs.impl.DistributionImpl <em>Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.DistributionImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

		/**
		 * The meta object literal for the '<em><b>Datadistributionservice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION__DATADISTRIBUTIONSERVICE = eINSTANCE.getDistribution_Datadistributionservice();

		/**
		 * The meta object literal for the '<em><b>Access URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__ACCESS_URL = eINSTANCE.getDistribution_AccessURL();

		/**
		 * The meta object literal for the '<em><b>Byte Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__BYTE_SIZE = eINSTANCE.getDistribution_ByteSize();

		/**
		 * The meta object literal for the '<em><b>Download URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__DOWNLOAD_URL = eINSTANCE.getDistribution_DownloadURL();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__MEDIA_TYPE = eINSTANCE.getDistribution_MediaType();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__CONFORMS_TO = eINSTANCE.getDistribution_ConformsTo();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__DESCRIPTION = eINSTANCE.getDistribution_Description();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__FORMAT = eINSTANCE.getDistribution_Format();

		/**
		 * The meta object literal for the '<em><b>Issued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__ISSUED = eINSTANCE.getDistribution_Issued();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__LICENSE = eINSTANCE.getDistribution_License();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__MODIFIED = eINSTANCE.getDistribution_Modified();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__RIGHTS = eINSTANCE.getDistribution_Rights();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__TITLE = eINSTANCE.getDistribution_Title();

		/**
		 * The meta object literal for the '{@link dcatcs.impl.DataDistributionServiceImpl <em>Data Distribution Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.DataDistributionServiceImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getDataDistributionService()
		 * @generated
		 */
		EClass DATA_DISTRIBUTION_SERVICE = eINSTANCE.getDataDistributionService();

		/**
		 * The meta object literal for the '{@link dcatcs.impl.DiscoveryServiceImpl <em>Discovery Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.DiscoveryServiceImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getDiscoveryService()
		 * @generated
		 */
		EClass DISCOVERY_SERVICE = eINSTANCE.getDiscoveryService();

		/**
		 * The meta object literal for the '{@link dcatcs.impl.CSDatasetImpl <em>CS Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.CSDatasetImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getCSDataset()
		 * @generated
		 */
		EClass CS_DATASET = eINSTANCE.getCSDataset();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_DATASET__ABSTRACT = eINSTANCE.getCSDataset_Abstract();

		/**
		 * The meta object literal for the '<em><b>Bibliographic Citation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_DATASET__BIBLIOGRAPHIC_CITATION = eINSTANCE.getCSDataset_BibliographicCitation();

		/**
		 * The meta object literal for the '<em><b>Method Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_DATASET__METHOD_TYPE = eINSTANCE.getCSDataset_MethodType();

		/**
		 * The meta object literal for the '<em><b>Method Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_DATASET__METHOD_SPECIFICATION = eINSTANCE.getCSDataset_MethodSpecification();

		/**
		 * The meta object literal for the '<em><b>Has Hypothesis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_DATASET__HAS_HYPOTHESIS = eINSTANCE.getCSDataset_HasHypothesis();

		/**
		 * The meta object literal for the '<em><b>Has Instrument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_DATASET__HAS_INSTRUMENT = eINSTANCE.getCSDataset_HasInstrument();

		/**
		 * The meta object literal for the '<em><b>Data Quality Assurance Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_DATASET__DATA_QUALITY_ASSURANCE_METHOD = eINSTANCE.getCSDataset_DataQualityAssuranceMethod();

		/**
		 * The meta object literal for the '<em><b>Data Management Plan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_DATASET__DATA_MANAGEMENT_PLAN = eINSTANCE.getCSDataset_DataManagementPlan();

		/**
		 * The meta object literal for the '{@link dcatcs.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.CatalogImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__DATASET = eINSTANCE.getCatalog_Dataset();

		/**
		 * The meta object literal for the '<em><b>Dataservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__DATASERVICE = eINSTANCE.getCatalog_Dataservice();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__CATALOG = eINSTANCE.getCatalog_Catalog();

		/**
		 * The meta object literal for the '<em><b>Catalogrecord</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__CATALOGRECORD = eINSTANCE.getCatalog_Catalogrecord();

		/**
		 * The meta object literal for the '<em><b>Home Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG__HOME_PAGE = eINSTANCE.getCatalog_HomePage();

		/**
		 * The meta object literal for the '{@link dcatcs.impl.CatalogRecordImpl <em>Catalog Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.CatalogRecordImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getCatalogRecord()
		 * @generated
		 */
		EClass CATALOG_RECORD = eINSTANCE.getCatalogRecord();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RECORD__DESCRIPTION = eINSTANCE.getCatalogRecord_Description();

		/**
		 * The meta object literal for the '<em><b>Issued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RECORD__ISSUED = eINSTANCE.getCatalogRecord_Issued();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RECORD__MODIFIED = eINSTANCE.getCatalogRecord_Modified();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RECORD__TITLE = eINSTANCE.getCatalogRecord_Title();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_RECORD__RESOURCE = eINSTANCE.getCatalogRecord_Resource();

		/**
		 * The meta object literal for the '{@link dcatcs.impl.CSCatalogImpl <em>CS Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.CSCatalogImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getCSCatalog()
		 * @generated
		 */
		EClass CS_CATALOG = eINSTANCE.getCSCatalog();

		/**
		 * The meta object literal for the '<em><b>Csproject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_CATALOG__CSPROJECT = eINSTANCE.getCSCatalog_Csproject();

		/**
		 * The meta object literal for the '<em><b>Program Or Campaign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_CATALOG__PROGRAM_OR_CAMPAIGN = eINSTANCE.getCSCatalog_ProgramOrCampaign();

		/**
		 * The meta object literal for the '{@link dcatcs.impl.CSProjectImpl <em>CS Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.CSProjectImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getCSProject()
		 * @generated
		 */
		EClass CS_PROJECT = eINSTANCE.getCSProject();

		/**
		 * The meta object literal for the '<em><b>Project Aim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_AIM = eINSTANCE.getCSProject_ProjectAim();

		/**
		 * The meta object literal for the '<em><b>Difficulty Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__DIFFICULTY_LEVEL = eINSTANCE.getCSProject_DifficultyLevel();

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
		 * The meta object literal for the '<em><b>Project Science Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_SCIENCE_TYPE = eINSTANCE.getCSProject_ProjectScienceType();

		/**
		 * The meta object literal for the '<em><b>Un Regions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__UN_REGIONS = eINSTANCE.getCSProject_UnRegions();

		/**
		 * The meta object literal for the '<em><b>Project Locality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PROJECT__PROJECT_LOCALITY = eINSTANCE.getCSProject_ProjectLocality();

		/**
		 * The meta object literal for the '<em><b>Projectmedia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_PROJECT__PROJECTMEDIA = eINSTANCE.getCSProject_Projectmedia();

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
		 * The meta object literal for the '<em><b>Projectgeographiclocation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_PROJECT__PROJECTGEOGRAPHICLOCATION = eINSTANCE.getCSProject_Projectgeographiclocation();

		/**
		 * The meta object literal for the '<em><b>Contacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_PROJECT__CONTACTS = eINSTANCE.getCSProject_Contacts();

		/**
		 * The meta object literal for the '{@link dcatcs.impl.ProjectMediaImpl <em>Project Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.ProjectMediaImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getProjectMedia()
		 * @generated
		 */
		EClass PROJECT_MEDIA = eINSTANCE.getProjectMedia();

		/**
		 * The meta object literal for the '<em><b>Project Media File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_MEDIA__PROJECT_MEDIA_FILE = eINSTANCE.getProjectMedia_ProjectMediaFile();

		/**
		 * The meta object literal for the '<em><b>Project Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_MEDIA__PROJECT_MEDIA_TYPE = eINSTANCE.getProjectMedia_ProjectMediaType();

		/**
		 * The meta object literal for the '<em><b>Project Media Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_MEDIA__PROJECT_MEDIA_CREDIT = eINSTANCE.getProjectMedia_ProjectMediaCredit();

		/**
		 * The meta object literal for the '{@link dcatcs.impl.ProjectGeographicLocationImpl <em>Project Geographic Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.ProjectGeographicLocationImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getProjectGeographicLocation()
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
		 * The meta object literal for the '{@link dcatcs.impl.ContactPointImpl <em>Contact Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dcatcs.impl.ContactPointImpl
		 * @see dcatcs.impl.DcatcsPackageImpl#getContactPoint()
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

	}

} //DcatcsPackage
