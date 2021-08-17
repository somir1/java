<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>Add a Category</title>
</head>
<body>
	<div class="container">
		<h1>Add a Category</h1>
		<form:form action='/make/cat' method='POST' modelAttribute='categories'>
		<div class="form-group d-flex flex-column ms-3 pb-3">
			<form:label path='name'>Name:</form:label>
        	<form:errors path='name'/>
        	<form:input path='name'/>
        </div>
        	<input type="submit" value="Create Category">
		</form:form>
		
		
		<h1>Existing Categories</h1>
		<ul>
		<c:forEach items='${allcat}' var='c' >
			<li>${c.name}</li>
		</c:forEach>
		</ul>
		<a href="/">DashBoard</a>
	</div>
</body>
</html>