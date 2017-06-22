package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {

		public Window()
		{
		JFrame windo = new JFrame();
		windo.setTitle("BOULDER DASH TA MERE LA PUTE");
		windo.setSize(400, 500);
		windo.setLocationRelativeTo(null);
		windo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windo.setContentPane(new DisplayElements());
		
		windo.setVisible(true);
		}
			
		}

