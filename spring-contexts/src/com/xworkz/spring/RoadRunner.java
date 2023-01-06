package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RoadRunner {
	
	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(Roadconfiguration.class);
		Road ref = spring.getBean(Road.class);
		System.out.println(ref);
		
	}

}
