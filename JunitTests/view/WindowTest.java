package view;

import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WindowTest {

	private Window window;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.window = new Window();
	}
		
	@After
	public void tearDown() throws Exception {
	}
	
	

	@Test
	public void testWindow() {
		JFrame windo = new JFrame();
		windo.setSize(336, 359);
	}

	@Test
	public void testKeyPressed() {
	
		final char expected = Order();
		assertEquals(expected, this.window.keyPressed());
		
	}

	@Test
	public void testKeyReleased() {
		
	}

	@Test
	public void testKeyTyped() {
	
	}

}
