package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FishRunner {
	
public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Fish ref = spring.getBean(Fish.class);
		System.out.println(ref);
				
	}

}
