package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//test
import com.mysql.cj.api.jdbc.Statement;

public class Connect {
	public char[][] tab;
	public String map = null;
	
public Connect() {
	this.connection();
	
}
	
public void connection(){
	
String url = "jdbc:mysql://localhost/boulderdash?useSSL=false&serverTimezone=UTC";
String login ="root";
String passwd = "";
Connection cn = null;
Statement st =null;
ResultSet rs = null;

try {
	cn = DriverManager.getConnection(url, login, passwd);
	st = (Statement) cn.createStatement();
	String sql ="call GetMap(4)";
	rs = st.executeQuery(sql);
	while (rs.next())	{
		map = rs.getString("Map");
		
	}
	System.out.println(map);


} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	
	
	
	
	
	
	
		
}

public String Getmap() {
	return this.map;
	
}}
