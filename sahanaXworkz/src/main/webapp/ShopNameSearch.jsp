<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a><ul>
				<li style="display: inline-block;padding: 20px;">
					<a href="index.jsp" class="col-lg-2 col-sm-2">Home Page</a>
					<li style="display: inline-block;">
					<a href="Grocery.jsp" class="col-lg-2 col-sm-2">Register</a>
				</ul>
			</div>
	</nav>
	<h1>Welcome to Search page</h1>
	<h3><span style="color:red">${message}</span></h3>
	<form action="searcbyshopname" method="get">
	Search By ShopName<input type="text" name="shopName"/>
	<input type="submit" value="search"/>
	</form>
	<div>
	
	<style>
	table, th, td{
	border: 2px double black;
	border-collapse: collapse;
	color: blue;
	}
	
	
	</style>
	
  <table>
	<tr>
	    <th> ID </th>
	    <th> Name </th>
	    <th> ShopName </th>
	    <th> Units </th>
	    <th> Type  </th>
	    <th> Price  </th>
	    <th> Area  </th>
	</tr>
	  <c:forEach items="${list}" var="t">
	   <tr>
	    <td>${t.id}</td>
	    <td>${t.name}</td>
	    <td>${t.shopName}</td>
	    <td>${t.units}</td>
	    <td>${t.type}</td>
	    <td>${t.price}</td>
	    <td>${t.area}</td>
	 </tr>
	 
	 </c:forEach>
	 
	 </table>
	 </div>	
</body>
</html>