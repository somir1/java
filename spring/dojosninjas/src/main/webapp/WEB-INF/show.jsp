<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css"/>
<title>Dojo info</title>
</head>
<body>
<div class="container">
	<h1>${dojo.name} Location Ninjas</h1>
		<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">ID</th>
	      <th scope="col">First</th>
	      <th scope="col">Last</th>
	      <th scope="col">Age</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach items='${dojo.ninjas}' var = 'nd'>
	    <tr>
	      <th scope="row">${nd.id}</th>
	      <td>${nd.first_name}</td>
	      <td>${nd.last_name}</td>
	      <td>${nd.age}</td>
	    </tr>
	    </c:forEach>
	  </tbody>
	</table>
	<a href="/">DashBoard</a>
</div>
</body>
</html>