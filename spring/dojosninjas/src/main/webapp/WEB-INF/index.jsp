<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>Dojos and Ninjas</title>
</head>
<body>
<div class="container">
	<h1>Here are the Dojos</h1>
	
	<ul class="list-group list-group-flush">
  		<c:forEach items='${allDojo}' var = 'd'>
			<li class="list-group-item"><a href="/show/${d.id}">${d.name}</a></li>
		</c:forEach>
	</ul>

	<div>
	<h1>Add a new Dojo Location</h1>
		<form:form action="/adddojo" method="post" modelAttribute="dojoo">
    	<div class="form-group d-flex flex-column ms-3 pb-3">
        	<form:label path="name">Name</form:label>
        	<form:errors path="name" class="text-danger"/>
        	<form:input path="name" class="form-control"/>
    	</div>
    		<input type="submit" value="Submit"/>
		</form:form>    
	</div>
	<p><a href="/makeninja">Add a Ninja</a></p>
</div>
</body>
</html>