package com.xworkz.medicalapp;

public class ChatShopDefault {
	
	public static void main(String[] o) {
		
		ChatShop chat = new ChatShop();
		
		chat.name="sai chats";
		chat.gstNo = "AAOPT098";
		chat.address = "rajajinagar";
		
		
		chat.menu = new String[6];
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
		
		chat.displayInfo();
		
	}
	}


