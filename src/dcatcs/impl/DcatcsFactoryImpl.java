/**
 */
package dcatcs.impl;

import dcatcs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DcatcsFactoryImpl extends EFactoryImpl implements DcatcsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DcatcsFactory init() {
		try {
			DcatcsFactory theDcatcsFactory = (DcatcsFactory)EPackage.Registry.INSTANCE.getEFactory(DcatcsPackage.eNS_URI);
			if (theDcatcsFactory != null) {
				return theDcatcsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DcatcsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcatcsFactoryImpl() {
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
			case DcatcsPackage.DATASET: return createDataset();
			case DcatcsPackage.DATA_SERVICE: return createDataService();
			case DcatcsPackage.DISTRIBUTION: return createDistribution();
			case DcatcsPackage.DATA_DISTRIBUTION_SERVICE: return createDataDistributionService();
			case DcatcsPackage.DISCOVERY_SERVICE: return createDiscoveryService();
			case DcatcsPackage.CS_DATASET: return createCSDataset();
			case DcatcsPackage.CATALOG: return createCatalog();
			case DcatcsPackage.CATALOG_RECORD: return createCatalogRecord();
			case DcatcsPackage.CS_CATALOG: return createCSCatalog();
			case DcatcsPackage.CS_PROJECT: return createCSProject();
			case DcatcsPackage.PROJECT_MEDIA: return createProjectMedia();
			case DcatcsPackage.PROJECT_GEOGRAPHIC_LOCATION: return createProjectGeographicLocation();
			case DcatcsPackage.CONTACT_POINT: return createContactPoint();
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
	public Dataset createDataset() {
		DatasetImpl dataset = new DatasetImpl();
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataService createDataService() {
		DataServiceImpl dataService = new DataServiceImpl();
		return dataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Distribution createDistribution() {
		DistributionImpl distribution = new DistributionImpl();
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataDistributionService createDataDistributionService() {
		DataDistributionServiceImpl dataDistributionService = new DataDistributionServiceImpl();
		return dataDistributionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscoveryService createDiscoveryService() {
		DiscoveryServiceImpl discoveryService = new DiscoveryServiceImpl();
		return discoveryService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSDataset createCSDataset() {
		CSDatasetImpl csDataset = new CSDatasetImpl();
		return csDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalog createCatalog() {
		CatalogImpl catalog = new CatalogImpl();
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogRecord createCatalogRecord() {
		CatalogRecordImpl catalogRecord = new CatalogRecordImpl();
		return catalogRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSCatalog createCSCatalog() {
		CSCatalogImpl csCatalog = new CSCatalogImpl();
		return csCatalog;
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
	public DcatcsPackage getDcatcsPackage() {
		return (DcatcsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DcatcsPackage getPackage() {
		return DcatcsPackage.eINSTANCE;
	}

} //DcatcsFactoryImpl
