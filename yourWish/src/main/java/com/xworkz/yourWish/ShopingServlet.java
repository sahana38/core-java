package com.xworkz.yourWish;
	
	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet(loadOnStartup = 1, urlPatterns = "/shop")
	public class ShopingServlet extends HttpServlet {
		
		public ShopingServlet() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running doGet method in ElectricalAppliancesServlet...");
			
			String name = req.getParameter("name");
			String brand = req.getParameter("brand");
			String price = req.getParameter("price");
			String color = req.getParameter("color");
			String type = req.getParameter("type");
			String pattern = req.getParameter("pattern");
			String size = req.getParameter("size");
			String discount = req.getParameter("discount");
			String totalPrice = req.getParameter("totalPrice");
			String discountAmount = req.getParameter("discountAmount");
			String deliveryCharge = req.getParameter("deliveryCharge");
			String shoppingAppName = req.getParameter("shoppingAppName");
			String customerName = req.getParameter("customerName");
			String location = req.getParameter("location");
			String state = req.getParameter("state");
			String city = req.getParameter("city");
			String Area = req.getParameter("Area");
			String Address = req.getParameter("Address");
			String HouseNo = req.getParameter("HouseNo");
			String shippingStatus = req.getParameter("shippingStatus");
			String shipping = req.getParameter("shipping");
			
			System.out.println(name);
			System.out.println(brand);
			System.out.println(price);
			System.out.println(color);
			System.out.println(type);
			System.out.println(pattern);
			System.out.println(size);
			System.out.println(discount);
			System.out.println(totalPrice);
			System.out.println(discountAmount);
			System.out.println(deliveryCharge);
			System.out.println(shoppingAppName);
			System.out.println(customerName);
			System.out.println(location);
			System.out.println(state);
			System.out.println(city);
			System.out.println(Area);
			System.out.println(Address);
			System.out.println(HouseNo);
			System.out.println(shippingStatus);
			System.out.println(shipping);
			
			PrintWriter writer = resp.getWriter();
			writer.print("<html>");
			writer.print("<body>");
			writer.print("<h1>");
			writer.print("<span style = 'color : green';>");
			writer.print("Shopping details sent successfullly.........");
			writer.print("</span>");
			writer.print("</h1>");
			writer.print("</body>");
			writer.print("</html>");
			
		}
		
		


}
