/**
 */
package dcatcs.impl;

import dcatcs.Dataset;
import dcatcs.DcatcsPackage;
import dcatcs.Distribution;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.impl.DatasetImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link dcatcs.impl.DatasetImpl#getAccrualPeriodicity <em>Accrual Periodicity</em>}</li>
 *   <li>{@link dcatcs.impl.DatasetImpl#getSpatial <em>Spatial</em>}</li>
 *   <li>{@link dcatcs.impl.DatasetImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link dcatcs.impl.DatasetImpl#getWasGeneratedBy <em>Was Generated By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetImpl extends ResourceImpl implements Dataset {
	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<Distribution> distribution;

	/**
	 * The default value of the '{@link #getAccrualPeriodicity() <em>Accrual Periodicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccrualPeriodicity()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCRUAL_PERIODICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccrualPeriodicity() <em>Accrual Periodicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccrualPeriodicity()
	 * @generated
	 * @ordered
	 */
	protected String accrualPeriodicity = ACCRUAL_PERIODICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpatial() <em>Spatial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatial()
	 * @generated
	 * @ordered
	 */
	protected static final Object SPATIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpatial() <em>Spatial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatial()
	 * @generated
	 * @ordered
	 */
	protected Object spatial = SPATIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemporal() <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporal()
	 * @generated
	 * @ordered
	 */
	protected static final Date TEMPORAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemporal() <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporal()
	 * @generated
	 * @ordered
	 */
	protected Date temporal = TEMPORAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWasGeneratedBy() <em>Was Generated By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWasGeneratedBy()
	 * @generated
	 * @ordered
	 */
	protected static final Object WAS_GENERATED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWasGeneratedBy() <em>Was Generated By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWasGeneratedBy()
	 * @generated
	 * @ordered
	 */
	protected Object wasGeneratedBy = WAS_GENERATED_BY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatcsPackage.Literals.DATASET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Distribution> getDistribution() {
		if (distribution == null) {
			distribution = new EObjectContainmentEList<Distribution>(Distribution.class, this, DcatcsPackage.DATASET__DISTRIBUTION);
		}
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccrualPeriodicity() {
		return accrualPeriodicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccrualPeriodicity(String newAccrualPeriodicity) {
		String oldAccrualPeriodicity = accrualPeriodicity;
		accrualPeriodicity = newAccrualPeriodicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DATASET__ACCRUAL_PERIODICITY, oldAccrualPeriodicity, accrualPeriodicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getSpatial() {
		return spatial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpatial(Object newSpatial) {
		Object oldSpatial = spatial;
		spatial = newSpatial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DATASET__SPATIAL, oldSpatial, spatial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTemporal() {
		return temporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporal(Date newTemporal) {
		Date oldTemporal = temporal;
		temporal = newTemporal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DATASET__TEMPORAL, oldTemporal, temporal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getWasGeneratedBy() {
		return wasGeneratedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWasGeneratedBy(Object newWasGeneratedBy) {
		Object oldWasGeneratedBy = wasGeneratedBy;
		wasGeneratedBy = newWasGeneratedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DATASET__WAS_GENERATED_BY, oldWasGeneratedBy, wasGeneratedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatcsPackage.DATASET__DISTRIBUTION:
				return ((InternalEList<?>)getDistribution()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DcatcsPackage.DATASET__DISTRIBUTION:
				return getDistribution();
			case DcatcsPackage.DATASET__ACCRUAL_PERIODICITY:
				return getAccrualPeriodicity();
			case DcatcsPackage.DATASET__SPATIAL:
				return getSpatial();
			case DcatcsPackage.DATASET__TEMPORAL:
				return getTemporal();
			case DcatcsPackage.DATASET__WAS_GENERATED_BY:
				return getWasGeneratedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DcatcsPackage.DATASET__DISTRIBUTION:
				getDistribution().clear();
				getDistribution().addAll((Collection<? extends Distribution>)newValue);
				return;
			case DcatcsPackage.DATASET__ACCRUAL_PERIODICITY:
				setAccrualPeriodicity((String)newValue);
				return;
			case DcatcsPackage.DATASET__SPATIAL:
				setSpatial(newValue);
				return;
			case DcatcsPackage.DATASET__TEMPORAL:
				setTemporal((Date)newValue);
				return;
			case DcatcsPackage.DATASET__WAS_GENERATED_BY:
				setWasGeneratedBy(newValue);
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
			case DcatcsPackage.DATASET__DISTRIBUTION:
				getDistribution().clear();
				return;
			case DcatcsPackage.DATASET__ACCRUAL_PERIODICITY:
				setAccrualPeriodicity(ACCRUAL_PERIODICITY_EDEFAULT);
				return;
			case DcatcsPackage.DATASET__SPATIAL:
				setSpatial(SPATIAL_EDEFAULT);
				return;
			case DcatcsPackage.DATASET__TEMPORAL:
				setTemporal(TEMPORAL_EDEFAULT);
				return;
			case DcatcsPackage.DATASET__WAS_GENERATED_BY:
				setWasGeneratedBy(WAS_GENERATED_BY_EDEFAULT);
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
			case DcatcsPackage.DATASET__DISTRIBUTION:
				return distribution != null && !distribution.isEmpty();
			case DcatcsPackage.DATASET__ACCRUAL_PERIODICITY:
				return ACCRUAL_PERIODICITY_EDEFAULT == null ? accrualPeriodicity != null : !ACCRUAL_PERIODICITY_EDEFAULT.equals(accrualPeriodicity);
			case DcatcsPackage.DATASET__SPATIAL:
				return SPATIAL_EDEFAULT == null ? spatial != null : !SPATIAL_EDEFAULT.equals(spatial);
			case DcatcsPackage.DATASET__TEMPORAL:
				return TEMPORAL_EDEFAULT == null ? temporal != null : !TEMPORAL_EDEFAULT.equals(temporal);
			case DcatcsPackage.DATASET__WAS_GENERATED_BY:
				return WAS_GENERATED_BY_EDEFAULT == null ? wasGeneratedBy != null : !WAS_GENERATED_BY_EDEFAULT.equals(wasGeneratedBy);
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
		result.append(" (accrualPeriodicity: ");
		result.append(accrualPeriodicity);
		result.append(", spatial: ");
		result.append(spatial);
		result.append(", temporal: ");
		result.append(temporal);
		result.append(", wasGeneratedBy: ");
		result.append(wasGeneratedBy);
		result.append(')');
		return result.toString();
	}

} //DatasetImpl