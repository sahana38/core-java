package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalTester {
	
	public static void main(String[] h) {
		
		Hospital hospital = new Hospital();
		hospital.savePatientNames("Ganesh");
		hospital.savePatientNames("vishala");
		hospital.savePatientNames("swati");
		hospital.savePatientNames("Guna");
		hospital.savePatientNames("anu");
		hospital.savePatientNames("sneha");
		hospital.savePatientNames("mahananda");
		
		hospital.getPatientNames();
		
		hospital.updatePatientNames("Guna",  "Guna sarkar");
		
		
		
	}

}
