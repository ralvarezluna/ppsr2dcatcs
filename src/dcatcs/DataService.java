/**
 */
package dcatcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.DataService#getEndpointDescription <em>Endpoint Description</em>}</li>
 *   <li>{@link dcatcs.DataService#getEndpointURL <em>Endpoint URL</em>}</li>
 *   <li>{@link dcatcs.DataService#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link dcatcs.DataService#getLicense <em>License</em>}</li>
 * </ul>
 *
 * @see dcatcs.DcatcsPackage#getDataService()
 * @model
 * @generated
 */
public interface DataService extends Resource {
	/**
	 * Returns the value of the '<em><b>Endpoint Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Description</em>' attribute.
	 * @see #setEndpointDescription(String)
	 * @see dcatcs.DcatcsPackage#getDataService_EndpointDescription()
	 * @model unique="false"
	 * @generated
	 */
	String getEndpointDescription();

	/**
	 * Sets the value of the '{@link dcatcs.DataService#getEndpointDescription <em>Endpoint Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Description</em>' attribute.
	 * @see #getEndpointDescription()
	 * @generated
	 */
	void setEndpointDescription(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint URL</em>' attribute.
	 * @see #setEndpointURL(String)
	 * @see dcatcs.DcatcsPackage#getDataService_EndpointURL()
	 * @model
	 * @generated
	 */
	String getEndpointURL();

	/**
	 * Sets the value of the '{@link dcatcs.DataService#getEndpointURL <em>Endpoint URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint URL</em>' attribute.
	 * @see #getEndpointURL()
	 * @generated
	 */
	void setEndpointURL(String value);

	/**
	 * Returns the value of the '<em><b>Access Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Rights</em>' attribute.
	 * @see #setAccessRights(String)
	 * @see dcatcs.DcatcsPackage#getDataService_AccessRights()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getAccessRights();

	/**
	 * Sets the value of the '{@link dcatcs.DataService#getAccessRights <em>Access Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Rights</em>' attribute.
	 * @see #getAccessRights()
	 * @generated
	 */
	void setAccessRights(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see dcatcs.DcatcsPackage#getDataService_License()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link dcatcs.DataService#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

} // DataService
