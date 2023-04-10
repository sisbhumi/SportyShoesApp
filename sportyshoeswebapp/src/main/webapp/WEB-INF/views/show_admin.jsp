<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN PAGE</title>
</head>
<body>
	<h1>Login Page Shopsy.com</h1>
	${message}
	<form action="/admin" method="post">
		User_ID<input type="text" name="name"> Password<input
			type="password" name="password"> <input type="submit"
			value="Login">
	</form>
	<ul>
		<c:forEach items="${admins}" var="ad">
			<li>${ad.name}|${ad.email}}</li>
		</c:forEach>
	</ul>

</body>
</html>