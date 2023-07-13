/**
 */
package ppsr_coremetamodel;


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
 *   <li>{@link ppsr_coremetamodel.ContactPoint#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ContactPoint#getMeansOfContact <em>Means Of Contact</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ContactPoint#getContactDetails <em>Contact Details</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ContactPoint#getContactPointType <em>Contact Point Type</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ContactPoint#getContactEmail <em>Contact Email</em>}</li>
 * </ul>
 *
 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getContactPoint()
 * @model
 * @generated
 */
public interface ContactPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Contact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Name</em>' attribute.
	 * @see #setContactName(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getContactPoint_ContactName()
	 * @model
	 * @generated
	 */
	String getContactName();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ContactPoint#getContactName <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Name</em>' attribute.
	 * @see #getContactName()
	 * @generated
	 */
	void setContactName(String value);

	/**
	 * Returns the value of the '<em><b>Means Of Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Means Of Contact</em>' attribute.
	 * @see #setMeansOfContact(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getContactPoint_MeansOfContact()
	 * @model
	 * @generated
	 */
	String getMeansOfContact();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ContactPoint#getMeansOfContact <em>Means Of Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Means Of Contact</em>' attribute.
	 * @see #getMeansOfContact()
	 * @generated
	 */
	void setMeansOfContact(String value);

	/**
	 * Returns the value of the '<em><b>Contact Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Details</em>' attribute.
	 * @see #setContactDetails(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getContactPoint_ContactDetails()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getContactDetails();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ContactPoint#getContactDetails <em>Contact Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Details</em>' attribute.
	 * @see #getContactDetails()
	 * @generated
	 */
	void setContactDetails(String value);

	/**
	 * Returns the value of the '<em><b>Contact Point Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Point Type</em>' attribute.
	 * @see #setContactPointType(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getContactPoint_ContactPointType()
	 * @model
	 * @generated
	 */
	String getContactPointType();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ContactPoint#getContactPointType <em>Contact Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Point Type</em>' attribute.
	 * @see #getContactPointType()
	 * @generated
	 */
	void setContactPointType(String value);

	/**
	 * Returns the value of the '<em><b>Contact Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Email</em>' attribute.
	 * @see #setContactEmail(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getContactPoint_ContactEmail()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getContactEmail();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ContactPoint#getContactEmail <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Email</em>' attribute.
	 * @see #getContactEmail()
	 * @generated
	 */
	void setContactEmail(String value);

} // ContactPoint
