<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JP Morgan Chase</title>
</head>
<body>
	<!--  <h1>JP Morgan Chase</h1>-->
	
	

	
	<form action="j_security_check" method="post">
	
	User Name: <input type="text" name="j_username"><br>
	
	Password: <input type="password" name="j_password"><br>
	
	<button type="submit">Login</button>
	
	<button type="reset">Reset</button><br>
	
	<p color="red">${message}</p>
	
	</form>
	
</body>
</html>