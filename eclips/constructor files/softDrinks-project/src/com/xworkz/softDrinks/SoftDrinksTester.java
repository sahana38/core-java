package com.xworkz.softDrinks;

public class SoftDrinksTester {
	public static void main(String[] s) {
		
		SoftDrinks d = new SoftDrinks("coco-cola", "cola", "1800 Mltrs", "1800 grams");
		System.out.println(d.brand +" "+ d.flavour +" "+ d.volume +" "+ d.weight);
		
		
		SoftDrinks d1 = new SoftDrinks("Thums Up", "cola", "300 Mltrs", "300 grams");
		System.out.println(d1.brand +" "+ d1.flavour +" "+ d1.volume +" "+ d1.weight);
		
		SoftDrinks d2 = new SoftDrinks("Red Bull", "cola", "800 Ml", "800 grams");
		System.out.println(d2.brand +" "+ d2.flavour +" "+ d2.volume +" "+ d2.weight);
				}

}
