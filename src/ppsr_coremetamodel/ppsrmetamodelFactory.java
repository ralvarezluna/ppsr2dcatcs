/**
 */
package ppsr_coremetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ppsr_coremetamodel.ppsrmetamodelPackage
 * @generated
 */
public interface ppsrmetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ppsrmetamodelFactory eINSTANCE = ppsr_coremetamodel.impl.ppsrmetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dmm Core Terms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dmm Core Terms</em>'.
	 * @generated
	 */
	DmmCoreTerms createDmmCoreTerms();

	/**
	 * Returns a new object of class '<em>Program Or Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Or Campaign</em>'.
	 * @generated
	 */
	ProgramOrCampaign createProgramOrCampaign();

	/**
	 * Returns a new object of class '<em>Contact Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Point</em>'.
	 * @generated
	 */
	ContactPoint createContactPoint();

	/**
	 * Returns a new object of class '<em>Project Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Media</em>'.
	 * @generated
	 */
	ProjectMedia createProjectMedia();

	/**
	 * Returns a new object of class '<em>Project Geographic Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Geographic Location</em>'.
	 * @generated
	 */
	ProjectGeographicLocation createProjectGeographicLocation();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Dataset Metadata Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Metadata Schema</em>'.
	 * @generated
	 */
	DatasetMetadataSchema createDatasetMetadataSchema();

	/**
	 * Returns a new object of class '<em>Method Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Specification</em>'.
	 * @generated
	 */
	MethodSpecification createMethodSpecification();

	/**
	 * Returns a new object of class '<em>Dmm Extension Terms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dmm Extension Terms</em>'.
	 * @generated
	 */
	DmmExtensionTerms createDmmExtensionTerms();

	/**
	 * Returns a new object of class '<em>CS Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CS Project</em>'.
	 * @generated
	 */
	CSProject createCSProject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ppsrmetamodelPackage getppsrmetamodelPackage();

} //ppsrmetamodelFactory
