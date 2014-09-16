package org.grapeCity.restAssignment.service;

import org.grapeCity.restAssignment.domain.Directory;
import org.grapeCity.restAssignment.domain.Files;
import junit.framework.*;

/**
 * The class <code>DirectoryServiceImplTest</code> contains tests for the class <code>{@link DirectoryServiceImpl}</code>.
 *
 * 
 * @author Gaurav Asthana
 * @version $Revision: 1.0 $
 */
public class DirectoryServiceImplTest extends TestCase {
	/**
	 * Run the DirectoryServiceImpl() constructor test.
	 *
	 * 
	 */
	public void testDirectoryServiceImpl_1()
		throws Exception {
		DirectoryServiceImpl result = new DirectoryServiceImpl();
		assertNotNull(result);
	}

	/**
	 * Run the Directory getDirectoryList(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetDirectoryList_1()
		throws Exception {
		DirectoryServiceImpl fixture = new DirectoryServiceImpl();
		String dirPath = "D:/m/The_Conjuring.SRT";

		Directory result = fixture.getDirectoryList(dirPath);
		assertNotNull(result);
	}

	/**
	 * Run the Directory getDirectoryList(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetDirectoryList_2()
		throws Exception {
		DirectoryServiceImpl fixture = new DirectoryServiceImpl();
		String dirPath = "D:/m/The_Conjuring.SRT";

		Directory result = fixture.getDirectoryList(dirPath);

		assertNotNull(result);
	}

	/**
	 * Run the Directory getDirectoryList(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetDirectoryList_3()
		throws Exception {
		DirectoryServiceImpl fixture = new DirectoryServiceImpl();
		String dirPath = "D:/m/The_Conjuring.SRT";

		Directory result = fixture.getDirectoryList(dirPath);

		assertNotNull(result);
	}

	/**
	 * Run the Directory getDirectoryList(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetDirectoryList_4()
		throws Exception {
		DirectoryServiceImpl fixture = new DirectoryServiceImpl();
		String dirPath = "D:/m/The_Conjuring.SRT";

		Directory result = fixture.getDirectoryList(dirPath);

		assertNotNull(result);
	}

	/**
	 * Run the Files getFileDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetFileDetails_1()
		throws Exception {
		DirectoryServiceImpl fixture = new DirectoryServiceImpl();
		String filePath = "";

		Files result = fixture.getFileDetails(filePath);

		assertNotNull(result);
	}

	/**
	 * Run the Files getFileDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetFileDetails_2()
		throws Exception {
		DirectoryServiceImpl fixture = new DirectoryServiceImpl();
		String filePath = "";

		Files result = fixture.getFileDetails(filePath);

		assertNotNull(result);
	}

	/**
	 * Run the Files getFileDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetFileDetails_3()
		throws Exception {
		DirectoryServiceImpl fixture = new DirectoryServiceImpl();
		String filePath = "";

		Files result = fixture.getFileDetails(filePath);

		assertNotNull(result);
	}

	/**
	 * Run the Files getFileDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetFileDetails_4()
		throws Exception {
		DirectoryServiceImpl fixture = new DirectoryServiceImpl();
		String filePath = "";

		Files result = fixture.getFileDetails(filePath);

		assertNotNull(result);
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
			junit.textui.TestRunner.run(DirectoryServiceImplTest.class);
		} else {
			// Run only the named tests
			TestSuite suite = new TestSuite("Selected tests");
			for (int i = 0; i < args.length; i++) {
				TestCase test = new DirectoryServiceImplTest();
				test.setName(args[i]);
				suite.addTest(test);
			}
			junit.textui.TestRunner.run(suite);
		}
	}
}