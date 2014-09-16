package org.grapeCity.restAssignment.domain;

import java.util.LinkedList;
import java.util.List;
import junit.framework.*;

/**
 * The class <code>DirectoryTest</code> contains tests for the class <code>{@link Directory}</code>.
 *
 * @author Gaurav Asthana
 * @version $Revision: 1.0 $
 */
public class DirectoryTest extends TestCase {
	/**
	 * Run the String getAbsolutePath() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetAbsolutePath_1()
		throws Exception {
		Directory fixture = new Directory();
		fixture.setAbsolutePath("");
		fixture.setSize("");
		fixture.setType("");
		fixture.directoryOrFiles = new LinkedList<Object>();

		String result = fixture.getAbsolutePath();

		
		assertEquals("", result);
	}

	/**
	 * Run the List<Object> getDirectoryOrFiles() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetDirectoryOrFiles_1()
		throws Exception {
		Directory fixture = new Directory();
		fixture.setAbsolutePath("");
		fixture.setSize("");
		fixture.setType("");
		fixture.directoryOrFiles = null;

		List<Object> result = fixture.getDirectoryOrFiles();

		
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getDirectoryOrFiles() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetDirectoryOrFiles_2()
		throws Exception {
		Directory fixture = new Directory();
		fixture.setAbsolutePath("");
		fixture.setSize("");
		fixture.setType("");
		fixture.directoryOrFiles = new LinkedList<Object>();

		List<Object> result = fixture.getDirectoryOrFiles();

		
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getSize() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetSize_1()
		throws Exception {
		Directory fixture = new Directory();
		fixture.setAbsolutePath("");
		fixture.setSize("");
		fixture.setType("");
		fixture.directoryOrFiles = new LinkedList<Object>();

		String result = fixture.getSize();

		
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetType_1()
		throws Exception {
		Directory fixture = new Directory();
		fixture.setAbsolutePath("");
		fixture.setSize("");
		fixture.setType("");
		fixture.directoryOrFiles = new LinkedList<Object>();

		String result = fixture.getType();

		
		assertEquals("", result);
	}

	/**
	 * Run the void setAbsolutePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testSetAbsolutePath_1()
		throws Exception {
		Directory fixture = new Directory();
		fixture.setAbsolutePath("");
		fixture.setSize("");
		fixture.setType("");
		fixture.directoryOrFiles = new LinkedList<Object>();
		String value = "";

		fixture.setAbsolutePath(value);

		
	}

	/**
	 * Run the void setSize(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testSetSize_1()
		throws Exception {
		Directory fixture = new Directory();
		fixture.setAbsolutePath("");
		fixture.setSize("");
		fixture.setType("");
		fixture.directoryOrFiles = new LinkedList<Object>();
		String value = "";

		fixture.setSize(value);

		
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testSetType_1()
		throws Exception {
		Directory fixture = new Directory();
		fixture.setAbsolutePath("");
		fixture.setSize("");
		fixture.setType("");
		fixture.directoryOrFiles = new LinkedList<Object>();
		String value = "";

		fixture.setType(value);

		
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
			junit.textui.TestRunner.run(DirectoryTest.class);
		} else {
			// Run only the named tests
			TestSuite suite = new TestSuite("Selected tests");
			for (int i = 0; i < args.length; i++) {
				TestCase test = new DirectoryTest();
				test.setName(args[i]);
				suite.addTest(test);
			}
			junit.textui.TestRunner.run(suite);
		}
	}
}