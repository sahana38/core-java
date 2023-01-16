package com.xworkz.spring.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.Fuel;
import com.xworkz.spring.PetrolBunk;

@Component
public class Shell implements PetrolBunk {
    @Autowired
    @Qualifier("avinash")
	private Fuel fuel;
	
	@Override
	public void purchase() {
		fuel.consume();
		
		System.out.println("Creating the petrol bunk properties");
		
	}

}
