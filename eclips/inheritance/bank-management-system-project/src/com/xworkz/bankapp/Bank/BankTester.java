package com.xworkz.bankapp.Bank;


public class BankTester {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		 account.deposit(5000);
		 account.deposit(7000);
		 account.withDraw(1000);
		 System.out.println("My Account Balance is " +account.balance);
		 
		 
		 BankAccount friendsAccount = new BankAccount();
		 friendsAccount.deposit(700);
		 friendsAccount.deposit(4000);
		 //String dullAccount = null;
		 //Transfering Amount to friends account to Friends account
		 account.transfer(500.0, friendsAccount);
		 System.out.println("My account balance is "+ account.balance);
		//double withDrawnAmount = account.withDraw(400);
		//System.out.println("Thank you for WithDrawing"+ withDrawn);
		System.out.println("Friends account balance is " +friendsAccount.balance);

		
	
	 BankAccount acnt= new BankAccount();
	 acnt.deposit(5000);
	 acnt.deposit(7000);
	 acnt.withDraw(1000);
	 System.out.println("My Account Balance is " +acnt.balance);
	 
	 
	 BankAccount maaAccount = new BankAccount();
	 maaAccount.deposit(3000);
	 
	 account.transfer(5000.0, maaAccount);
	 System.out.println("My account balance is "+ acnt.balance);
	
	 System.out.println("Maa account balance is " +maaAccount.balance);
}

}
