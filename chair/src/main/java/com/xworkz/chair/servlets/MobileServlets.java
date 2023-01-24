package com.xworkz.chair.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	
	@WebServlet(loadOnStartup = 1 , urlPatterns ="/Mob")
	public class MobileServlets extends HttpServlet {
		
		public void LaptopServelets() 
		{
			System.out.println("mobile"+getClass().getSimpleName());	
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
			System.out.println("running servlet of mobile");
		}
		


}
