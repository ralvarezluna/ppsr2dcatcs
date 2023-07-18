/**
 */
package dcatcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.ContactPoint#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link dcatcs.ContactPoint#getMeansOfContact <em>Means Of Contact</em>}</li>
 *   <li>{@link dcatcs.ContactPoint#getContactDetails <em>Contact Details</em>}</li>
 *   <li>{@link dcatcs.ContactPoint#getContactPointType <em>Contact Point Type</em>}</li>
 *   <li>{@link dcatcs.ContactPoint#getContactEmail <em>Contact Email</em>}</li>
 * </ul>
 *
 * @see dcatcs.DcatcsPackage#getContactPoint()
 * @model
 * @generated
 */
public interface ContactPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Contact Name</b></em>' attribute.
	 * The default value is <code>"undefined"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Name</em>' attribute.
	 * @see #setContactName(String)
	 * @see dcatcs.DcatcsPackage#getContactPoint_ContactName()
	 * @model default="undefined" unique="false" ordered="false"
	 * @generated
	 */
	String getContactName();

	/**
	 * Sets the value of the '{@link dcatcs.ContactPoint#getContactName <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Name</em>' attribute.
	 * @see #getContactName()
	 * @generated
	 */
	void setContactName(String value);

	/**
	 * Returns the value of the '<em><b>Means Of Contact</b></em>' attribute.
	 * The default value is <code>"undefined"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Means Of Contact</em>' attribute.
	 * @see #setMeansOfContact(String)
	 * @see dcatcs.DcatcsPackage#getContactPoint_MeansOfContact()
	 * @model default="undefined" unique="false"
	 * @generated
	 */
	String getMeansOfContact();

	/**
	 * Sets the value of the '{@link dcatcs.ContactPoint#getMeansOfContact <em>Means Of Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Means Of Contact</em>' attribute.
	 * @see #getMeansOfContact()
	 * @generated
	 */
	void setMeansOfContact(String value);

	/**
	 * Returns the value of the '<em><b>Contact Details</b></em>' attribute.
	 * The default value is <code>"undefined"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Details</em>' attribute.
	 * @see #setContactDetails(String)
	 * @see dcatcs.DcatcsPackage#getContactPoint_ContactDetails()
	 * @model default="undefined" unique="false" ordered="false"
	 * @generated
	 */
	String getContactDetails();

	/**
	 * Sets the value of the '{@link dcatcs.ContactPoint#getContactDetails <em>Contact Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Details</em>' attribute.
	 * @see #getContactDetails()
	 * @generated
	 */
	void setContactDetails(String value);

	/**
	 * Returns the value of the '<em><b>Contact Point Type</b></em>' attribute.
	 * The default value is <code>"undefined"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Point Type</em>' attribute.
	 * @see #setContactPointType(String)
	 * @see dcatcs.DcatcsPackage#getContactPoint_ContactPointType()
	 * @model default="undefined" unique="false" ordered="false"
	 * @generated
	 */
	String getContactPointType();

	/**
	 * Sets the value of the '{@link dcatcs.ContactPoint#getContactPointType <em>Contact Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Point Type</em>' attribute.
	 * @see #getContactPointType()
	 * @generated
	 */
	void setContactPointType(String value);

	/**
	 * Returns the value of the '<em><b>Contact Email</b></em>' attribute.
	 * The default value is <code>"undefined"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Email</em>' attribute.
	 * @see #setContactEmail(String)
	 * @see dcatcs.DcatcsPackage#getContactPoint_ContactEmail()
	 * @model default="undefined"
	 * @generated
	 */
	String getContactEmail();

	/**
	 * Sets the value of the '{@link dcatcs.ContactPoint#getContactEmail <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Email</em>' attribute.
	 * @see #getContactEmail()
	 * @generated
	 */
	void setContactEmail(String value);

} // ContactPoint
