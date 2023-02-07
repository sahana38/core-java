<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous">
</script>
</head>

<body>
	<nav class="navbar navbar-light bg dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align-text-top"></a>
			
		</div>
	</nav>
	
	<form method = "get" action ="Email">
	<h6>Display String: ${Email}</h6>
	<input type="submit" value="Email"/></form>
	
	<form method="get" action="mobile">
	<h6>Display Mobile no. : ${mobiles}</h6>
	<input type="submit" value="Mno"></form>
	
	<form method ="get" action ="adhar">
	<h6>Display adhar no. : ${adhar}</h6>
	<input type="submit" value="adhar"></form>
	
	<form method="get" action="age">
	<h6>Display age : ${age}</h6>
	<input type="submit" value="age"></form>
	
	<form method="get" action="salary">
	<h6>Display salary : ${salary}</h6>
	<input type="submit" value="salary"></form>
	
	<form method="get" action="bestFriends">
	<h6>Display frnd : ${frnd}</h6>
	<h6>Display frnd : ${frnds}</h6>
	<input type="submit" value="frnds"></form>
	
	<form method="get" action="VisitedPlaces">
	<h6>Display city : ${city}</h6>
	<input type="submit" value="city"></form>
	
	<form method="get" action="skill">
	<h6>Display skills : ${skill }</h6>
	<input type ="submit" value="skill"></form>
	
	<form action="dto">
	<h6>Display Education : ${dto }</h6>
	<input type ="submit" value="dto"></br>
	<label>name : ${data.getName() }</label></br>
	<label>Location : ${data.getLocation() }</label></br>
	<label>District : ${data.getDist() }</label></br>
	<label>Tq : ${data.getTq() }</label></br>
	<label>School : ${data.getSchool() }</label></br>
	<label>Passing Year : ${data.getPassingYear() }</label></br>
	<label>PucCollege : ${data.getPu() }</label></br>
	<label>PucPassingYear : ${data.getPuPassingYear() }</label></br>
	<label>Graduated In : ${data.getGraduation() }</label></br>
	<label>GPassing year : ${data.getGPassingYear() }</label>
	<label>CGPA : ${data.getCgpa() }</label></br>
	</form>
	
	<form action="family">
	<h6>Display Family : ${fam}</h6>
	<input type ="submit" value="family"></label></br>
	<label>FamilyName : ${fdata.getFamilyName() }</label></br>
	<label>NativePlace : ${fdata.getNativePlace() }</label></br>
	<label>NativePlaceDist : ${fdata.getNativePlaceDist() }</label></br>
	<label>NativePlaceTq : ${fdata.getNativePlaceTq() }</label></br>
	<label>GrandFather : ${fdata.getGrandFather() }</label></br>
	<label>GrandMother : ${fdata.getGrandMother() }</label></br>
	<label>MotherName : ${fdata.getMotherName() }</label></br>
	<label>FatherName : ${fdata.getFatherName() }</label></br>
	<label>BrotherName : ${fdata.getBrotherName() }</label></br>
	<label>Area : ${fdata.getArea() }</label></br>
	</form>
	
	<form method="get" action="mobilePhone">
	<h6>Display mobile : ${mob}</h6>
	<input type ="submit" value="mobilePhone"></label></br>
	<label>Name :${cell.getMobileName() }</label></br>
	<label>Color :${cell.getColor() }</label></br>
	<label>Type : ${cell.getType() }</label></br>
	<label>Price : ${cell.getPrice() }</label></br>
	<label>Storage : ${cell.getStorage() }</label></br>
	</form>
	
	<form method="get" action="beverage">
	<h6>Display beverage : ${Stall }</h6>
	<input type="submit" value="Stall"></label>
	</form>
	
	<form method="get" action="chats">
	<h6>Display beverage : ${snacks }</h6>
	<input type="submit" value="snacks"></label>
	</form>
	
	
</body>
</html>