package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.IModel;



/**
 * <h1>The Class Jdbc.</h1>
 *
 * @author Florentin
 * @version 1.0
 */

public class MapFromDB {

	private static final int idlevel = 5;
	public char[][] tab;
	public String map = null;
	

	public MapFromDB()
	{
		try{
		this.BDD();} 
		catch (SQLException e){e.printStackTrace();}
	}
	
	public void BDD () throws SQLException {

			
	    
		    /** The login. */
		    String                  user     = "root";

		    /** The password. */
		    String                  password = "";

		    /** The url. */
		    String                  url      = "jdbc:mysql://localhost/boulderdash?useSSL=false&serverTimezone=UTC";

		    /** The connection. */
		    Connection                     cn = null;

		    /** The statement. */
		    Statement                      st = null;
		    
		    /** The ResultSet. */
		    ResultSet rs = null;
		    
		    try {
		    	Class.forName("com.mysql.jdbc.Driver");
		    	cn = DriverManager.getConnection(url, user, password);
		    	st = cn.createStatement();
		    	/S*String sql = "SELECT * FROM	Map WHERE id=1";
		    	*rs = st.executeQuery(sql);
		    	*while (rs.next())	{
		    		*this.map = rs.getString("Map");
		    		
		    	}*/
		    	System.out.println(map);
		    	this.tabsplit();
		    }
		    catch (ClassNotFoundException e) {
		    	e.printStackTrace();
		    }
		
		    	
		    	

		    
			//return map;
	}
public void tabsplit()
{
	
	tab= new char[20][20];
	String str = this.map;
	/** split the map in differents part and pull it the board*/
	String[] splitArray = str.split(";");
	for(int x = 0; x<20;x++){
	for(int y = 0; y<20;y++){
		/** Detect the position of each character in the board*/
			tab[x][y]=splitArray[x].charAt(y);

	for(int i = 0; i < tab.length; i++) {
        for(int j =0; j < tab.length; j++) {
            

        }
        
    }
	
	System.out.println("BDD");
	}
	
	}
	
}
public IModel getBDD(){
	return (IModel) new MapFromDB();
}
	
}
