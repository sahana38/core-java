package com.xworkz.sahanaXworkz.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GroceryInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

public GroceryInit() {
	System.out.println("Created" +this.getClass().getSimpleName());
}

@Override
protected Class<?>[] getRootConfigClasses() {
	// TODO Auto-generated method stub
	System.out.println("getRootConfigClasses");
	return null;
}

@Override
protected Class<?>[] getServletConfigClasses() {
	// TODO Auto-generated method stub
	System.out.println("getServletConfigClasses");
	return new Class[] {GroceryConfiguration.class};
}

@Override
protected String[] getServletMappings() {
	// TODO Auto-generated method stub
	System.out.println("getServletMappings");
	return new String[] {"/"};
}

@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
}
}
