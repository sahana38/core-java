package com.xworkz.overloading;

import com.xworkz.overloading.conceptoverloading.PetrolBunk;

public class PetrolBunkTester {
	
	public static void main(String[] args) {
		String workersName[] = {"Sahana","Vishala","Swati","Sneha","anu","muskan","Mahanamda"};
		//PetrolBunk bunk = new  PetrolBunk(123, "Devegouda Petrol Bunk", "Banshankarin 2nd Stage", workersName);
	
		PetrolBunk bunk2 = new PetrolBunk(workersName);
		System.out.println(bunk2.id+ " "+ bunk2.name);
		
		}
	}




