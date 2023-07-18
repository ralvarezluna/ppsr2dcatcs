/**
 */
package dcatcs;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.Dataset#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link dcatcs.Dataset#getAccrualPeriodicity <em>Accrual Periodicity</em>}</li>
 *   <li>{@link dcatcs.Dataset#getSpatial <em>Spatial</em>}</li>
 *   <li>{@link dcatcs.Dataset#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link dcatcs.Dataset#getWasGeneratedBy <em>Was Generated By</em>}</li>
 * </ul>
 *
 * @see dcatcs.DcatcsPackage#getDataset()
 * @model
 * @generated
 */
public interface Dataset extends Resource {
	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' containment reference list.
	 * The list contents are of type {@link dcatcs.Distribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' containment reference list.
	 * @see dcatcs.DcatcsPackage#getDataset_Distribution()
	 * @model containment="true"
	 * @generated
	 */
	EList<Distribution> getDistribution();

	/**
	 * Returns the value of the '<em><b>Accrual Periodicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accrual Periodicity</em>' attribute.
	 * @see #setAccrualPeriodicity(String)
	 * @see dcatcs.DcatcsPackage#getDataset_AccrualPeriodicity()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getAccrualPeriodicity();

	/**
	 * Sets the value of the '{@link dcatcs.Dataset#getAccrualPeriodicity <em>Accrual Periodicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accrual Periodicity</em>' attribute.
	 * @see #getAccrualPeriodicity()
	 * @generated
	 */
	void setAccrualPeriodicity(String value);

	/**
	 * Returns the value of the '<em><b>Spatial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial</em>' attribute.
	 * @see #setSpatial(Object)
	 * @see dcatcs.DcatcsPackage#getDataset_Spatial()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Object getSpatial();

	/**
	 * Sets the value of the '{@link dcatcs.Dataset#getSpatial <em>Spatial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial</em>' attribute.
	 * @see #getSpatial()
	 * @generated
	 */
	void setSpatial(Object value);

	/**
	 * Returns the value of the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal</em>' attribute.
	 * @see #setTemporal(Date)
	 * @see dcatcs.DcatcsPackage#getDataset_Temporal()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Date getTemporal();

	/**
	 * Sets the value of the '{@link dcatcs.Dataset#getTemporal <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal</em>' attribute.
	 * @see #getTemporal()
	 * @generated
	 */
	void setTemporal(Date value);

	/**
	 * Returns the value of the '<em><b>Was Generated By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Was Generated By</em>' attribute.
	 * @see #setWasGeneratedBy(Object)
	 * @see dcatcs.DcatcsPackage#getDataset_WasGeneratedBy()
	 * @model ordered="false"
	 * @generated
	 */
	Object getWasGeneratedBy();

	/**
	 * Sets the value of the '{@link dcatcs.Dataset#getWasGeneratedBy <em>Was Generated By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Was Generated By</em>' attribute.
	 * @see #getWasGeneratedBy()
	 * @generated
	 */
	void setWasGeneratedBy(Object value);

} // Dataset
