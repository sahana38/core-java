package com.xworkz.bankapp.Bank;

public class SavingsAccount extends BankAccount{
	
	public double interestRate ;
	 public double newBalance;
	 
	 public void periodicInterest() {
		 double newBalance = getBalance() * interestRate/100;
		 deposit(newBalance);
	 }
	

}
