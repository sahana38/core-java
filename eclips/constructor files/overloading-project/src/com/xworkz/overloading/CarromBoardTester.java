package com.xworkz.overloading;

import com.xworkz.overloading.conceptoverloading.CarromBoard;

public class CarromBoardTester {
	
	public static void main(String[] args) {
		String brandNames[] = {"SYNCO","PRECISE","STAG","VINEX","SUZUKI"};
		//CarromBoard carrom = new  carrom(2345, 1000, 19, brandNames);
	
		CarromBoard carrom = new CarromBoard(brandNames);
		System.out.println(carrom.price+ " "+ carrom.coins);
		
	}
}