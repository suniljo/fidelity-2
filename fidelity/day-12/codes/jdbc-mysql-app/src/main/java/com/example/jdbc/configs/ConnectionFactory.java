package com.example.jdbc.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionFactory {
	private static Connection con = null;
	
	public static Connection getDBConnection() throws Exception{
		try {
			ResourceBundle bundle = ResourceBundle.getBundle("dbconfig");
			
			String driverClass = bundle.getString("jdbc.driverclass");
			String url = bundle.getString("jdbc.url");
			String user = bundle.getString("jdbc.username");
			String pass = bundle.getString("jdbc.password");
			
			
			Class.forName(driverClass);
			con = DriverManager.getConnection(url, user, pass);
			
			return con;
		}catch(Exception ex) {
			System.err.println(ex);
		}
		return null;
	}
	
	
	public static void closeConnection() throws Exception{
		if(con != null)
			con.close();
	}
}
