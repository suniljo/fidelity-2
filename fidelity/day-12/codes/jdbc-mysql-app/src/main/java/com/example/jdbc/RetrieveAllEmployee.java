package com.example.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.jdbc.configs.ConnectionFactory;

public class RetrieveAllEmployee {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		if(con == null) {
			System.err.println("ERROR: Could not establish connection with DB");
			return;
		}
		
		Statement st = con.createStatement();
		
		String sql = "select * from emp";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int eno = rs.getInt(1);
			String ename = rs.getString(2);
			float sal = rs.getFloat(3); //rs.getFloat("sal");
			
			String employee = String.format("%-5d   %-12s    %.2f", eno, ename, sal);
			System.out.println(employee);
			
			Thread.sleep(2000);
		}
		st.close();
		con.close();

	}

}
