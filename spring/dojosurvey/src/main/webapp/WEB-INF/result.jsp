<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
	<div class = "main">
		<h1>Submitted info</h1>
		<h2>Your name: ${name} </h2>
		<h2>Dojo Location: ${loc}</h2>
		<h2>Your Favorite language: ${lang}</h2>
		<h2>Comments:  ${comment}</h2>
	</div>
	<a href='/'>Go back</a>
</body>
</html>