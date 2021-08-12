<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>${show.name}</title>
</head>
<body>
	<h1>Name: ${show.name}</h1>
	<p>Creator: ${show.creator}</p>
	<p>Version: ${show.version}</p>
	<p><a href="/lang/edit/${show.id}">Edit</a> | <a href="/lang/delete/${show.id}">Delete</a></p>
</body>
</html>