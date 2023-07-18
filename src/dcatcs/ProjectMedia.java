/**
 */
package dcatcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.ProjectMedia#getProjectMediaFile <em>Project Media File</em>}</li>
 *   <li>{@link dcatcs.ProjectMedia#getProjectMediaType <em>Project Media Type</em>}</li>
 *   <li>{@link dcatcs.ProjectMedia#getProjectMediaCredit <em>Project Media Credit</em>}</li>
 * </ul>
 *
 * @see dcatcs.DcatcsPackage#getProjectMedia()
 * @model
 * @generated
 */
public interface ProjectMedia extends EObject {
	/**
	 * Returns the value of the '<em><b>Project Media File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Media File</em>' attribute.
	 * @see #setProjectMediaFile(String)
	 * @see dcatcs.DcatcsPackage#getProjectMedia_ProjectMediaFile()
	 * @model unique="false"
	 *        annotation="http://xmlns.com/foaf/spec#term_img"
	 * @generated
	 */
	String getProjectMediaFile();

	/**
	 * Sets the value of the '{@link dcatcs.ProjectMedia#getProjectMediaFile <em>Project Media File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Media File</em>' attribute.
	 * @see #getProjectMediaFile()
	 * @generated
	 */
	void setProjectMediaFile(String value);

	/**
	 * Returns the value of the '<em><b>Project Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Media Type</em>' attribute.
	 * @see #setProjectMediaType(String)
	 * @see dcatcs.DcatcsPackage#getProjectMedia_ProjectMediaType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        annotation="http://xmlns.com/foaf/0.1/#term_depiction"
	 * @generated
	 */
	String getProjectMediaType();

	/**
	 * Sets the value of the '{@link dcatcs.ProjectMedia#getProjectMediaType <em>Project Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Media Type</em>' attribute.
	 * @see #getProjectMediaType()
	 * @generated
	 */
	void setProjectMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Project Media Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Media Credit</em>' attribute.
	 * @see #setProjectMediaCredit(String)
	 * @see dcatcs.DcatcsPackage#getProjectMedia_ProjectMediaCredit()
	 * @model unique="false"
	 *        annotation="http://purl.org/dc/terms/bibliographicCitation"
	 * @generated
	 */
	String getProjectMediaCredit();

	/**
	 * Sets the value of the '{@link dcatcs.ProjectMedia#getProjectMediaCredit <em>Project Media Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Media Credit</em>' attribute.
	 * @see #getProjectMediaCredit()
	 * @generated
	 */
	void setProjectMediaCredit(String value);

} // ProjectMedia
