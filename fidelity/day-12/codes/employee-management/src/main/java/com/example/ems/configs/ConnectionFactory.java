package com.example.ems.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionFactory {
	
	public static Connection getDBConnection() throws Exception{
		ResourceBundle bundle = ResourceBundle.getBundle("dbconfig");
		
		String dc = bundle.getString("driverclassname");
		String url = bundle.getString("url");
		String uname = bundle.getString("username");
		String pass = bundle.getString("password");
		
		Class.forName(dc);
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		return con;
	}
}
