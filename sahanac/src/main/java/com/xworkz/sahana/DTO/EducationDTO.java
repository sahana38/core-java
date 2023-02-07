package com.xworkz.sahana.DTO;

import lombok.Data;

@Data
	public class EducationDTO {
		
			private String name;
			private String location;
			private String dist;
			private String tq;
			private String school;
			private String passingYear;
			private String Pu;
			private String puPassingYear;
			private String graduation;
			private String gPassingYear;
			private String cgpa;
			
			public EducationDTO() {
				System.out.println("Created" +this.getClass().getSimpleName());
			}

		}


