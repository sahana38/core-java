package com.xworkz.medicalapp;

public class MilkParlour {
	
	public String name;
	public String gstNo;
	public String address;
	public String milkProducts[];
	public String brandName[];
	public String billingMethod[];
	
	public MilkParlour(String name, String gstNo, String address, String milkProducts[],String brandName[],String billingMethod[]) {
		this.name = name;
		this.gstNo= gstNo;
		this.address = address;
		this.milkProducts = milkProducts;
		this.brandName = brandName;
		this.billingMethod = billingMethod;
		
	}
	
	public MilkParlour() {
		System.out.println("Contructor created");
	}
	
	public void displayInfo() {
		System.out.println("Name of milkParlour: " +name);
		System.out.println("============================");
		System.out.println("Shop gstNo is: " +gstNo);
		System.out.println("=============================");
		System.out.println("Address is : " +address);
		System.out.println("=============================");
		
		System.out.println("milk products Menu");
		for(int i = 0;i<milkProducts.length; i++) {
			System.out.println(milkProducts[i]);
		}
		
		System.out.println("=============================");
		System.out.println( "BrandNames available at Parlour");
		
		for(int i =0; i<brandName.length; i++) {
			System.out.println(brandName[i]);
		}
		
		System.out.println("===============================");
		System.out.println("Billing Method");
		for(int i=0; i<billingMethod.length; i++) {
			System.out.println(billingMethod[i]);
			
		}
	}
	
}
	


