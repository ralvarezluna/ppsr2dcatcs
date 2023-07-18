/**
 */
package ppsr_coremetamodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ppsr_coremetamodel.ProgramOrCampaign;
import ppsr_coremetamodel.ppsrmetamodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Program Or Campaign</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramOrCampaignTest extends TestCase {

	/**
	 * The fixture for this Program Or Campaign test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramOrCampaign fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgramOrCampaignTest.class);
	}

	/**
	 * Constructs a new Program Or Campaign test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramOrCampaignTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Program Or Campaign test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProgramOrCampaign fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Program Or Campaign test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramOrCampaign getFixture() {
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
		setFixture(ppsrmetamodelFactory.eINSTANCE.createProgramOrCampaign());
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

} //ProgramOrCampaignTest
