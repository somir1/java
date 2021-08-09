<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date</title>
</head>
<body onload="alertUser()">
	<h1>Hello the date is ${today}</h1>
	<a href='/'>Go back</a>
</body>
<script>
function alertUser() {
    alert("Here is the date");
}
</script>
</html>