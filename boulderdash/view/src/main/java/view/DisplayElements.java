package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


public class DisplayElements extends JPanel {
	
	public DisplayElements(){}

public void paintComponent(Graphics g)
{	
	
String test = "33333333333333333333;34522222225222222223;32221222222522222523;32222222222222522423;35222222422222522223;35222222255222222223;32225522222222252223;33333333333332222223;32222222222222222223;32522122222122222223;32212222222522222223;32225225522522252523;32225222222242222243;32222223333333333333;32122222422222222243;32542222552252222263;32222222222252215213;32222522225222225223;34222222222222224253;33333333333333333333;";
char[][] tab= new char[20][20];
String str = test;
String[] splitArray = str.split(";");
for(int x = 0; x<20;x++){
for(int y = 0; y<20;y++){
		tab[x][y]=splitArray[x].charAt(y);} 


try{
	for(int i=0; i<tab.length; i++){
	for(int j=0; j<tab.length; j++){

		
switch (tab[i][j])
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
Image img6 = ImageIO.read(new File("6.jpg"));
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
}
}
