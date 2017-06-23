package view;

import java.awt.Graphics;

import javax.swing.JOptionPane;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class DisplayElements implements IView {

    /**
     * Instantiates a new view facade.
     */
    public DisplayElements() {
        super();
    }


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
	@Override
	public void UpdateDrawElements(Graphics graphics) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DrawElements(Graphics graphics) {
		// TODO Auto-generated method stub
		
	}

}
