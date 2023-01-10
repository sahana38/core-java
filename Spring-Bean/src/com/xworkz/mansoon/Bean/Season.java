package com.xworkz.mansoon.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//apply getter and setter 
@Component
public class Season {
	
	
	private String name;
	
	private int duration;
	
	private String startingMonth;
	
	public Season() {
		System.out.println("created season by spring....");
	}
	
	public String getName() {
		return name;
	}
	
	@Value("Winter")
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDuration() {
		return duration;
	}
	@Value("4")
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String getStartingMonth() {
		return startingMonth;
	}
	@Value("Oct")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
}
