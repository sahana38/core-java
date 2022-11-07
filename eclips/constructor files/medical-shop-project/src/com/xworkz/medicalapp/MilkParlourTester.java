package com.xworkz.medicalapp;

public class MilkParlourTester {
	
	public static void main(String[] m) {
		
		String milkProducts[] = new String[8];
		milkProducts[0] = "Cheese";
		milkProducts[1]="yogurt";
		milkProducts[2]="wipped cream";
		milkProducts[3]="Butter";
		milkProducts[4]="Butter Milk";
		milkProducts[5]="Ghee";
		milkProducts[6]="Paneer";
		milkProducts[7]="Curd";
		
		String brandName[] = new String[6];
		brandName[0] = "Monoko ";
		brandName[1] = "Dairy life ";
		brandName[2] = "Amrit";
		brandName[3] = "Nandini";
		brandName[4] = "Bulla";
		brandName[5] = "Fresh Farm";
		
		String billingMethod[]= new String[4];
	    billingMethod[0] ="Phone pay";
	    billingMethod[1] = "Google pay";
	    billingMethod[2] = "hard cash";
	    billingMethod[3] = "debit card";
		
		
		
		
		MilkParlour milk = new MilkParlour("Swami", "AAOP99707","gayatri nagar",milkProducts,brandName,billingMethod);
		
		/*
		milk.name = "swami";
		milk.gstNo = "AAOP99707";
		milk.address = "gayatri nagar";
		
		
		milk.milkProducts = new String[8];
		milk.milkProducts[0] = "Cheese";
		milk.milkProducts[1]="yogurt";
		milk.milkProducts[2]="wipped cream";
		milk.milkProducts[3]="Butter";
		milk.milkProducts[4]="Butter Milk";
		milk.milkProducts[5]="Ghee";
		milk.milkProducts[6]="Paneer";
		milk.milkProducts[7]="Curd";
		
		milk.brandName = new String[6];
		milk.brandName[0] = "Monoko ";
		milk.brandName[1] = "Dairy life ";
		milk.brandName[2] = "Amrit";
		milk.brandName[3] = "Nandini";
		milk.brandName[4] = "Bulla";
		milk.brandName[5] = "Fresh Farm";
		
		milk.billingMethod = new String[4];
		milk.billingMethod[0] ="Phone pay";
		milk.billingMethod[1] = "Google pay";
		milk.billingMethod[2] = "hard cash";
		milk.billingMethod[3] = "debit card";
		*/
		milk.displayInfo();
		
		
	}

}
