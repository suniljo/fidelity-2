package com.fidelity.java.oops;

import java.util.Scanner;

public class BankApp {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Account acc = null;
		
		while(true) {
			System.out.println("1. New Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");
			
			System.out.print("what can I do for you[1-5]: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				if(acc == null) {
					System.out.print("enter account number: ");
					long acno = sc.nextLong();
					sc.nextLine();
					
					System.out.print("enter account holder name: ");
					String name = sc.nextLine();
					
					System.out.print("enter initial deposit amount: ");
					double iniAmount = sc.nextDouble();
					
					// creating an Account instance
					acc = new Account(acno, name, iniAmount);
					System.out.println("Welcome to State Bank of India!!!!");
				}else {
					System.err.println("### ERROR: Account is already with Us #####");
				}
				break;
			 case 2:
				 if(acc != null) {	 
					 System.out.print("enter amount to deposit: ");
					 float amt = sc.nextFloat();
					 acc.deposit(amt);
				 }else {
					System.err.println("### ERROR: Please open an account with Us #####"); 
				 }				 
				 break;
			 case 3:
				 if(acc != null) {
					 System.out.print("enter amount to withdraw: ");
					 float amt = sc.nextFloat();
					 acc.withdraw(amt);
				 }else {
					System.err.println("### ERROR: Please open an account with Us #####"); 
				 }				 
				 break;
			 case 4:
				 if(acc != null) {
					 acc.getBalance();
				 }else {
					System.err.println("### ERROR: Please open an account with Us #####"); 
				 }				 
				 break;
			 case 5:
				 System.out.println("Thanks for using our Banking Application");
				 System.out.println("Application Designed & Developed by");
				 System.out.println("\t team@ Fidelity");
				 //return
				 System.exit(0);
			 default:
				 System.err.println("Sorry, Invalid Option Entered .... Try Again");
			}//switch
			System.out.println("=".repeat(80));
			System.out.println();
		}

	}

}
