package com.xworkz.mansoon.Bean;

import org.springframework.beans.factory.annotation.Value;

public class Bun {
	
	private  double price;
	private String bakeryName;
	
	public Bun() {
		
	}
	
	@Value("Vishala")
	public void setBakeryName(String setBakeryName) {
		this.bakeryName = setBakeryName;
	}
	
	@Value("10")
	public void setPrice(double setPrice) {
		this.price = setPrice;
	}


}
