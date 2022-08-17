<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<%
  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
  response.setHeader("Pragma","no-cache"); //HTTP 1.0
  response.setDateHeader ("Expires", 0);

%>
	<h1>Login Form</h1>
	<form
		action="http://localhost:8080/online-book-store-application/LoginCustomerServlet" method="POST">
		<label for="customerEmail">Customer Email:</label><br> <input
			type="text" id="customerEmail" name="customerEmail"><br>
		<label for="customerpassword">Customer Password:</label><br> <input
			type="password" id="customerpassword" name="customerpassword"><br>
		<br> <input type="submit" value="Login">
	</form>
	</br>
	<label>Are you a New User ? </label>
	<a href="index.jsp">Click Here to Register</a>

</body>
</html>