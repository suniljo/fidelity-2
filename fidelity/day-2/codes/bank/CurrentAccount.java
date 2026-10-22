package com.fidelity.java.oops.bank;

public class CurrentAccount extends Account {
	int transactionsCount;
	final int NO_OF_FREE_TRANSACTIONS = 3;
	
	public CurrentAccount(long accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
	}

	@Override
	public void deposit(float amt) {
		transactionsCount++;
		super.deposit(amt);
	}

	@Override
	void withdraw(float amt) {
		transactionsCount++;
		super.withdraw(amt);
	}

	@Override
	void getBalance() {
		transactionsCount++;
		super.getBalance();
	}
	
	void serviceCharge() {
		if(transactionsCount > NO_OF_FREE_TRANSACTIONS) {
			int extra_trans = transactionsCount - NO_OF_FREE_TRANSACTIONS;
			float ser_charge = extra_trans * 100;
			transactionsCount = 0;
			super.withdraw(ser_charge);
		} else {
			System.out.println("Only " + transactionsCount + " is over... can do extra");
		}
	}
}
