<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Book details</title>
</head>
<body>
	<h1>Here is the book info</h1>
	<p>Title: ${bookShow.title}</p>
	<p>Description: ${bookShow.description}</p>
	<p>Language: ${bookShow.language}</p>
	<p>Pages: ${bookShow.numberOfPages}</p>
	<p><a href="/">Go back</a> | <a href="/book/edit/${bookShow.id}">Edit</a> | <a href="/book/delete/${bookShow.id}">Delete</a></p>
</body>
</html>