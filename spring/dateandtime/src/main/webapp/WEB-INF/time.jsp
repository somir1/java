<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time</title>
</head>
<body onload="alertUser()">
	<h1>The time is ${time}</h1>
	<a href='/'>Go back</a>
</body>
<script>
	function alertUser() {
    	alert("Here is the time");
	}
</script>
</html>