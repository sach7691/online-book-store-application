<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Something Went Wrong!!</title>
</head>
<body>
<%String title =(String)session.getAttribute("bookTitle");

title = null;


%>
<div class= "container p-3 text-center">

<img src ="img/img1.png" />

<h1 class= "display-3">Sorry ! Invalid ISBN</h1>
<%=exception %>
<a  href="search_book.jsp">Search Book</a>

</div>
</body>
</html>