/**
 */
package ppsr_coremetamodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ppsr_coremetamodel.CSProject;
import ppsr_coremetamodel.ppsrmetamodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CS Project</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSProjectTest extends TestCase {

	/**
	 * The fixture for this CS Project test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSProject fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CSProjectTest.class);
	}

	/**
	 * Constructs a new CS Project test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSProjectTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this CS Project test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CSProject fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this CS Project test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSProject getFixture() {
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
		setFixture(ppsrmetamodelFactory.eINSTANCE.createCSProject());
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

} //CSProjectTest
