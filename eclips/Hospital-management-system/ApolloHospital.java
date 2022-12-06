package com.xworkz.hospitalapp.Hospital.Patient;


import com.xworkz.hospitalapp.Hospital.Hospital;
import com.xworkz.hospitalapp.Hospital.Patient.constant.Gender; 

public class ApolloHospital extends Hospital {
		
		//One to Many relationship
		public Patient[] patients;
		int index;
		
		public ApolloHospital(int size) {
			patients = new Patient[size];	
		}
		
		public boolean addPatient(Patient patient) {
			System.out.println("inside addPatient method");
			boolean isPatientAdded = false;
			if(patients != null) {
				System.out.println("Patient's details are right");
				
				patients[index++]= patient; ///or patients[index] = patient;
				isPatientAdded = true;
				///index++
			}
			
			return isPatientAdded;
			
		}
		public void getAllPatients() {
			System.out.println("List of patients are:");
			for(int i =0; i< patients.length; i++) {
				System.out.println(patients[i].getPatientName()+" "+ patients[i].getAddress()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
			}
	}
		
		public void getPatientByName(String patientName) {
			System.out.println("Inside getPatientByName");
			System.out.println(" No of parameters: 1 : patientName(String)");
			for(int i=0; i<patients.length; i++) {
				
				if(patients[i].getPatientName().equals(patientName)) {
					System.out.println(patients[i].getPatientName()+" "+ patients[i].getAddress()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
			}
				else {
					System.out.println("No Patient found ");
				}
		}
		}
			
		public void getPatientsByAge(int age) {
			System.out.println("Inside getPatientsByAge");
			System.out.println("No of parameters: 1 : patientAge(int)");
			for(int i=0; i<patients.length; i++) {
				
				if(patients[i].getAge()==age){
					
					System.out.println(patients[i].getPatientName()+" "+ patients[i].getAddress()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
				 }
					else {
						System.out.println("No Patient found");
					}
			    }
			}
		
		public void getPatientsByGender(Gender gender) {
			System.out.println("Inside getPatientsGender");
			System.out.println("No of parameters: 1 : patients(Gender)");
			for(int i=0 ; i<patients.length; i++ ) {
				
				if(patients[i].getGender().equals(gender)) {
					System.out.println(patients[i].getPatientName()+" "+ patients[i].getAddress()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
				 }
					else {
						System.out.println("No Patient found");
					}
				}
			}
		
		public void getPatientByAddress(String address) {
			System.out.println("Inside getPatientsAddress");
			System.out.println("No of parameters: 1 : patients(Address)");
			for(int i=0; i<patients.length; i++) {
				
				if(patients[i].getAddress().equals(address)) {
					System.out.println(patients[i].getPatientName()+" "+ patients[i].getAddress()+" "+ patients[i].getAge()+" "+ patients[i].getGender());
				 }
					else {
						System.out.println("No Patient found");
					}
				}
			}
		
		public void getPatientNAmeByGender(Gender gender) {
			System.out.println("Inside getPatientNameByGender");
			System.out.println("No of parameters: 1 : patientName(Gender)");
			for(int i=0; i<patients.length; i++) {
				
				if(patients[i].getGender().equals(gender)) {
					System.out.println(patients[i].getPatientName());
					
				}
			}
		}
		
		public void getGenderByPatientName(String patientName) {
			System.out.println("Inside getGenderByPatientName");
			System.out.println("No of parameters: 1 : gender(patientName)");
            for(int i=0; i<patients.length; i++) {
				
				if(patients[i].getGender().equals(patientName)) {
					System.out.println(patients[i].getGender());
					
				}
			}
		}
		}
		
		
//getPatientsByAge(int age)
//getPatientsByGender(Gender gender)
//getPatientByAddress(String address)
//getPatientNAmeByGender(Gender)
//getGenderByPatientName(String)
