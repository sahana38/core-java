package com.xworkz.medicalapp;

public class IceCreamParlour {
	
	public String name;
	public String gstNo;
	public String address;
	public String brands[];
	public String flavours[];
	public String type[];
	public String billingMethod[];
	
	
	public IceCreamParlour(String name, String gstNo, String address,String brands[],String flavours[],String type[],String billingMethod[]) {
		 
		this.name= name;
		this.gstNo= gstNo;
		this.address = address;
		this.brands = brands;
		this.flavours = flavours;
		this.type = type;
		this.billingMethod = billingMethod;
	}
	
	public IceCreamParlour() {
		System.out.println("Constructor created");
	}
		
		public void displayInfo() {
			System.out.println("Name of IceCreamParlour: " +name);
			System.out.println("============================");
			System.out.println("Shop gstNo is: " +gstNo);
			System.out.println("=============================");
			System.out.println("Address is : " +address);
			System.out.println("=============================");
			
			
			
			System.out.println("=============================");
			System.out.println( "Brands available at Parlour");
			
			for(int i =0; i<brands.length; i++) {
				System.out.println(brands[i]);
			}
			
			System.out.println("=============================");
			System.out.println("Flavours");
			for(int i = 0;i<flavours.length; i++) {
				System.out.println(flavours[i]);
			}
			
			System.out.println("=============================");
			System.out.println("type of Ice cream");
			for(int i = 0;i<type.length; i++) {
				System.out.println(type[i]);
			}
			
			System.out.println("===============================");
			System.out.println("Billing Method");
			for(int i=0; i<billingMethod.length; i++) {
				System.out.println(billingMethod[i]);
				
			}
	}

}
