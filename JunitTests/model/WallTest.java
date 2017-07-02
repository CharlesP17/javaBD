package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WallTest {

	private Wall wall;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.wall = new Wall(0, 0, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWall() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetElements() {
		
	}

	@Test
	public void testGetPositionX() {
		final int expected <= 20;
		assertEquals(expected, this.wall.GetPositionX());
	}


	@Test
	public void testGetPositionY() {
		final int expected <= 20;
		assertEquals(expected, this.wall.GetPositionY());
	}

}
