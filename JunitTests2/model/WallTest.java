package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WallTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		new Wall(0, 0, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWall() {
		
	}

	@Test
	public void testGetElements() {
		
	}

	@Test
	public void testGetPositionX() {
		final int GetPosotionX = 0;
		assertTrue(GetPosotionX <= 20);
	}


	@Test
	public void testGetPositionY() {
		final int GetPositionY = 0;
		assertTrue(GetPositionY <= 20);
	}

}
