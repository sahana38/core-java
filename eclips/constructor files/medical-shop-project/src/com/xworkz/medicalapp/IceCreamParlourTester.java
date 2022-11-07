package com.xworkz.medicalapp;

public class IceCreamParlourTester {
	
	public static void main(String[] p) {
		
		
		String brands[] = new String[6];
		brands[0] = "Amul";
		brands[1] = "ibaco ";
		brands[2] = "joy ";
		brands[3] = "nandini ";
		brands[4] = "tip top";
		brands[5] = "scoop";
		
		String flavours[] = new String[6];
		flavours[0] ="vanilla";
		flavours[1] = "chocolate";
		flavours[2] = "Mint chocolate";
		flavours[3] = "Cookie cream";
		flavours[4] = "strawberry";
		flavours[5] = "Butter vanilla";
		
		
		String type[] = new String[6];
		type[0] = "Hard Ice Cream";
		type[1] = " Ice Cream cones";
		type[2] = "Ice Cream Sticks";
		type[3] = "Ice Cream cakes";
		type[4] = "Ice Cream Floats";
		type[5] = "Ice Cream Buckets";
		
		String billingMethod[]= new String[4];
	    billingMethod[0] ="Phone pay";
	    billingMethod[1] = "Google pay";
	    billingMethod[2] = "hard cash";
	    billingMethod[3] = "debit card";
		
		IceCreamParlour ice = new IceCreamParlour("Arun", "AAOH086","Malleshwaram",brands,flavours, type,billingMethod );
		
		/*
		ice.brands = new String[6];
		ice.brands[0] = "Amul";
		ice.brands[1] = "ibaco ";
		ice.brands[2] = "joy ";
		ice.brands[3] = "nandini ";
		ice.brands[4] = "tip top";
		ice.brands[5] = "scoop";
		
		ice.flavours = new String[6];
		ice.flavours[0] ="vanilla";
		ice.flavours[1] = "chocolate";
		ice.flavours[2] = "Mint chocolate";
		ice.flavours[3] = "Cookie cream";
		ice.flavours[4] = "strawberry";
		ice.flavours[5] = "Butter vanilla";
		
		
	    ice.type = new String[6];
	    ice.type[0] = "Hard Ice Cream";
	    ice.type[1] = " Ice Cream cones";
	    ice.type[2] = "Ice Cream Sticks";
	    ice.type[3] = "Ice Cream cakes";
	    ice.type[4] = "Ice Cream Floats";
	    ice.type[5] = "Ice Cream Buckets";
		
	    ice.billingMethod= new String[4];
	    ice.billingMethod[0] ="Phone pay";
	    ice.billingMethod[1] = "Google pay";
	    ice.billingMethod[2] = "hard cash";
	    ice.billingMethod[3] = "debit card";
	    */
		
		ice.displayInfo();
		
		
		
	
	}

}
