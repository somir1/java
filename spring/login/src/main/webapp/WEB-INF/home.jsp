<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome User</title>
</head>
<body>
	<h1>Hello ${user.userName} now go away</h1>
	<a href="/logout">Log Out of Here</a>
</body>
</html>