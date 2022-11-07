package com.xworkz.medicalapp;

import com.xworkz.medicalapp.MedicalShop.MedicalShop;

public class MedicalShopTester {
	
	public static void main(String[] n) {
		
		String staffNames[] = new String[3];
	    staffNames[0] = "Narang";
	    staffNames[1] = "sarang";
	    staffNames[2] = "Bajarang";
	    
	    
	    long staffContactNo[] = new long[3];
	    staffContactNo[0] = 2345678888L;
	    staffContactNo[1] = 9764356889L;
	    staffContactNo[2] = 9876543217L;
	    
	    String medicineNames[] = new String[5];
	    medicineNames[0] = "Dolo";
	    medicineNames[1] = "Oravit";
	    medicineNames[2] = "parasitamol";
	    medicineNames[3] = "scenarist";
	    medicineNames[4] = "B-complex";
	    
	    String cosmetics[] = new String[4];
	    cosmetics[0] = "Himalya face wash";
	    cosmetics[1] = "cold cream";
	    cosmetics[2] = "Acne soap";
	    cosmetics[3] = "Serum";
	    
	    int noOfSections = 5 ;
	    
	    String billingMethod[]= new String[4];
	    billingMethod[0] ="Phone pay";
	    billingMethod[1] = "Google pay";
	    billingMethod[2] = "hard cash";
	    billingMethod[3] = "debit card";
	    
	    
	    
		
		
		MedicalShop med = new MedicalShop("AAERT4567899087","Vijayanagar","Maruti Medical",staffNames,staffContactNo,medicineNames,cosmetics,noOfSections,billingMethod);
		/*
		med.gstNo = "AAERT4567899087";
		med.address =  "Vijayanagar";
		med.name = "Maruti Medical"; 
		
		
	    med.staffNames = new String[3];
	    med.staffNames[0] = "Narang";
	    med.staffNames[1] = "sarang";
	    med.staffNames[2] = "Bajarang";
	    
	    med.staffContactNo = new long[3];
	    med.staffContactNo[0] = 2345678888L;
	    med.staffContactNo[1] = 9764356889L;
	    med.staffContactNo[2] = 9876543217L; 
	    
	    
	    med.medicineNames = new String[5];
	    med.medicineNames[0] = "Dolo";
	    med.medicineNames[1] = "Oravit";
	    med.medicineNames[2] = "parasitamol";
	    med.medicineNames[3] = "scenarist";
	    med.medicineNames[4] = "B-complex";
	    
	     
	    med.cosmetics = new String[4];
	    med.cosmetics[0] = "Himalaya face wash";
	    med.cosmetics[1] = "cold cream";
	    med.cosmetics[2] = "Acne soap";
	    med.cosmetics[3] = "Serum";
	    
	    med.noOfSections = 5 ;
	    
	    med.billingMethod = new String[4];
	    med.billingMethod[0] ="Phone pay";
	    med.billingMethod[1] = "Google pay";
	    med.billingMethod[2] = "hard cash";
	    med.billingMethod[3] = "debit card";
	    */
	    
	    med.displayInfo();
	    	
	}

}
