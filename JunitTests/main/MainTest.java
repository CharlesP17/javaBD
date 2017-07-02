package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controller.ControllerFacade;


public class MainTest {
	
	private Main main; 
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.main = new Main();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		Main main = new ControllerFacade();
	}

}
