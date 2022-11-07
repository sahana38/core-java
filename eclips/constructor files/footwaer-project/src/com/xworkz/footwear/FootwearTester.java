package com.xworkz.footwear;

public class FootwearTester {
	
	public static void main(String[] s) {
		
		Footwear f = new Footwear("F45","3 UK" , "black", "sandal" ,"Sponex PVC", 599);
		System.out.println("***Footwears***");
		System.out.println( f.id +" \n "+ f.size +" \n "+ f.color +" \n "+ f.model +" \n "+ f.brandName +" \n "+ f.price);
		
		
		
		Footwear f1 = new Footwear("F46","5 UK" , "white", "flipflop" ,"Tokyo", 399);
		System.out.println("***Footwears***");
		System.out.println( f1.id +" \n "+ f1.size +" \n "+ f1.color +" \n "+ f1.model +" \n "+ f1.brandName +" \n "+ f1.price);
		
		
		
		Footwear f2 = new Footwear("FO34","8 UK" , "black", "Shoes" ,"London Steps", 5999);
		System.out.println("***Footwears***");
		System.out.println( f2.id +" \n "+ f2.size +" \n "+ f2.color +" \n "+ f2.model +" \n "+ f2.brandName +" \n "+ f2.price);
		
		
		Footwear f3 = new Footwear("Fg56" , "7 UK", "cream", "sandals", "Adidas", 899);
		System.out.println("***Footwears***");
		System.out.println( f3.id +" \n "+ f3.size +" \n "+ f3.color +" \n "+ f3.model +" \n "+ f3.brandName +" \n "+ f3.price);
		
		
		
		
	}

}
