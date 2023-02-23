package com.xworkz.aeroplane.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class AeroplaneConfiguration   {

	
	public AeroplaneConfiguration() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Creating the configuration");
	}

	@Bean
	public ViewResolver viewResolver()
	{
		System.out.println("Registering ViewResolver");
		return new InternalResourceViewResolver("/",".jsp");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		System.out.println("rigistered the containerEntityManagerFactoryBean");
        return new LocalContainerEntityManagerFactoryBean();
	}
}