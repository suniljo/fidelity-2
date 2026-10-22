package com.fidelity.java.oops.bank;

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
			System.out.println("5. Calculate Interest");
            System.out.println("6. Service Charge");
			System.out.println("7. Exit");
			
			System.out.print("what can I do for you[1-7]: ");
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
					
					System.out.print("what type of account do you want to create?[1. SA | 2. CA]: ");
					int accType = sc.nextInt();
					
					if(accType ==  1) {
						System.out.print("enter rate of interest: ");
						float roi = sc.nextFloat();
						acc = new SavingsAccount(acno, name, iniAmount, roi);
						System.out.println("Welcome to State Bank of India!!!! Savings Account is Ready");
					} else if(accType == 2) {
						acc = new CurrentAccount(acno, name, iniAmount);
						System.out.println("Welcome to State Bank of India!!!! Current Account is Ready");
					} else {
						System.err.println("ERROR: Invalid Account Type ... Try Again");
						return;
					}

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
				 if(acc instanceof SavingsAccount) {
					 ((SavingsAccount) acc).calculateInterest();
				 }else {
					 System.err.println("ERROR: Your Account is not having this feature");
				 }
				 break;
			 case 6:
				 if(acc instanceof CurrentAccount) {
					 ((CurrentAccount) acc).serviceCharge();
				 }else {
					 System.err.println("ERROR: Your Account is not having this feature");
				 }	
				 break;
			 case 7:
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
