/**
 */
package ppsr_coremetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ppsr_coremetamodel.DmmExtensionTerms;
import ppsr_coremetamodel.ppsrmetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dmm Extension Terms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.impl.DmmExtensionTermsImpl#getDatasetUpdateFrequency <em>Dataset Update Frequency</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmExtensionTermsImpl#getDatasetExternalUrl <em>Dataset External Url</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmExtensionTermsImpl#getDownloadURL <em>Download URL</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmExtensionTermsImpl#getDataQualityAssuranceMethod <em>Data Quality Assurance Method</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmExtensionTermsImpl#getDataQualityAssuranceDescription <em>Data Quality Assurance Description</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmExtensionTermsImpl#getUsageGuide <em>Usage Guide</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmExtensionTermsImpl#getDataManagementPlan <em>Data Management Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmmExtensionTermsImpl extends EObjectImpl implements DmmExtensionTerms {
	/**
	 * The default value of the '{@link #getDatasetUpdateFrequency() <em>Dataset Update Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetUpdateFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASET_UPDATE_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatasetUpdateFrequency() <em>Dataset Update Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetUpdateFrequency()
	 * @generated
	 * @ordered
	 */
	protected String datasetUpdateFrequency = DATASET_UPDATE_FREQUENCY_EDEFAULT;

	/**
	 * This is true if the Dataset Update Frequency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean datasetUpdateFrequencyESet;

	/**
	 * The default value of the '{@link #getDatasetExternalUrl() <em>Dataset External Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetExternalUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASET_EXTERNAL_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatasetExternalUrl() <em>Dataset External Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetExternalUrl()
	 * @generated
	 * @ordered
	 */
	protected String datasetExternalUrl = DATASET_EXTERNAL_URL_EDEFAULT;

	/**
	 * This is true if the Dataset External Url attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean datasetExternalUrlESet;

	/**
	 * The default value of the '{@link #getDownloadURL() <em>Download URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadURL()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNLOAD_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDownloadURL() <em>Download URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadURL()
	 * @generated
	 * @ordered
	 */
	protected String downloadURL = DOWNLOAD_URL_EDEFAULT;

	/**
	 * This is true if the Download URL attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean downloadURLESet;

	/**
	 * The default value of the '{@link #getDataQualityAssuranceMethod() <em>Data Quality Assurance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataQualityAssuranceMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_QUALITY_ASSURANCE_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataQualityAssuranceMethod() <em>Data Quality Assurance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataQualityAssuranceMethod()
	 * @generated
	 * @ordered
	 */
	protected String dataQualityAssuranceMethod = DATA_QUALITY_ASSURANCE_METHOD_EDEFAULT;

	/**
	 * This is true if the Data Quality Assurance Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataQualityAssuranceMethodESet;

	/**
	 * The default value of the '{@link #getDataQualityAssuranceDescription() <em>Data Quality Assurance Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataQualityAssuranceDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_QUALITY_ASSURANCE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataQualityAssuranceDescription() <em>Data Quality Assurance Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataQualityAssuranceDescription()
	 * @generated
	 * @ordered
	 */
	protected String dataQualityAssuranceDescription = DATA_QUALITY_ASSURANCE_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Data Quality Assurance Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataQualityAssuranceDescriptionESet;

	/**
	 * The default value of the '{@link #getUsageGuide() <em>Usage Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageGuide()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_GUIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageGuide() <em>Usage Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageGuide()
	 * @generated
	 * @ordered
	 */
	protected String usageGuide = USAGE_GUIDE_EDEFAULT;

	/**
	 * This is true if the Usage Guide attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageGuideESet;

	/**
	 * The default value of the '{@link #getDataManagementPlan() <em>Data Management Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataManagementPlan()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_MANAGEMENT_PLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataManagementPlan() <em>Data Management Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataManagementPlan()
	 * @generated
	 * @ordered
	 */
	protected String dataManagementPlan = DATA_MANAGEMENT_PLAN_EDEFAULT;

	/**
	 * This is true if the Data Management Plan attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataManagementPlanESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmmExtensionTermsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppsrmetamodelPackage.Literals.DMM_EXTENSION_TERMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatasetUpdateFrequency() {
		return datasetUpdateFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatasetUpdateFrequency(String newDatasetUpdateFrequency) {
		String oldDatasetUpdateFrequency = datasetUpdateFrequency;
		datasetUpdateFrequency = newDatasetUpdateFrequency;
		boolean oldDatasetUpdateFrequencyESet = datasetUpdateFrequencyESet;
		datasetUpdateFrequencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATASET_UPDATE_FREQUENCY, oldDatasetUpdateFrequency, datasetUpdateFrequency, !oldDatasetUpdateFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDatasetUpdateFrequency() {
		String oldDatasetUpdateFrequency = datasetUpdateFrequency;
		boolean oldDatasetUpdateFrequencyESet = datasetUpdateFrequencyESet;
		datasetUpdateFrequency = DATASET_UPDATE_FREQUENCY_EDEFAULT;
		datasetUpdateFrequencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATASET_UPDATE_FREQUENCY, oldDatasetUpdateFrequency, DATASET_UPDATE_FREQUENCY_EDEFAULT, oldDatasetUpdateFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDatasetUpdateFrequency() {
		return datasetUpdateFrequencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatasetExternalUrl() {
		return datasetExternalUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatasetExternalUrl(String newDatasetExternalUrl) {
		String oldDatasetExternalUrl = datasetExternalUrl;
		datasetExternalUrl = newDatasetExternalUrl;
		boolean oldDatasetExternalUrlESet = datasetExternalUrlESet;
		datasetExternalUrlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATASET_EXTERNAL_URL, oldDatasetExternalUrl, datasetExternalUrl, !oldDatasetExternalUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDatasetExternalUrl() {
		String oldDatasetExternalUrl = datasetExternalUrl;
		boolean oldDatasetExternalUrlESet = datasetExternalUrlESet;
		datasetExternalUrl = DATASET_EXTERNAL_URL_EDEFAULT;
		datasetExternalUrlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATASET_EXTERNAL_URL, oldDatasetExternalUrl, DATASET_EXTERNAL_URL_EDEFAULT, oldDatasetExternalUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDatasetExternalUrl() {
		return datasetExternalUrlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDownloadURL() {
		return downloadURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDownloadURL(String newDownloadURL) {
		String oldDownloadURL = downloadURL;
		downloadURL = newDownloadURL;
		boolean oldDownloadURLESet = downloadURLESet;
		downloadURLESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DOWNLOAD_URL, oldDownloadURL, downloadURL, !oldDownloadURLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDownloadURL() {
		String oldDownloadURL = downloadURL;
		boolean oldDownloadURLESet = downloadURLESet;
		downloadURL = DOWNLOAD_URL_EDEFAULT;
		downloadURLESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DOWNLOAD_URL, oldDownloadURL, DOWNLOAD_URL_EDEFAULT, oldDownloadURLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDownloadURL() {
		return downloadURLESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataQualityAssuranceMethod() {
		return dataQualityAssuranceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataQualityAssuranceMethod(String newDataQualityAssuranceMethod) {
		String oldDataQualityAssuranceMethod = dataQualityAssuranceMethod;
		dataQualityAssuranceMethod = newDataQualityAssuranceMethod;
		boolean oldDataQualityAssuranceMethodESet = dataQualityAssuranceMethodESet;
		dataQualityAssuranceMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_METHOD, oldDataQualityAssuranceMethod, dataQualityAssuranceMethod, !oldDataQualityAssuranceMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDataQualityAssuranceMethod() {
		String oldDataQualityAssuranceMethod = dataQualityAssuranceMethod;
		boolean oldDataQualityAssuranceMethodESet = dataQualityAssuranceMethodESet;
		dataQualityAssuranceMethod = DATA_QUALITY_ASSURANCE_METHOD_EDEFAULT;
		dataQualityAssuranceMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_METHOD, oldDataQualityAssuranceMethod, DATA_QUALITY_ASSURANCE_METHOD_EDEFAULT, oldDataQualityAssuranceMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDataQualityAssuranceMethod() {
		return dataQualityAssuranceMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataQualityAssuranceDescription() {
		return dataQualityAssuranceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataQualityAssuranceDescription(String newDataQualityAssuranceDescription) {
		String oldDataQualityAssuranceDescription = dataQualityAssuranceDescription;
		dataQualityAssuranceDescription = newDataQualityAssuranceDescription;
		boolean oldDataQualityAssuranceDescriptionESet = dataQualityAssuranceDescriptionESet;
		dataQualityAssuranceDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_DESCRIPTION, oldDataQualityAssuranceDescription, dataQualityAssuranceDescription, !oldDataQualityAssuranceDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDataQualityAssuranceDescription() {
		String oldDataQualityAssuranceDescription = dataQualityAssuranceDescription;
		boolean oldDataQualityAssuranceDescriptionESet = dataQualityAssuranceDescriptionESet;
		dataQualityAssuranceDescription = DATA_QUALITY_ASSURANCE_DESCRIPTION_EDEFAULT;
		dataQualityAssuranceDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_DESCRIPTION, oldDataQualityAssuranceDescription, DATA_QUALITY_ASSURANCE_DESCRIPTION_EDEFAULT, oldDataQualityAssuranceDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDataQualityAssuranceDescription() {
		return dataQualityAssuranceDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsageGuide() {
		return usageGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsageGuide(String newUsageGuide) {
		String oldUsageGuide = usageGuide;
		usageGuide = newUsageGuide;
		boolean oldUsageGuideESet = usageGuideESet;
		usageGuideESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__USAGE_GUIDE, oldUsageGuide, usageGuide, !oldUsageGuideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUsageGuide() {
		String oldUsageGuide = usageGuide;
		boolean oldUsageGuideESet = usageGuideESet;
		usageGuide = USAGE_GUIDE_EDEFAULT;
		usageGuideESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__USAGE_GUIDE, oldUsageGuide, USAGE_GUIDE_EDEFAULT, oldUsageGuideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUsageGuide() {
		return usageGuideESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataManagementPlan() {
		return dataManagementPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataManagementPlan(String newDataManagementPlan) {
		String oldDataManagementPlan = dataManagementPlan;
		dataManagementPlan = newDataManagementPlan;
		boolean oldDataManagementPlanESet = dataManagementPlanESet;
		dataManagementPlanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_MANAGEMENT_PLAN, oldDataManagementPlan, dataManagementPlan, !oldDataManagementPlanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDataManagementPlan() {
		String oldDataManagementPlan = dataManagementPlan;
		boolean oldDataManagementPlanESet = dataManagementPlanESet;
		dataManagementPlan = DATA_MANAGEMENT_PLAN_EDEFAULT;
		dataManagementPlanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_MANAGEMENT_PLAN, oldDataManagementPlan, DATA_MANAGEMENT_PLAN_EDEFAULT, oldDataManagementPlanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDataManagementPlan() {
		return dataManagementPlanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATASET_UPDATE_FREQUENCY:
				return getDatasetUpdateFrequency();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATASET_EXTERNAL_URL:
				return getDatasetExternalUrl();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DOWNLOAD_URL:
				return getDownloadURL();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_METHOD:
				return getDataQualityAssuranceMethod();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_DESCRIPTION:
				return getDataQualityAssuranceDescription();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__USAGE_GUIDE:
				return getUsageGuide();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_MANAGEMENT_PLAN:
				return getDataManagementPlan();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATASET_UPDATE_FREQUENCY:
				setDatasetUpdateFrequency((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATASET_EXTERNAL_URL:
				setDatasetExternalUrl((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DOWNLOAD_URL:
				setDownloadURL((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_METHOD:
				setDataQualityAssuranceMethod((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_DESCRIPTION:
				setDataQualityAssuranceDescription((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__USAGE_GUIDE:
				setUsageGuide((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_MANAGEMENT_PLAN:
				setDataManagementPlan((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATASET_UPDATE_FREQUENCY:
				unsetDatasetUpdateFrequency();
				return;
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATASET_EXTERNAL_URL:
				unsetDatasetExternalUrl();
				return;
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DOWNLOAD_URL:
				unsetDownloadURL();
				return;
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_METHOD:
				unsetDataQualityAssuranceMethod();
				return;
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_DESCRIPTION:
				unsetDataQualityAssuranceDescription();
				return;
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__USAGE_GUIDE:
				unsetUsageGuide();
				return;
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_MANAGEMENT_PLAN:
				unsetDataManagementPlan();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATASET_UPDATE_FREQUENCY:
				return isSetDatasetUpdateFrequency();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATASET_EXTERNAL_URL:
				return isSetDatasetExternalUrl();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DOWNLOAD_URL:
				return isSetDownloadURL();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_METHOD:
				return isSetDataQualityAssuranceMethod();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_QUALITY_ASSURANCE_DESCRIPTION:
				return isSetDataQualityAssuranceDescription();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__USAGE_GUIDE:
				return isSetUsageGuide();
			case ppsrmetamodelPackage.DMM_EXTENSION_TERMS__DATA_MANAGEMENT_PLAN:
				return isSetDataManagementPlan();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (datasetUpdateFrequency: ");
		if (datasetUpdateFrequencyESet) result.append(datasetUpdateFrequency); else result.append("<unset>");
		result.append(", datasetExternalUrl: ");
		if (datasetExternalUrlESet) result.append(datasetExternalUrl); else result.append("<unset>");
		result.append(", downloadURL: ");
		if (downloadURLESet) result.append(downloadURL); else result.append("<unset>");
		result.append(", dataQualityAssuranceMethod: ");
		if (dataQualityAssuranceMethodESet) result.append(dataQualityAssuranceMethod); else result.append("<unset>");
		result.append(", dataQualityAssuranceDescription: ");
		if (dataQualityAssuranceDescriptionESet) result.append(dataQualityAssuranceDescription); else result.append("<unset>");
		result.append(", usageGuide: ");
		if (usageGuideESet) result.append(usageGuide); else result.append("<unset>");
		result.append(", dataManagementPlan: ");
		if (dataManagementPlanESet) result.append(dataManagementPlan); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DmmExtensionTermsImpl
