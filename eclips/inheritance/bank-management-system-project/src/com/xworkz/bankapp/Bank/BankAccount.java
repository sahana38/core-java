package com.xworkz.bankapp.Bank;

public class BankAccount {
	
	String name;
	String branchName;
	String accountNo;
	public double balance;
	
	public double withDraw(double balance)
	{
		System.out.println("The Amount to be withdrawn " +balance);

		this.balance = this.balance-balance;
		return balance;
	}
	
	//balance = 5000
	public double deposit(double balance)
	{
		System.out.println("The Amount to be deposited " +balance);
		//0.0 + 5000
		this.balance = this.balance+ balance;
		return this.balance;
	}
	
	public void transfer(double amount, BankAccount friendsAccount)
	{
	System.out.println("Transferring to Friends Account ");
	withDraw(amount);
	friendsAccount.deposit(amount);
	
	System.out.println("Transferring Done.. Transaction Successfull ");
	} 
	
	
}
