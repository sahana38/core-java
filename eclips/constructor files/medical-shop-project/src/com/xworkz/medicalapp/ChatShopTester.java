package com.xworkz.medicalapp;

public class ChatShopTester {
	
	public static void main(String[] c) {
		
		String menu[] = new String[6];
		menu[0] = "Samosa";
		menu[1] = "Pani Puri";
		menu[2] = "Sev Puri";
		menu[3] = "Vadapav";
		menu[4] = "Pavbhaji";
		menu[5] = "Dabeli";
		
		String drinks[] = new String[5];
		drinks[0] = "Tea";
		drinks[1] ="coffee";
		drinks[2] ="lemon Tea";
		drinks[3] ="lemon juice";
		drinks[4] ="cold coffee";
		
		String billingMethod[]= new String[4];
	    billingMethod[0] ="Phone pay";
	    billingMethod[1] = "Google pay";
	    billingMethod[2] = "hard cash";
	    billingMethod[3] = "debit card";
		
		ChatShop chat = new ChatShop("Sagar","AADOS24098","Rajajinagar",menu,drinks,billingMethod);
		
		chat.displayInfo();
		
		/*
		chat.menu[0] = "Samosa";
		chat.menu[1] = "Pani Puri";
		chat.menu[2] = "Sev Puri";
		chat.menu[3] = "Vadapav";
		chat.menu[4] = "Pavbhaji";
		chat.menu[5] = "Dabeli";
		
		chat.drinks = new String[5];
		chat.drinks[0] = "Tea";
		chat.drinks[1] ="coffee";
		chat.drinks[2] ="lemon Tea";
		chat.drinks[3] ="lemon juice";
		chat.drinks[4] ="cold coffee";
		
		chat.billingMethod= new String[4];
		chat.billingMethod[0] ="Phone pay";
		chat.billingMethod[1] = "Google pay";
		chat.billingMethod[2] = "hard cash";
		chat.billingMethod[3] = "debit card";
		*/
	}

}
