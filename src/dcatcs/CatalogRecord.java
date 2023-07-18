/**
 */
package dcatcs;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.CatalogRecord#getDescription <em>Description</em>}</li>
 *   <li>{@link dcatcs.CatalogRecord#getIssued <em>Issued</em>}</li>
 *   <li>{@link dcatcs.CatalogRecord#getModified <em>Modified</em>}</li>
 *   <li>{@link dcatcs.CatalogRecord#getTitle <em>Title</em>}</li>
 *   <li>{@link dcatcs.CatalogRecord#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see dcatcs.DcatcsPackage#getCatalogRecord()
 * @model
 * @generated
 */
public interface CatalogRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dcatcs.DcatcsPackage#getCatalogRecord_Description()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dcatcs.CatalogRecord#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued</em>' attribute.
	 * @see #setIssued(Date)
	 * @see dcatcs.DcatcsPackage#getCatalogRecord_Issued()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Date getIssued();

	/**
	 * Sets the value of the '{@link dcatcs.CatalogRecord#getIssued <em>Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' attribute.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(Date value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #isSetModified()
	 * @see #unsetModified()
	 * @see #setModified(Date)
	 * @see dcatcs.DcatcsPackage#getCatalogRecord_Modified()
	 * @model unique="false" unsettable="true" ordered="false"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link dcatcs.CatalogRecord#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #isSetModified()
	 * @see #unsetModified()
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Unsets the value of the '{@link dcatcs.CatalogRecord#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModified()
	 * @see #getModified()
	 * @see #setModified(Date)
	 * @generated
	 */
	void unsetModified();

	/**
	 * Returns whether the value of the '{@link dcatcs.CatalogRecord#getModified <em>Modified</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modified</em>' attribute is set.
	 * @see #unsetModified()
	 * @see #getModified()
	 * @see #setModified(Date)
	 * @generated
	 */
	boolean isSetModified();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dcatcs.DcatcsPackage#getCatalogRecord_Title()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dcatcs.CatalogRecord#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see dcatcs.DcatcsPackage#getCatalogRecord_Resource()
	 * @model
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link dcatcs.CatalogRecord#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // CatalogRecord
