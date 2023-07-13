/**
 */
package ppsr_coremetamodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ppsr_coremetamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ppsr_coremetamodel.ppsrmetamodelPackage
 * @generated
 */
public class ppsrmetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ppsrmetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ppsrmetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ppsrmetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ppsrmetamodelSwitch<Adapter> modelSwitch =
		new ppsrmetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseDmmCoreTerms(DmmCoreTerms object) {
				return createDmmCoreTermsAdapter();
			}
			@Override
			public Adapter caseProgramOrCampaign(ProgramOrCampaign object) {
				return createProgramOrCampaignAdapter();
			}
			@Override
			public Adapter caseContactPoint(ContactPoint object) {
				return createContactPointAdapter();
			}
			@Override
			public Adapter caseProjectMedia(ProjectMedia object) {
				return createProjectMediaAdapter();
			}
			@Override
			public Adapter caseProjectGeographicLocation(ProjectGeographicLocation object) {
				return createProjectGeographicLocationAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseDatasetMetadataSchema(DatasetMetadataSchema object) {
				return createDatasetMetadataSchemaAdapter();
			}
			@Override
			public Adapter caseMethodSpecification(MethodSpecification object) {
				return createMethodSpecificationAdapter();
			}
			@Override
			public Adapter caseDmmExtensionTerms(DmmExtensionTerms object) {
				return createDmmExtensionTermsAdapter();
			}
			@Override
			public Adapter caseCSProject(CSProject object) {
				return createCSProjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ppsr_coremetamodel.DmmCoreTerms <em>Dmm Core Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppsr_coremetamodel.DmmCoreTerms
	 * @generated
	 */
	public Adapter createDmmCoreTermsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppsr_coremetamodel.ProgramOrCampaign <em>Program Or Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppsr_coremetamodel.ProgramOrCampaign
	 * @generated
	 */
	public Adapter createProgramOrCampaignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppsr_coremetamodel.ContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppsr_coremetamodel.ContactPoint
	 * @generated
	 */
	public Adapter createContactPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppsr_coremetamodel.ProjectMedia <em>Project Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppsr_coremetamodel.ProjectMedia
	 * @generated
	 */
	public Adapter createProjectMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppsr_coremetamodel.ProjectGeographicLocation <em>Project Geographic Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppsr_coremetamodel.ProjectGeographicLocation
	 * @generated
	 */
	public Adapter createProjectGeographicLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppsr_coremetamodel.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppsr_coremetamodel.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppsr_coremetamodel.DatasetMetadataSchema <em>Dataset Metadata Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppsr_coremetamodel.DatasetMetadataSchema
	 * @generated
	 */
	public Adapter createDatasetMetadataSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppsr_coremetamodel.MethodSpecification <em>Method Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppsr_coremetamodel.MethodSpecification
	 * @generated
	 */
	public Adapter createMethodSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppsr_coremetamodel.DmmExtensionTerms <em>Dmm Extension Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppsr_coremetamodel.DmmExtensionTerms
	 * @generated
	 */
	public Adapter createDmmExtensionTermsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ppsr_coremetamodel.CSProject <em>CS Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ppsr_coremetamodel.CSProject
	 * @generated
	 */
	public Adapter createCSProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ppsrmetamodelAdapterFactory
