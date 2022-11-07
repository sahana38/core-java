package com.xworkz.medicalapp;

public class ChatShop {
	
	public String name;
	public String gstNo;
	public String address;
	public String menu[];
	public String drinks[];
	public String billingMethod[];
	
	public ChatShop(String gstNo, String address, String name, String menu[], String drinks[], String billingMethod[]) {
	
		this.name = name;
		this.gstNo = gstNo;
		this.address = address;
		this.menu=menu;
		this.drinks = drinks;
		
		
	}
	
	public ChatShop() {
		System.out.println("constructot created");
	}
	
	public void displayInfo() {
		System.out.println("Chat Shop name is: " +name);
		System.out.println("============================");
		System.out.println(" Shop gstNo is: " +gstNo);
		System.out.println("=============================");
		System.out.println("Address of the shop: " +address);
		System.out.println("=============================");
		
		System.out.println("Chats Menu");
		for(int i = 0;i<menu.length; i++) {
			System.out.println(menu[i]);
		}
		
		System.out.println("=============================");
		System.out.println( "Drinks available at chat shop");
		
		for(int i =0; i<drinks.length; i++) {
			System.out.println(drinks[i]);
		}
		
		System.out.println("===============================");
		System.out.println("Billing Method");
		for(int i=0; i<billingMethod.length; i++) {
			System.out.println(billingMethod[i]);
			
		}
	}
		
	

}
