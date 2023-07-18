/**
 */
package dcatcs.tests;

import dcatcs.DcatcsFactory;
import dcatcs.ProjectGeographicLocation;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Project Geographic Location</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectGeographicLocationTest extends TestCase {

	/**
	 * The fixture for this Project Geographic Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectGeographicLocation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjectGeographicLocationTest.class);
	}

	/**
	 * Constructs a new Project Geographic Location test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectGeographicLocationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Project Geographic Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProjectGeographicLocation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Project Geographic Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectGeographicLocation getFixture() {
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
		setFixture(DcatcsFactory.eINSTANCE.createProjectGeographicLocation());
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

} //ProjectGeographicLocationTest
