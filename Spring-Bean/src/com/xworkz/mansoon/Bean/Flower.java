package com.xworkz.mansoon.Bean;

import org.springframework.beans.factory.annotation.Value;

public class Flower {
	
	
	@Value("Rose")
	private String name;
	@Value("pink")
	private String color;
	@Value("15")
	private double price;
	
	public Flower() {
		
	}
	public String getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}

}
