package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class DisplayElements extends JPanel{


      //ok
public void paintComponent(Graphics g){
        try {
          Image wall = ImageIO.read(new File("bloc 1.JPG"));
          
          g.drawImage(wall, 0, 0, null);
          //Pour une image de fond
          //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
        } catch (IOException e) {
          e.printStackTrace();}
        
        int tab[][]={{0,0,0,0,0,0},{0,1,1,1,1,0},{0,1,1,1,1,0}};
        for(int i =0; i < tab.length; i++)
        {
        			{
        			//	
        			}
        
        }
        } 
    
    
  
  /* public void UpdateDrawElements(){}
   public void UpdatePositionX(){}
   public void UpdatePositionY(){}
   public void GetPositionX(){}
   public void GetPositionY(){}
   public int GetIDElements()
   {
	return 0;
	}
*/
}
