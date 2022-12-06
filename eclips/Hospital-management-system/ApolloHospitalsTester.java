package com.xworkz.hospitalapp.Hospital.Patient;

import java.util.Scanner;

import com.xworkz.hospitalapp.Hospital.Patient.constant.Gender;

public class ApolloHospitalsTester {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		
		ApolloHospital apolloHospitals = new ApolloHospital(size);
		
		/*Patient patient = new Patient();
		patient.address = "Rajajinagar";//sc.next;
		patient.patientName = "Sneha";
		patient.age = 22;
		patient.gender = Gender.female;
		
		Patient patient1 = new Patient();
		patient1.address = "Gayatrinagar";
		patient1.age = 23;
		patient1.gender =Gender.female;
		patient1.patientName = "Muskan";
		
		Patient patient2 = new Patient();
		patient2.address = "JP nagar";
		patient2.patientName = "anu";
		patient2.age = 24;
		patient2.gender = Gender.female;
		
		apollo.addPatient(patient);
		apollo.addPatient(patient1);
		apollo.addPatient(patient2);
		
		apollo.getAllPatients();*/
		for (int i= 0; i<size; i++) {
		Patient patient = new Patient();
		System.out.println("Enter the patient name");
		patient.setPatientName(scanner.next());
		System.out.println("Enter the patient age");
		patient.setAge(scanner.nextInt());
		
		System.out.println("Enter the patient gender");
		patient.setGender(Gender.valueOf(scanner.next()));
		
		System.out.println("Enter the patient Address");
		patient.setAddress(scanner.next());
		
		apolloHospitals.addPatient(patient);
		}
		//apolloHospitals.getAllPatients();
		
	
	System.out.println("Enter the patient name");
	String patientName = scanner.next();
	apolloHospitals.getPatientByName(patientName);
	
	System.out.println("Enter the patient age");
	int age = scanner.nextInt();
	apolloHospitals.getPatientsByAge(age);
	
	System.out.println("Enter the patient Gender");
	apolloHospitals.getPatientsByGender(Gender.valueOf(scanner.next()));
	
	System.out.println("Enter the patient Address");
	String address = scanner.next();
	apolloHospitals.getPatientByAddress(address);
	
	System.out.println("Enter the patientName by Gender");
	apolloHospitals.getPatientsByGender(Gender.valueOf(scanner.next()));
	
	System.out.println("Enter the patient name");
	String patientName1 = scanner.next();
	apolloHospitals.getPatientByName(patientName1);
}
}


