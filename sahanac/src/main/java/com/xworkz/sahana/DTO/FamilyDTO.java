package com.xworkz.sahana.DTO;

import lombok.Data;

@Data
public class FamilyDTO {
	
	private String familyName;
	private int familyMembers;
	private String nativePlace;
	private String grandFather;
	private String grandMother;
	private String fatherName;
	private String motherName;
	private String brotherName;
	private String area;
	private String nativePlaceDist;
	private String nativePlaceTq;
	
	public FamilyDTO() {
		System.out.println("Created" +this.getClass().getSimpleName());
	}

}



