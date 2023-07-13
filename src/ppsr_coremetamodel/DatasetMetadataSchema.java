/**
 */
package ppsr_coremetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset Metadata Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.DatasetMetadataSchema#getObservationalDataModel <em>Observational Data Model</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DatasetMetadataSchema#getDmmcoreterms <em>Dmmcoreterms</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DatasetMetadataSchema#getMethodspecification <em>Methodspecification</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DatasetMetadataSchema#getDmmextensionterms <em>Dmmextensionterms</em>}</li>
 * </ul>
 *
 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDatasetMetadataSchema()
 * @model
 * @generated
 */
public interface DatasetMetadataSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Observational Data Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observational Data Model</em>' attribute.
	 * @see #setObservationalDataModel(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDatasetMetadataSchema_ObservationalDataModel()
	 * @model
	 * @generated
	 */
	String getObservationalDataModel();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DatasetMetadataSchema#getObservationalDataModel <em>Observational Data Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observational Data Model</em>' attribute.
	 * @see #getObservationalDataModel()
	 * @generated
	 */
	void setObservationalDataModel(String value);

	/**
	 * Returns the value of the '<em><b>Dmmcoreterms</b></em>' containment reference list.
	 * The list contents are of type {@link ppsr_coremetamodel.DmmCoreTerms}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmmcoreterms</em>' containment reference list.
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDatasetMetadataSchema_Dmmcoreterms()
	 * @model containment="true"
	 * @generated
	 */
	EList<DmmCoreTerms> getDmmcoreterms();

	/**
	 * Returns the value of the '<em><b>Methodspecification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodspecification</em>' containment reference.
	 * @see #setMethodspecification(MethodSpecification)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDatasetMetadataSchema_Methodspecification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MethodSpecification getMethodspecification();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DatasetMetadataSchema#getMethodspecification <em>Methodspecification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methodspecification</em>' containment reference.
	 * @see #getMethodspecification()
	 * @generated
	 */
	void setMethodspecification(MethodSpecification value);

	/**
	 * Returns the value of the '<em><b>Dmmextensionterms</b></em>' containment reference list.
	 * The list contents are of type {@link ppsr_coremetamodel.DmmExtensionTerms}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmmextensionterms</em>' containment reference list.
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDatasetMetadataSchema_Dmmextensionterms()
	 * @model containment="true"
	 * @generated
	 */
	EList<DmmExtensionTerms> getDmmextensionterms();

} // DatasetMetadataSchema
