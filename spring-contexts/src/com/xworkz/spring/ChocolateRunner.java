package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChocolateRunner {
	
public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Chocolate ref = spring.getBean(Chocolate.class);
		System.out.println(ref);
				
	}

}
