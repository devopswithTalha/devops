package com;

class BankImp implements Bank {
	
	int balance=5000;
	
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs"+amount);
		balance=balance+amount;
		System.out.println("amount deposited successfully");

	}
	@Override
	public void withdraw(int amount) {
		System.out.println("withdrawing rs"+amount);
		balance -= amount;
		System.out.println("Amount withdrawn successfully");

	}
	@Override
	public void checkBalance() {
		System.out.println("Available balance"+balance);
	}

}
