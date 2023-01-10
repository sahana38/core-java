package com.xworkz.mansoon.Bean;

import org.springframework.beans.factory.annotation.Value;

public class Puff {
	
	private String name;
	private String type;
	
	public Puff(@Value("vegPuff")String name, @Value("Paneer Puff") String type) {
		this.name = name;
		this.type = type;
	}
	
	

}
