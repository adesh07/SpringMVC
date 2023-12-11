<%@page import="com.rays.dto.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dto" class="com.rays.dto.UserDTO" scope="request"></jsp:useBean>

	<br>
	<marquee scrollamount="20" behavior="alternate">
		<h2 style="color: red">${msg}</h2>
	</marquee>
	<hr>
	<%
		 dto = (UserDTO) session.getAttribute("user");

		boolean userLoggedIn = dto != null;
%>
		<h3> "Hi, "</h3>

	<%	if (userLoggedIn) {

			 dto.getFirstName();
		} else {
			 
		}
	%>



</body>
</html>