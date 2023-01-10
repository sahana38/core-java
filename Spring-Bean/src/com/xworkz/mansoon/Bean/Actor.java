package com.xworkz.mansoon.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//constructor
@Component
public class Actor {
	
	private String name;
	private String language;
	
	public Actor(@Value("Puneeth")String name, @Value("kannada")String language) {
		
		this.name = name;
		this.language = language;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public String getName() {
		return name;
	}
	
	

	
	
	
	

}
