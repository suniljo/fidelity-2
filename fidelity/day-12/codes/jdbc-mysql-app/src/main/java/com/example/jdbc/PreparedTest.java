package com.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.example.jdbc.configs.ConnectionFactory;

public class PreparedTest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String continueStatus;
		
		Connection con = ConnectionFactory.getDBConnection();
		
		PreparedStatement pst = con.prepareStatement("select * from emp where empno between ? and ?");
		
		do {
			System.out.print("enter employee range to search: ");
			int searchStart = sc.nextInt();
			int searchEnd = sc.nextInt();
			
			pst.setInt(1, searchStart);
			pst.setInt(2, searchEnd);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				int eno = rs.getInt(1);
				String ename = rs.getString(2);
				float sal = rs.getFloat(3); //rs.getFloat("sal");
				
				String employee = String.format("%-5d   %-12s    %.2f", eno, ename, sal);
				System.out.println(employee);	
				
				pst.clearParameters();
			}
			System.out.println("=".repeat(80));
			System.out.print("Do you want to continue? [Y/N]: ");
			continueStatus = sc.next();
		}while(continueStatus.equalsIgnoreCase("Y"));
		
		con.close();

	}

}
