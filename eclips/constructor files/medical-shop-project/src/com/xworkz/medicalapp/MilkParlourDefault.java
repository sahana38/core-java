package com.xworkz.medicalapp;

public class MilkParlourDefault {
	
	public static void main(String[] p) {
		
		MilkParlour milk = new MilkParlour();
		
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
		
		milk.displayInfo();
		
	}

}
