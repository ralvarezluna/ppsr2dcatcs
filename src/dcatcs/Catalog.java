/**
 */
package dcatcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.Catalog#getDataset <em>Dataset</em>}</li>
 *   <li>{@link dcatcs.Catalog#getDataservice <em>Dataservice</em>}</li>
 *   <li>{@link dcatcs.Catalog#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link dcatcs.Catalog#getCatalogrecord <em>Catalogrecord</em>}</li>
 *   <li>{@link dcatcs.Catalog#getHomePage <em>Home Page</em>}</li>
 * </ul>
 *
 * @see dcatcs.DcatcsPackage#getCatalog()
 * @model
 * @generated
 */
public interface Catalog extends Dataset {
	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference list.
	 * The list contents are of type {@link dcatcs.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference list.
	 * @see dcatcs.DcatcsPackage#getCatalog_Dataset()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dataset> getDataset();

	/**
	 * Returns the value of the '<em><b>Dataservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataservice</em>' reference.
	 * @see #setDataservice(DataService)
	 * @see dcatcs.DcatcsPackage#getCatalog_Dataservice()
	 * @model
	 * @generated
	 */
	DataService getDataservice();

	/**
	 * Sets the value of the '{@link dcatcs.Catalog#getDataservice <em>Dataservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataservice</em>' reference.
	 * @see #getDataservice()
	 * @generated
	 */
	void setDataservice(DataService value);

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference list.
	 * The list contents are of type {@link dcatcs.Catalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference list.
	 * @see dcatcs.DcatcsPackage#getCatalog_Catalog()
	 * @model containment="true"
	 * @generated
	 */
	EList<Catalog> getCatalog();

	/**
	 * Returns the value of the '<em><b>Catalogrecord</b></em>' containment reference list.
	 * The list contents are of type {@link dcatcs.CatalogRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogrecord</em>' containment reference list.
	 * @see dcatcs.DcatcsPackage#getCatalog_Catalogrecord()
	 * @model containment="true"
	 * @generated
	 */
	EList<CatalogRecord> getCatalogrecord();

	/**
	 * Returns the value of the '<em><b>Home Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Page</em>' attribute.
	 * @see #setHomePage(String)
	 * @see dcatcs.DcatcsPackage#getCatalog_HomePage()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" ordered="false"
	 * @generated
	 */
	String getHomePage();

	/**
	 * Sets the value of the '{@link dcatcs.Catalog#getHomePage <em>Home Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Page</em>' attribute.
	 * @see #getHomePage()
	 * @generated
	 */
	void setHomePage(String value);

} // Catalog
