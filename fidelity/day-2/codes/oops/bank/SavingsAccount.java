package com.fidelity.java.oops.bank;

public class SavingsAccount extends Account {
	float roi;

	public SavingsAccount(long accountNumber, String accountHolderName, double balance, float roi) {
		super(accountNumber, accountHolderName, balance);
		this.roi = roi;
	}
	
	public void calculateInterest() {
		float interest = (float) (this.balance * roi /100);
		super.deposit(interest);
	}
}
