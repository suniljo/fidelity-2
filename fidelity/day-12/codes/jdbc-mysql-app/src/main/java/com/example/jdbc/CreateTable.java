package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//-- initialize MySQL JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-- connect to MySQL db_company Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_company", "root", "root");
		
		//-- create a provision for passing SQL query to connected DB
		Statement st = con.createStatement();
		
		//-- pass SQL Query to create a DB Table - emp(empno, ename, sal)
		String sqlToCreateTable = "CREATE TABLE EMP (EMPNO INT, ENAME VARCHAR(50), SAL FLOAT(10,2), PRIMARY KEY(EMPNO))";
		
		try {
			st.execute(sqlToCreateTable);
			System.out.println("EMP TABLE CREATED!!!");
		} catch(Exception ex) {
			System.err.println("ERROR: " + ex.toString());
		} 		
		
		//-- close connection with DB
		st.close();
		con.close();
	}

}
