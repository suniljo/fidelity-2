package com.example.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import com.example.jdbc.configs.ConnectionFactory;

public class SaveEmployees {

	public static void main(String[] args)throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		try { 
			if(con != null) {
				Statement st = con.createStatement();
				
				String sqlToSaveEmp = "insert into emp(empno, ename, sal) values"
						+ "(107, 'Aarishi', 2500.5),"
						+ "(108, 'Rohan', 3500.5),"
						+ "(109, 'Hemanth', 4500.5),"
						+ "(110, 'Shaik', 5500.5),"
						+ "(111, 'Bhargavi', 6500.5)";
				
				int employeesSaved = st.executeUpdate(sqlToSaveEmp);
				System.out.println("Employees Saved - " + employeesSaved);
			} else {
				System.err.println("ERROR: Could not get connection with DB!!");
			}
		}catch(Exception ex) {
			System.err.println(ex);
		}
		
		con.close();
	}

}
