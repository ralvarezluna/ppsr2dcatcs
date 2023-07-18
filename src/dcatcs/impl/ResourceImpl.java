/**
 */
package dcatcs.impl;

import dcatcs.DcatcsPackage;
import dcatcs.Resource;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.impl.ResourceImpl#getContactPoint <em>Contact Point</em>}</li>
 *   <li>{@link dcatcs.impl.ResourceImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link dcatcs.impl.ResourceImpl#getLandingPage <em>Landing Page</em>}</li>
 *   <li>{@link dcatcs.impl.ResourceImpl#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link dcatcs.impl.ResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dcatcs.impl.ResourceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dcatcs.impl.ResourceImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link dcatcs.impl.ResourceImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link dcatcs.impl.ResourceImpl#getUpdateModificationDate <em>Update Modification Date</em>}</li>
 *   <li>{@link dcatcs.impl.ResourceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link dcatcs.impl.ResourceImpl#getHasPart <em>Has Part</em>}</li>
 *   <li>{@link dcatcs.impl.ResourceImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl extends EObjectImpl implements Resource {
	/**
	 * The default value of the '{@link #getContactPoint() <em>Contact Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPoint()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONTACT_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactPoint() <em>Contact Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPoint()
	 * @generated
	 * @ordered
	 */
	protected Object contactPoint = CONTACT_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected String keyword = KEYWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLandingPage() <em>Landing Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingPage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANDING_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLandingPage() <em>Landing Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingPage()
	 * @generated
	 * @ordered
	 */
	protected String landingPage = LANDING_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConformsTo() <em>Conforms To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformsTo()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFORMS_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConformsTo() <em>Conforms To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformsTo()
	 * @generated
	 * @ordered
	 */
	protected String conformsTo = CONFORMS_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected Date releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateModificationDate() <em>Update Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateModificationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATE_MODIFICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateModificationDate() <em>Update Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateModificationDate()
	 * @generated
	 * @ordered
	 */
	protected Date updateModificationDate = UPDATE_MODIFICATION_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getHasPart() <em>Has Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPart()
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasPart() <em>Has Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPart()
	 * @generated
	 * @ordered
	 */
	protected String hasPart = HAS_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatcsPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getContactPoint() {
		return contactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactPoint(Object newContactPoint) {
		Object oldContactPoint = contactPoint;
		contactPoint = newContactPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.RESOURCE__CONTACT_POINT, oldContactPoint, contactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyword(String newKeyword) {
		String oldKeyword = keyword;
		keyword = newKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.RESOURCE__KEYWORD, oldKeyword, keyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLandingPage() {
		return landingPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLandingPage(String newLandingPage) {
		String oldLandingPage = landingPage;
		landingPage = newLandingPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.RESOURCE__LANDING_PAGE, oldLandingPage, landingPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConformsTo() {
		return conformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConformsTo(String newConformsTo) {
		String oldConformsTo = conformsTo;
		conformsTo = newConformsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.RESOURCE__CONFORMS_TO, oldConformsTo, conformsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.RESOURCE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.RESOURCE__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.RESOURCE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseDate(Date newReleaseDate) {
		Date oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.RESOURCE__RELEASE_DATE, oldReleaseDate, releaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUpdateModificationDate() {
		return updateModificationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateModificationDate(Date newUpdateModificationDate) {
		Date oldUpdateModificationDate = updateModificationDate;
		updateModificationDate = newUpdateModificationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.RESOURCE__UPDATE_MODIFICATION_DATE, oldUpdateModificationDate, updateModificationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.RESOURCE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHasPart() {
		return hasPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasPart(String newHasPart) {
		String oldHasPart = hasPart;
		hasPart = newHasPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.RESOURCE__HAS_PART, oldHasPart, hasPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.RESOURCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DcatcsPackage.RESOURCE__CONTACT_POINT:
				return getContactPoint();
			case DcatcsPackage.RESOURCE__KEYWORD:
				return getKeyword();
			case DcatcsPackage.RESOURCE__LANDING_PAGE:
				return getLandingPage();
			case DcatcsPackage.RESOURCE__CONFORMS_TO:
				return getConformsTo();
			case DcatcsPackage.RESOURCE__DESCRIPTION:
				return getDescription();
			case DcatcsPackage.RESOURCE__IDENTIFIER:
				return getIdentifier();
			case DcatcsPackage.RESOURCE__LANGUAGE:
				return getLanguage();
			case DcatcsPackage.RESOURCE__RELEASE_DATE:
				return getReleaseDate();
			case DcatcsPackage.RESOURCE__UPDATE_MODIFICATION_DATE:
				return getUpdateModificationDate();
			case DcatcsPackage.RESOURCE__TITLE:
				return getTitle();
			case DcatcsPackage.RESOURCE__HAS_PART:
				return getHasPart();
			case DcatcsPackage.RESOURCE__STATUS:
				return getStatus();
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
			case DcatcsPackage.RESOURCE__CONTACT_POINT:
				setContactPoint(newValue);
				return;
			case DcatcsPackage.RESOURCE__KEYWORD:
				setKeyword((String)newValue);
				return;
			case DcatcsPackage.RESOURCE__LANDING_PAGE:
				setLandingPage((String)newValue);
				return;
			case DcatcsPackage.RESOURCE__CONFORMS_TO:
				setConformsTo((String)newValue);
				return;
			case DcatcsPackage.RESOURCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DcatcsPackage.RESOURCE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case DcatcsPackage.RESOURCE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case DcatcsPackage.RESOURCE__RELEASE_DATE:
				setReleaseDate((Date)newValue);
				return;
			case DcatcsPackage.RESOURCE__UPDATE_MODIFICATION_DATE:
				setUpdateModificationDate((Date)newValue);
				return;
			case DcatcsPackage.RESOURCE__TITLE:
				setTitle((String)newValue);
				return;
			case DcatcsPackage.RESOURCE__HAS_PART:
				setHasPart((String)newValue);
				return;
			case DcatcsPackage.RESOURCE__STATUS:
				setStatus((String)newValue);
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
			case DcatcsPackage.RESOURCE__CONTACT_POINT:
				setContactPoint(CONTACT_POINT_EDEFAULT);
				return;
			case DcatcsPackage.RESOURCE__KEYWORD:
				setKeyword(KEYWORD_EDEFAULT);
				return;
			case DcatcsPackage.RESOURCE__LANDING_PAGE:
				setLandingPage(LANDING_PAGE_EDEFAULT);
				return;
			case DcatcsPackage.RESOURCE__CONFORMS_TO:
				setConformsTo(CONFORMS_TO_EDEFAULT);
				return;
			case DcatcsPackage.RESOURCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DcatcsPackage.RESOURCE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case DcatcsPackage.RESOURCE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case DcatcsPackage.RESOURCE__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
				return;
			case DcatcsPackage.RESOURCE__UPDATE_MODIFICATION_DATE:
				setUpdateModificationDate(UPDATE_MODIFICATION_DATE_EDEFAULT);
				return;
			case DcatcsPackage.RESOURCE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DcatcsPackage.RESOURCE__HAS_PART:
				setHasPart(HAS_PART_EDEFAULT);
				return;
			case DcatcsPackage.RESOURCE__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case DcatcsPackage.RESOURCE__CONTACT_POINT:
				return CONTACT_POINT_EDEFAULT == null ? contactPoint != null : !CONTACT_POINT_EDEFAULT.equals(contactPoint);
			case DcatcsPackage.RESOURCE__KEYWORD:
				return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
			case DcatcsPackage.RESOURCE__LANDING_PAGE:
				return LANDING_PAGE_EDEFAULT == null ? landingPage != null : !LANDING_PAGE_EDEFAULT.equals(landingPage);
			case DcatcsPackage.RESOURCE__CONFORMS_TO:
				return CONFORMS_TO_EDEFAULT == null ? conformsTo != null : !CONFORMS_TO_EDEFAULT.equals(conformsTo);
			case DcatcsPackage.RESOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DcatcsPackage.RESOURCE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case DcatcsPackage.RESOURCE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case DcatcsPackage.RESOURCE__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? releaseDate != null : !RELEASE_DATE_EDEFAULT.equals(releaseDate);
			case DcatcsPackage.RESOURCE__UPDATE_MODIFICATION_DATE:
				return UPDATE_MODIFICATION_DATE_EDEFAULT == null ? updateModificationDate != null : !UPDATE_MODIFICATION_DATE_EDEFAULT.equals(updateModificationDate);
			case DcatcsPackage.RESOURCE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DcatcsPackage.RESOURCE__HAS_PART:
				return HAS_PART_EDEFAULT == null ? hasPart != null : !HAS_PART_EDEFAULT.equals(hasPart);
			case DcatcsPackage.RESOURCE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
		result.append(" (contactPoint: ");
		result.append(contactPoint);
		result.append(", keyword: ");
		result.append(keyword);
		result.append(", landingPage: ");
		result.append(landingPage);
		result.append(", conformsTo: ");
		result.append(conformsTo);
		result.append(", description: ");
		result.append(description);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", language: ");
		result.append(language);
		result.append(", releaseDate: ");
		result.append(releaseDate);
		result.append(", updateModificationDate: ");
		result.append(updateModificationDate);
		result.append(", title: ");
		result.append(title);
		result.append(", hasPart: ");
		result.append(hasPart);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
