/**
 */
package ppsr_coremetamodel;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Geographic Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * User-defined geospatial representation point location or geographic extent of the project. Point locations are typically represented as map pins and extents as polygons. Uses OGC GeoAPI (09-083r3) standard.
 * This is a class object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectPinLatitude <em>Project Pin Latitude</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectPinLongitude <em>Project Pin Longitude</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverage <em>Project Geographic Coverage</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLatitude <em>Project Geographic Coverage Centroid Latitude</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLongitude <em>Project Geographic Coverage Centroid Longitude</em>}</li>
 * </ul>
 *
 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProjectGeographicLocation()
 * @model
 * @generated
 */
public interface ProjectGeographicLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Project Pin Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Latitude coordinate of the point location of the project. Typically this is where the project is hosted, e.g., a home institution. Uses OGC GeoAPI (09-083r3) standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Pin Latitude</em>' attribute.
	 * @see #isSetProjectPinLatitude()
	 * @see #unsetProjectPinLatitude()
	 * @see #setProjectPinLatitude(BigDecimal)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProjectGeographicLocation_ProjectPinLatitude()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 * @generated
	 */
	BigDecimal getProjectPinLatitude();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectPinLatitude <em>Project Pin Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Pin Latitude</em>' attribute.
	 * @see #isSetProjectPinLatitude()
	 * @see #unsetProjectPinLatitude()
	 * @see #getProjectPinLatitude()
	 * @generated
	 */
	void setProjectPinLatitude(BigDecimal value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectPinLatitude <em>Project Pin Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjectPinLatitude()
	 * @see #getProjectPinLatitude()
	 * @see #setProjectPinLatitude(BigDecimal)
	 * @generated
	 */
	void unsetProjectPinLatitude();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectPinLatitude <em>Project Pin Latitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Project Pin Latitude</em>' attribute is set.
	 * @see #unsetProjectPinLatitude()
	 * @see #getProjectPinLatitude()
	 * @see #setProjectPinLatitude(BigDecimal)
	 * @generated
	 */
	boolean isSetProjectPinLatitude();

	/**
	 * Returns the value of the '<em><b>Project Pin Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Longitude coordinate of the point location of the project. Typically this is where the project is hosted, e.g. a home institution. Uses OGC GeoAPI (09-083r3) standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Pin Longitude</em>' attribute.
	 * @see #isSetProjectPinLongitude()
	 * @see #unsetProjectPinLongitude()
	 * @see #setProjectPinLongitude(BigDecimal)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProjectGeographicLocation_ProjectPinLongitude()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 * @generated
	 */
	BigDecimal getProjectPinLongitude();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectPinLongitude <em>Project Pin Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Pin Longitude</em>' attribute.
	 * @see #isSetProjectPinLongitude()
	 * @see #unsetProjectPinLongitude()
	 * @see #getProjectPinLongitude()
	 * @generated
	 */
	void setProjectPinLongitude(BigDecimal value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectPinLongitude <em>Project Pin Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjectPinLongitude()
	 * @see #getProjectPinLongitude()
	 * @see #setProjectPinLongitude(BigDecimal)
	 * @generated
	 */
	void unsetProjectPinLongitude();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectPinLongitude <em>Project Pin Longitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Project Pin Longitude</em>' attribute is set.
	 * @see #unsetProjectPinLongitude()
	 * @see #getProjectPinLongitude()
	 * @see #setProjectPinLongitude(BigDecimal)
	 * @generated
	 */
	boolean isSetProjectPinLongitude();

	/**
	 * Returns the value of the '<em><b>Project Geographic Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-defined geospatial representation(s) of the project area footprint/extent. Coverage is typically represented in a GeoJSON object which has a centroid coordinate ('centre') and a definition of the boundary of the shape. Uses OGC GeoAPI (09-083r3) standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Geographic Coverage</em>' attribute.
	 * @see #isSetProjectGeographicCoverage()
	 * @see #unsetProjectGeographicCoverage()
	 * @see #setProjectGeographicCoverage(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProjectGeographicLocation_ProjectGeographicCoverage()
	 * @model unique="false" unsettable="true" ordered="false"
	 * @generated
	 */
	String getProjectGeographicCoverage();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverage <em>Project Geographic Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Geographic Coverage</em>' attribute.
	 * @see #isSetProjectGeographicCoverage()
	 * @see #unsetProjectGeographicCoverage()
	 * @see #getProjectGeographicCoverage()
	 * @generated
	 */
	void setProjectGeographicCoverage(String value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverage <em>Project Geographic Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjectGeographicCoverage()
	 * @see #getProjectGeographicCoverage()
	 * @see #setProjectGeographicCoverage(String)
	 * @generated
	 */
	void unsetProjectGeographicCoverage();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverage <em>Project Geographic Coverage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Project Geographic Coverage</em>' attribute is set.
	 * @see #unsetProjectGeographicCoverage()
	 * @see #getProjectGeographicCoverage()
	 * @see #setProjectGeographicCoverage(String)
	 * @generated
	 */
	boolean isSetProjectGeographicCoverage();

	/**
	 * Returns the value of the '<em><b>Project Geographic Coverage Centroid Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Latitude coordinate of the centroid of the project extent area. Latitude coordinate in geographic decimal degrees for the center or home base of the project best representing the project's location as a point. Uses OGC GeoAPI (09-083r3) standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Geographic Coverage Centroid Latitude</em>' attribute.
	 * @see #isSetProjectGeographicCoverageCentroidLatitude()
	 * @see #unsetProjectGeographicCoverageCentroidLatitude()
	 * @see #setProjectGeographicCoverageCentroidLatitude(BigDecimal)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProjectGeographicLocation_ProjectGeographicCoverageCentroidLatitude()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 * @generated
	 */
	BigDecimal getProjectGeographicCoverageCentroidLatitude();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLatitude <em>Project Geographic Coverage Centroid Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Geographic Coverage Centroid Latitude</em>' attribute.
	 * @see #isSetProjectGeographicCoverageCentroidLatitude()
	 * @see #unsetProjectGeographicCoverageCentroidLatitude()
	 * @see #getProjectGeographicCoverageCentroidLatitude()
	 * @generated
	 */
	void setProjectGeographicCoverageCentroidLatitude(BigDecimal value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLatitude <em>Project Geographic Coverage Centroid Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjectGeographicCoverageCentroidLatitude()
	 * @see #getProjectGeographicCoverageCentroidLatitude()
	 * @see #setProjectGeographicCoverageCentroidLatitude(BigDecimal)
	 * @generated
	 */
	void unsetProjectGeographicCoverageCentroidLatitude();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLatitude <em>Project Geographic Coverage Centroid Latitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Project Geographic Coverage Centroid Latitude</em>' attribute is set.
	 * @see #unsetProjectGeographicCoverageCentroidLatitude()
	 * @see #getProjectGeographicCoverageCentroidLatitude()
	 * @see #setProjectGeographicCoverageCentroidLatitude(BigDecimal)
	 * @generated
	 */
	boolean isSetProjectGeographicCoverageCentroidLatitude();

	/**
	 * Returns the value of the '<em><b>Project Geographic Coverage Centroid Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Longitude coordinate of the centroid of the project extent area. Longitude coordinate in geographic decimal degrees for the center or home base of the project best representing the project's location as a point. Uses OGC GeoAPI (09-083r3) standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Geographic Coverage Centroid Longitude</em>' attribute.
	 * @see #setProjectGeographicCoverageCentroidLongitude(BigDecimal)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProjectGeographicLocation_ProjectGeographicCoverageCentroidLongitude()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 * @generated
	 */
	BigDecimal getProjectGeographicCoverageCentroidLongitude();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ProjectGeographicLocation#getProjectGeographicCoverageCentroidLongitude <em>Project Geographic Coverage Centroid Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Geographic Coverage Centroid Longitude</em>' attribute.
	 * @see #getProjectGeographicCoverageCentroidLongitude()
	 * @generated
	 */
	void setProjectGeographicCoverageCentroidLongitude(BigDecimal value);

} // ProjectGeographicLocation
