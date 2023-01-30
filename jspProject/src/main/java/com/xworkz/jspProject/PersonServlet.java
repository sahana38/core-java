package com.xworkz.jspProject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Dispatch;

//import org.eclipse.jdt.internal.compiler.util.Util.Displayable;

@WebServlet(loadOnStartup = 1, urlPatterns = "/details")
public class PersonServlet extends HttpServlet{
	
	public PersonServlet() {
		System.out.println("Created" +this.getClass().getSimpleName());
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Running dopost in PersonServlet");
		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
	    String gender = req.getParameter("gender");
	    String reason =req.getParameter("reason");
	    String address = req.getParameter("address");
	    
	    System.out.println("firstName" +firstName);
	    System.out.println("lastName" +lastName);
	    System.out.println("gender" +gender);
	    System.out.println("reason" +reason);
	    System.out.println("address" +address);
	    
	  
		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
	    	req.setAttribute("firstName" , firstName);
	    	req.setAttribute("lastName", lastName);
	    	req.setAttribute("gender" , gender);
	    	req.setAttribute("reason", reason);
	    	req.setAttribute("address" , address);
	    
	    String temp = "Person Servlet";
	    System.out.println("Displaying in jsp..." +temp);
	    req.setAttribute("display" , temp);
	    dispatcher.forward(req, res);
	    
	}
	}

