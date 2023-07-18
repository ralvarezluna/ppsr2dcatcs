/**
 */
package dcatcs.impl;

import dcatcs.ContactPoint;
import dcatcs.DcatcsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.impl.ContactPointImpl#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link dcatcs.impl.ContactPointImpl#getMeansOfContact <em>Means Of Contact</em>}</li>
 *   <li>{@link dcatcs.impl.ContactPointImpl#getContactDetails <em>Contact Details</em>}</li>
 *   <li>{@link dcatcs.impl.ContactPointImpl#getContactPointType <em>Contact Point Type</em>}</li>
 *   <li>{@link dcatcs.impl.ContactPointImpl#getContactEmail <em>Contact Email</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactPointImpl extends EObjectImpl implements ContactPoint {
	/**
	 * The default value of the '{@link #getContactName() <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_NAME_EDEFAULT = "undefined";

	/**
	 * The cached value of the '{@link #getContactName() <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactName()
	 * @generated
	 * @ordered
	 */
	protected String contactName = CONTACT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeansOfContact() <em>Means Of Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeansOfContact()
	 * @generated
	 * @ordered
	 */
	protected static final String MEANS_OF_CONTACT_EDEFAULT = "undefined";

	/**
	 * The cached value of the '{@link #getMeansOfContact() <em>Means Of Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeansOfContact()
	 * @generated
	 * @ordered
	 */
	protected String meansOfContact = MEANS_OF_CONTACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactDetails() <em>Contact Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_DETAILS_EDEFAULT = "undefined";

	/**
	 * The cached value of the '{@link #getContactDetails() <em>Contact Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactDetails()
	 * @generated
	 * @ordered
	 */
	protected String contactDetails = CONTACT_DETAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactPointType() <em>Contact Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPointType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_POINT_TYPE_EDEFAULT = "undefined";

	/**
	 * The cached value of the '{@link #getContactPointType() <em>Contact Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPointType()
	 * @generated
	 * @ordered
	 */
	protected String contactPointType = CONTACT_POINT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactEmail() <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_EMAIL_EDEFAULT = "undefined";

	/**
	 * The cached value of the '{@link #getContactEmail() <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEmail()
	 * @generated
	 * @ordered
	 */
	protected String contactEmail = CONTACT_EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatcsPackage.Literals.CONTACT_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactName() {
		return contactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactName(String newContactName) {
		String oldContactName = contactName;
		contactName = newContactName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CONTACT_POINT__CONTACT_NAME, oldContactName, contactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMeansOfContact() {
		return meansOfContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeansOfContact(String newMeansOfContact) {
		String oldMeansOfContact = meansOfContact;
		meansOfContact = newMeansOfContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CONTACT_POINT__MEANS_OF_CONTACT, oldMeansOfContact, meansOfContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactDetails() {
		return contactDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactDetails(String newContactDetails) {
		String oldContactDetails = contactDetails;
		contactDetails = newContactDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CONTACT_POINT__CONTACT_DETAILS, oldContactDetails, contactDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactPointType() {
		return contactPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactPointType(String newContactPointType) {
		String oldContactPointType = contactPointType;
		contactPointType = newContactPointType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CONTACT_POINT__CONTACT_POINT_TYPE, oldContactPointType, contactPointType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactEmail() {
		return contactEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactEmail(String newContactEmail) {
		String oldContactEmail = contactEmail;
		contactEmail = newContactEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CONTACT_POINT__CONTACT_EMAIL, oldContactEmail, contactEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DcatcsPackage.CONTACT_POINT__CONTACT_NAME:
				return getContactName();
			case DcatcsPackage.CONTACT_POINT__MEANS_OF_CONTACT:
				return getMeansOfContact();
			case DcatcsPackage.CONTACT_POINT__CONTACT_DETAILS:
				return getContactDetails();
			case DcatcsPackage.CONTACT_POINT__CONTACT_POINT_TYPE:
				return getContactPointType();
			case DcatcsPackage.CONTACT_POINT__CONTACT_EMAIL:
				return getContactEmail();
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
			case DcatcsPackage.CONTACT_POINT__CONTACT_NAME:
				setContactName((String)newValue);
				return;
			case DcatcsPackage.CONTACT_POINT__MEANS_OF_CONTACT:
				setMeansOfContact((String)newValue);
				return;
			case DcatcsPackage.CONTACT_POINT__CONTACT_DETAILS:
				setContactDetails((String)newValue);
				return;
			case DcatcsPackage.CONTACT_POINT__CONTACT_POINT_TYPE:
				setContactPointType((String)newValue);
				return;
			case DcatcsPackage.CONTACT_POINT__CONTACT_EMAIL:
				setContactEmail((String)newValue);
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
			case DcatcsPackage.CONTACT_POINT__CONTACT_NAME:
				setContactName(CONTACT_NAME_EDEFAULT);
				return;
			case DcatcsPackage.CONTACT_POINT__MEANS_OF_CONTACT:
				setMeansOfContact(MEANS_OF_CONTACT_EDEFAULT);
				return;
			case DcatcsPackage.CONTACT_POINT__CONTACT_DETAILS:
				setContactDetails(CONTACT_DETAILS_EDEFAULT);
				return;
			case DcatcsPackage.CONTACT_POINT__CONTACT_POINT_TYPE:
				setContactPointType(CONTACT_POINT_TYPE_EDEFAULT);
				return;
			case DcatcsPackage.CONTACT_POINT__CONTACT_EMAIL:
				setContactEmail(CONTACT_EMAIL_EDEFAULT);
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
			case DcatcsPackage.CONTACT_POINT__CONTACT_NAME:
				return CONTACT_NAME_EDEFAULT == null ? contactName != null : !CONTACT_NAME_EDEFAULT.equals(contactName);
			case DcatcsPackage.CONTACT_POINT__MEANS_OF_CONTACT:
				return MEANS_OF_CONTACT_EDEFAULT == null ? meansOfContact != null : !MEANS_OF_CONTACT_EDEFAULT.equals(meansOfContact);
			case DcatcsPackage.CONTACT_POINT__CONTACT_DETAILS:
				return CONTACT_DETAILS_EDEFAULT == null ? contactDetails != null : !CONTACT_DETAILS_EDEFAULT.equals(contactDetails);
			case DcatcsPackage.CONTACT_POINT__CONTACT_POINT_TYPE:
				return CONTACT_POINT_TYPE_EDEFAULT == null ? contactPointType != null : !CONTACT_POINT_TYPE_EDEFAULT.equals(contactPointType);
			case DcatcsPackage.CONTACT_POINT__CONTACT_EMAIL:
				return CONTACT_EMAIL_EDEFAULT == null ? contactEmail != null : !CONTACT_EMAIL_EDEFAULT.equals(contactEmail);
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
		result.append(" (contactName: ");
		result.append(contactName);
		result.append(", meansOfContact: ");
		result.append(meansOfContact);
		result.append(", contactDetails: ");
		result.append(contactDetails);
		result.append(", contactPointType: ");
		result.append(contactPointType);
		result.append(", contactEmail: ");
		result.append(contactEmail);
		result.append(')');
		return result.toString();
	}

} //ContactPointImpl
