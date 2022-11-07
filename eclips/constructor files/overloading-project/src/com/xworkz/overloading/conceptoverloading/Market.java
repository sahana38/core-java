package com.xworkz.overloading.conceptoverloading;

public class Market {
		
		//instance variables / states / properties / fields
		
		public String location;
		public int price;
		public int weight;
		public String vegetables[]=new String[5];
		
		public  Market() {
			System.out.println("Default Constructor is called");
		}
		
		//Default Constructor
		public   Market(String vegetables[]) {
			this("Rajajinagar", 50 , 1, vegetables);
			System.out.println("One Parameterized constructor is called");
			}
		
		//parameterized Constructor
		public Market(String location, int price, int weight, String[] vegetables) 
		{
			this();
			System.out.println("Calling 4 parameterized constructor");
			this.location = location;
			this.price = price;
			this.weight = weight;
			this.vegetables = vegetables;
			
		}
		
		public void provideFuels() {
			
		}
		
		public void displayDetails() {
			System.out.println("displayDetails() is invoked");
			System.out.println(this.location + " "+ this.price + " "+ this.weight );
			System.out.println("list if workers for" +this.location);
			for(int i= 0; i<vegetables.length; i++) {
				System.out.println(vegetables[i]);
			}
			
		}
	}	


