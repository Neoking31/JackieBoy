package org.grapeCity.restAssignment.domain;

import junit.framework.*;

/**
 * The class <code>FilesTest</code> contains tests for the class <code>{@link Files}</code>.
 *
 * 
 * @author Gaurav Asthana
 * @version $Revision: 1.0 $
 */
public class FilesTest extends TestCase {
	/**
	 * Run the String getAbsolutePath() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetAbsolutePath_1()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");

		String result = fixture.getAbsolutePath();

		
		assertEquals("", result);
	}

	/**
	 * Run the String getExecutable() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetExecutable_1()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable((String) null);
		fixture.setMtime("");

		String result = fixture.getExecutable();

		
		assertEquals("0", result);
	}

	/**
	 * Run the String getExecutable() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetExecutable_2()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");

		String result = fixture.getExecutable();

		
		assertEquals("", result);
	}

	/**
	 * Run the String getMtime() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetMtime_1()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime((String) null);

		String result = fixture.getMtime();

		
		assertEquals("0", result);
	}

	/**
	 * Run the String getMtime() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetMtime_2()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");

		String result = fixture.getMtime();

		
		assertEquals("", result);
	}

	/**
	 * Run the String getReadable() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetReadable_1()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable((String) null);
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");

		String result = fixture.getReadable();

		
		assertEquals("0", result);
	}

	/**
	 * Run the String getReadable() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetReadable_2()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");

		String result = fixture.getReadable();

		
		assertEquals("", result);
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
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");

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
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");

		String result = fixture.getType();

		
		assertEquals("", result);
	}

	/**
	 * Run the String getWritable() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetWritable_1()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable((String) null);
		fixture.setExecutable("");
		fixture.setMtime("");

		String result = fixture.getWritable();

		
		assertEquals("0", result);
	}

	/**
	 * Run the String getWritable() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testGetWritable_2()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");

		String result = fixture.getWritable();

		
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
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");
		String value = "";

		fixture.setAbsolutePath(value);

		
	}

	/**
	 * Run the void setExecutable(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testSetExecutable_1()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");
		String value = "";

		fixture.setExecutable(value);

		
	}

	/**
	 * Run the void setMtime(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testSetMtime_1()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");
		String value = "";

		fixture.setMtime(value);

		
	}

	/**
	 * Run the void setReadable(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testSetReadable_1()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");
		String value = "";

		fixture.setReadable(value);

		
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
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");
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
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");
		String value = "";

		fixture.setType(value);

		
	}

	/**
	 * Run the void setWritable(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	public void testSetWritable_1()
		throws Exception {
		Files fixture = new Files();
		fixture.setAbsolutePath("");
		fixture.setType("");
		fixture.setReadable("");
		fixture.setSize("");
		fixture.setWritable("");
		fixture.setExecutable("");
		fixture.setMtime("");
		String value = "";

		fixture.setWritable(value);

		
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
			junit.textui.TestRunner.run(FilesTest.class);
		} else {
			// Run only the named tests
			TestSuite suite = new TestSuite("Selected tests");
			for (int i = 0; i < args.length; i++) {
				TestCase test = new FilesTest();
				test.setName(args[i]);
				suite.addTest(test);
			}
			junit.textui.TestRunner.run(suite);
		}
	}
}