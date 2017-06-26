package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import model.dao.Connect;





public class DisplayElements extends JPanel {
	
	
/** allow the picture to display on the panel*/
public void paintComponent(Graphics g)
{	

/** get the map*/

char[][] tab= new char[20][20];

Connect test = new Connect();
	test.Getmap();
	System.out.println(test.Getmap());
String str = test.Getmap();
	

	/** split the map in differents part and pull it the board*/
String[] splitArray = str.split(";");
for(int x = 0; x<20;x++){
for(int y = 0; y<20;y++){
		/** Detect the position of each character in the board*/
tab[x][y]=splitArray[x].charAt(y);} 

try{
	for(int i=0; i<tab.length; i++){
	for(int j=0; j<tab.length; j++){

/** replace each letter by a picture*/		
switch (tab[j][i])
{
case '1':
Image img1 = ImageIO.read(new File("1.jpg"));
g.drawImage(img1, i*16, j*16, null);
break;
case '2':
Image img2 = ImageIO.read(new File("2.jpg"));
g.drawImage(img2, i*16, j*16, null);
break;
case '3':
Image img3 = ImageIO.read(new File("3.jpg"));
g.drawImage(img3, i*16, j*16, null);
break;
case '4':
Image img4 = ImageIO.read(new File("4.jpg"));
g.drawImage(img4, i*16, j*16, null);
break;
case '5':
Image img5 = ImageIO.read(new File("5.jpg"));
g.drawImage(img5, i*16, j*16, null);
break;
case '6':
Image img6 = ImageIO.read(new File("8.jpg"));
g.drawImage(img6, i*16, j*16, null);
break;
case '7':
Image img7 = ImageIO.read(new File("7.jpg"));
g.drawImage(img7, i*16, j*16, null);
break;


}
}
}
}

catch(IOException e)
{
		e.printStackTrace();

}

}	
}}

