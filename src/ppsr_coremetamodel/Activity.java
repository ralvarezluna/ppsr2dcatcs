/**
 */
package ppsr_coremetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An activity is analagous to a survey and comprises 2 components: a metadata schema; and an observational data model (ie. the data schema into which observational records are created). The data schema definition will represent a specific data collection protocol. In the context of an activity/survey, these exist as a singular pair of objects. Usage of an activity is always made in the context of an event, ie. A non-persistent time-based usage of an observational data schema. Observational data schemas are domain and protocol specific, and may be published in other repositories.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.Activity#getActivityId <em>Activity Id</em>}</li>
 *   <li>{@link ppsr_coremetamodel.Activity#getDatasetmetadataschema <em>Datasetmetadataschema</em>}</li>
 * </ul>
 *
 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A globally unique identifier for an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Id</em>' attribute.
	 * @see #setActivityId(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getActivity_ActivityId()
	 * @model
	 * @generated
	 */
	String getActivityId();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.Activity#getActivityId <em>Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Id</em>' attribute.
	 * @see #getActivityId()
	 * @generated
	 */
	void setActivityId(String value);

	/**
	 * Returns the value of the '<em><b>Datasetmetadataschema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasetmetadataschema</em>' containment reference.
	 * @see #setDatasetmetadataschema(DatasetMetadataSchema)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getActivity_Datasetmetadataschema()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DatasetMetadataSchema getDatasetmetadataschema();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.Activity#getDatasetmetadataschema <em>Datasetmetadataschema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasetmetadataschema</em>' containment reference.
	 * @see #getDatasetmetadataschema()
	 * @generated
	 */
	void setDatasetmetadataschema(DatasetMetadataSchema value);

} // Activity
