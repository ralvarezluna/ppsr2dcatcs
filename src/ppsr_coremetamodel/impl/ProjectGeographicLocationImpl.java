/**
 */
package ppsr_coremetamodel.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ppsr_coremetamodel.ProjectGeographicLocation;
import ppsr_coremetamodel.ppsrmetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Geographic Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.impl.ProjectGeographicLocationImpl#getProjectPinLatitude <em>Project Pin Latitude</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.ProjectGeographicLocationImpl#getProjectPinLongitude <em>Project Pin Longitude</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.ProjectGeographicLocationImpl#getProjectGeographicCoverage <em>Project Geographic Coverage</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.ProjectGeographicLocationImpl#getProjectGeographicCoverageCentroidLatitude <em>Project Geographic Coverage Centroid Latitude</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.ProjectGeographicLocationImpl#getProjectGeographicCoverageCentroidLongitude <em>Project Geographic Coverage Centroid Longitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectGeographicLocationImpl extends EObjectImpl implements ProjectGeographicLocation {
	/**
	 * The default value of the '{@link #getProjectPinLatitude() <em>Project Pin Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectPinLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PROJECT_PIN_LATITUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectPinLatitude() <em>Project Pin Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectPinLatitude()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal projectPinLatitude = PROJECT_PIN_LATITUDE_EDEFAULT;

	/**
	 * This is true if the Project Pin Latitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean projectPinLatitudeESet;

	/**
	 * The default value of the '{@link #getProjectPinLongitude() <em>Project Pin Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectPinLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PROJECT_PIN_LONGITUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectPinLongitude() <em>Project Pin Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectPinLongitude()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal projectPinLongitude = PROJECT_PIN_LONGITUDE_EDEFAULT;

	/**
	 * This is true if the Project Pin Longitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean projectPinLongitudeESet;

	/**
	 * The default value of the '{@link #getProjectGeographicCoverage() <em>Project Geographic Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectGeographicCoverage()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_GEOGRAPHIC_COVERAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectGeographicCoverage() <em>Project Geographic Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectGeographicCoverage()
	 * @generated
	 * @ordered
	 */
	protected String projectGeographicCoverage = PROJECT_GEOGRAPHIC_COVERAGE_EDEFAULT;

	/**
	 * This is true if the Project Geographic Coverage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean projectGeographicCoverageESet;

	/**
	 * The default value of the '{@link #getProjectGeographicCoverageCentroidLatitude() <em>Project Geographic Coverage Centroid Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectGeographicCoverageCentroidLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectGeographicCoverageCentroidLatitude() <em>Project Geographic Coverage Centroid Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectGeographicCoverageCentroidLatitude()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal projectGeographicCoverageCentroidLatitude = PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE_EDEFAULT;

	/**
	 * This is true if the Project Geographic Coverage Centroid Latitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean projectGeographicCoverageCentroidLatitudeESet;

	/**
	 * The default value of the '{@link #getProjectGeographicCoverageCentroidLongitude() <em>Project Geographic Coverage Centroid Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectGeographicCoverageCentroidLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectGeographicCoverageCentroidLongitude() <em>Project Geographic Coverage Centroid Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectGeographicCoverageCentroidLongitude()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal projectGeographicCoverageCentroidLongitude = PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectGeographicLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppsrmetamodelPackage.Literals.PROJECT_GEOGRAPHIC_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProjectPinLatitude() {
		return projectPinLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectPinLatitude(BigDecimal newProjectPinLatitude) {
		BigDecimal oldProjectPinLatitude = projectPinLatitude;
		projectPinLatitude = newProjectPinLatitude;
		boolean oldProjectPinLatitudeESet = projectPinLatitudeESet;
		projectPinLatitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LATITUDE, oldProjectPinLatitude, projectPinLatitude, !oldProjectPinLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProjectPinLatitude() {
		BigDecimal oldProjectPinLatitude = projectPinLatitude;
		boolean oldProjectPinLatitudeESet = projectPinLatitudeESet;
		projectPinLatitude = PROJECT_PIN_LATITUDE_EDEFAULT;
		projectPinLatitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LATITUDE, oldProjectPinLatitude, PROJECT_PIN_LATITUDE_EDEFAULT, oldProjectPinLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProjectPinLatitude() {
		return projectPinLatitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProjectPinLongitude() {
		return projectPinLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectPinLongitude(BigDecimal newProjectPinLongitude) {
		BigDecimal oldProjectPinLongitude = projectPinLongitude;
		projectPinLongitude = newProjectPinLongitude;
		boolean oldProjectPinLongitudeESet = projectPinLongitudeESet;
		projectPinLongitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LONGITUDE, oldProjectPinLongitude, projectPinLongitude, !oldProjectPinLongitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProjectPinLongitude() {
		BigDecimal oldProjectPinLongitude = projectPinLongitude;
		boolean oldProjectPinLongitudeESet = projectPinLongitudeESet;
		projectPinLongitude = PROJECT_PIN_LONGITUDE_EDEFAULT;
		projectPinLongitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LONGITUDE, oldProjectPinLongitude, PROJECT_PIN_LONGITUDE_EDEFAULT, oldProjectPinLongitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProjectPinLongitude() {
		return projectPinLongitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectGeographicCoverage() {
		return projectGeographicCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectGeographicCoverage(String newProjectGeographicCoverage) {
		String oldProjectGeographicCoverage = projectGeographicCoverage;
		projectGeographicCoverage = newProjectGeographicCoverage;
		boolean oldProjectGeographicCoverageESet = projectGeographicCoverageESet;
		projectGeographicCoverageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE, oldProjectGeographicCoverage, projectGeographicCoverage, !oldProjectGeographicCoverageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProjectGeographicCoverage() {
		String oldProjectGeographicCoverage = projectGeographicCoverage;
		boolean oldProjectGeographicCoverageESet = projectGeographicCoverageESet;
		projectGeographicCoverage = PROJECT_GEOGRAPHIC_COVERAGE_EDEFAULT;
		projectGeographicCoverageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE, oldProjectGeographicCoverage, PROJECT_GEOGRAPHIC_COVERAGE_EDEFAULT, oldProjectGeographicCoverageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProjectGeographicCoverage() {
		return projectGeographicCoverageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProjectGeographicCoverageCentroidLatitude() {
		return projectGeographicCoverageCentroidLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectGeographicCoverageCentroidLatitude(BigDecimal newProjectGeographicCoverageCentroidLatitude) {
		BigDecimal oldProjectGeographicCoverageCentroidLatitude = projectGeographicCoverageCentroidLatitude;
		projectGeographicCoverageCentroidLatitude = newProjectGeographicCoverageCentroidLatitude;
		boolean oldProjectGeographicCoverageCentroidLatitudeESet = projectGeographicCoverageCentroidLatitudeESet;
		projectGeographicCoverageCentroidLatitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE, oldProjectGeographicCoverageCentroidLatitude, projectGeographicCoverageCentroidLatitude, !oldProjectGeographicCoverageCentroidLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProjectGeographicCoverageCentroidLatitude() {
		BigDecimal oldProjectGeographicCoverageCentroidLatitude = projectGeographicCoverageCentroidLatitude;
		boolean oldProjectGeographicCoverageCentroidLatitudeESet = projectGeographicCoverageCentroidLatitudeESet;
		projectGeographicCoverageCentroidLatitude = PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE_EDEFAULT;
		projectGeographicCoverageCentroidLatitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE, oldProjectGeographicCoverageCentroidLatitude, PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE_EDEFAULT, oldProjectGeographicCoverageCentroidLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProjectGeographicCoverageCentroidLatitude() {
		return projectGeographicCoverageCentroidLatitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProjectGeographicCoverageCentroidLongitude() {
		return projectGeographicCoverageCentroidLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectGeographicCoverageCentroidLongitude(BigDecimal newProjectGeographicCoverageCentroidLongitude) {
		BigDecimal oldProjectGeographicCoverageCentroidLongitude = projectGeographicCoverageCentroidLongitude;
		projectGeographicCoverageCentroidLongitude = newProjectGeographicCoverageCentroidLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE, oldProjectGeographicCoverageCentroidLongitude, projectGeographicCoverageCentroidLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LATITUDE:
				return getProjectPinLatitude();
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LONGITUDE:
				return getProjectPinLongitude();
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE:
				return getProjectGeographicCoverage();
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE:
				return getProjectGeographicCoverageCentroidLatitude();
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE:
				return getProjectGeographicCoverageCentroidLongitude();
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
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LATITUDE:
				setProjectPinLatitude((BigDecimal)newValue);
				return;
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LONGITUDE:
				setProjectPinLongitude((BigDecimal)newValue);
				return;
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE:
				setProjectGeographicCoverage((String)newValue);
				return;
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE:
				setProjectGeographicCoverageCentroidLatitude((BigDecimal)newValue);
				return;
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE:
				setProjectGeographicCoverageCentroidLongitude((BigDecimal)newValue);
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
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LATITUDE:
				unsetProjectPinLatitude();
				return;
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LONGITUDE:
				unsetProjectPinLongitude();
				return;
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE:
				unsetProjectGeographicCoverage();
				return;
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE:
				unsetProjectGeographicCoverageCentroidLatitude();
				return;
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE:
				setProjectGeographicCoverageCentroidLongitude(PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE_EDEFAULT);
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
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LATITUDE:
				return isSetProjectPinLatitude();
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_PIN_LONGITUDE:
				return isSetProjectPinLongitude();
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE:
				return isSetProjectGeographicCoverage();
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LATITUDE:
				return isSetProjectGeographicCoverageCentroidLatitude();
			case ppsrmetamodelPackage.PROJECT_GEOGRAPHIC_LOCATION__PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE:
				return PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE_EDEFAULT == null ? projectGeographicCoverageCentroidLongitude != null : !PROJECT_GEOGRAPHIC_COVERAGE_CENTROID_LONGITUDE_EDEFAULT.equals(projectGeographicCoverageCentroidLongitude);
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
		result.append(" (projectPinLatitude: ");
		if (projectPinLatitudeESet) result.append(projectPinLatitude); else result.append("<unset>");
		result.append(", projectPinLongitude: ");
		if (projectPinLongitudeESet) result.append(projectPinLongitude); else result.append("<unset>");
		result.append(", projectGeographicCoverage: ");
		if (projectGeographicCoverageESet) result.append(projectGeographicCoverage); else result.append("<unset>");
		result.append(", projectGeographicCoverageCentroidLatitude: ");
		if (projectGeographicCoverageCentroidLatitudeESet) result.append(projectGeographicCoverageCentroidLatitude); else result.append("<unset>");
		result.append(", projectGeographicCoverageCentroidLongitude: ");
		result.append(projectGeographicCoverageCentroidLongitude);
		result.append(')');
		return result.toString();
	}

} //ProjectGeographicLocationImpl
