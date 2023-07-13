/**
 */
package ppsr_coremetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ppsr_coremetamodel.DatasetMetadataSchema;
import ppsr_coremetamodel.DmmCoreTerms;
import ppsr_coremetamodel.DmmExtensionTerms;
import ppsr_coremetamodel.MethodSpecification;
import ppsr_coremetamodel.ppsrmetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Metadata Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.impl.DatasetMetadataSchemaImpl#getObservationalDataModel <em>Observational Data Model</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DatasetMetadataSchemaImpl#getDmmcoreterms <em>Dmmcoreterms</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DatasetMetadataSchemaImpl#getMethodspecification <em>Methodspecification</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.DatasetMetadataSchemaImpl#getDmmextensionterms <em>Dmmextensionterms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetMetadataSchemaImpl extends EObjectImpl implements DatasetMetadataSchema {
	/**
	 * The default value of the '{@link #getObservationalDataModel() <em>Observational Data Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationalDataModel()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVATIONAL_DATA_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservationalDataModel() <em>Observational Data Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationalDataModel()
	 * @generated
	 * @ordered
	 */
	protected String observationalDataModel = OBSERVATIONAL_DATA_MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDmmcoreterms() <em>Dmmcoreterms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmmcoreterms()
	 * @generated
	 * @ordered
	 */
	protected EList<DmmCoreTerms> dmmcoreterms;

	/**
	 * The cached value of the '{@link #getMethodspecification() <em>Methodspecification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodspecification()
	 * @generated
	 * @ordered
	 */
	protected MethodSpecification methodspecification;

	/**
	 * The cached value of the '{@link #getDmmextensionterms() <em>Dmmextensionterms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmmextensionterms()
	 * @generated
	 * @ordered
	 */
	protected EList<DmmExtensionTerms> dmmextensionterms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetMetadataSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppsrmetamodelPackage.Literals.DATASET_METADATA_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObservationalDataModel() {
		return observationalDataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservationalDataModel(String newObservationalDataModel) {
		String oldObservationalDataModel = observationalDataModel;
		observationalDataModel = newObservationalDataModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__OBSERVATIONAL_DATA_MODEL, oldObservationalDataModel, observationalDataModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DmmCoreTerms> getDmmcoreterms() {
		if (dmmcoreterms == null) {
			dmmcoreterms = new EObjectContainmentEList<DmmCoreTerms>(DmmCoreTerms.class, this, ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__DMMCORETERMS);
		}
		return dmmcoreterms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodSpecification getMethodspecification() {
		return methodspecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodspecification(MethodSpecification newMethodspecification, NotificationChain msgs) {
		MethodSpecification oldMethodspecification = methodspecification;
		methodspecification = newMethodspecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__METHODSPECIFICATION, oldMethodspecification, newMethodspecification);
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
	public void setMethodspecification(MethodSpecification newMethodspecification) {
		if (newMethodspecification != methodspecification) {
			NotificationChain msgs = null;
			if (methodspecification != null)
				msgs = ((InternalEObject)methodspecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__METHODSPECIFICATION, null, msgs);
			if (newMethodspecification != null)
				msgs = ((InternalEObject)newMethodspecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__METHODSPECIFICATION, null, msgs);
			msgs = basicSetMethodspecification(newMethodspecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__METHODSPECIFICATION, newMethodspecification, newMethodspecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DmmExtensionTerms> getDmmextensionterms() {
		if (dmmextensionterms == null) {
			dmmextensionterms = new EObjectContainmentEList<DmmExtensionTerms>(DmmExtensionTerms.class, this, ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__DMMEXTENSIONTERMS);
		}
		return dmmextensionterms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__DMMCORETERMS:
				return ((InternalEList<?>)getDmmcoreterms()).basicRemove(otherEnd, msgs);
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__METHODSPECIFICATION:
				return basicSetMethodspecification(null, msgs);
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__DMMEXTENSIONTERMS:
				return ((InternalEList<?>)getDmmextensionterms()).basicRemove(otherEnd, msgs);
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
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__OBSERVATIONAL_DATA_MODEL:
				return getObservationalDataModel();
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__DMMCORETERMS:
				return getDmmcoreterms();
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__METHODSPECIFICATION:
				return getMethodspecification();
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__DMMEXTENSIONTERMS:
				return getDmmextensionterms();
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
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__OBSERVATIONAL_DATA_MODEL:
				setObservationalDataModel((String)newValue);
				return;
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__DMMCORETERMS:
				getDmmcoreterms().clear();
				getDmmcoreterms().addAll((Collection<? extends DmmCoreTerms>)newValue);
				return;
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__METHODSPECIFICATION:
				setMethodspecification((MethodSpecification)newValue);
				return;
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__DMMEXTENSIONTERMS:
				getDmmextensionterms().clear();
				getDmmextensionterms().addAll((Collection<? extends DmmExtensionTerms>)newValue);
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
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__OBSERVATIONAL_DATA_MODEL:
				setObservationalDataModel(OBSERVATIONAL_DATA_MODEL_EDEFAULT);
				return;
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__DMMCORETERMS:
				getDmmcoreterms().clear();
				return;
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__METHODSPECIFICATION:
				setMethodspecification((MethodSpecification)null);
				return;
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__DMMEXTENSIONTERMS:
				getDmmextensionterms().clear();
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
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__OBSERVATIONAL_DATA_MODEL:
				return OBSERVATIONAL_DATA_MODEL_EDEFAULT == null ? observationalDataModel != null : !OBSERVATIONAL_DATA_MODEL_EDEFAULT.equals(observationalDataModel);
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__DMMCORETERMS:
				return dmmcoreterms != null && !dmmcoreterms.isEmpty();
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__METHODSPECIFICATION:
				return methodspecification != null;
			case ppsrmetamodelPackage.DATASET_METADATA_SCHEMA__DMMEXTENSIONTERMS:
				return dmmextensionterms != null && !dmmextensionterms.isEmpty();
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
		result.append(" (observationalDataModel: ");
		result.append(observationalDataModel);
		result.append(')');
		return result.toString();
	}

} //DatasetMetadataSchemaImpl
