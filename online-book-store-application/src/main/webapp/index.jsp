<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style>
body {margin: 0;
 background: rgba(0, 128, 0, 0.3);}
 
 table {
	font-family : Arial, Helvetica, sans-serif;	
	font-size : 100%;
    font-weight: bold;
    background-color: light green
}
 h1 {
   color: #ea503f;
   font-family: Arial;
   text-align: center
 }
 table.center {
  margin-left: auto; 
  margin-right: auto;
}

ul.topnav {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

ul.topnav li {float: left;}

ul.topnav li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

ul.topnav li a:hover:not(.active) {background-color: #111;}

ul.topnav li a.active {background-color: #04AA6D;}

ul.topnav li.right {float: right;}

@media screen and (max-width: 600px) {
  ul.topnav li.right, 
  ul.topnav li {float: none;}
}
</style>
</head>
<body>

<ul class="topnav">
  <li><a class="active"><h2><b>Registration Form</b></h2></a></li>
  <li class="right"><a class ="active">Are you a Registered Customer?</a><a href="login.jsp">Click here to Login</a></li>
  <li class="right"><a href="welcome.jsp">Go Back to Welcome Page</a></li>
</ul>

	<form action="http://localhost:8080/online-book-store-application/CustomerRegistrationServlet" method="POST">
		<table class ="center" style ="margin-top:200px">
		<tr>
		<td><label for="firstName">First name:</label><br> </td>
		<td><input type="text" id="firstName" name="firstName" value="" ><br></td> 
		</tr>
		<tr>
		<td><label for="lastName">Last name:</label><br></td> 
		<td><input type="text" id="lastName" name="lastName" value=""><br></td>
		</tr>
		<tr>
		<td><label for="customerEmail">Email:</label><br> </td>
		<td><input type="text" id="customerEmail" name="customerEmail" placeholder="Enter a valid Email"><br></td> 
		</tr>
		<tr>
		<td><label for="customerpassword">Password:</label><br> </td>
		<td><input type="password" id="customerpassword" name="customerpassword" placeholder="Enter a valid Password"><br></td>
		</tr>
		<tr>
		<td><input type="submit" class="signupbtn" value="Sign up"></td>
		</tr>
		</table>
	</form>
	



</body>
</html>