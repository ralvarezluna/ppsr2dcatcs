/**
 */
package ppsr_coremetamodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import ppsr_coremetamodel.Activity;
import ppsr_coremetamodel.CSProject;
import ppsr_coremetamodel.ContactPoint;
import ppsr_coremetamodel.DatasetMetadataSchema;
import ppsr_coremetamodel.DmmCoreTerms;
import ppsr_coremetamodel.DmmExtensionTerms;
import ppsr_coremetamodel.MethodSpecification;
import ppsr_coremetamodel.ProgramOrCampaign;
import ppsr_coremetamodel.ProjectGeographicLocation;
import ppsr_coremetamodel.ProjectMedia;
import ppsr_coremetamodel.ppsrmetamodelFactory;
import ppsr_coremetamodel.ppsrmetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ppsrmetamodelPackageImpl extends EPackageImpl implements ppsrmetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmmCoreTermsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programOrCampaignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactPointEClass = null;

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
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetMetadataSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmmExtensionTermsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csProjectEClass = null;

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
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ppsrmetamodelPackageImpl() {
		super(eNS_URI, ppsrmetamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ppsrmetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ppsrmetamodelPackage init() {
		if (isInited) return (ppsrmetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(ppsrmetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredppsrmetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ppsrmetamodelPackageImpl theppsrmetamodelPackage = registeredppsrmetamodelPackage instanceof ppsrmetamodelPackageImpl ? (ppsrmetamodelPackageImpl)registeredppsrmetamodelPackage : new ppsrmetamodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theppsrmetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theppsrmetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theppsrmetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ppsrmetamodelPackage.eNS_URI, theppsrmetamodelPackage);
		return theppsrmetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmmCoreTerms() {
		return dmmCoreTermsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_Identifier() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_DateSubmitted() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_Modified() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_DatasetStatus() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_Title() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_Abstract() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_AccessRights() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_BibliographicCitation() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_RightsHolder() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_License() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_Language() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_DatesetStartDate() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_DatasetEndDate() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_MethodType() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmCoreTerms_DataAccessMethod() {
		return (EAttribute)dmmCoreTermsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramOrCampaign() {
		return programOrCampaignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramOrCampaign_ProgramId() {
		return (EAttribute)programOrCampaignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramOrCampaign_ProgramName() {
		return (EAttribute)programOrCampaignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramOrCampaign_Language() {
		return (EAttribute)programOrCampaignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramOrCampaign_Csproject() {
		return (EReference)programOrCampaignEClass.getEStructuralFeatures().get(3);
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
	public EClass getProjectMedia() {
		return projectMediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectMedia_ProjectMediaType() {
		return (EAttribute)projectMediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectMedia_ProjectMediaFile() {
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
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_ActivityId() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Datasetmetadataschema() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatasetMetadataSchema() {
		return datasetMetadataSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetMetadataSchema_ObservationalDataModel() {
		return (EAttribute)datasetMetadataSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetMetadataSchema_Dmmcoreterms() {
		return (EReference)datasetMetadataSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetMetadataSchema_Methodspecification() {
		return (EReference)datasetMetadataSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetMetadataSchema_Dmmextensionterms() {
		return (EReference)datasetMetadataSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodSpecification() {
		return methodSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodSpecification_SamplingProtocolDomain() {
		return (EAttribute)methodSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodSpecification_SamplingProtocolMethod() {
		return (EAttribute)methodSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodSpecification_MethodAbstract() {
		return (EAttribute)methodSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodSpecification_MethodUrl() {
		return (EAttribute)methodSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodSpecification_MethodDocUrl() {
		return (EAttribute)methodSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmmExtensionTerms() {
		return dmmExtensionTermsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmExtensionTerms_DatasetUpdateFrequency() {
		return (EAttribute)dmmExtensionTermsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmExtensionTerms_DatasetExternalUrl() {
		return (EAttribute)dmmExtensionTermsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmExtensionTerms_DownloadURL() {
		return (EAttribute)dmmExtensionTermsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmExtensionTerms_DataQualityAssuranceMethod() {
		return (EAttribute)dmmExtensionTermsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmExtensionTerms_DataQualityAssuranceDescription() {
		return (EAttribute)dmmExtensionTermsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmExtensionTerms_UsageGuide() {
		return (EAttribute)dmmExtensionTermsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmmExtensionTerms_DataManagementPlan() {
		return (EAttribute)dmmExtensionTermsEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getCSProject_ProjectId() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectDateCreated() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectLastUpdatedDate() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectName() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectAim() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectDescription() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_HasTag() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_DifficultyLevel() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectStatus() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectStartDate() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectEndDate() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectDuration() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectScienceType() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectUrl() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_UnRegions() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_Language() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCSProject_Projectgeographiclocation() {
		return (EReference)csProjectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCSProject_Projectmedia() {
		return (EReference)csProjectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCSProject_Activity() {
		return (EReference)csProjectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_Keywords() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCSProject_Contactpoint() {
		return (EReference)csProjectEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSProject_ProjectResponsiblePartyName() {
		return (EAttribute)csProjectEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ppsrmetamodelFactory getppsrmetamodelFactory() {
		return (ppsrmetamodelFactory)getEFactoryInstance();
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
		dmmCoreTermsEClass = createEClass(DMM_CORE_TERMS);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__IDENTIFIER);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__DATE_SUBMITTED);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__MODIFIED);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__DATASET_STATUS);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__TITLE);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__ABSTRACT);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__ACCESS_RIGHTS);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__BIBLIOGRAPHIC_CITATION);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__RIGHTS_HOLDER);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__LICENSE);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__LANGUAGE);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__DATESET_START_DATE);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__DATASET_END_DATE);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__METHOD_TYPE);
		createEAttribute(dmmCoreTermsEClass, DMM_CORE_TERMS__DATA_ACCESS_METHOD);

		programOrCampaignEClass = createEClass(PROGRAM_OR_CAMPAIGN);
		createEAttribute(programOrCampaignEClass, PROGRAM_OR_CAMPAIGN__PROGRAM_ID);
		createEAttribute(programOrCampaignEClass, PROGRAM_OR_CAMPAIGN__PROGRAM_NAME);
		createEAttribute(programOrCampaignEClass, PROGRAM_OR_CAMPAIGN__LANGUAGE);
		createEReference(programOrCampaignEClass, PROGRAM_OR_CAMPAIGN__CSPROJECT);

		contactPointEClass = createEClass(CONTACT_POINT);
		createEAttribute(contactPointEClass, CONTACT_POINT__CONTACT_NAME);
		createEAttribute(contactPointEClass, CONTACT_POINT__MEANS_OF_CONTACT);
		createEAttribute(contactPointEClass, CONTACT_POINT__CONTACT_DETAILS);
		createEAttribute(contactPointEClass, CONTACT_POINT__CONTACT_POINT_TYPE);
		createEAttribute(contactPointEClass, CONTACT_POINT__CONTACT_EMAIL);

		projectMediaEClass = createEClass(PROJECT_MEDIA);
		createEAttribute(projectMediaEClass, PROJECT_MEDIA__PROJECT_MEDIA_TYPE);
		createEAttribute(projectMediaEClass, PROJECT_MEDIA__PROJECT_MEDIA_FILE);
		createEAttribute(projectMediaEClass, PROJECT_MEDIA__PROJECT_MEDIA_CREDIT);

		projectGeographicLocationEClass = createEClass(PROJECT_GEOGRAPHIC_LOCATION);
		createEAttribute(projectGeographicLocationEClass, PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LATITUDE);
		createEAttribute(projectGeographicLocationEClass, PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LONGITUDE);
		createEAttribute(projectGeographicLocationEClass, PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE);
		createEAttribute(projectGeographicLocationEClass, PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE);
		createEAttribute(projectGeographicLocationEClass, PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__ACTIVITY_ID);
		createEReference(activityEClass, ACTIVITY__DATASETMETADATASCHEMA);

		datasetMetadataSchemaEClass = createEClass(DATASET_METADATA_SCHEMA);
		createEAttribute(datasetMetadataSchemaEClass, DATASET_METADATA_SCHEMA__OBSERVATIONAL_DATA_MODEL);
		createEReference(datasetMetadataSchemaEClass, DATASET_METADATA_SCHEMA__DMMCORETERMS);
		createEReference(datasetMetadataSchemaEClass, DATASET_METADATA_SCHEMA__METHODSPECIFICATION);
		createEReference(datasetMetadataSchemaEClass, DATASET_METADATA_SCHEMA__DMMEXTENSIONTERMS);

		methodSpecificationEClass = createEClass(METHOD_SPECIFICATION);
		createEAttribute(methodSpecificationEClass, METHOD_SPECIFICATION__SAMPLING_PROTOCOL_DOMAIN);
		createEAttribute(methodSpecificationEClass, METHOD_SPECIFICATION__SAMPLING_PROTOCOL_METHOD);
		createEAttribute(methodSpecificationEClass, METHOD_SPECIFICATION__METHOD_ABSTRACT);
		createEAttribute(methodSpecificationEClass, METHOD_SPECIFICATION__METHOD_URL);
		createEAttribute(methodSpecificationEClass, METHOD_SPECIFICATION__METHOD_DOC_URL);

		dmmExtensionTermsEClass = createEClass(DMM_EXTENSION_TERMS);
		createEAttribute(dmmExtensionTermsEClass, DMM_EXTENSION_TERMS__DATASET_UPDATE_FREQUENCY);
		createEAttribute(dmmExtensionTermsEClass, DMM_EXTENSION_TERMS__DATASET_EXTERNAL_URL);
		createEAttribute(dmmExtensionTermsEClass, DMM_EXTENSION_TERMS__DOWNLOAD_URL);
		createEAttribute(dmmExtensionTermsEClass, DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_METHOD);
		createEAttribute(dmmExtensionTermsEClass, DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_DESCRIPTION);
		createEAttribute(dmmExtensionTermsEClass, DMM_EXTENSION_TERMS__USAGE_GUIDE);
		createEAttribute(dmmExtensionTermsEClass, DMM_EXTENSION_TERMS__DATA_MANAGEMENT_PLAN);

		csProjectEClass = createEClass(CS_PROJECT);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_ID);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_DATE_CREATED);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_LAST_UPDATED_DATE);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_NAME);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_AIM);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_DESCRIPTION);
		createEAttribute(csProjectEClass, CS_PROJECT__HAS_TAG);
		createEAttribute(csProjectEClass, CS_PROJECT__DIFFICULTY_LEVEL);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_STATUS);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_START_DATE);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_END_DATE);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_DURATION);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_SCIENCE_TYPE);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_URL);
		createEAttribute(csProjectEClass, CS_PROJECT__UN_REGIONS);
		createEAttribute(csProjectEClass, CS_PROJECT__LANGUAGE);
		createEReference(csProjectEClass, CS_PROJECT__PROJECTGEOGRAPHICLOCATION);
		createEReference(csProjectEClass, CS_PROJECT__PROJECTMEDIA);
		createEReference(csProjectEClass, CS_PROJECT__ACTIVITY);
		createEAttribute(csProjectEClass, CS_PROJECT__KEYWORDS);
		createEReference(csProjectEClass, CS_PROJECT__CONTACTPOINT);
		createEAttribute(csProjectEClass, CS_PROJECT__PROJECT_RESPONSIBLE_PARTY_NAME);
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

		// Initialize classes and features; add operations and parameters
		initEClass(dmmCoreTermsEClass, DmmCoreTerms.class, "DmmCoreTerms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmmCoreTerms_Identifier(), theXMLTypePackage.getAnyURI(), "identifier", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_DateSubmitted(), ecorePackage.getEDate(), "dateSubmitted", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_DatasetStatus(), ecorePackage.getEString(), "datasetStatus", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_Title(), ecorePackage.getEString(), "title", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_Abstract(), ecorePackage.getEString(), "abstract", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_AccessRights(), ecorePackage.getEString(), "accessRights", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_BibliographicCitation(), ecorePackage.getEString(), "bibliographicCitation", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_RightsHolder(), ecorePackage.getEString(), "rightsHolder", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_License(), ecorePackage.getEString(), "license", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_Language(), ecorePackage.getEString(), "language", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_DatesetStartDate(), ecorePackage.getEDate(), "datesetStartDate", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_DatasetEndDate(), ecorePackage.getEDate(), "datasetEndDate", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_MethodType(), ecorePackage.getEString(), "methodType", null, 0, 1, DmmCoreTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmCoreTerms_DataAccessMethod(), ecorePackage.getEString(), "dataAccessMethod", null, 0, 1, DmmCoreTerms.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programOrCampaignEClass, ProgramOrCampaign.class, "ProgramOrCampaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramOrCampaign_ProgramId(), ecorePackage.getEString(), "programId", null, 0, 1, ProgramOrCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProgramOrCampaign_ProgramName(), ecorePackage.getEString(), "programName", null, 0, 1, ProgramOrCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramOrCampaign_Language(), ecorePackage.getEString(), "language", null, 0, 1, ProgramOrCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramOrCampaign_Csproject(), this.getCSProject(), null, "csproject", null, 0, -1, ProgramOrCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactPointEClass, ContactPoint.class, "ContactPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactPoint_ContactName(), ecorePackage.getEString(), "contactName", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactPoint_MeansOfContact(), ecorePackage.getEString(), "meansOfContact", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactPoint_ContactDetails(), theXMLTypePackage.getString(), "contactDetails", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactPoint_ContactPointType(), ecorePackage.getEString(), "contactPointType", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactPoint_ContactEmail(), theXMLTypePackage.getString(), "ContactEmail", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectMediaEClass, ProjectMedia.class, "ProjectMedia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectMedia_ProjectMediaType(), ecorePackage.getEString(), "projectMediaType", null, 0, 1, ProjectMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectMedia_ProjectMediaFile(), theXMLTypePackage.getAnyURI(), "projectMediaFile", null, 0, 1, ProjectMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectMedia_ProjectMediaCredit(), ecorePackage.getEString(), "projectMediaCredit", null, 0, 1, ProjectMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectGeographicLocationEClass, ProjectGeographicLocation.class, "ProjectGeographicLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectGeographicLocation_ProjectPinLatitude(), theXMLTypePackage.getDecimal(), "projectPinLatitude", null, 0, 1, ProjectGeographicLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectGeographicLocation_ProjectPinLongitude(), theXMLTypePackage.getDecimal(), "projectPinLongitude", null, 0, 1, ProjectGeographicLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectGeographicLocation_ProjectGeographicCoverage(), ecorePackage.getEString(), "projectGeographicCoverage", null, 0, 1, ProjectGeographicLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProjectGeographicLocation_ProjectGeographicCoverageCentroidLatitude(), theXMLTypePackage.getDecimal(), "projectGeographicCoverageCentroidLatitude", null, 0, 1, ProjectGeographicLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectGeographicLocation_ProjectGeographicCoverageCentroidLongitude(), theXMLTypePackage.getDecimal(), "projectGeographicCoverageCentroidLongitude", null, 0, 1, ProjectGeographicLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_ActivityId(), ecorePackage.getEString(), "activityId", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Datasetmetadataschema(), this.getDatasetMetadataSchema(), null, "datasetmetadataschema", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetMetadataSchemaEClass, DatasetMetadataSchema.class, "DatasetMetadataSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatasetMetadataSchema_ObservationalDataModel(), ecorePackage.getEString(), "observationalDataModel", null, 0, 1, DatasetMetadataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatasetMetadataSchema_Dmmcoreterms(), this.getDmmCoreTerms(), null, "dmmcoreterms", null, 0, -1, DatasetMetadataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatasetMetadataSchema_Methodspecification(), this.getMethodSpecification(), null, "methodspecification", null, 1, 1, DatasetMetadataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatasetMetadataSchema_Dmmextensionterms(), this.getDmmExtensionTerms(), null, "dmmextensionterms", null, 0, -1, DatasetMetadataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodSpecificationEClass, MethodSpecification.class, "MethodSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodSpecification_SamplingProtocolDomain(), ecorePackage.getEString(), "samplingProtocolDomain", null, 0, 1, MethodSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodSpecification_SamplingProtocolMethod(), ecorePackage.getEString(), "samplingProtocolMethod", null, 0, 1, MethodSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodSpecification_MethodAbstract(), ecorePackage.getEString(), "methodAbstract", null, 0, 1, MethodSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodSpecification_MethodUrl(), theXMLTypePackage.getAnyURI(), "methodUrl", null, 0, 1, MethodSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodSpecification_MethodDocUrl(), theXMLTypePackage.getAnyURI(), "methodDocUrl", null, 0, 1, MethodSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmmExtensionTermsEClass, DmmExtensionTerms.class, "DmmExtensionTerms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmmExtensionTerms_DatasetUpdateFrequency(), ecorePackage.getEString(), "datasetUpdateFrequency", null, 0, 1, DmmExtensionTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmExtensionTerms_DatasetExternalUrl(), theXMLTypePackage.getAnyURI(), "datasetExternalUrl", null, 0, 1, DmmExtensionTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmExtensionTerms_DownloadURL(), theXMLTypePackage.getAnyURI(), "downloadURL", null, 0, 1, DmmExtensionTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmExtensionTerms_DataQualityAssuranceMethod(), ecorePackage.getEString(), "dataQualityAssuranceMethod", null, 0, 1, DmmExtensionTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmExtensionTerms_DataQualityAssuranceDescription(), ecorePackage.getEString(), "dataQualityAssuranceDescription", null, 0, 1, DmmExtensionTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmExtensionTerms_UsageGuide(), ecorePackage.getEString(), "usageGuide", null, 0, 1, DmmExtensionTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmmExtensionTerms_DataManagementPlan(), ecorePackage.getEString(), "dataManagementPlan", null, 0, 1, DmmExtensionTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csProjectEClass, CSProject.class, "CSProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSProject_ProjectId(), ecorePackage.getEString(), "projectId", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectDateCreated(), ecorePackage.getEDate(), "projectDateCreated", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectLastUpdatedDate(), ecorePackage.getEDate(), "projectLastUpdatedDate", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectAim(), ecorePackage.getEString(), "projectAim", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectDescription(), ecorePackage.getEString(), "projectDescription", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_HasTag(), ecorePackage.getEString(), "hasTag", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_DifficultyLevel(), ecorePackage.getEString(), "difficultyLevel", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectStatus(), ecorePackage.getEString(), "projectStatus", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCSProject_ProjectStartDate(), ecorePackage.getEDate(), "projectStartDate", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectEndDate(), ecorePackage.getEDate(), "projectEndDate", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectDuration(), theXMLTypePackage.getTime(), "projectDuration", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectScienceType(), ecorePackage.getEString(), "projectScienceType", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_ProjectUrl(), theXMLTypePackage.getAnyURI(), "projectUrl", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_UnRegions(), ecorePackage.getEString(), "unRegions", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSProject_Language(), ecorePackage.getEString(), "language", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSProject_Projectgeographiclocation(), this.getProjectGeographicLocation(), null, "projectgeographiclocation", null, 0, -1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCSProject_Projectmedia(), this.getProjectMedia(), null, "projectmedia", null, 0, -1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCSProject_Activity(), this.getActivity(), null, "activity", null, 1, -1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCSProject_Keywords(), ecorePackage.getEString(), "keywords", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSProject_Contactpoint(), this.getContactPoint(), null, "contactpoint", null, 0, -1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCSProject_ProjectResponsiblePartyName(), ecorePackage.getEString(), "projectResponsiblePartyName", null, 0, 1, CSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://xmlns.com/foaf/0.1/#term_depiction
		create_term_depictionAnnotations();
		// http://xmlns.com/foaf/spec#term_img
		createSpecterm_imgAnnotations();
		// http://purl.org/dc/terms/bibliographicCitation
		createBibliographicCitationAnnotations();
		// http://purl.org/dc/elements/1.1/identifier
		createIdentifierAnnotations();
		// http://purl.org/dc/terms/created
		createCreatedAnnotations();
		// http://purl.org/dc/terms/modified
		createModifiedAnnotations();
		// http://purl.org/dc/elements/1.1/title
		createTitleAnnotations();
		// http://purl.org/dc/terms/abstract
		createAbstractAnnotations();
		// http://purl.org/dc/elements/1.1/description
		createDescriptionAnnotations();
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
	 * Initializes the annotations for <b>http://purl.org/dc/terms/modified</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createModifiedAnnotations() {
		String source = "http://purl.org/dc/terms/modified";
		addAnnotation
		  (getCSProject_ProjectLastUpdatedDate(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://purl.org/dc/elements/1.1/title</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTitleAnnotations() {
		String source = "http://purl.org/dc/elements/1.1/title";
		addAnnotation
		  (getCSProject_ProjectName(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://purl.org/dc/terms/abstract</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAbstractAnnotations() {
		String source = "http://purl.org/dc/terms/abstract";
		addAnnotation
		  (getCSProject_ProjectAim(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://purl.org/dc/elements/1.1/description</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDescriptionAnnotations() {
		String source = "http://purl.org/dc/elements/1.1/description";
		addAnnotation
		  (getCSProject_ProjectDescription(),
		   source,
		   new String[] {
		   });
	}

} //ppsrmetamodelPackageImpl
