package com.xworkz.hospitalapp.Hospital;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Manager {
	
	private String name;
	private Gender gender;
	private long contactNo;
	private int age;
	
	
	public void displayInfo() {
		System.out.println("Enter manager name");
		System.out.println("Enter manager id");
		System.out.println("Enter manager contact number");
		System.out.println("Enter manager address");
	}

}
