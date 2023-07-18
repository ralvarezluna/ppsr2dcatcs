/**
 */
package dcatcs.impl;

import dcatcs.CSDataset;
import dcatcs.DcatcsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CS Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.impl.CSDatasetImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link dcatcs.impl.CSDatasetImpl#getBibliographicCitation <em>Bibliographic Citation</em>}</li>
 *   <li>{@link dcatcs.impl.CSDatasetImpl#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link dcatcs.impl.CSDatasetImpl#getMethodSpecification <em>Method Specification</em>}</li>
 *   <li>{@link dcatcs.impl.CSDatasetImpl#getHasHypothesis <em>Has Hypothesis</em>}</li>
 *   <li>{@link dcatcs.impl.CSDatasetImpl#getHasInstrument <em>Has Instrument</em>}</li>
 *   <li>{@link dcatcs.impl.CSDatasetImpl#getDataQualityAssuranceMethod <em>Data Quality Assurance Method</em>}</li>
 *   <li>{@link dcatcs.impl.CSDatasetImpl#getDataManagementPlan <em>Data Management Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSDatasetImpl extends DatasetImpl implements CSDataset {
	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected String abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBibliographicCitation() <em>Bibliographic Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliographicCitation()
	 * @generated
	 * @ordered
	 */
	protected static final String BIBLIOGRAPHIC_CITATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBibliographicCitation() <em>Bibliographic Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliographicCitation()
	 * @generated
	 * @ordered
	 */
	protected String bibliographicCitation = BIBLIOGRAPHIC_CITATION_EDEFAULT;

	/**
	 * This is true if the Bibliographic Citation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bibliographicCitationESet;

	/**
	 * The default value of the '{@link #getMethodType() <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodType()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodType() <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodType()
	 * @generated
	 * @ordered
	 */
	protected String methodType = METHOD_TYPE_EDEFAULT;

	/**
	 * This is true if the Method Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodTypeESet;

	/**
	 * The default value of the '{@link #getMethodSpecification() <em>Method Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final Object METHOD_SPECIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodSpecification() <em>Method Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodSpecification()
	 * @generated
	 * @ordered
	 */
	protected Object methodSpecification = METHOD_SPECIFICATION_EDEFAULT;

	/**
	 * This is true if the Method Specification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodSpecificationESet;

	/**
	 * The default value of the '{@link #getHasHypothesis() <em>Has Hypothesis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHypothesis()
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_HYPOTHESIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasHypothesis() <em>Has Hypothesis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHypothesis()
	 * @generated
	 * @ordered
	 */
	protected String hasHypothesis = HAS_HYPOTHESIS_EDEFAULT;

	/**
	 * This is true if the Has Hypothesis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasHypothesisESet;

	/**
	 * The default value of the '{@link #getHasInstrument() <em>Has Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInstrument()
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_INSTRUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasInstrument() <em>Has Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInstrument()
	 * @generated
	 * @ordered
	 */
	protected String hasInstrument = HAS_INSTRUMENT_EDEFAULT;

	/**
	 * This is true if the Has Instrument attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasInstrumentESet;

	/**
	 * The default value of the '{@link #getDataQualityAssuranceMethod() <em>Data Quality Assurance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataQualityAssuranceMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_QUALITY_ASSURANCE_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataQualityAssuranceMethod() <em>Data Quality Assurance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataQualityAssuranceMethod()
	 * @generated
	 * @ordered
	 */
	protected String dataQualityAssuranceMethod = DATA_QUALITY_ASSURANCE_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataManagementPlan() <em>Data Management Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataManagementPlan()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_MANAGEMENT_PLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataManagementPlan() <em>Data Management Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataManagementPlan()
	 * @generated
	 * @ordered
	 */
	protected String dataManagementPlan = DATA_MANAGEMENT_PLAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSDatasetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatcsPackage.Literals.CS_DATASET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(String newAbstract) {
		String oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_DATASET__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBibliographicCitation() {
		return bibliographicCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBibliographicCitation(String newBibliographicCitation) {
		String oldBibliographicCitation = bibliographicCitation;
		bibliographicCitation = newBibliographicCitation;
		boolean oldBibliographicCitationESet = bibliographicCitationESet;
		bibliographicCitationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_DATASET__BIBLIOGRAPHIC_CITATION, oldBibliographicCitation, bibliographicCitation, !oldBibliographicCitationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBibliographicCitation() {
		String oldBibliographicCitation = bibliographicCitation;
		boolean oldBibliographicCitationESet = bibliographicCitationESet;
		bibliographicCitation = BIBLIOGRAPHIC_CITATION_EDEFAULT;
		bibliographicCitationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DcatcsPackage.CS_DATASET__BIBLIOGRAPHIC_CITATION, oldBibliographicCitation, BIBLIOGRAPHIC_CITATION_EDEFAULT, oldBibliographicCitationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBibliographicCitation() {
		return bibliographicCitationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodType() {
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodType(String newMethodType) {
		String oldMethodType = methodType;
		methodType = newMethodType;
		boolean oldMethodTypeESet = methodTypeESet;
		methodTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_DATASET__METHOD_TYPE, oldMethodType, methodType, !oldMethodTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMethodType() {
		String oldMethodType = methodType;
		boolean oldMethodTypeESet = methodTypeESet;
		methodType = METHOD_TYPE_EDEFAULT;
		methodTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DcatcsPackage.CS_DATASET__METHOD_TYPE, oldMethodType, METHOD_TYPE_EDEFAULT, oldMethodTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMethodType() {
		return methodTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMethodSpecification() {
		return methodSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodSpecification(Object newMethodSpecification) {
		Object oldMethodSpecification = methodSpecification;
		methodSpecification = newMethodSpecification;
		boolean oldMethodSpecificationESet = methodSpecificationESet;
		methodSpecificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_DATASET__METHOD_SPECIFICATION, oldMethodSpecification, methodSpecification, !oldMethodSpecificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMethodSpecification() {
		Object oldMethodSpecification = methodSpecification;
		boolean oldMethodSpecificationESet = methodSpecificationESet;
		methodSpecification = METHOD_SPECIFICATION_EDEFAULT;
		methodSpecificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DcatcsPackage.CS_DATASET__METHOD_SPECIFICATION, oldMethodSpecification, METHOD_SPECIFICATION_EDEFAULT, oldMethodSpecificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMethodSpecification() {
		return methodSpecificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHasHypothesis() {
		return hasHypothesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasHypothesis(String newHasHypothesis) {
		String oldHasHypothesis = hasHypothesis;
		hasHypothesis = newHasHypothesis;
		boolean oldHasHypothesisESet = hasHypothesisESet;
		hasHypothesisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_DATASET__HAS_HYPOTHESIS, oldHasHypothesis, hasHypothesis, !oldHasHypothesisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHasHypothesis() {
		String oldHasHypothesis = hasHypothesis;
		boolean oldHasHypothesisESet = hasHypothesisESet;
		hasHypothesis = HAS_HYPOTHESIS_EDEFAULT;
		hasHypothesisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DcatcsPackage.CS_DATASET__HAS_HYPOTHESIS, oldHasHypothesis, HAS_HYPOTHESIS_EDEFAULT, oldHasHypothesisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHasHypothesis() {
		return hasHypothesisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHasInstrument() {
		return hasInstrument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasInstrument(String newHasInstrument) {
		String oldHasInstrument = hasInstrument;
		hasInstrument = newHasInstrument;
		boolean oldHasInstrumentESet = hasInstrumentESet;
		hasInstrumentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_DATASET__HAS_INSTRUMENT, oldHasInstrument, hasInstrument, !oldHasInstrumentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHasInstrument() {
		String oldHasInstrument = hasInstrument;
		boolean oldHasInstrumentESet = hasInstrumentESet;
		hasInstrument = HAS_INSTRUMENT_EDEFAULT;
		hasInstrumentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DcatcsPackage.CS_DATASET__HAS_INSTRUMENT, oldHasInstrument, HAS_INSTRUMENT_EDEFAULT, oldHasInstrumentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHasInstrument() {
		return hasInstrumentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataQualityAssuranceMethod() {
		return dataQualityAssuranceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataQualityAssuranceMethod(String newDataQualityAssuranceMethod) {
		String oldDataQualityAssuranceMethod = dataQualityAssuranceMethod;
		dataQualityAssuranceMethod = newDataQualityAssuranceMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_DATASET__DATA_QUALITY_ASSURANCE_METHOD, oldDataQualityAssuranceMethod, dataQualityAssuranceMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataManagementPlan() {
		return dataManagementPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataManagementPlan(String newDataManagementPlan) {
		String oldDataManagementPlan = dataManagementPlan;
		dataManagementPlan = newDataManagementPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_DATASET__DATA_MANAGEMENT_PLAN, oldDataManagementPlan, dataManagementPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DcatcsPackage.CS_DATASET__ABSTRACT:
				return getAbstract();
			case DcatcsPackage.CS_DATASET__BIBLIOGRAPHIC_CITATION:
				return getBibliographicCitation();
			case DcatcsPackage.CS_DATASET__METHOD_TYPE:
				return getMethodType();
			case DcatcsPackage.CS_DATASET__METHOD_SPECIFICATION:
				return getMethodSpecification();
			case DcatcsPackage.CS_DATASET__HAS_HYPOTHESIS:
				return getHasHypothesis();
			case DcatcsPackage.CS_DATASET__HAS_INSTRUMENT:
				return getHasInstrument();
			case DcatcsPackage.CS_DATASET__DATA_QUALITY_ASSURANCE_METHOD:
				return getDataQualityAssuranceMethod();
			case DcatcsPackage.CS_DATASET__DATA_MANAGEMENT_PLAN:
				return getDataManagementPlan();
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
			case DcatcsPackage.CS_DATASET__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case DcatcsPackage.CS_DATASET__BIBLIOGRAPHIC_CITATION:
				setBibliographicCitation((String)newValue);
				return;
			case DcatcsPackage.CS_DATASET__METHOD_TYPE:
				setMethodType((String)newValue);
				return;
			case DcatcsPackage.CS_DATASET__METHOD_SPECIFICATION:
				setMethodSpecification(newValue);
				return;
			case DcatcsPackage.CS_DATASET__HAS_HYPOTHESIS:
				setHasHypothesis((String)newValue);
				return;
			case DcatcsPackage.CS_DATASET__HAS_INSTRUMENT:
				setHasInstrument((String)newValue);
				return;
			case DcatcsPackage.CS_DATASET__DATA_QUALITY_ASSURANCE_METHOD:
				setDataQualityAssuranceMethod((String)newValue);
				return;
			case DcatcsPackage.CS_DATASET__DATA_MANAGEMENT_PLAN:
				setDataManagementPlan((String)newValue);
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
			case DcatcsPackage.CS_DATASET__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case DcatcsPackage.CS_DATASET__BIBLIOGRAPHIC_CITATION:
				unsetBibliographicCitation();
				return;
			case DcatcsPackage.CS_DATASET__METHOD_TYPE:
				unsetMethodType();
				return;
			case DcatcsPackage.CS_DATASET__METHOD_SPECIFICATION:
				unsetMethodSpecification();
				return;
			case DcatcsPackage.CS_DATASET__HAS_HYPOTHESIS:
				unsetHasHypothesis();
				return;
			case DcatcsPackage.CS_DATASET__HAS_INSTRUMENT:
				unsetHasInstrument();
				return;
			case DcatcsPackage.CS_DATASET__DATA_QUALITY_ASSURANCE_METHOD:
				setDataQualityAssuranceMethod(DATA_QUALITY_ASSURANCE_METHOD_EDEFAULT);
				return;
			case DcatcsPackage.CS_DATASET__DATA_MANAGEMENT_PLAN:
				setDataManagementPlan(DATA_MANAGEMENT_PLAN_EDEFAULT);
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
			case DcatcsPackage.CS_DATASET__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case DcatcsPackage.CS_DATASET__BIBLIOGRAPHIC_CITATION:
				return isSetBibliographicCitation();
			case DcatcsPackage.CS_DATASET__METHOD_TYPE:
				return isSetMethodType();
			case DcatcsPackage.CS_DATASET__METHOD_SPECIFICATION:
				return isSetMethodSpecification();
			case DcatcsPackage.CS_DATASET__HAS_HYPOTHESIS:
				return isSetHasHypothesis();
			case DcatcsPackage.CS_DATASET__HAS_INSTRUMENT:
				return isSetHasInstrument();
			case DcatcsPackage.CS_DATASET__DATA_QUALITY_ASSURANCE_METHOD:
				return DATA_QUALITY_ASSURANCE_METHOD_EDEFAULT == null ? dataQualityAssuranceMethod != null : !DATA_QUALITY_ASSURANCE_METHOD_EDEFAULT.equals(dataQualityAssuranceMethod);
			case DcatcsPackage.CS_DATASET__DATA_MANAGEMENT_PLAN:
				return DATA_MANAGEMENT_PLAN_EDEFAULT == null ? dataManagementPlan != null : !DATA_MANAGEMENT_PLAN_EDEFAULT.equals(dataManagementPlan);
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", bibliographicCitation: ");
		if (bibliographicCitationESet) result.append(bibliographicCitation); else result.append("<unset>");
		result.append(", methodType: ");
		if (methodTypeESet) result.append(methodType); else result.append("<unset>");
		result.append(", methodSpecification: ");
		if (methodSpecificationESet) result.append(methodSpecification); else result.append("<unset>");
		result.append(", hasHypothesis: ");
		if (hasHypothesisESet) result.append(hasHypothesis); else result.append("<unset>");
		result.append(", hasInstrument: ");
		if (hasInstrumentESet) result.append(hasInstrument); else result.append("<unset>");
		result.append(", dataQualityAssuranceMethod: ");
		result.append(dataQualityAssuranceMethod);
		result.append(", dataManagementPlan: ");
		result.append(dataManagementPlan);
		result.append(')');
		return result.toString();
	}

} //CSDatasetImpl
