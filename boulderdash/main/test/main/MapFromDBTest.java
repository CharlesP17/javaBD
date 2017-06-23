package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.dao.MapFromDB;

/**
 * JUnit tests for the class MapFromDB.
 *
 * @author Florentin
 * @version 1.0
 */

public class MapFromDBTest {

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
	
	/**
	 * Tests if the level we want to display is available.
	 * 
	 */
	
	public void testMapFromDB() {
		final int min = 1;
		final int max = 5;
		final MapFromDB map = new MapFromDB();
		assertTrue(map.getIdlevel() >= min); 
		assertTrue(map.getIdlevel() <= max);
		//(expected, map.getIdlevel());
	}

}
