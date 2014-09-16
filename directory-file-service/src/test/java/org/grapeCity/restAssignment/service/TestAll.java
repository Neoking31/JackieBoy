package org.grapeCity.restAssignment.service;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 *
 * @author Gaurav Asthana
 * @version $Revision: 1.0 $
 */
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 *
	 */
	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}

	/**
	 * Create a test suite that can run all of the test cases in this package
	 * and all subpackages.
	 *
	 * @return the test suite that was created
	 *
	 *
	 */
	public static Test suite() {
		TestSuite suite;
	
		suite = new TestSuite("Tests in package org.grapeCity.restAssignment.service");
		suite.addTestSuite(DirectoryServiceImplTest.class);
		return suite;
	}
}
