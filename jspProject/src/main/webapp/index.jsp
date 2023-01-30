<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>

<h1>Sending message...</h1>
<form action ="details" method="post">
<pre> 
firstName<input type="text" name="firstName"/>
lastName <input type="text" name="lastName"/>
Gender<input type="radio" name="gender"/>Male
       <input type="radio" name="gender"/>Female
       <input type="radio" name="gender"/>Others
Reason<br><textarea rows="6" cols="15" name="reason"></textarea>
     
Address	<input type="text" name="address"/>
<br/>
<input type="submit" value="send"/>
</pre></form>
</body>
</html>



