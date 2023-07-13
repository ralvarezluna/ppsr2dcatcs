/**
 */
package ppsr_coremetamodel.impl;

import java.util.Collection;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import ppsr_coremetamodel.Activity;
import ppsr_coremetamodel.CSProject;
import ppsr_coremetamodel.ContactPoint;
import ppsr_coremetamodel.ProjectGeographicLocation;
import ppsr_coremetamodel.ProjectMedia;
import ppsr_coremetamodel.ppsrmetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CS Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectDateCreated <em>Project Date Created</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectLastUpdatedDate <em>Project Last Updated Date</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectAim <em>Project Aim</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectDescription <em>Project Description</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getHasTag <em>Has Tag</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getDifficultyLevel <em>Difficulty Level</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectStatus <em>Project Status</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectStartDate <em>Project Start Date</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectEndDate <em>Project End Date</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectDuration <em>Project Duration</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectScienceType <em>Project Science Type</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectUrl <em>Project Url</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getUnRegions <em>Un Regions</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectgeographiclocation <em>Projectgeographiclocation</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectmedia <em>Projectmedia</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getContactpoint <em>Contactpoint</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.CSProjectImpl#getProjectResponsiblePartyName <em>Project Responsible Party Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSProjectImpl extends EObjectImpl implements CSProject {
	/**
	 * The default value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectId()
	 * @generated
	 * @ordered
	 */
	protected String projectId = PROJECT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectDateCreated() <em>Project Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectDateCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date PROJECT_DATE_CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectDateCreated() <em>Project Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectDateCreated()
	 * @generated
	 * @ordered
	 */
	protected Date projectDateCreated = PROJECT_DATE_CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectLastUpdatedDate() <em>Project Last Updated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectLastUpdatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PROJECT_LAST_UPDATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectLastUpdatedDate() <em>Project Last Updated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectLastUpdatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date projectLastUpdatedDate = PROJECT_LAST_UPDATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectAim() <em>Project Aim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectAim()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_AIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectAim() <em>Project Aim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectAim()
	 * @generated
	 * @ordered
	 */
	protected String projectAim = PROJECT_AIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectDescription() <em>Project Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectDescription() <em>Project Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectDescription()
	 * @generated
	 * @ordered
	 */
	protected String projectDescription = PROJECT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasTag() <em>Has Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTag()
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasTag() <em>Has Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTag()
	 * @generated
	 * @ordered
	 */
	protected String hasTag = HAS_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifficultyLevel() <em>Difficulty Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficultyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFFICULTY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDifficultyLevel() <em>Difficulty Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficultyLevel()
	 * @generated
	 * @ordered
	 */
	protected String difficultyLevel = DIFFICULTY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectStatus() <em>Project Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectStatus() <em>Project Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectStatus()
	 * @generated
	 * @ordered
	 */
	protected String projectStatus = PROJECT_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectStartDate() <em>Project Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PROJECT_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectStartDate() <em>Project Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date projectStartDate = PROJECT_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectEndDate() <em>Project End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PROJECT_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectEndDate() <em>Project End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date projectEndDate = PROJECT_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectDuration() <em>Project Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectDuration()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PROJECT_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectDuration() <em>Project Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectDuration()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar projectDuration = PROJECT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectScienceType() <em>Project Science Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectScienceType()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_SCIENCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectScienceType() <em>Project Science Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectScienceType()
	 * @generated
	 * @ordered
	 */
	protected String projectScienceType = PROJECT_SCIENCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectUrl() <em>Project Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectUrl() <em>Project Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectUrl()
	 * @generated
	 * @ordered
	 */
	protected String projectUrl = PROJECT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnRegions() <em>Un Regions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnRegions()
	 * @generated
	 * @ordered
	 */
	protected static final String UN_REGIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnRegions() <em>Un Regions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnRegions()
	 * @generated
	 * @ordered
	 */
	protected String unRegions = UN_REGIONS_EDEFAULT;

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
	 * The cached value of the '{@link #getProjectgeographiclocation() <em>Projectgeographiclocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectgeographiclocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectGeographicLocation> projectgeographiclocation;

	/**
	 * The cached value of the '{@link #getProjectmedia() <em>Projectmedia</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectmedia()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectMedia> projectmedia;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * The default value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected String keywords = KEYWORDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContactpoint() <em>Contactpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contactpoint;

	/**
	 * The default value of the '{@link #getProjectResponsiblePartyName() <em>Project Responsible Party Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectResponsiblePartyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_RESPONSIBLE_PARTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectResponsiblePartyName() <em>Project Responsible Party Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectResponsiblePartyName()
	 * @generated
	 * @ordered
	 */
	protected String projectResponsiblePartyName = PROJECT_RESPONSIBLE_PARTY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppsrmetamodelPackage.Literals.CS_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectId() {
		return projectId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectId(String newProjectId) {
		String oldProjectId = projectId;
		projectId = newProjectId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_ID, oldProjectId, projectId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getProjectDateCreated() {
		return projectDateCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectDateCreated(Date newProjectDateCreated) {
		Date oldProjectDateCreated = projectDateCreated;
		projectDateCreated = newProjectDateCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_DATE_CREATED, oldProjectDateCreated, projectDateCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getProjectLastUpdatedDate() {
		return projectLastUpdatedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectLastUpdatedDate(Date newProjectLastUpdatedDate) {
		Date oldProjectLastUpdatedDate = projectLastUpdatedDate;
		projectLastUpdatedDate = newProjectLastUpdatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_LAST_UPDATED_DATE, oldProjectLastUpdatedDate, projectLastUpdatedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectAim() {
		return projectAim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectAim(String newProjectAim) {
		String oldProjectAim = projectAim;
		projectAim = newProjectAim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_AIM, oldProjectAim, projectAim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectDescription() {
		return projectDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectDescription(String newProjectDescription) {
		String oldProjectDescription = projectDescription;
		projectDescription = newProjectDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_DESCRIPTION, oldProjectDescription, projectDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHasTag() {
		return hasTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTag(String newHasTag) {
		String oldHasTag = hasTag;
		hasTag = newHasTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__HAS_TAG, oldHasTag, hasTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifficultyLevel(String newDifficultyLevel) {
		String oldDifficultyLevel = difficultyLevel;
		difficultyLevel = newDifficultyLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__DIFFICULTY_LEVEL, oldDifficultyLevel, difficultyLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectStatus() {
		return projectStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectStatus(String newProjectStatus) {
		String oldProjectStatus = projectStatus;
		projectStatus = newProjectStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_STATUS, oldProjectStatus, projectStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getProjectStartDate() {
		return projectStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectStartDate(Date newProjectStartDate) {
		Date oldProjectStartDate = projectStartDate;
		projectStartDate = newProjectStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_START_DATE, oldProjectStartDate, projectStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getProjectEndDate() {
		return projectEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectEndDate(Date newProjectEndDate) {
		Date oldProjectEndDate = projectEndDate;
		projectEndDate = newProjectEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_END_DATE, oldProjectEndDate, projectEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getProjectDuration() {
		return projectDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectDuration(XMLGregorianCalendar newProjectDuration) {
		XMLGregorianCalendar oldProjectDuration = projectDuration;
		projectDuration = newProjectDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_DURATION, oldProjectDuration, projectDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectScienceType() {
		return projectScienceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectScienceType(String newProjectScienceType) {
		String oldProjectScienceType = projectScienceType;
		projectScienceType = newProjectScienceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_SCIENCE_TYPE, oldProjectScienceType, projectScienceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectUrl() {
		return projectUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectUrl(String newProjectUrl) {
		String oldProjectUrl = projectUrl;
		projectUrl = newProjectUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_URL, oldProjectUrl, projectUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnRegions() {
		return unRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnRegions(String newUnRegions) {
		String oldUnRegions = unRegions;
		unRegions = newUnRegions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__UN_REGIONS, oldUnRegions, unRegions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProjectGeographicLocation> getProjectgeographiclocation() {
		if (projectgeographiclocation == null) {
			projectgeographiclocation = new EObjectContainmentEList<ProjectGeographicLocation>(ProjectGeographicLocation.class, this, ppsrmetamodelPackage.CS_PROJECT__PROJECTGEOGRAPHICLOCATION);
		}
		return projectgeographiclocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProjectMedia> getProjectmedia() {
		if (projectmedia == null) {
			projectmedia = new EObjectContainmentEList<ProjectMedia>(ProjectMedia.class, this, ppsrmetamodelPackage.CS_PROJECT__PROJECTMEDIA);
		}
		return projectmedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<Activity>(Activity.class, this, ppsrmetamodelPackage.CS_PROJECT__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeywords() {
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeywords(String newKeywords) {
		String oldKeywords = keywords;
		keywords = newKeywords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__KEYWORDS, oldKeywords, keywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getContactpoint() {
		if (contactpoint == null) {
			contactpoint = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, ppsrmetamodelPackage.CS_PROJECT__CONTACTPOINT);
		}
		return contactpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectResponsiblePartyName() {
		return projectResponsiblePartyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectResponsiblePartyName(String newProjectResponsiblePartyName) {
		String oldProjectResponsiblePartyName = projectResponsiblePartyName;
		projectResponsiblePartyName = newProjectResponsiblePartyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.CS_PROJECT__PROJECT_RESPONSIBLE_PARTY_NAME, oldProjectResponsiblePartyName, projectResponsiblePartyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ppsrmetamodelPackage.CS_PROJECT__PROJECTGEOGRAPHICLOCATION:
				return ((InternalEList<?>)getProjectgeographiclocation()).basicRemove(otherEnd, msgs);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECTMEDIA:
				return ((InternalEList<?>)getProjectmedia()).basicRemove(otherEnd, msgs);
			case ppsrmetamodelPackage.CS_PROJECT__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case ppsrmetamodelPackage.CS_PROJECT__CONTACTPOINT:
				return ((InternalEList<?>)getContactpoint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_ID:
				return getProjectId();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_DATE_CREATED:
				return getProjectDateCreated();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_LAST_UPDATED_DATE:
				return getProjectLastUpdatedDate();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_NAME:
				return getProjectName();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_AIM:
				return getProjectAim();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_DESCRIPTION:
				return getProjectDescription();
			case ppsrmetamodelPackage.CS_PROJECT__HAS_TAG:
				return getHasTag();
			case ppsrmetamodelPackage.CS_PROJECT__DIFFICULTY_LEVEL:
				return getDifficultyLevel();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_STATUS:
				return getProjectStatus();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_START_DATE:
				return getProjectStartDate();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_END_DATE:
				return getProjectEndDate();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_DURATION:
				return getProjectDuration();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_SCIENCE_TYPE:
				return getProjectScienceType();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_URL:
				return getProjectUrl();
			case ppsrmetamodelPackage.CS_PROJECT__UN_REGIONS:
				return getUnRegions();
			case ppsrmetamodelPackage.CS_PROJECT__LANGUAGE:
				return getLanguage();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECTGEOGRAPHICLOCATION:
				return getProjectgeographiclocation();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECTMEDIA:
				return getProjectmedia();
			case ppsrmetamodelPackage.CS_PROJECT__ACTIVITY:
				return getActivity();
			case ppsrmetamodelPackage.CS_PROJECT__KEYWORDS:
				return getKeywords();
			case ppsrmetamodelPackage.CS_PROJECT__CONTACTPOINT:
				return getContactpoint();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_RESPONSIBLE_PARTY_NAME:
				return getProjectResponsiblePartyName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_ID:
				setProjectId((String)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_DATE_CREATED:
				setProjectDateCreated((Date)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_LAST_UPDATED_DATE:
				setProjectLastUpdatedDate((Date)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_AIM:
				setProjectAim((String)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_DESCRIPTION:
				setProjectDescription((String)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__HAS_TAG:
				setHasTag((String)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__DIFFICULTY_LEVEL:
				setDifficultyLevel((String)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_STATUS:
				setProjectStatus((String)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_START_DATE:
				setProjectStartDate((Date)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_END_DATE:
				setProjectEndDate((Date)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_DURATION:
				setProjectDuration((XMLGregorianCalendar)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_SCIENCE_TYPE:
				setProjectScienceType((String)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_URL:
				setProjectUrl((String)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__UN_REGIONS:
				setUnRegions((String)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECTGEOGRAPHICLOCATION:
				getProjectgeographiclocation().clear();
				getProjectgeographiclocation().addAll((Collection<? extends ProjectGeographicLocation>)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECTMEDIA:
				getProjectmedia().clear();
				getProjectmedia().addAll((Collection<? extends ProjectMedia>)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__KEYWORDS:
				setKeywords((String)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__CONTACTPOINT:
				getContactpoint().clear();
				getContactpoint().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_RESPONSIBLE_PARTY_NAME:
				setProjectResponsiblePartyName((String)newValue);
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
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_ID:
				setProjectId(PROJECT_ID_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_DATE_CREATED:
				setProjectDateCreated(PROJECT_DATE_CREATED_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_LAST_UPDATED_DATE:
				setProjectLastUpdatedDate(PROJECT_LAST_UPDATED_DATE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_AIM:
				setProjectAim(PROJECT_AIM_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_DESCRIPTION:
				setProjectDescription(PROJECT_DESCRIPTION_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__HAS_TAG:
				setHasTag(HAS_TAG_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__DIFFICULTY_LEVEL:
				setDifficultyLevel(DIFFICULTY_LEVEL_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_STATUS:
				setProjectStatus(PROJECT_STATUS_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_START_DATE:
				setProjectStartDate(PROJECT_START_DATE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_END_DATE:
				setProjectEndDate(PROJECT_END_DATE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_DURATION:
				setProjectDuration(PROJECT_DURATION_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_SCIENCE_TYPE:
				setProjectScienceType(PROJECT_SCIENCE_TYPE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_URL:
				setProjectUrl(PROJECT_URL_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__UN_REGIONS:
				setUnRegions(UN_REGIONS_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECTGEOGRAPHICLOCATION:
				getProjectgeographiclocation().clear();
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECTMEDIA:
				getProjectmedia().clear();
				return;
			case ppsrmetamodelPackage.CS_PROJECT__ACTIVITY:
				getActivity().clear();
				return;
			case ppsrmetamodelPackage.CS_PROJECT__KEYWORDS:
				setKeywords(KEYWORDS_EDEFAULT);
				return;
			case ppsrmetamodelPackage.CS_PROJECT__CONTACTPOINT:
				getContactpoint().clear();
				return;
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_RESPONSIBLE_PARTY_NAME:
				setProjectResponsiblePartyName(PROJECT_RESPONSIBLE_PARTY_NAME_EDEFAULT);
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
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_ID:
				return PROJECT_ID_EDEFAULT == null ? projectId != null : !PROJECT_ID_EDEFAULT.equals(projectId);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_DATE_CREATED:
				return PROJECT_DATE_CREATED_EDEFAULT == null ? projectDateCreated != null : !PROJECT_DATE_CREATED_EDEFAULT.equals(projectDateCreated);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_LAST_UPDATED_DATE:
				return PROJECT_LAST_UPDATED_DATE_EDEFAULT == null ? projectLastUpdatedDate != null : !PROJECT_LAST_UPDATED_DATE_EDEFAULT.equals(projectLastUpdatedDate);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_AIM:
				return PROJECT_AIM_EDEFAULT == null ? projectAim != null : !PROJECT_AIM_EDEFAULT.equals(projectAim);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_DESCRIPTION:
				return PROJECT_DESCRIPTION_EDEFAULT == null ? projectDescription != null : !PROJECT_DESCRIPTION_EDEFAULT.equals(projectDescription);
			case ppsrmetamodelPackage.CS_PROJECT__HAS_TAG:
				return HAS_TAG_EDEFAULT == null ? hasTag != null : !HAS_TAG_EDEFAULT.equals(hasTag);
			case ppsrmetamodelPackage.CS_PROJECT__DIFFICULTY_LEVEL:
				return DIFFICULTY_LEVEL_EDEFAULT == null ? difficultyLevel != null : !DIFFICULTY_LEVEL_EDEFAULT.equals(difficultyLevel);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_STATUS:
				return PROJECT_STATUS_EDEFAULT == null ? projectStatus != null : !PROJECT_STATUS_EDEFAULT.equals(projectStatus);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_START_DATE:
				return PROJECT_START_DATE_EDEFAULT == null ? projectStartDate != null : !PROJECT_START_DATE_EDEFAULT.equals(projectStartDate);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_END_DATE:
				return PROJECT_END_DATE_EDEFAULT == null ? projectEndDate != null : !PROJECT_END_DATE_EDEFAULT.equals(projectEndDate);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_DURATION:
				return PROJECT_DURATION_EDEFAULT == null ? projectDuration != null : !PROJECT_DURATION_EDEFAULT.equals(projectDuration);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_SCIENCE_TYPE:
				return PROJECT_SCIENCE_TYPE_EDEFAULT == null ? projectScienceType != null : !PROJECT_SCIENCE_TYPE_EDEFAULT.equals(projectScienceType);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_URL:
				return PROJECT_URL_EDEFAULT == null ? projectUrl != null : !PROJECT_URL_EDEFAULT.equals(projectUrl);
			case ppsrmetamodelPackage.CS_PROJECT__UN_REGIONS:
				return UN_REGIONS_EDEFAULT == null ? unRegions != null : !UN_REGIONS_EDEFAULT.equals(unRegions);
			case ppsrmetamodelPackage.CS_PROJECT__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case ppsrmetamodelPackage.CS_PROJECT__PROJECTGEOGRAPHICLOCATION:
				return projectgeographiclocation != null && !projectgeographiclocation.isEmpty();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECTMEDIA:
				return projectmedia != null && !projectmedia.isEmpty();
			case ppsrmetamodelPackage.CS_PROJECT__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case ppsrmetamodelPackage.CS_PROJECT__KEYWORDS:
				return KEYWORDS_EDEFAULT == null ? keywords != null : !KEYWORDS_EDEFAULT.equals(keywords);
			case ppsrmetamodelPackage.CS_PROJECT__CONTACTPOINT:
				return contactpoint != null && !contactpoint.isEmpty();
			case ppsrmetamodelPackage.CS_PROJECT__PROJECT_RESPONSIBLE_PARTY_NAME:
				return PROJECT_RESPONSIBLE_PARTY_NAME_EDEFAULT == null ? projectResponsiblePartyName != null : !PROJECT_RESPONSIBLE_PARTY_NAME_EDEFAULT.equals(projectResponsiblePartyName);
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
		result.append(" (projectId: ");
		result.append(projectId);
		result.append(", projectDateCreated: ");
		result.append(projectDateCreated);
		result.append(", projectLastUpdatedDate: ");
		result.append(projectLastUpdatedDate);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", projectAim: ");
		result.append(projectAim);
		result.append(", projectDescription: ");
		result.append(projectDescription);
		result.append(", hasTag: ");
		result.append(hasTag);
		result.append(", difficultyLevel: ");
		result.append(difficultyLevel);
		result.append(", projectStatus: ");
		result.append(projectStatus);
		result.append(", projectStartDate: ");
		result.append(projectStartDate);
		result.append(", projectEndDate: ");
		result.append(projectEndDate);
		result.append(", projectDuration: ");
		result.append(projectDuration);
		result.append(", projectScienceType: ");
		result.append(projectScienceType);
		result.append(", projectUrl: ");
		result.append(projectUrl);
		result.append(", unRegions: ");
		result.append(unRegions);
		result.append(", language: ");
		result.append(language);
		result.append(", keywords: ");
		result.append(keywords);
		result.append(", projectResponsiblePartyName: ");
		result.append(projectResponsiblePartyName);
		result.append(')');
		return result.toString();
	}

} //CSProjectImpl
