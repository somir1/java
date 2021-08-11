<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
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