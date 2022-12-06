package com.xworkz.hospitalapp.Hospital.Patient;
import com.xworkz.hospitalapp.Hospital.Patient.constant.Gender;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Patient {

	private String patientName;
	private String address;
	private Gender gender;
	private int age;
	
	public Patient(String patientName, String address,Gender gender, int age) {
		this.patientName = patientName;
		this.address=address;
		this.gender = gender;
		this.age = age;
	}
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public void displayInfo() {
		System.out.println("Patient Name is: " +patientName);
		System.out.println("Patient address is: " +address);
		System.out.println("Patient gender is: " +gender);
		System.out.println("Patient age is: " +age);
	}
	
}
