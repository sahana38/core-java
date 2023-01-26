package com.xworkz.tetra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1, urlPatterns="/freedom")
public class WebSeriesServlets extends HttpServlet {
	
	public WebSeriesServlets() {
		System.out.println("Created" +this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    System.out.println("running doGet in WebSeriesServlets......");
    System.out.println(Thread.currentThread().getName());
    String name = req.getParameter("name");
    String lang = req.getParameter("language");
    String episodes = req.getParameter("episodes");
    String ott = req.getParameter("ott");
    String budget = req.getParameter("budget");
    
    System.out.println(name);
    System.out.println(lang);
    System.out.println(episodes);
    System.out.println(ott);
    System.out.println(budget);
    
    PrintWriter writer = res.getWriter();
    writer.print("<html>");
    writer.print("<body>");
    writer.print("<h1>");
    writer.print("<span style = 'color:brown';>");
    writer.print("WebSeries information send successfully....");
    writer.print("</span>");
    writer.print("</h1>");
    writer.print("</body>");
    writer.print("</html>");
    res.setContentType("text/html");
    
	}

}
