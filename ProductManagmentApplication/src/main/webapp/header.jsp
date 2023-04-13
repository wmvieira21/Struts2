<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/header.css">
</head>
<body>

	<%
	if (session.getAttribute("userSession") == null) {
		response.sendRedirect("login.jsp");
	}
	%>

	<div class="topnav">
		<a href="welcomeAction">Home</a> <a href="addProduct.jsp">Add
			Product</a> <a class="topnav__logout" href="logoutAction">Logout</a>
	</div>
</body>
</html>