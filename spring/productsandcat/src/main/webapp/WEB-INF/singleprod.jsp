<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>Product Info</title>
</head>
<body>
	<div class = "container">
		<h1>${prod.name}</h1>
		<p>Description: ${prod.description}</p>
		<p>Price: ${prod.price}</p>
		<p>Categories:
			<ul>
			<c:forEach items='${cats}' var='c' >
				<li>${c.name}</li>
			</c:forEach>
			</ul> </p>
		
		<a href="/">DashBoard</a>
		
		<h1>Add a Category</h1>
		<form action="/addcategory/${prod.id}" method="post">
		<div class="form-group d-flex flex-column ms-3 pb-3">
			<select name="categories">
			<c:forEach items='${cat}' var='c' >
				<option value="${c.id}">${c.name}</option>
			</c:forEach>
			</select>
        </div>
        <input type="submit" value="Add category to a product">
		</form>
	</div>
</body>
</html>