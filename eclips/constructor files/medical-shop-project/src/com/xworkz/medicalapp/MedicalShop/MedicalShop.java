package com.xworkz.medicalapp.MedicalShop;

public class MedicalShop {
	
	public String gstNo;
	public String address;
	public String name;
	public String staffNames[];
	public long staffContactNo[];
	public String medicineNames[];
	public String cosmetics[];
	public int noOfSections;
	public String billingMethod[];
	
	public MedicalShop(String gstNo,String address, String name, String staffNames[], long staffContactNo[],String medicineNames[],String cosmetics[],int noOfSections, String billingMethod[]) {
		System.out.println("Medical shop object is created");
			  this.gstNo = gstNo;
			  this.address=address;
			  this.name=name;
			  this.staffNames=staffNames;
			  this.staffContactNo= staffContactNo;
			  this.medicineNames= medicineNames;
			  this.cosmetics=cosmetics;
			  this.noOfSections = noOfSections;
			  this.billingMethod = billingMethod;
			  
			  
	}
	
	public void displayInfo() {
		System.out.println("Medical Shop name is: " +name);
		System.out.println("============================");
		System.out.println("Medical Shop gstNo is: " +gstNo);
		System.out.println("=============================");
		System.out.println("Number of Sections are: " +noOfSections);
		System.out.println("=============================");
		System.out.println("Medical staff Info");
		for(int i = 0;i<staffNames.length; i++) {
			System.out.println(staffNames[i]);
		}
		
		System.out.println("=============================");
		System.out.println("Medical staff Contact number ");
		
		for(int i =0; i<staffContactNo.length; i++) {
			System.out.println(staffContactNo[i]);
		}
		
		System.out.println("===============================");
		System.out.println(" Names of the Medicines");
		for(int i= 0; i< medicineNames.length; i++) {
			System.out.println(medicineNames[i]);
		}
		
		System.out.println("===============================");
		System.out.println("cosmetics in the Medical shop");
		for(int i=0; i<cosmetics.length; i++) {
			System.out.println(cosmetics[i]);
			
		}
		
		System.out.println("===============================");
		System.out.println("Billing Method");
		for(int i=0; i<billingMethod.length; i++) {
			System.out.println(billingMethod[i]);
			
		}
	}
	

}
