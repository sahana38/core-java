<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home
				Page</a>
		</div>
	</nav>
	<h1>Welcome to grocery page</h1>

	<c:forEach items="${errors}" var="e">
		<br>
		<span style="color: red;">${e.message}</span>
	</c:forEach>

	<form action="grocery" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" id="formFile" required="required"
				placeholder="Enter name" value="${name}" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">shopName</label> <input
				type="text" class="form-control" name="shopName" id="formFile" required="required"
				placeholder="Enter shop name" value="${shopName}" />
		</div>
		
		<div class="mb-3">
			<label for="formFile" class="form-label">units</label> <input
				type="text" class="form-control" name="units" id="formFile" required="required"
				placeholder="Enter units" value="${units}" />
		</div>
		
		<div class="mb-3">
			<label for="formFile" class="form-label">type</label> <input
				type="text" class="form-control" name="type" id="formFile" required="required"
				placeholder="Enter type" value="${type}" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">price</label> <input
				type="number" class="form-control" name="price" id="formFile" required="required"
				placeholder="Enter price" value="${price}" />
		</div>
		
		<div class="mb-3">
			<label for="formFile" class="form-label">area</label> <input
				type="text" class="form-control" name="area" id="formFile" required="required"
				placeholder="Enter area" value="${area}" />
		</div>
		<input type="submit" value="Save" class="btn btn-primary"/>
		</form>
</body>
</html>