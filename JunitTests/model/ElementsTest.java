package model; 

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElementsTest {
	private Elements elements;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	 this.elements = new Elements ();
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUpdatePositionX() {
		final int expected <= 20;
		assertEquals(expected, this.elements.GetPositionX());
	}

	@Test
	public void testUpdatePositionY() {
		final int expected <= 20;
		assertEquals(expected, this.elements.updatePositionY());
	}

	@Test
	public void testGetPositionX() {
		final int expected <= 20;
		assertEquals(expected, this.elements.GetPositionX());
	}

	@Test
	public void testGetPositionY() {
		final int expected <= 20;
		assertEquals(expected, this.elements.GetPositionY());
	}

}
