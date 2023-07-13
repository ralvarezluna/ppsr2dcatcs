/**
 */
package ppsr_coremetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ppsr_coremetamodel.MethodSpecification;
import ppsr_coremetamodel.ppsrmetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.impl.MethodSpecificationImpl#getSamplingProtocolDomain <em>Sampling Protocol Domain</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.MethodSpecificationImpl#getSamplingProtocolMethod <em>Sampling Protocol Method</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.MethodSpecificationImpl#getMethodAbstract <em>Method Abstract</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.MethodSpecificationImpl#getMethodUrl <em>Method Url</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.MethodSpecificationImpl#getMethodDocUrl <em>Method Doc Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodSpecificationImpl extends EObjectImpl implements MethodSpecification {
	/**
	 * The default value of the '{@link #getSamplingProtocolDomain() <em>Sampling Protocol Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingProtocolDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String SAMPLING_PROTOCOL_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSamplingProtocolDomain() <em>Sampling Protocol Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingProtocolDomain()
	 * @generated
	 * @ordered
	 */
	protected String samplingProtocolDomain = SAMPLING_PROTOCOL_DOMAIN_EDEFAULT;

	/**
	 * This is true if the Sampling Protocol Domain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean samplingProtocolDomainESet;

	/**
	 * The default value of the '{@link #getSamplingProtocolMethod() <em>Sampling Protocol Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingProtocolMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String SAMPLING_PROTOCOL_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSamplingProtocolMethod() <em>Sampling Protocol Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingProtocolMethod()
	 * @generated
	 * @ordered
	 */
	protected String samplingProtocolMethod = SAMPLING_PROTOCOL_METHOD_EDEFAULT;

	/**
	 * This is true if the Sampling Protocol Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean samplingProtocolMethodESet;

	/**
	 * The default value of the '{@link #getMethodAbstract() <em>Method Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodAbstract() <em>Method Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodAbstract()
	 * @generated
	 * @ordered
	 */
	protected String methodAbstract = METHOD_ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Method Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodAbstractESet;

	/**
	 * The default value of the '{@link #getMethodUrl() <em>Method Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodUrl() <em>Method Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodUrl()
	 * @generated
	 * @ordered
	 */
	protected String methodUrl = METHOD_URL_EDEFAULT;

	/**
	 * This is true if the Method Url attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodUrlESet;

	/**
	 * The default value of the '{@link #getMethodDocUrl() <em>Method Doc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDocUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_DOC_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodDocUrl() <em>Method Doc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDocUrl()
	 * @generated
	 * @ordered
	 */
	protected String methodDocUrl = METHOD_DOC_URL_EDEFAULT;

	/**
	 * This is true if the Method Doc Url attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodDocUrlESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppsrmetamodelPackage.Literals.METHOD_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSamplingProtocolDomain() {
		return samplingProtocolDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSamplingProtocolDomain(String newSamplingProtocolDomain) {
		String oldSamplingProtocolDomain = samplingProtocolDomain;
		samplingProtocolDomain = newSamplingProtocolDomain;
		boolean oldSamplingProtocolDomainESet = samplingProtocolDomainESet;
		samplingProtocolDomainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.METHOD_SPECIFICATION__SAMPLING_PROTOCOL_DOMAIN, oldSamplingProtocolDomain, samplingProtocolDomain, !oldSamplingProtocolDomainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSamplingProtocolDomain() {
		String oldSamplingProtocolDomain = samplingProtocolDomain;
		boolean oldSamplingProtocolDomainESet = samplingProtocolDomainESet;
		samplingProtocolDomain = SAMPLING_PROTOCOL_DOMAIN_EDEFAULT;
		samplingProtocolDomainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.METHOD_SPECIFICATION__SAMPLING_PROTOCOL_DOMAIN, oldSamplingProtocolDomain, SAMPLING_PROTOCOL_DOMAIN_EDEFAULT, oldSamplingProtocolDomainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSamplingProtocolDomain() {
		return samplingProtocolDomainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSamplingProtocolMethod() {
		return samplingProtocolMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSamplingProtocolMethod(String newSamplingProtocolMethod) {
		String oldSamplingProtocolMethod = samplingProtocolMethod;
		samplingProtocolMethod = newSamplingProtocolMethod;
		boolean oldSamplingProtocolMethodESet = samplingProtocolMethodESet;
		samplingProtocolMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.METHOD_SPECIFICATION__SAMPLING_PROTOCOL_METHOD, oldSamplingProtocolMethod, samplingProtocolMethod, !oldSamplingProtocolMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSamplingProtocolMethod() {
		String oldSamplingProtocolMethod = samplingProtocolMethod;
		boolean oldSamplingProtocolMethodESet = samplingProtocolMethodESet;
		samplingProtocolMethod = SAMPLING_PROTOCOL_METHOD_EDEFAULT;
		samplingProtocolMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.METHOD_SPECIFICATION__SAMPLING_PROTOCOL_METHOD, oldSamplingProtocolMethod, SAMPLING_PROTOCOL_METHOD_EDEFAULT, oldSamplingProtocolMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSamplingProtocolMethod() {
		return samplingProtocolMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodAbstract() {
		return methodAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodAbstract(String newMethodAbstract) {
		String oldMethodAbstract = methodAbstract;
		methodAbstract = newMethodAbstract;
		boolean oldMethodAbstractESet = methodAbstractESet;
		methodAbstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_ABSTRACT, oldMethodAbstract, methodAbstract, !oldMethodAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMethodAbstract() {
		String oldMethodAbstract = methodAbstract;
		boolean oldMethodAbstractESet = methodAbstractESet;
		methodAbstract = METHOD_ABSTRACT_EDEFAULT;
		methodAbstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_ABSTRACT, oldMethodAbstract, METHOD_ABSTRACT_EDEFAULT, oldMethodAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMethodAbstract() {
		return methodAbstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodUrl() {
		return methodUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodUrl(String newMethodUrl) {
		String oldMethodUrl = methodUrl;
		methodUrl = newMethodUrl;
		boolean oldMethodUrlESet = methodUrlESet;
		methodUrlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_URL, oldMethodUrl, methodUrl, !oldMethodUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMethodUrl() {
		String oldMethodUrl = methodUrl;
		boolean oldMethodUrlESet = methodUrlESet;
		methodUrl = METHOD_URL_EDEFAULT;
		methodUrlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_URL, oldMethodUrl, METHOD_URL_EDEFAULT, oldMethodUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMethodUrl() {
		return methodUrlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodDocUrl() {
		return methodDocUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodDocUrl(String newMethodDocUrl) {
		String oldMethodDocUrl = methodDocUrl;
		methodDocUrl = newMethodDocUrl;
		boolean oldMethodDocUrlESet = methodDocUrlESet;
		methodDocUrlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_DOC_URL, oldMethodDocUrl, methodDocUrl, !oldMethodDocUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMethodDocUrl() {
		String oldMethodDocUrl = methodDocUrl;
		boolean oldMethodDocUrlESet = methodDocUrlESet;
		methodDocUrl = METHOD_DOC_URL_EDEFAULT;
		methodDocUrlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_DOC_URL, oldMethodDocUrl, METHOD_DOC_URL_EDEFAULT, oldMethodDocUrlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMethodDocUrl() {
		return methodDocUrlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__SAMPLING_PROTOCOL_DOMAIN:
				return getSamplingProtocolDomain();
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__SAMPLING_PROTOCOL_METHOD:
				return getSamplingProtocolMethod();
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_ABSTRACT:
				return getMethodAbstract();
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_URL:
				return getMethodUrl();
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_DOC_URL:
				return getMethodDocUrl();
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
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__SAMPLING_PROTOCOL_DOMAIN:
				setSamplingProtocolDomain((String)newValue);
				return;
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__SAMPLING_PROTOCOL_METHOD:
				setSamplingProtocolMethod((String)newValue);
				return;
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_ABSTRACT:
				setMethodAbstract((String)newValue);
				return;
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_URL:
				setMethodUrl((String)newValue);
				return;
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_DOC_URL:
				setMethodDocUrl((String)newValue);
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
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__SAMPLING_PROTOCOL_DOMAIN:
				unsetSamplingProtocolDomain();
				return;
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__SAMPLING_PROTOCOL_METHOD:
				unsetSamplingProtocolMethod();
				return;
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_ABSTRACT:
				unsetMethodAbstract();
				return;
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_URL:
				unsetMethodUrl();
				return;
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_DOC_URL:
				unsetMethodDocUrl();
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
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__SAMPLING_PROTOCOL_DOMAIN:
				return isSetSamplingProtocolDomain();
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__SAMPLING_PROTOCOL_METHOD:
				return isSetSamplingProtocolMethod();
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_ABSTRACT:
				return isSetMethodAbstract();
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_URL:
				return isSetMethodUrl();
			case ppsrmetamodelPackage.METHOD_SPECIFICATION__METHOD_DOC_URL:
				return isSetMethodDocUrl();
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
		result.append(" (samplingProtocolDomain: ");
		if (samplingProtocolDomainESet) result.append(samplingProtocolDomain); else result.append("<unset>");
		result.append(", samplingProtocolMethod: ");
		if (samplingProtocolMethodESet) result.append(samplingProtocolMethod); else result.append("<unset>");
		result.append(", methodAbstract: ");
		if (methodAbstractESet) result.append(methodAbstract); else result.append("<unset>");
		result.append(", methodUrl: ");
		if (methodUrlESet) result.append(methodUrl); else result.append("<unset>");
		result.append(", methodDocUrl: ");
		if (methodDocUrlESet) result.append(methodDocUrl); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MethodSpecificationImpl
