package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <h1>The Class Jdbc.</h1>
 *
 * @author Florentin
 * @version 1.0
 */

public class MapFromDB {

	private static final int idlevel = 5;
	

	/*public static void main(String[] args) {
		
		MapFromDB(idlevel); 
		System.out.print(map);
		
	}*/
	
	/**
     * Extract the map from the data
	 * @param id 
     *
     * @return the map on a string
     * @throws SQLException
     *             the SQL exception
     */
	
	public MapFromDB (int idlevel) {

			
	    
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
		    	String sql = "call GetMap(idlevel)";
		    	rs = st.executeQuery(sql);
		    	while (rs.next())	{
		    		rs.getString("Map");
		    		
		    	}
		    }
		    catch (SQLException e) {
		    	e.printStackTrace();
		    }
		    catch (ClassNotFoundException e) {
		    	e.printStackTrace();
		    }
		    finally {
		    	try {
		    		cn.close();
		    		st.close();
		    	}
		    	catch (SQLException e) {
		    		e.printStackTrace();
		    	}
		    }
			return;
	}

	public int getIdlevel() {
		return idlevel;
	}
	
}
