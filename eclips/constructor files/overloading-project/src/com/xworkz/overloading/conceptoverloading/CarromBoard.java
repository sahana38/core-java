package com.xworkz.overloading.conceptoverloading;

public class CarromBoard {
	
	
	public int id;
	public int price;
	public int coins;
	public String brandNames[]=new String[5];
	
	public  CarromBoard() {
		System.out.println("Default Constructor is called");
	}
	
	//Default Constructor
	public   CarromBoard(String brandNames[]) {
		this(6589, 900 , 19,brandNames );
		System.out.println("One Parameterized constructor is called");
		}
	
	//parameterized Constructor
	public CarromBoard(int id, int price, int coins, String[] brandNames) 
	{
		this();
		System.out.println("Calling 4 parameterized constructor");
		this.id = id;
		this.price = price;
		this.coins = coins;
		this.brandNames= brandNames;
		
	}
	
	public void coins() {
		
	}
	
	public void displayDetails() {
		System.out.println("displayDetails() is invoked");
		System.out.println(this.id + " "+ this.price + " "+ this.coins );
		System.out.println("list if workers for" +this.brandNames);
		for(int i= 0; i<brandNames.length; i++) {
			System.out.println(brandNames[i]);
		}
	
	}

}
