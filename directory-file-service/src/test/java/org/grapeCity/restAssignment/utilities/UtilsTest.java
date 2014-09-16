package org.grapeCity.restAssignment.utilities;

import java.util.LinkedList;
import java.util.TreeMap;
import junit.framework.*;

/**
 * The class <code>UtilsTest</code> contains tests for the class <code>{@link Utils}</code>.
 *
 * @author Gaurav Asthana
 * @version $Revision: 1.0 $
 */
public class UtilsTest extends TestCase {
	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_1()
		throws Exception {
		Object objVal = null;

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_2()
		throws Exception {
		Object objVal = "";

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_3()
		throws Exception {
		Object objVal = "";

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_4()
		throws Exception {
		Object objVal = new Integer(1);

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(false, result);
	}

	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_5()
		throws Exception {
		Object objVal = new Object[] {};

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_6()
		throws Exception {
		Object objVal = new LinkedList<Object>();

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_7()
		throws Exception {
		Object objVal = new TreeMap<Object, Object>();

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_8()
		throws Exception {
		Object objVal = new TreeMap<Object, Object>();

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_9()
		throws Exception {
		Object objVal = new Object();

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(false, result);
	}

	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_10()
		throws Exception {
		Object objVal = new LinkedList<Object>();

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_11()
		throws Exception {
		Object objVal = new Object[] {null};

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(false, result);
	}

	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_12()
		throws Exception {
		Object objVal = new Integer(1);

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(false, result);
	}

	/**
	 * Run the boolean checkNullOrBlank(Object) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testCheckNullOrBlank_13()
		throws Exception {
		Object objVal = "";

		boolean result = Utils.checkNullOrBlank(objVal);

		assertEquals(true, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * 
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * 
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * 
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			// Run all of the tests
			junit.textui.TestRunner.run(UtilsTest.class);
		} else {
			// Run only the named tests
			TestSuite suite = new TestSuite("Selected tests");
			for (int i = 0; i < args.length; i++) {
				TestCase test = new UtilsTest();
				test.setName(args[i]);
				suite.addTest(test);
			}
			junit.textui.TestRunner.run(suite);
		}
	}
}