package com.xworkz.overloading;

import com.xworkz.overloading.conceptoverloading.Market;

public class MarketTester {
	
	
		
		public static void main(String[] args) {
			String vegetables[] = {"Onion","Potato","Ladies finger","Tomato","Brinjal"};
			//Market veg = new  Market(rajajinagar, 100, 1, vegetables);
		
			Market veg = new Market(vegetables);
			System.out.println(veg.price+ " "+ veg.location);
			
			}
		}



