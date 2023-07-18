/**
 */
package dcatcs.tests;

import dcatcs.DataDistributionService;
import dcatcs.DcatcsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Distribution Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataDistributionServiceTest extends DataServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataDistributionServiceTest.class);
	}

	/**
	 * Constructs a new Data Distribution Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDistributionServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Distribution Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataDistributionService getFixture() {
		return (DataDistributionService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DcatcsFactory.eINSTANCE.createDataDistributionService());
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

} //DataDistributionServiceTest
