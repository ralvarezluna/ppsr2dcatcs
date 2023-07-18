/**
 */
package dcatcs.impl;

import dcatcs.DataService;
import dcatcs.DcatcsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.impl.DataServiceImpl#getEndpointDescription <em>Endpoint Description</em>}</li>
 *   <li>{@link dcatcs.impl.DataServiceImpl#getEndpointURL <em>Endpoint URL</em>}</li>
 *   <li>{@link dcatcs.impl.DataServiceImpl#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link dcatcs.impl.DataServiceImpl#getLicense <em>License</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataServiceImpl extends ResourceImpl implements DataService {
	/**
	 * The default value of the '{@link #getEndpointDescription() <em>Endpoint Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointDescription() <em>Endpoint Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointDescription()
	 * @generated
	 * @ordered
	 */
	protected String endpointDescription = ENDPOINT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpointURL() <em>Endpoint URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointURL() <em>Endpoint URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointURL()
	 * @generated
	 * @ordered
	 */
	protected String endpointURL = ENDPOINT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessRights() <em>Access Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRights()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_RIGHTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessRights() <em>Access Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRights()
	 * @generated
	 * @ordered
	 */
	protected String accessRights = ACCESS_RIGHTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatcsPackage.Literals.DATA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndpointDescription() {
		return endpointDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpointDescription(String newEndpointDescription) {
		String oldEndpointDescription = endpointDescription;
		endpointDescription = newEndpointDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DATA_SERVICE__ENDPOINT_DESCRIPTION, oldEndpointDescription, endpointDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndpointURL() {
		return endpointURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpointURL(String newEndpointURL) {
		String oldEndpointURL = endpointURL;
		endpointURL = newEndpointURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DATA_SERVICE__ENDPOINT_URL, oldEndpointURL, endpointURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessRights() {
		return accessRights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessRights(String newAccessRights) {
		String oldAccessRights = accessRights;
		accessRights = newAccessRights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DATA_SERVICE__ACCESS_RIGHTS, oldAccessRights, accessRights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DATA_SERVICE__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DcatcsPackage.DATA_SERVICE__ENDPOINT_DESCRIPTION:
				return getEndpointDescription();
			case DcatcsPackage.DATA_SERVICE__ENDPOINT_URL:
				return getEndpointURL();
			case DcatcsPackage.DATA_SERVICE__ACCESS_RIGHTS:
				return getAccessRights();
			case DcatcsPackage.DATA_SERVICE__LICENSE:
				return getLicense();
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
			case DcatcsPackage.DATA_SERVICE__ENDPOINT_DESCRIPTION:
				setEndpointDescription((String)newValue);
				return;
			case DcatcsPackage.DATA_SERVICE__ENDPOINT_URL:
				setEndpointURL((String)newValue);
				return;
			case DcatcsPackage.DATA_SERVICE__ACCESS_RIGHTS:
				setAccessRights((String)newValue);
				return;
			case DcatcsPackage.DATA_SERVICE__LICENSE:
				setLicense((String)newValue);
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
			case DcatcsPackage.DATA_SERVICE__ENDPOINT_DESCRIPTION:
				setEndpointDescription(ENDPOINT_DESCRIPTION_EDEFAULT);
				return;
			case DcatcsPackage.DATA_SERVICE__ENDPOINT_URL:
				setEndpointURL(ENDPOINT_URL_EDEFAULT);
				return;
			case DcatcsPackage.DATA_SERVICE__ACCESS_RIGHTS:
				setAccessRights(ACCESS_RIGHTS_EDEFAULT);
				return;
			case DcatcsPackage.DATA_SERVICE__LICENSE:
				setLicense(LICENSE_EDEFAULT);
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
			case DcatcsPackage.DATA_SERVICE__ENDPOINT_DESCRIPTION:
				return ENDPOINT_DESCRIPTION_EDEFAULT == null ? endpointDescription != null : !ENDPOINT_DESCRIPTION_EDEFAULT.equals(endpointDescription);
			case DcatcsPackage.DATA_SERVICE__ENDPOINT_URL:
				return ENDPOINT_URL_EDEFAULT == null ? endpointURL != null : !ENDPOINT_URL_EDEFAULT.equals(endpointURL);
			case DcatcsPackage.DATA_SERVICE__ACCESS_RIGHTS:
				return ACCESS_RIGHTS_EDEFAULT == null ? accessRights != null : !ACCESS_RIGHTS_EDEFAULT.equals(accessRights);
			case DcatcsPackage.DATA_SERVICE__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
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
		result.append(" (endpointDescription: ");
		result.append(endpointDescription);
		result.append(", endpointURL: ");
		result.append(endpointURL);
		result.append(", accessRights: ");
		result.append(accessRights);
		result.append(", license: ");
		result.append(license);
		result.append(')');
		return result.toString();
	}

} //DataServiceImpl
