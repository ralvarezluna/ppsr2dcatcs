/**
 */
package dcatcs.impl;

import dcatcs.CSProject;
import dcatcs.ContactPoint;
import dcatcs.DcatcsPackage;
import dcatcs.ProjectGeographicLocation;
import dcatcs.ProjectMedia;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CS Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.impl.CSProjectImpl#getProjectAim <em>Project Aim</em>}</li>
 *   <li>{@link dcatcs.impl.CSProjectImpl#getDifficultyLevel <em>Difficulty Level</em>}</li>
 *   <li>{@link dcatcs.impl.CSProjectImpl#getProjectStartDate <em>Project Start Date</em>}</li>
 *   <li>{@link dcatcs.impl.CSProjectImpl#getProjectEndDate <em>Project End Date</em>}</li>
 *   <li>{@link dcatcs.impl.CSProjectImpl#getProjectScienceType <em>Project Science Type</em>}</li>
 *   <li>{@link dcatcs.impl.CSProjectImpl#getUnRegions <em>Un Regions</em>}</li>
 *   <li>{@link dcatcs.impl.CSProjectImpl#getProjectLocality <em>Project Locality</em>}</li>
 *   <li>{@link dcatcs.impl.CSProjectImpl#getProjectmedia <em>Projectmedia</em>}</li>
 *   <li>{@link dcatcs.impl.CSProjectImpl#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link dcatcs.impl.CSProjectImpl#getProjectDateCreated <em>Project Date Created</em>}</li>
 *   <li>{@link dcatcs.impl.CSProjectImpl#getProjectgeographiclocation <em>Projectgeographiclocation</em>}</li>
 *   <li>{@link dcatcs.impl.CSProjectImpl#getContacts <em>Contacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSProjectImpl extends ResourceImpl implements CSProject {
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
	 * This is true if the Difficulty Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean difficultyLevelESet;

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
	 * This is true if the Project End Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean projectEndDateESet;

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
	 * This is true if the Un Regions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unRegionsESet;

	/**
	 * The default value of the '{@link #getProjectLocality() <em>Project Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectLocality()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_LOCALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectLocality() <em>Project Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectLocality()
	 * @generated
	 * @ordered
	 */
	protected String projectLocality = PROJECT_LOCALITY_EDEFAULT;

	/**
	 * This is true if the Project Locality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean projectLocalityESet;

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
	 * The cached value of the '{@link #getProjectgeographiclocation() <em>Projectgeographiclocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectgeographiclocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectGeographicLocation> projectgeographiclocation;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contacts;

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
		return DcatcsPackage.Literals.CS_PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_PROJECT__PROJECT_AIM, oldProjectAim, projectAim));
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
		boolean oldDifficultyLevelESet = difficultyLevelESet;
		difficultyLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_PROJECT__DIFFICULTY_LEVEL, oldDifficultyLevel, difficultyLevel, !oldDifficultyLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDifficultyLevel() {
		String oldDifficultyLevel = difficultyLevel;
		boolean oldDifficultyLevelESet = difficultyLevelESet;
		difficultyLevel = DIFFICULTY_LEVEL_EDEFAULT;
		difficultyLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DcatcsPackage.CS_PROJECT__DIFFICULTY_LEVEL, oldDifficultyLevel, DIFFICULTY_LEVEL_EDEFAULT, oldDifficultyLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDifficultyLevel() {
		return difficultyLevelESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_PROJECT__PROJECT_START_DATE, oldProjectStartDate, projectStartDate));
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
		boolean oldProjectEndDateESet = projectEndDateESet;
		projectEndDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_PROJECT__PROJECT_END_DATE, oldProjectEndDate, projectEndDate, !oldProjectEndDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProjectEndDate() {
		Date oldProjectEndDate = projectEndDate;
		boolean oldProjectEndDateESet = projectEndDateESet;
		projectEndDate = PROJECT_END_DATE_EDEFAULT;
		projectEndDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DcatcsPackage.CS_PROJECT__PROJECT_END_DATE, oldProjectEndDate, PROJECT_END_DATE_EDEFAULT, oldProjectEndDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProjectEndDate() {
		return projectEndDateESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_PROJECT__PROJECT_SCIENCE_TYPE, oldProjectScienceType, projectScienceType));
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
		boolean oldUnRegionsESet = unRegionsESet;
		unRegionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_PROJECT__UN_REGIONS, oldUnRegions, unRegions, !oldUnRegionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUnRegions() {
		String oldUnRegions = unRegions;
		boolean oldUnRegionsESet = unRegionsESet;
		unRegions = UN_REGIONS_EDEFAULT;
		unRegionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DcatcsPackage.CS_PROJECT__UN_REGIONS, oldUnRegions, UN_REGIONS_EDEFAULT, oldUnRegionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUnRegions() {
		return unRegionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectLocality() {
		return projectLocality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectLocality(String newProjectLocality) {
		String oldProjectLocality = projectLocality;
		projectLocality = newProjectLocality;
		boolean oldProjectLocalityESet = projectLocalityESet;
		projectLocalityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_PROJECT__PROJECT_LOCALITY, oldProjectLocality, projectLocality, !oldProjectLocalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProjectLocality() {
		String oldProjectLocality = projectLocality;
		boolean oldProjectLocalityESet = projectLocalityESet;
		projectLocality = PROJECT_LOCALITY_EDEFAULT;
		projectLocalityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DcatcsPackage.CS_PROJECT__PROJECT_LOCALITY, oldProjectLocality, PROJECT_LOCALITY_EDEFAULT, oldProjectLocalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProjectLocality() {
		return projectLocalityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProjectMedia> getProjectmedia() {
		if (projectmedia == null) {
			projectmedia = new EObjectContainmentEList<ProjectMedia>(ProjectMedia.class, this, DcatcsPackage.CS_PROJECT__PROJECTMEDIA);
		}
		return projectmedia;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_PROJECT__PROJECT_DATE_CREATED, oldProjectDateCreated, projectDateCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProjectGeographicLocation> getProjectgeographiclocation() {
		if (projectgeographiclocation == null) {
			projectgeographiclocation = new EObjectContainmentEList<ProjectGeographicLocation>(ProjectGeographicLocation.class, this, DcatcsPackage.CS_PROJECT__PROJECTGEOGRAPHICLOCATION);
		}
		return projectgeographiclocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, DcatcsPackage.CS_PROJECT__CONTACTS);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatcsPackage.CS_PROJECT__PROJECTMEDIA:
				return ((InternalEList<?>)getProjectmedia()).basicRemove(otherEnd, msgs);
			case DcatcsPackage.CS_PROJECT__PROJECTGEOGRAPHICLOCATION:
				return ((InternalEList<?>)getProjectgeographiclocation()).basicRemove(otherEnd, msgs);
			case DcatcsPackage.CS_PROJECT__CONTACTS:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
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
			case DcatcsPackage.CS_PROJECT__PROJECT_AIM:
				return getProjectAim();
			case DcatcsPackage.CS_PROJECT__DIFFICULTY_LEVEL:
				return getDifficultyLevel();
			case DcatcsPackage.CS_PROJECT__PROJECT_START_DATE:
				return getProjectStartDate();
			case DcatcsPackage.CS_PROJECT__PROJECT_END_DATE:
				return getProjectEndDate();
			case DcatcsPackage.CS_PROJECT__PROJECT_SCIENCE_TYPE:
				return getProjectScienceType();
			case DcatcsPackage.CS_PROJECT__UN_REGIONS:
				return getUnRegions();
			case DcatcsPackage.CS_PROJECT__PROJECT_LOCALITY:
				return getProjectLocality();
			case DcatcsPackage.CS_PROJECT__PROJECTMEDIA:
				return getProjectmedia();
			case DcatcsPackage.CS_PROJECT__PROJECT_ID:
				return getProjectId();
			case DcatcsPackage.CS_PROJECT__PROJECT_DATE_CREATED:
				return getProjectDateCreated();
			case DcatcsPackage.CS_PROJECT__PROJECTGEOGRAPHICLOCATION:
				return getProjectgeographiclocation();
			case DcatcsPackage.CS_PROJECT__CONTACTS:
				return getContacts();
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
			case DcatcsPackage.CS_PROJECT__PROJECT_AIM:
				setProjectAim((String)newValue);
				return;
			case DcatcsPackage.CS_PROJECT__DIFFICULTY_LEVEL:
				setDifficultyLevel((String)newValue);
				return;
			case DcatcsPackage.CS_PROJECT__PROJECT_START_DATE:
				setProjectStartDate((Date)newValue);
				return;
			case DcatcsPackage.CS_PROJECT__PROJECT_END_DATE:
				setProjectEndDate((Date)newValue);
				return;
			case DcatcsPackage.CS_PROJECT__PROJECT_SCIENCE_TYPE:
				setProjectScienceType((String)newValue);
				return;
			case DcatcsPackage.CS_PROJECT__UN_REGIONS:
				setUnRegions((String)newValue);
				return;
			case DcatcsPackage.CS_PROJECT__PROJECT_LOCALITY:
				setProjectLocality((String)newValue);
				return;
			case DcatcsPackage.CS_PROJECT__PROJECTMEDIA:
				getProjectmedia().clear();
				getProjectmedia().addAll((Collection<? extends ProjectMedia>)newValue);
				return;
			case DcatcsPackage.CS_PROJECT__PROJECT_DATE_CREATED:
				setProjectDateCreated((Date)newValue);
				return;
			case DcatcsPackage.CS_PROJECT__PROJECTGEOGRAPHICLOCATION:
				getProjectgeographiclocation().clear();
				getProjectgeographiclocation().addAll((Collection<? extends ProjectGeographicLocation>)newValue);
				return;
			case DcatcsPackage.CS_PROJECT__CONTACTS:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactPoint>)newValue);
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
			case DcatcsPackage.CS_PROJECT__PROJECT_AIM:
				setProjectAim(PROJECT_AIM_EDEFAULT);
				return;
			case DcatcsPackage.CS_PROJECT__DIFFICULTY_LEVEL:
				unsetDifficultyLevel();
				return;
			case DcatcsPackage.CS_PROJECT__PROJECT_START_DATE:
				setProjectStartDate(PROJECT_START_DATE_EDEFAULT);
				return;
			case DcatcsPackage.CS_PROJECT__PROJECT_END_DATE:
				unsetProjectEndDate();
				return;
			case DcatcsPackage.CS_PROJECT__PROJECT_SCIENCE_TYPE:
				setProjectScienceType(PROJECT_SCIENCE_TYPE_EDEFAULT);
				return;
			case DcatcsPackage.CS_PROJECT__UN_REGIONS:
				unsetUnRegions();
				return;
			case DcatcsPackage.CS_PROJECT__PROJECT_LOCALITY:
				unsetProjectLocality();
				return;
			case DcatcsPackage.CS_PROJECT__PROJECTMEDIA:
				getProjectmedia().clear();
				return;
			case DcatcsPackage.CS_PROJECT__PROJECT_DATE_CREATED:
				setProjectDateCreated(PROJECT_DATE_CREATED_EDEFAULT);
				return;
			case DcatcsPackage.CS_PROJECT__PROJECTGEOGRAPHICLOCATION:
				getProjectgeographiclocation().clear();
				return;
			case DcatcsPackage.CS_PROJECT__CONTACTS:
				getContacts().clear();
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
			case DcatcsPackage.CS_PROJECT__PROJECT_AIM:
				return PROJECT_AIM_EDEFAULT == null ? projectAim != null : !PROJECT_AIM_EDEFAULT.equals(projectAim);
			case DcatcsPackage.CS_PROJECT__DIFFICULTY_LEVEL:
				return isSetDifficultyLevel();
			case DcatcsPackage.CS_PROJECT__PROJECT_START_DATE:
				return PROJECT_START_DATE_EDEFAULT == null ? projectStartDate != null : !PROJECT_START_DATE_EDEFAULT.equals(projectStartDate);
			case DcatcsPackage.CS_PROJECT__PROJECT_END_DATE:
				return isSetProjectEndDate();
			case DcatcsPackage.CS_PROJECT__PROJECT_SCIENCE_TYPE:
				return PROJECT_SCIENCE_TYPE_EDEFAULT == null ? projectScienceType != null : !PROJECT_SCIENCE_TYPE_EDEFAULT.equals(projectScienceType);
			case DcatcsPackage.CS_PROJECT__UN_REGIONS:
				return isSetUnRegions();
			case DcatcsPackage.CS_PROJECT__PROJECT_LOCALITY:
				return isSetProjectLocality();
			case DcatcsPackage.CS_PROJECT__PROJECTMEDIA:
				return projectmedia != null && !projectmedia.isEmpty();
			case DcatcsPackage.CS_PROJECT__PROJECT_ID:
				return PROJECT_ID_EDEFAULT == null ? projectId != null : !PROJECT_ID_EDEFAULT.equals(projectId);
			case DcatcsPackage.CS_PROJECT__PROJECT_DATE_CREATED:
				return PROJECT_DATE_CREATED_EDEFAULT == null ? projectDateCreated != null : !PROJECT_DATE_CREATED_EDEFAULT.equals(projectDateCreated);
			case DcatcsPackage.CS_PROJECT__PROJECTGEOGRAPHICLOCATION:
				return projectgeographiclocation != null && !projectgeographiclocation.isEmpty();
			case DcatcsPackage.CS_PROJECT__CONTACTS:
				return contacts != null && !contacts.isEmpty();
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
		result.append(" (projectAim: ");
		result.append(projectAim);
		result.append(", difficultyLevel: ");
		if (difficultyLevelESet) result.append(difficultyLevel); else result.append("<unset>");
		result.append(", projectStartDate: ");
		result.append(projectStartDate);
		result.append(", projectEndDate: ");
		if (projectEndDateESet) result.append(projectEndDate); else result.append("<unset>");
		result.append(", projectScienceType: ");
		result.append(projectScienceType);
		result.append(", unRegions: ");
		if (unRegionsESet) result.append(unRegions); else result.append("<unset>");
		result.append(", projectLocality: ");
		if (projectLocalityESet) result.append(projectLocality); else result.append("<unset>");
		result.append(", projectId: ");
		result.append(projectId);
		result.append(", projectDateCreated: ");
		result.append(projectDateCreated);
		result.append(')');
		return result.toString();
	}

} //CSProjectImpl
