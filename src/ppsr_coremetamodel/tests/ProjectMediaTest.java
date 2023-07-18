/**
 */
package ppsr_coremetamodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ppsr_coremetamodel.ProjectMedia;
import ppsr_coremetamodel.ppsrmetamodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Project Media</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectMediaTest extends TestCase {

	/**
	 * The fixture for this Project Media test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectMedia fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjectMediaTest.class);
	}

	/**
	 * Constructs a new Project Media test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectMediaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Project Media test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProjectMedia fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Project Media test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectMedia getFixture() {
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
		setFixture(ppsrmetamodelFactory.eINSTANCE.createProjectMedia());
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

} //ProjectMediaTest
