<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<!-- modelAttribute == 2-way-data-binding -->
<body>
	<sf:form action="UserRegister" method="post" modelAttribute="form">
		<table>
			<tr>
				<th>First Name :</th>
				<td><sf:input path="firstName" /></td>
			</tr>
			<tr>
				<th>Last Name :</th>
				<td><sf:input path="lastName" /></td>
			</tr>
			<tr>
				<th>Login-Id :</th>
				<td><sf:input path="loginId" /></td>
			</tr>
			<tr>
				<th>Password :</th>
				<td><sf:input path="password" /></td>
			</tr>
			<tr>
				<th>DOB :</th>
				<td><sf:input path="dob" /></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>