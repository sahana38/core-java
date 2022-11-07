package com.xworkz.hospitalapp.hospital;

public class Hospital {
	//Datatype variable[] = {value};
	
	
	//Datatype variableNames[]= new Datatype[size];
	String patientNames[] = new String[6];
	int index;
	
	public Hospital() {
		System.out.println("Hospital object created");
	}
	
	     public void savePatientNames(String patientName) {
	    	 System.out.println("Inside savePatientNames");
	    	 
	    	 
	    	    if(patientName != null && patientNames.length > index) { 
	    		   //patientNames[0] = "";
	    		   patientNames[index++] = patientName;
	    		   return;
	    	    }
	    		
	    	    else {
	    	    	System.out.println("Patient Names is full...Bed illa");
	    	    }
	  	   
	    	   System.out.println("End of savePatientNames");
	    	   return ;
	
	}
	     
	     
	     
	     public void getPatientNames() {
	    	 for (int i=0; i< patientNames.length; i++) {
	    		 System.out.println(patientNames[i] + " ");
	    	 }
	     }
	     
	     
	     
	     
	     public boolean updatePatientNames(String oldPatientName , String newPatientName) {
	    	 System.out.println("inside update");
	    	 for(int i=0; i < patientNames.length; i++) {
	    		 //Ganesh == Guna
	    		 if(patientNames[i] == oldPatientName) {
	    			 
	    			 patientNames[i] = newPatientName ;
	    			 return true;
	    		 }
	    	 }
	    	 
	    	 return false;
	     }
 }
