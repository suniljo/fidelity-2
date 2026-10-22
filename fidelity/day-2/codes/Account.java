package com.fidelity.java.oops;

public class Account {
	long accountNumber;
	String accountHolderName;
	double balance;
	
	public Account(long accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void deposit(float amt) {
		this.balance += amt;
		System.out.printf("Rs.%.2f Credited || Balance: %.2f \n", amt, this.balance);
	}
	
	void withdraw(float amt) {
		if(this.balance >= amt) {
			this.balance = this.balance - amt;
			System.out.printf("Rs.%.2f Debited || Balance: %.2f \n", amt, this.balance);
		} else {
			System.err.println("ERROR: Insufficient Balance");
		}
	}
	
	void getBalance() {
		System.out.printf("A/C No: %d | NAME: %20s | BALANCE: %.2f\n", this.accountNumber, this.accountHolderName, this.balance);
	}
}
