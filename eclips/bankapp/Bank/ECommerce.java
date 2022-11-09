package com.xworkz.bankapp.Bank;

public class ECommerce {
	
	public String name;
	public String purchase;
	
	public void shopping(String purchase) {
		
		System.out.println("The purchased item is" +purchase);
		this.purchase = purchase;
	}
	
	public void presenting(String eCommerce, ECommerce toSister) {
		System.out.println("Presenting the purchased item");
		purchase(eCommerce);
		toSister.shopping(eCommerce);
		System.out.println("Presented the gift.....sister is happy")
	}

}
