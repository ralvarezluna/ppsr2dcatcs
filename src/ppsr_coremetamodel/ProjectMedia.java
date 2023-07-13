/**
 */
package ppsr_coremetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Image(s) and/or other media used to graphically enhance or represent the project. This is a class object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.ProjectMedia#getProjectMediaType <em>Project Media Type</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ProjectMedia#getProjectMediaFile <em>Project Media File</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ProjectMedia#getProjectMediaCredit <em>Project Media Credit</em>}</li>
 * </ul>
 *
 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProjectMedia()
 * @model
 * @generated
 */
public interface ProjectMedia extends EObject {
	/**
	 * Returns the value of the '<em><b>Project Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Media Type</em>' attribute.
	 * @see #setProjectMediaType(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProjectMedia_ProjectMediaType()
	 * @model annotation="http://xmlns.com/foaf/0.1/#term_depiction"
	 * @generated
	 */
	String getProjectMediaType();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ProjectMedia#getProjectMediaType <em>Project Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Media Type</em>' attribute.
	 * @see #getProjectMediaType()
	 * @generated
	 */
	void setProjectMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Project Media File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Media File</em>' attribute.
	 * @see #setProjectMediaFile(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProjectMedia_ProjectMediaFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        annotation="http://xmlns.com/foaf/spec#term_img"
	 * @generated
	 */
	String getProjectMediaFile();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ProjectMedia#getProjectMediaFile <em>Project Media File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Media File</em>' attribute.
	 * @see #getProjectMediaFile()
	 * @generated
	 */
	void setProjectMediaFile(String value);

	/**
	 * Returns the value of the '<em><b>Project Media Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Media Credit</em>' attribute.
	 * @see #setProjectMediaCredit(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProjectMedia_ProjectMediaCredit()
	 * @model annotation="http://purl.org/dc/terms/bibliographicCitation"
	 * @generated
	 */
	String getProjectMediaCredit();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ProjectMedia#getProjectMediaCredit <em>Project Media Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Media Credit</em>' attribute.
	 * @see #getProjectMediaCredit()
	 * @generated
	 */
	void setProjectMediaCredit(String value);

} // ProjectMedia
