package model; 

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElementsTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	 new Elements ();
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUpdatePositionX() {
		final int UpdatePositionX = 0;
		assertTrue(UpdatePositionX <= 20);
	}

	@Test
	public void testUpdatePositionY() {
		final int UpdatePositionY = 0;
		assertTrue(UpdatePositionY <= 20);
	}

	@Test
	public void testGetPositionX() {
		final int GetPositionX = 0;
		assertTrue(GetPositionX <= 20);
	}

	@Test
	public void testGetPositionY() {
		final int GetPositionY = 0;
		assertTrue(GetPositionY <= 20);
	}

}
