package com.xworkz.watch;


public class WatchTester {
	public static void main(String[] args) {
		

		Watch w = new Watch("Q26", "Pink" ,  "Smart Watch", "FRENCH CONNECTION", 4498);
		//instance variables cannot be shared among multiple Objects
		
		System.out.println("*****Watch details*****");
		System.out.println( w.watchId +" "+ w.color +" "+ w.brandName +" "+ w.watchType +" "+ w.price);
		
		
		Watch w1 = new Watch("D134", "Gold" ,  "Analog", "Casio", 4995);
		//instance variables cannot be shared among multiple Objects
		
		System.out.println("*****Watch details*****");
		System.out.println( w1.watchId +" "+ w1.color +" "+ w1.brandName +" "+ w1.watchType +" "+ w1.price);
	
		
		Watch w2 = new Watch("LC07206", "Black" ,  "leather Watch", "CAT", 5256);
		//instance variables cannot be shared among multiple Objects
		
		System.out.println("*****Watch details*****");
		System.out.println( w2.watchId +" "+ w2.color +" "+ w2.brandName +" "+ w2.watchType +" "+ w2.price);
	
	}

}
