package com.xworkz.spring.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.FuelConfiguration;
import com.xworkz.spring.dto.Diesel;
import com.xworkz.spring.dto.Shell;

public class BunkRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext container = new AnnotationConfigApplicationContext(FuelConfiguration.class);
		container.getBean(Diesel.class);
		
		Shell shell =container.getBean(Shell.class);
		shell.purchase();
		
		
	}

}
