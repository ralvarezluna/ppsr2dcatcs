/**
 */
package ppsr_coremetamodel.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ppsr_coremetamodel.DmmCoreTerms;
import ppsr_coremetamodel.ppsrmetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dmm Core Terms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getDateSubmitted <em>Date Submitted</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getDatasetStatus <em>Dataset Status</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getBibliographicCitation <em>Bibliographic Citation</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getRightsHolder <em>Rights Holder</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getLicense <em>License</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getDatesetStartDate <em>Dateset Start Date</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getDatasetEndDate <em>Dataset End Date</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DmmCoreTermsImpl#getDataAccessMethod <em>Data Access Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmmCoreTermsImpl extends EObjectImpl implements DmmCoreTerms {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateSubmitted() <em>Date Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSubmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_SUBMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateSubmitted() <em>Date Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSubmitted()
	 * @generated
	 * @ordered
	 */
	protected Date dateSubmitted = DATE_SUBMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatasetStatus() <em>Dataset Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASET_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatasetStatus() <em>Dataset Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetStatus()
	 * @generated
	 * @ordered
	 */
	protected String datasetStatus = DATASET_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected String abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessRights() <em>Access Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRights()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_RIGHTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessRights() <em>Access Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRights()
	 * @generated
	 * @ordered
	 */
	protected String accessRights = ACCESS_RIGHTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBibliographicCitation() <em>Bibliographic Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliographicCitation()
	 * @generated
	 * @ordered
	 */
	protected static final String BIBLIOGRAPHIC_CITATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBibliographicCitation() <em>Bibliographic Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliographicCitation()
	 * @generated
	 * @ordered
	 */
	protected String bibliographicCitation = BIBLIOGRAPHIC_CITATION_EDEFAULT;

	/**
	 * This is true if the Bibliographic Citation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bibliographicCitationESet;

	/**
	 * The default value of the '{@link #getRightsHolder() <em>Rights Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightsHolder()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHTS_HOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRightsHolder() <em>Rights Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightsHolder()
	 * @generated
	 * @ordered
	 */
	protected String rightsHolder = RIGHTS_HOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatesetStartDate() <em>Dateset Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatesetStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATESET_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatesetStartDate() <em>Dateset Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatesetStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date datesetStartDate = DATESET_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatasetEndDate() <em>Dataset End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATASET_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatasetEndDate() <em>Dataset End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date datasetEndDate = DATASET_END_DATE_EDEFAULT;

	/**
	 * This is true if the Dataset End Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean datasetEndDateESet;

	/**
	 * The default value of the '{@link #getMethodType() <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodType()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodType() <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodType()
	 * @generated
	 * @ordered
	 */
	protected String methodType = METHOD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataAccessMethod() <em>Data Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAccessMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_ACCESS_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataAccessMethod() <em>Data Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAccessMethod()
	 * @generated
	 * @ordered
	 */
	protected String dataAccessMethod = DATA_ACCESS_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmmCoreTermsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppsrmetamodelPackage.Literals.DMM_CORE_TERMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateSubmitted() {
		return dateSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateSubmitted(Date newDateSubmitted) {
		Date oldDateSubmitted = dateSubmitted;
		dateSubmitted = newDateSubmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__DATE_SUBMITTED, oldDateSubmitted, dateSubmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatasetStatus() {
		return datasetStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatasetStatus(String newDatasetStatus) {
		String oldDatasetStatus = datasetStatus;
		datasetStatus = newDatasetStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__DATASET_STATUS, oldDatasetStatus, datasetStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(String newAbstract) {
		String oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessRights() {
		return accessRights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessRights(String newAccessRights) {
		String oldAccessRights = accessRights;
		accessRights = newAccessRights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__ACCESS_RIGHTS, oldAccessRights, accessRights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBibliographicCitation() {
		return bibliographicCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBibliographicCitation(String newBibliographicCitation) {
		String oldBibliographicCitation = bibliographicCitation;
		bibliographicCitation = newBibliographicCitation;
		boolean oldBibliographicCitationESet = bibliographicCitationESet;
		bibliographicCitationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__BIBLIOGRAPHIC_CITATION, oldBibliographicCitation, bibliographicCitation, !oldBibliographicCitationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBibliographicCitation() {
		String oldBibliographicCitation = bibliographicCitation;
		boolean oldBibliographicCitationESet = bibliographicCitationESet;
		bibliographicCitation = BIBLIOGRAPHIC_CITATION_EDEFAULT;
		bibliographicCitationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.DMM_CORE_TERMS__BIBLIOGRAPHIC_CITATION, oldBibliographicCitation, BIBLIOGRAPHIC_CITATION_EDEFAULT, oldBibliographicCitationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBibliographicCitation() {
		return bibliographicCitationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRightsHolder() {
		return rightsHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightsHolder(String newRightsHolder) {
		String oldRightsHolder = rightsHolder;
		rightsHolder = newRightsHolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__RIGHTS_HOLDER, oldRightsHolder, rightsHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatesetStartDate() {
		return datesetStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatesetStartDate(Date newDatesetStartDate) {
		Date oldDatesetStartDate = datesetStartDate;
		datesetStartDate = newDatesetStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__DATESET_START_DATE, oldDatesetStartDate, datesetStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatasetEndDate() {
		return datasetEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatasetEndDate(Date newDatasetEndDate) {
		Date oldDatasetEndDate = datasetEndDate;
		datasetEndDate = newDatasetEndDate;
		boolean oldDatasetEndDateESet = datasetEndDateESet;
		datasetEndDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__DATASET_END_DATE, oldDatasetEndDate, datasetEndDate, !oldDatasetEndDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDatasetEndDate() {
		Date oldDatasetEndDate = datasetEndDate;
		boolean oldDatasetEndDateESet = datasetEndDateESet;
		datasetEndDate = DATASET_END_DATE_EDEFAULT;
		datasetEndDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.DMM_CORE_TERMS__DATASET_END_DATE, oldDatasetEndDate, DATASET_END_DATE_EDEFAULT, oldDatasetEndDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDatasetEndDate() {
		return datasetEndDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodType() {
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodType(String newMethodType) {
		String oldMethodType = methodType;
		methodType = newMethodType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__METHOD_TYPE, oldMethodType, methodType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataAccessMethod() {
		return dataAccessMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataAccessMethod(String newDataAccessMethod) {
		String oldDataAccessMethod = dataAccessMethod;
		dataAccessMethod = newDataAccessMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DMM_CORE_TERMS__DATA_ACCESS_METHOD, oldDataAccessMethod, dataAccessMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ppsrmetamodelPackage.DMM_CORE_TERMS__IDENTIFIER:
				return getIdentifier();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATE_SUBMITTED:
				return getDateSubmitted();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__MODIFIED:
				return getModified();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATASET_STATUS:
				return getDatasetStatus();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__TITLE:
				return getTitle();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__ABSTRACT:
				return getAbstract();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__ACCESS_RIGHTS:
				return getAccessRights();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__BIBLIOGRAPHIC_CITATION:
				return getBibliographicCitation();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__RIGHTS_HOLDER:
				return getRightsHolder();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__LICENSE:
				return getLicense();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__LANGUAGE:
				return getLanguage();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATESET_START_DATE:
				return getDatesetStartDate();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATASET_END_DATE:
				return getDatasetEndDate();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__METHOD_TYPE:
				return getMethodType();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATA_ACCESS_METHOD:
				return getDataAccessMethod();
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
			case ppsrmetamodelPackage.DMM_CORE_TERMS__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATE_SUBMITTED:
				setDateSubmitted((Date)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__MODIFIED:
				setModified((Date)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATASET_STATUS:
				setDatasetStatus((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__TITLE:
				setTitle((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__ACCESS_RIGHTS:
				setAccessRights((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__BIBLIOGRAPHIC_CITATION:
				setBibliographicCitation((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__RIGHTS_HOLDER:
				setRightsHolder((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__LICENSE:
				setLicense((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATESET_START_DATE:
				setDatesetStartDate((Date)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATASET_END_DATE:
				setDatasetEndDate((Date)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__METHOD_TYPE:
				setMethodType((String)newValue);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATA_ACCESS_METHOD:
				setDataAccessMethod((String)newValue);
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
			case ppsrmetamodelPackage.DMM_CORE_TERMS__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATE_SUBMITTED:
				setDateSubmitted(DATE_SUBMITTED_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATASET_STATUS:
				setDatasetStatus(DATASET_STATUS_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__ACCESS_RIGHTS:
				setAccessRights(ACCESS_RIGHTS_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__BIBLIOGRAPHIC_CITATION:
				unsetBibliographicCitation();
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__RIGHTS_HOLDER:
				setRightsHolder(RIGHTS_HOLDER_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATESET_START_DATE:
				setDatesetStartDate(DATESET_START_DATE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATASET_END_DATE:
				unsetDatasetEndDate();
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__METHOD_TYPE:
				setMethodType(METHOD_TYPE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATA_ACCESS_METHOD:
				setDataAccessMethod(DATA_ACCESS_METHOD_EDEFAULT);
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
			case ppsrmetamodelPackage.DMM_CORE_TERMS__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATE_SUBMITTED:
				return DATE_SUBMITTED_EDEFAULT == null ? dateSubmitted != null : !DATE_SUBMITTED_EDEFAULT.equals(dateSubmitted);
			case ppsrmetamodelPackage.DMM_CORE_TERMS__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATASET_STATUS:
				return DATASET_STATUS_EDEFAULT == null ? datasetStatus != null : !DATASET_STATUS_EDEFAULT.equals(datasetStatus);
			case ppsrmetamodelPackage.DMM_CORE_TERMS__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ppsrmetamodelPackage.DMM_CORE_TERMS__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case ppsrmetamodelPackage.DMM_CORE_TERMS__ACCESS_RIGHTS:
				return ACCESS_RIGHTS_EDEFAULT == null ? accessRights != null : !ACCESS_RIGHTS_EDEFAULT.equals(accessRights);
			case ppsrmetamodelPackage.DMM_CORE_TERMS__BIBLIOGRAPHIC_CITATION:
				return isSetBibliographicCitation();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__RIGHTS_HOLDER:
				return RIGHTS_HOLDER_EDEFAULT == null ? rightsHolder != null : !RIGHTS_HOLDER_EDEFAULT.equals(rightsHolder);
			case ppsrmetamodelPackage.DMM_CORE_TERMS__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case ppsrmetamodelPackage.DMM_CORE_TERMS__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATESET_START_DATE:
				return DATESET_START_DATE_EDEFAULT == null ? datesetStartDate != null : !DATESET_START_DATE_EDEFAULT.equals(datesetStartDate);
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATASET_END_DATE:
				return isSetDatasetEndDate();
			case ppsrmetamodelPackage.DMM_CORE_TERMS__METHOD_TYPE:
				return METHOD_TYPE_EDEFAULT == null ? methodType != null : !METHOD_TYPE_EDEFAULT.equals(methodType);
			case ppsrmetamodelPackage.DMM_CORE_TERMS__DATA_ACCESS_METHOD:
				return DATA_ACCESS_METHOD_EDEFAULT == null ? dataAccessMethod != null : !DATA_ACCESS_METHOD_EDEFAULT.equals(dataAccessMethod);
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", dateSubmitted: ");
		result.append(dateSubmitted);
		result.append(", modified: ");
		result.append(modified);
		result.append(", datasetStatus: ");
		result.append(datasetStatus);
		result.append(", title: ");
		result.append(title);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", accessRights: ");
		result.append(accessRights);
		result.append(", bibliographicCitation: ");
		if (bibliographicCitationESet) result.append(bibliographicCitation); else result.append("<unset>");
		result.append(", rightsHolder: ");
		result.append(rightsHolder);
		result.append(", license: ");
		result.append(license);
		result.append(", language: ");
		result.append(language);
		result.append(", datesetStartDate: ");
		result.append(datesetStartDate);
		result.append(", datasetEndDate: ");
		if (datasetEndDateESet) result.append(datasetEndDate); else result.append("<unset>");
		result.append(", methodType: ");
		result.append(methodType);
		result.append(", dataAccessMethod: ");
		result.append(dataAccessMethod);
		result.append(')');
		return result.toString();
	}

} //DmmCoreTermsImpl
