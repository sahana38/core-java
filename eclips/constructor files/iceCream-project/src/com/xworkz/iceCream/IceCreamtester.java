package com.xworkz.iceCream;

public class IceCreamtester {
	public static void main(String[] o) {
		
		IceCream ice = new IceCream("Vanilla", "cup",90);
		System.out.println(ice.flavour +" "+ ice.type +" "+ ice.price);
		
		IceCream ice1 = new IceCream("Chocolate", "cone",65);
		System.out.println(ice1.flavour +" "+ ice1.type +" "+ ice1.price);
		
		IceCream ice2 = new IceCream("Strawberries", "Family pack",400);
		System.out.println(ice2.flavour +" "+ ice2.type +" "+ ice2.price);
		
	}

}
