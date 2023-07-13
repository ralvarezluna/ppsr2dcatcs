/**
 */
package ppsr_coremetamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ppsr_coremetamodel.Activity;
import ppsr_coremetamodel.DatasetMetadataSchema;
import ppsr_coremetamodel.ppsrmetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.impl.ActivityImpl#getActivityId <em>Activity Id</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.ActivityImpl#getDatasetmetadataschema <em>Datasetmetadataschema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends EObjectImpl implements Activity {
	/**
	 * The default value of the '{@link #getActivityId() <em>Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityId() <em>Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityId()
	 * @generated
	 * @ordered
	 */
	protected String activityId = ACTIVITY_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatasetmetadataschema() <em>Datasetmetadataschema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetmetadataschema()
	 * @generated
	 * @ordered
	 */
	protected DatasetMetadataSchema datasetmetadataschema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppsrmetamodelPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActivityId() {
		return activityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivityId(String newActivityId) {
		String oldActivityId = activityId;
		activityId = newActivityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.ACTIVITY__ACTIVITY_ID, oldActivityId, activityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetMetadataSchema getDatasetmetadataschema() {
		return datasetmetadataschema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatasetmetadataschema(DatasetMetadataSchema newDatasetmetadataschema, NotificationChain msgs) {
		DatasetMetadataSchema oldDatasetmetadataschema = datasetmetadataschema;
		datasetmetadataschema = newDatasetmetadataschema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.ACTIVITY__DATASETMETADATASCHEMA, oldDatasetmetadataschema, newDatasetmetadataschema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatasetmetadataschema(DatasetMetadataSchema newDatasetmetadataschema) {
		if (newDatasetmetadataschema != datasetmetadataschema) {
			NotificationChain msgs = null;
			if (datasetmetadataschema != null)
				msgs = ((InternalEObject)datasetmetadataschema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ppsrmetamodelPackage.ACTIVITY__DATASETMETADATASCHEMA, null, msgs);
			if (newDatasetmetadataschema != null)
				msgs = ((InternalEObject)newDatasetmetadataschema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ppsrmetamodelPackage.ACTIVITY__DATASETMETADATASCHEMA, null, msgs);
			msgs = basicSetDatasetmetadataschema(newDatasetmetadataschema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.ACTIVITY__DATASETMETADATASCHEMA, newDatasetmetadataschema, newDatasetmetadataschema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ppsrmetamodelPackage.ACTIVITY__DATASETMETADATASCHEMA:
				return basicSetDatasetmetadataschema(null, msgs);
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
			case ppsrmetamodelPackage.ACTIVITY__ACTIVITY_ID:
				return getActivityId();
			case ppsrmetamodelPackage.ACTIVITY__DATASETMETADATASCHEMA:
				return getDatasetmetadataschema();
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
			case ppsrmetamodelPackage.ACTIVITY__ACTIVITY_ID:
				setActivityId((String)newValue);
				return;
			case ppsrmetamodelPackage.ACTIVITY__DATASETMETADATASCHEMA:
				setDatasetmetadataschema((DatasetMetadataSchema)newValue);
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
			case ppsrmetamodelPackage.ACTIVITY__ACTIVITY_ID:
				setActivityId(ACTIVITY_ID_EDEFAULT);
				return;
			case ppsrmetamodelPackage.ACTIVITY__DATASETMETADATASCHEMA:
				setDatasetmetadataschema((DatasetMetadataSchema)null);
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
			case ppsrmetamodelPackage.ACTIVITY__ACTIVITY_ID:
				return ACTIVITY_ID_EDEFAULT == null ? activityId != null : !ACTIVITY_ID_EDEFAULT.equals(activityId);
			case ppsrmetamodelPackage.ACTIVITY__DATASETMETADATASCHEMA:
				return datasetmetadataschema != null;
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
		result.append(" (activityId: ");
		result.append(activityId);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
