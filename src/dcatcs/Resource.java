/**
 */
package dcatcs;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.Resource#getContactPoint <em>Contact Point</em>}</li>
 *   <li>{@link dcatcs.Resource#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link dcatcs.Resource#getLandingPage <em>Landing Page</em>}</li>
 *   <li>{@link dcatcs.Resource#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link dcatcs.Resource#getDescription <em>Description</em>}</li>
 *   <li>{@link dcatcs.Resource#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dcatcs.Resource#getLanguage <em>Language</em>}</li>
 *   <li>{@link dcatcs.Resource#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link dcatcs.Resource#getUpdateModificationDate <em>Update Modification Date</em>}</li>
 *   <li>{@link dcatcs.Resource#getTitle <em>Title</em>}</li>
 *   <li>{@link dcatcs.Resource#getHasPart <em>Has Part</em>}</li>
 *   <li>{@link dcatcs.Resource#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see dcatcs.DcatcsPackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Contact Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Point</em>' attribute.
	 * @see #setContactPoint(Object)
	 * @see dcatcs.DcatcsPackage#getResource_ContactPoint()
	 * @model unique="false"
	 * @generated
	 */
	Object getContactPoint();

	/**
	 * Sets the value of the '{@link dcatcs.Resource#getContactPoint <em>Contact Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Point</em>' attribute.
	 * @see #getContactPoint()
	 * @generated
	 */
	void setContactPoint(Object value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute.
	 * @see #setKeyword(String)
	 * @see dcatcs.DcatcsPackage#getResource_Keyword()
	 * @model unique="false"
	 * @generated
	 */
	String getKeyword();

	/**
	 * Sets the value of the '{@link dcatcs.Resource#getKeyword <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' attribute.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Landing Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Page</em>' attribute.
	 * @see #setLandingPage(String)
	 * @see dcatcs.DcatcsPackage#getResource_LandingPage()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" ordered="false"
	 * @generated
	 */
	String getLandingPage();

	/**
	 * Sets the value of the '{@link dcatcs.Resource#getLandingPage <em>Landing Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing Page</em>' attribute.
	 * @see #getLandingPage()
	 * @generated
	 */
	void setLandingPage(String value);

	/**
	 * Returns the value of the '<em><b>Conforms To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms To</em>' attribute.
	 * @see #setConformsTo(String)
	 * @see dcatcs.DcatcsPackage#getResource_ConformsTo()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" ordered="false"
	 * @generated
	 */
	String getConformsTo();

	/**
	 * Sets the value of the '{@link dcatcs.Resource#getConformsTo <em>Conforms To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conforms To</em>' attribute.
	 * @see #getConformsTo()
	 * @generated
	 */
	void setConformsTo(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dcatcs.DcatcsPackage#getResource_Description()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dcatcs.Resource#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see dcatcs.DcatcsPackage#getResource_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link dcatcs.Resource#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see dcatcs.DcatcsPackage#getResource_Language()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Language" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link dcatcs.Resource#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(Date)
	 * @see dcatcs.DcatcsPackage#getResource_ReleaseDate()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Date getReleaseDate();

	/**
	 * Sets the value of the '{@link dcatcs.Resource#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Update Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Modification Date</em>' attribute.
	 * @see #setUpdateModificationDate(Date)
	 * @see dcatcs.DcatcsPackage#getResource_UpdateModificationDate()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Date getUpdateModificationDate();

	/**
	 * Sets the value of the '{@link dcatcs.Resource#getUpdateModificationDate <em>Update Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Modification Date</em>' attribute.
	 * @see #getUpdateModificationDate()
	 * @generated
	 */
	void setUpdateModificationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dcatcs.DcatcsPackage#getResource_Title()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dcatcs.Resource#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Has Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Part</em>' attribute.
	 * @see #setHasPart(String)
	 * @see dcatcs.DcatcsPackage#getResource_HasPart()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getHasPart();

	/**
	 * Sets the value of the '{@link dcatcs.Resource#getHasPart <em>Has Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Part</em>' attribute.
	 * @see #getHasPart()
	 * @generated
	 */
	void setHasPart(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see dcatcs.DcatcsPackage#getResource_Status()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link dcatcs.Resource#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // Resource
