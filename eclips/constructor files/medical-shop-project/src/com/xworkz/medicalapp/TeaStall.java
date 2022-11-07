package com.xworkz.medicalapp;

public class TeaStall {
	
	public String  name;
	public int teaStallId;
	public String ownerName;
	
	
	public TeaStall(String name, int teaStallId, String ownerName) {
		// wrt id, using this keyword
		
		this.name = name;
		this.teaStallId = teaStallId;
		this.ownerName = ownerName;
		
		//invoking a displayInfo in a constructor ue=sing this keyword
		this.displayInfo();
	}
	
	public TeaStall() {
		 //Auto-generated constructor stub
	}
	
	public void displayInfo() {
		
		//invoking variables of a current class using this keyword
		System.out.println(this.name+ " "+ this.teaStallId + " "+ this.ownerName);
		
	}
	
	
}
