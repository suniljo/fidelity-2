package com.fidelity.java.exceptions;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("enter first no: ");
			int fno = sc.nextInt();
			
			System.out.print("enter second no: ");
			int sno = sc.nextInt();
			
			int result = fno / sno;
			System.out.printf("%d / %d = %d \n", fno, sno, result);
			//return;
			System.exit(0);
		}catch(ArithmeticException ex) {
			System.err.println("in Catch ---> " + ex.toString());
			return;
		}finally {	
			System.err.println("--- finally block ---");
			System.out.println("\t Application Designed & Developed by");
			System.out.println("\t\t team % fidelity");
			sc.close();
		}
		//System.out.println("----- DONE -----");
	}

}
