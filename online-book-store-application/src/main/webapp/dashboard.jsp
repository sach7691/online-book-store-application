
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Dashboard</title>
</head>
<body>
	<%

  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); //prevent back button after logout HTTP 1.1
  //HTTP 1.0 and if you use proxy seperatly should remove cache to prevent back button	
   response.setHeader("Pragma","no-cache"); //HTTP 1.0
   response.setDateHeader ("Expires", 0);
  if(session.getAttribute("email")==null){
	response.sendRedirect("login.jsp");
}
%>			
<style>			


body 
{
  margin: 0;
  background: rgba(0, 128, 0, 0.3);
  
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
<form action="http://localhost:8080/online-book-store-application/LogoutCustomerServlet" method="GET">
<div>
<ul class="topnav">
  <li><a class="active" href="">View Order History</a></li>
  <li><a href="">View Personal Account Details</a></li>
  <li><a href="">Modify Account Details</a></li>
  <li><a href="">Purchase Book</a></li>
  <li class="right"><a>Welcome ${email} </a></li>
  <li class="right"><a href="login.jsp">Logout</a></li> 
</ul>	
</div>				
</form>		
					
</body>
</html>