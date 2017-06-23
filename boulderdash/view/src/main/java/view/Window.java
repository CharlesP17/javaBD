package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import javax.swing.JFrame;

/**
 * <h1>The Class Window.</h1>
 *
 * @author Charles
 * @version 1.0
 */
public class Window implements KeyListener  {
	
	/** Create the window*/
		public Window()
		{
		JFrame windo = new JFrame();
		/** Title */
		windo.setTitle("BOULDER DASH");
		/** Size */
		windo.setSize(336, 359);
		/** location */
		windo.setLocationRelativeTo(null);
		/** CloseOperation */
		windo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/** ContentPane */
		windo.setContentPane(new DisplayElements());
		/** visibility */
		windo.setVisible(true);
		}
		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
		
			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}


	
			
		}

//ok