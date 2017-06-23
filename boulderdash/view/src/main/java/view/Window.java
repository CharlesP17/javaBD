package view;

import javax.swing.JFrame;


public class Window  {
private static final long serialVersionIUD = 1L;
		public Window()
		{
		JFrame windo = new JFrame();
		windo.setTitle("BOULDER DASH TA MERE LA PUTE");
		windo.setSize(336, 359);
		windo.setLocationRelativeTo(null);
		windo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windo.setContentPane(new DisplayElements());
		
		windo.setVisible(true);
		}


	
			
		}

//ok