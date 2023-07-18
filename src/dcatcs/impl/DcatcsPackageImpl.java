/**
 */
package dcatcs.impl;

import dcatcs.CSCatalog;
import dcatcs.CSDataset;
import dcatcs.CSProject;
import dcatcs.Catalog;
import dcatcs.CatalogRecord;
import dcatcs.ContactPoint;
import dcatcs.DataDistributionService;
import dcatcs.DataService;
import dcatcs.Dataset;
import dcatcs.DcatcsFactory;
import dcatcs.DcatcsPackage;
import dcatcs.DiscoveryService;
import dcatcs.Distribution;
import dcatcs.ProjectGeographicLocation;
import dcatcs.ProjectMedia;
import dcatcs.Resource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DcatcsPackageImpl extends EPackageImpl implements DcatcsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDistributionServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoveryServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectMediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectGeographicLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactPointEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dcatcs.DcatcsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DcatcsPackageImpl() {
		super(eNS_URI, DcatcsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DcatcsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DcatcsPackage init() {
		if (isInited) return (DcatcsPackage)EPackage.Registry.INSTANCE.getEPackage(DcatcsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDcatcsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DcatcsPackageImpl theDcatcsPackage = registeredDcatcsPackage instanceof DcatcsPackageImpl ? (DcatcsPackageImpl)registeredDcatcsPackage : new DcatcsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDcatcsPackage.createPackageContents();

		// Initialize created meta-data
		theDcatcsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDcatcsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DcatcsPackage.eNS_URI, theDcatcsPackage);
		return theDcatcsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_ContactPoint() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Keyword() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_LandingPage() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_ConformsTo() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Description() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Identifier() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Language() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_ReleaseDate() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_UpdateModificationDate() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Title() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_HasPart() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Status() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataset() {
		return datasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataset_Distribution() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_AccrualPeriodicity() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_Spatial() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_Temporal() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_WasGeneratedBy() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataService() {
		return dataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataService_EndpointDescription() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataService_EndpointURL() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataService_AccessRights() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataService_License() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistribution() {
		return distributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistribution_Datadistributionservice() {
		return (EReference)distributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_AccessURL() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_ByteSize() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_DownloadURL() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_MediaType() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_ConformsTo() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_Description() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_Format() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_Issued() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_License() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_Modified() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_Rights() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistribution_Title() {
		return (EAttribute)distributionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataDistributionService() {
		return dataDistributionServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscoveryService() {
		return discoveryServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCSDataset() {
		return csDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSDataset_Abstract() {
		return (EAttribute)csDatasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSDataset_BibliographicCitation() {
		return (EAttribute)csDatasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSDataset_MethodType() {
		return (EAttribute)csDatasetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSDataset_MethodSpecification() {
		return (EAttribute)csDatasetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSDataset_HasHypothesis() {
		return (EAttribute)csDatasetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSDataset_HasInstrument() {
		return (EAttribute)csDatasetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSDataset_DataQualityAssuranceMethod() {
		return (EAttribute)csDatasetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSDataset_DataManagementPlan() {
		return (EAttribute)csDatasetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Dataset() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Dataservice() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Catalog() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Catalogrecord() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalog_HomePage() {
		return (EAttribute)catalogEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogRecord() {
		return catalogRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogRecord_Description() {
		return (EAttribute)catalogRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogRecord_Issued() {
		return (EAttribute)catalogRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogRecord_Modified() {
		return (EAttribute)catalogRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogRecord_Title() {
		return (EAttribute)catalogRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogRecord_Resource() {
		return (EReference)catalogRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCSCatalog() {
		return csCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCSCatalog_Csproject() {
		return (EReference)csCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSCatalog_ProgramOrCampaign() {
		return (EAttribute)csCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCSProject() {
		return csProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectAim() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_DifficultyLevel() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectStartDate() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectEndDate() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectScienceType() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_UnRegions() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectLocality() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCSProject_Projectmedia() {
		return (EReference)csProjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectId() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectDateCreated() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCSProject_Projectgeographiclocation() {
		return (EReference)csProjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCSProject_Contacts() {
		return (EReference)csProjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectMedia() {
		return projectMediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectMedia_ProjectMediaFile() {
		return (EAttribute)projectMediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectMedia_ProjectMediaType() {
		return (EAttribute)projectMediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectMedia_ProjectMediaCredit() {
		return (EAttribute)projectMediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectGeographicLocation() {
		return projectGeographicLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectGeographicLocation_ProjectPinLatitude() {
		return (EAttribute)projectGeographicLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectGeographicLocation_ProjectPinLongitude() {
		return (EAttribute)projectGeographicLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectGeographicLocation_ProjectGeographicCoverage() {
		return (EAttribute)projectGeographicLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectGeographicLocation_ProjectGeographicCoverageCentroidLatitude() {
		return (EAttribute)projectGeographicLocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectGeographicLocation_ProjectGeographicCoverageCentroidLongitude() {
		return (EAttribute)projectGeographicLocationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactPoint() {
		return contactPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPoint_ContactName() {
		return (EAttribute)contactPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPoint_MeansOfContact() {
		return (EAttribute)contactPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPoint_ContactDetails() {
		return (EAttribute)contactPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPoint_ContactPointType() {
		return (EAttribute)contactPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactPoint_ContactEmail() {
		return (EAttribute)contactPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcatcsFactory getDcatcsFactory() {
		return (DcatcsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__CONTACT_POINT);
		createEAttribute(resourceEClass, RESOURCE__KEYWORD);
		createEAttribute(resourceEClass, RESOURCE__LANDING_PAGE);
		createEAttribute(resourceEClass, RESOURCE__CONFORMS_TO);
		createEAttribute(resourceEClass, RESOURCE__DESCRIPTION);
		createEAttribute(resourceEClass, RESOURCE__IDENTIFIER);
		createEAttribute(resourceEClass, RESOURCE__LANGUAGE);
		createEAttribute(resourceEClass, RESOURCE__RELEASE_DATE);
		createEAttribute(resourceEClass, RESOURCE__UPDATE_MODIFICATION_DATE);
		createEAttribute(resourceEClass, RESOURCE__TITLE);
		createEAttribute(resourceEClass, RESOURCE__HAS_PART);
		createEAttribute(resourceEClass, RESOURCE__STATUS);

		datasetEClass = createEClass(DATASET);
		createEReference(datasetEClass, DATASET__DISTRIBUTION);
		createEAttribute(datasetEClass, DATASET__ACCRUAL_PERIODICITY);
		createEAttribute(datasetEClass, DATASET__SPATIAL);
		createEAttribute(datasetEClass, DATASET__TEMPORAL);
		createEAttribute(datasetEClass, DATASET__WAS_GENERATED_BY);

		dataServiceEClass = createEClass(DATA_SERVICE);
		createEAttribute(dataServiceEClass, DATA_SERVICE__ENDPOINT_DESCRIPTION);
		createEAttribute(dataServiceEClass, DATA_SERVICE__ENDPOINT_URL);
		createEAttribute(dataServiceEClass, DATA_SERVICE__ACCESS_RIGHTS);
		createEAttribute(dataServiceEClass, DATA_SERVICE__LICENSE);

		distributionEClass = createEClass(DISTRIBUTION);
		createEReference(distributionEClass, DISTRIBUTION__DATADISTRIBUTIONSERVICE);
		createEAttribute(distributionEClass, DISTRIBUTION__ACCESS_URL);
		createEAttribute(distributionEClass, DISTRIBUTION__BYTE_SIZE);
		createEAttribute(distributionEClass, DISTRIBUTION__DOWNLOAD_URL);
		createEAttribute(distributionEClass, DISTRIBUTION__MEDIA_TYPE);
		createEAttribute(distributionEClass, DISTRIBUTION__CONFORMS_TO);
		createEAttribute(distributionEClass, DISTRIBUTION__DESCRIPTION);
		createEAttribute(distributionEClass, DISTRIBUTION__FORMAT);
		createEAttribute(distributionEClass, DISTRIBUTION__ISSUED);
		createEAttribute(distributionEClass, DISTRIBUTION__LICENSE);
		createEAttribute(distributionEClass, DISTRIBUTION__MODIFIED);
		createEAttribute(distributionEClass, DISTRIBUTION__RIGHTS);
		createEAttribute(distributionEClass, DISTRIBUTION__TITLE);

		dataDistributionServiceEClass = createEClass(DATA_DISTRIBUTION_SERVICE);

		discoveryServiceEClass = createEClass(DISCOVERY_SERVICE);

		csDatasetEClass = createEClass(CS_DATASET);
		createEAttribute(csDatasetEClass, CS_DATASET__ABSTRACT);
		createEAttribute(csDatasetEClass, CS_DATASET__BIBLIOGRAPHIC_CITATION);
		createEAttribute(csDatasetEClass, CS_DATASET__METHOD_TYPE);
		createEAttribute(csDatasetEClass, CS_DATASET__METHOD_SPECIFICATION);
		createEAttribute(csDatasetEClass, CS_DATASET__HAS_HYPOTHESIS);
		createEAttribute(csDatasetEClass, CS_DATASET__HAS_INSTRUMENT);
		createEAttribute(csDatasetEClass, CS_DATASET__DATA_QUALITY_ASSURANCE_METHOD);
		createEAttribute(csDatasetEClass, CS_DATASET__DATA_MANAGEMENT_PLAN);

		catalogEClass = createEClass(CATALOG);
		createEReference(catalogEClass, CATALOG__DATASET);
		createEReference(catalogEClass, CATALOG__DATASERVICE);
		createEReference(catalogEClass, CATALOG__CATALOG);
		createEReference(catalogEClass, CATALOG__CATALOGRECORD);
		createEAttribute(catalogEClass, CATALOG__HOME_PAGE);

		catalogRecordEClass = createEClass(CATALOG_RECORD);
		createEAttribute(catalogRecordEClass, CATALOG_RECORD__DESCRIPTION);
		createEAttribute(catalogRecordEClass, CATALOG_RECORD__ISSUED);
		createEAttribute(catalogRecordEClass, CATALOG_RECORD__MODIFIED);
		createEAttribute(catalogRecordEClass, CATALOG_RECORD__TITLE);
		createEReference(catalogRecordEClass, CATALOG_RECORD__RESOURCE);

		csCatalogEClass = createEClass(CS_CATALOG);
		createEReference(csCatalogEClass, CS_CATALOG__CSPROJECT);
		createEAttribute(csCatalogEClass, CS_CATALOG__PROGRAM_OR_CAMPAIGN);

		csProjectEClass = createEClass(CS_PROJECT);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_AIM);
		createEAttribute(csProjectEClass, CS_PROJECT__DIFFICULTY_LEVEL);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_START_DATE);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_END_DATE);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_SCIENCE_TYPE);
		createEAttribute(csProjectEClass, CS_PROJECT__UN_REGIONS);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_LOCALITY);
		createEReference(csProjectEClass, CS_PROJECT__PROJECTMEDIA);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_ID);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_DATE_CREATED);
		createEReference(csProjectEClass, CS_PROJECT__PROJECTGEOGRAPHICLOCATION);
		createEReference(csProjectEClass, CS_PROJECT__CONTACTS);

		projectMediaEClass = createEClass(PROJECT_MEDIA);
		createEAttribute(projectMediaEClass, PROJECT_MEDIA__PROJECT_MEDIA_FILE);
		createEAttribute(projectMediaEClass, PROJECT_MEDIA__PROJECT_MEDIA_TYPE);
		createEAttribute(projectMediaEClass, PROJECT_MEDIA__PROJECT_MEDIA_CREDIT);

		projectGeographicLocationEClass = createEClass(PROJECT_GEOGRAPHIC_LOCATION);
		createEAttribute(projectGeographicLocationEClass, PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LATITUDE);
		createEAttribute(projectGeographicLocationEClass, PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LONGITUDE);
		createEAttribute(projectGeographicLocationEClass, PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE);
		createEAttribute(projectGeographicLocationEClass, PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE);
		createEAttribute(projectGeographicLocationEClass, PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE);

		contactPointEClass = createEClass(CONTACT_POINT);
		createEAttribute(contactPointEClass, CONTACT_POINT__CONTACT_NAME);
		createEAttribute(contactPointEClass, CONTACT_POINT__MEANS_OF_CONTACT);
		createEAttribute(contactPointEClass, CONTACT_POINT__CONTACT_DETAILS);
		createEAttribute(contactPointEClass, CONTACT_POINT__CONTACT_POINT_TYPE);
		createEAttribute(contactPointEClass, CONTACT_POINT__CONTACT_EMAIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		datasetEClass.getESuperTypes().add(this.getResource());
		dataServiceEClass.getESuperTypes().add(this.getResource());
		dataDistributionServiceEClass.getESuperTypes().add(this.getDataService());
		discoveryServiceEClass.getESuperTypes().add(this.getDataDistributionService());
		csDatasetEClass.getESuperTypes().add(this.getDataset());
		catalogEClass.getESuperTypes().add(this.getDataset());
		csCatalogEClass.getESuperTypes().add(this.getCatalog());
		csProjectEClass.getESuperTypes().add(this.getResource());

		// Initialize classes and features; add operations and parameters
		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_ContactPoint(), ecorePackage.getEJavaObject(), "contactPoint", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_LandingPage(), theXMLTypePackage.getAnyURI(), "landingPage", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResource_ConformsTo(), theXMLTypePackage.getAnyURI(), "conformsTo", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResource_Description(), ecorePackage.getEString(), "description", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResource_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Language(), theXMLTypePackage.getLanguage(), "language", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResource_ReleaseDate(), ecorePackage.getEDate(), "releaseDate", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResource_UpdateModificationDate(), ecorePackage.getEDate(), "updateModificationDate", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResource_Title(), ecorePackage.getEString(), "title", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResource_HasPart(), ecorePackage.getEString(), "hasPart", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResource_Status(), ecorePackage.getEString(), "status", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataset_Distribution(), this.getDistribution(), null, "distribution", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_AccrualPeriodicity(), ecorePackage.getEString(), "accrualPeriodicity", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataset_Spatial(), ecorePackage.getEJavaObject(), "spatial", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataset_Temporal(), ecorePackage.getEDate(), "temporal", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataset_WasGeneratedBy(), ecorePackage.getEJavaObject(), "wasGeneratedBy", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataServiceEClass, DataService.class, "DataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataService_EndpointDescription(), ecorePackage.getEString(), "endpointDescription", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_EndpointURL(), ecorePackage.getEString(), "endpointURL", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_AccessRights(), ecorePackage.getEString(), "accessRights", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataService_License(), ecorePackage.getEString(), "license", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(distributionEClass, Distribution.class, "Distribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistribution_Datadistributionservice(), this.getDataDistributionService(), null, "datadistributionservice", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistribution_AccessURL(), theXMLTypePackage.getAnyURI(), "accessURL", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDistribution_ByteSize(), ecorePackage.getEFloat(), "byteSize", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDistribution_DownloadURL(), theXMLTypePackage.getAnyURI(), "downloadURL", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDistribution_MediaType(), ecorePackage.getEString(), "mediaType", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDistribution_ConformsTo(), theXMLTypePackage.getString(), "conformsTo", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDistribution_Description(), ecorePackage.getEString(), "description", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDistribution_Format(), ecorePackage.getEString(), "format", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDistribution_Issued(), ecorePackage.getEDate(), "issued", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDistribution_License(), ecorePackage.getEString(), "license", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDistribution_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDistribution_Rights(), ecorePackage.getEString(), "rights", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDistribution_Title(), ecorePackage.getEString(), "title", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataDistributionServiceEClass, DataDistributionService.class, "DataDistributionService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discoveryServiceEClass, DiscoveryService.class, "DiscoveryService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(csDatasetEClass, CSDataset.class, "CSDataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSDataset_Abstract(), ecorePackage.getEString(), "abstract", null, 0, 1, CSDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCSDataset_BibliographicCitation(), ecorePackage.getEString(), "bibliographicCitation", null, 0, 1, CSDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSDataset_MethodType(), ecorePackage.getEString(), "methodType", null, 0, 1, CSDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSDataset_MethodSpecification(), ecorePackage.getEJavaObject(), "methodSpecification", null, 0, 1, CSDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSDataset_HasHypothesis(), ecorePackage.getEString(), "hasHypothesis", null, 0, 1, CSDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCSDataset_HasInstrument(), ecorePackage.getEString(), "hasInstrument", null, 0, 1, CSDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCSDataset_DataQualityAssuranceMethod(), ecorePackage.getEString(), "dataQualityAssuranceMethod", null, 0, 1, CSDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCSDataset_DataManagementPlan(), ecorePackage.getEString(), "dataManagementPlan", null, 0, 1, CSDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_Dataset(), this.getDataset(), null, "dataset", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Dataservice(), this.getDataService(), null, "dataservice", null, 0, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Catalog(), this.getCatalog(), null, "catalog", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Catalogrecord(), this.getCatalogRecord(), null, "catalogrecord", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalog_HomePage(), theXMLTypePackage.getAnyURI(), "homePage", null, 0, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(catalogRecordEClass, CatalogRecord.class, "CatalogRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogRecord_Description(), ecorePackage.getEString(), "description", null, 0, 1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCatalogRecord_Issued(), ecorePackage.getEDate(), "issued", null, 0, 1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCatalogRecord_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCatalogRecord_Title(), ecorePackage.getEString(), "title", null, 0, 1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCatalogRecord_Resource(), this.getResource(), null, "resource", null, 0, 1, CatalogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csCatalogEClass, CSCatalog.class, "CSCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSCatalog_Csproject(), this.getCSProject(), null, "csproject", null, 1, -1, CSCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSCatalog_ProgramOrCampaign(), ecorePackage.getEString(), "programOrCampaign", null, 0, 1, CSCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csProjectEClass, CSProject.class, "CSProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSProject_ProjectAim(), ecorePackage.getEString(), "projectAim", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCSProject_DifficultyLevel(), ecorePackage.getEString(), "difficultyLevel", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectStartDate(), ecorePackage.getEDate(), "projectStartDate", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectEndDate(), ecorePackage.getEDate(), "projectEndDate", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectScienceType(), ecorePackage.getEString(), "projectScienceType", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_UnRegions(), ecorePackage.getEString(), "unRegions", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCSProject_ProjectLocality(), ecorePackage.getEString(), "projectLocality", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSProject_Projectmedia(), this.getProjectMedia(), null, "projectmedia", null, 0, -1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCSProject_ProjectId(), ecorePackage.getEString(), "projectId", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectDateCreated(), ecorePackage.getEDate(), "projectDateCreated", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSProject_Projectgeographiclocation(), this.getProjectGeographicLocation(), null, "projectgeographiclocation", null, 0, -1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSProject_Contacts(), this.getContactPoint(), null, "contacts", null, 0, -1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectMediaEClass, ProjectMedia.class, "ProjectMedia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectMedia_ProjectMediaFile(), ecorePackage.getEString(), "projectMediaFile", null, 0, 1, ProjectMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectMedia_ProjectMediaType(), theXMLTypePackage.getAnyURI(), "projectMediaType", null, 0, 1, ProjectMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectMedia_ProjectMediaCredit(), ecorePackage.getEString(), "projectMediaCredit", null, 0, 1, ProjectMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectGeographicLocationEClass, ProjectGeographicLocation.class, "ProjectGeographicLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectGeographicLocation_ProjectPinLatitude(), theXMLTypePackage.getDecimal(), "projectPinLatitude", "0", 0, 1, ProjectGeographicLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectGeographicLocation_ProjectPinLongitude(), theXMLTypePackage.getDecimal(), "projectPinLongitude", "0", 0, 1, ProjectGeographicLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectGeographicLocation_ProjectGeographicCoverage(), ecorePackage.getEString(), "projectGeographicCoverage", "undefined", 0, 1, ProjectGeographicLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProjectGeographicLocation_ProjectGeographicCoverageCentroidLatitude(), theXMLTypePackage.getDecimal(), "projectGeographicCoverageCentroidLatitude", "0", 0, 1, ProjectGeographicLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectGeographicLocation_ProjectGeographicCoverageCentroidLongitude(), theXMLTypePackage.getDecimal(), "projectGeographicCoverageCentroidLongitude", "0", 0, 1, ProjectGeographicLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactPointEClass, ContactPoint.class, "ContactPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactPoint_ContactName(), ecorePackage.getEString(), "contactName", "undefined", 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContactPoint_MeansOfContact(), ecorePackage.getEString(), "meansOfContact", "undefined", 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactPoint_ContactDetails(), ecorePackage.getEString(), "contactDetails", "undefined", 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContactPoint_ContactPointType(), ecorePackage.getEString(), "contactPointType", "undefined", 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContactPoint_ContactEmail(), ecorePackage.getEString(), "contactEmail", "undefined", 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://purl.org/dc/elements/1.1/identifier
		createIdentifierAnnotations();
		// http://purl.org/dc/terms/created
		createCreatedAnnotations();
		// http://xmlns.com/foaf/spec#term_img
		createSpecterm_imgAnnotations();
		// http://xmlns.com/foaf/0.1/#term_depiction
		create_term_depictionAnnotations();
		// http://purl.org/dc/terms/bibliographicCitation
		createBibliographicCitationAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://purl.org/dc/elements/1.1/identifier</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIdentifierAnnotations() {
		String source = "http://purl.org/dc/elements/1.1/identifier";
		addAnnotation
		  (getCSProject_ProjectId(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://purl.org/dc/terms/created</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCreatedAnnotations() {
		String source = "http://purl.org/dc/terms/created";
		addAnnotation
		  (getCSProject_ProjectDateCreated(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://xmlns.com/foaf/spec#term_img</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSpecterm_imgAnnotations() {
		String source = "http://xmlns.com/foaf/spec#term_img";
		addAnnotation
		  (getProjectMedia_ProjectMediaFile(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://xmlns.com/foaf/0.1/#term_depiction</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_term_depictionAnnotations() {
		String source = "http://xmlns.com/foaf/0.1/#term_depiction";
		addAnnotation
		  (getProjectMedia_ProjectMediaType(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://purl.org/dc/terms/bibliographicCitation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createBibliographicCitationAnnotations() {
		String source = "http://purl.org/dc/terms/bibliographicCitation";
		addAnnotation
		  (getProjectMedia_ProjectMediaCredit(),
		   source,
		   new String[] {
		   });
	}

} //DcatcsPackageImpl
