package com.xworkz.sahana.DTO;

import lombok.Data;

@Data
public class MobileDTO {
	
	private String mobileName;
	private String type;
	private String color;
	private String storage;
	private double price;
	
	public MobileDTO() {
		System.out.println("created" +this.getClass().getSimpleName());
	}

}
