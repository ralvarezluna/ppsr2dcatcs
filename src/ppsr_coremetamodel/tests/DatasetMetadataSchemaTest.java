/**
 */
package ppsr_coremetamodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ppsr_coremetamodel.DatasetMetadataSchema;
import ppsr_coremetamodel.ppsrmetamodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dataset Metadata Schema</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetMetadataSchemaTest extends TestCase {

	/**
	 * The fixture for this Dataset Metadata Schema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetMetadataSchema fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatasetMetadataSchemaTest.class);
	}

	/**
	 * Constructs a new Dataset Metadata Schema test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetMetadataSchemaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dataset Metadata Schema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DatasetMetadataSchema fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dataset Metadata Schema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetMetadataSchema getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ppsrmetamodelFactory.eINSTANCE.createDatasetMetadataSchema());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DatasetMetadataSchemaTest
