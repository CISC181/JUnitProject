package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainClassJunit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd2() {
		assertTrue("Assertion didnt work",MainClass.Add2Numbers(1, 2)==3);
		
		
		
		assertTrue(1==1);
		
		
		
		assertTrue("My Test of 1=1",1==2);
		
		
		
		assertFalse("Assertion is not false",MainClass.Add2Numbers(1,3)==3);
		
		
	}

}
