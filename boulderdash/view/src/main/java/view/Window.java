package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window implements KeyListener {
	
public boolean up,down,right,left;

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

		@Override
		public void keyPressed(KeyEvent e) 
		{
			// TODO Auto-generated method stub
			if(e.getKeyCode()== KeyEvent.VK_UP) up = true;
			if(e.getKeyCode()== KeyEvent.VK_DOWN) down = true;
			if(e.getKeyCode()== KeyEvent.VK_LEFT) left = true;
			if(e.getKeyCode()== KeyEvent.VK_RIGHT) right = true;
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()== KeyEvent.VK_UP) up = false;
			if(e.getKeyCode()== KeyEvent.VK_DOWN) down = false;
			if(e.getKeyCode()== KeyEvent.VK_LEFT) left = false;
			if(e.getKeyCode()== KeyEvent.VK_RIGHT) right = false;
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
			
		}

//ok