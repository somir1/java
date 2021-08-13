<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>Lets add a Ninja</title>
</head>
<body>
<div class="container">	
	<h1>All ninjas in the system</h1>
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
	  <c:forEach items='${allNinja}' var = 'n'>
	    <tr>
	      <th scope="row">${n.id}</th>
	      <td>${n.first_name}</td>
	      <td>${n.last_name}</td>
	      <td>${n.age}</td>
	    </tr>
	    </c:forEach>
	  </tbody>
	</table>
	<h1>Please input ninjas info below.</h1>
		<form:form action="/addninja" method="post" modelAttribute="ninjaninja">
			<div class="form-group d-flex flex-column ms-3 pb-3">
				<form:label path="dojo">Dojo Location</form:label>
        		<form:errors path="dojo" class="text-danger"/>
        		<form:select path="dojo" class="form-select">
        			<c:forEach items='${allDojo}' var = 'd'>
        				<option value="${d.id}">${d.name}</option>
        			</c:forEach>
        		</form:select>

			</div>
			<div class="form-group d-flex flex-column ms-3 pb-3">
				<form:label path="first_name">First Name</form:label>
        		<form:errors path="first_name" class="text-danger"/>
        		<form:input path="first_name" class="form-control"/>
			</div>
			<div class="form-group d-flex flex-column ms-3 pb-3">
				<form:label path="last_name">Last Name</form:label>
        		<form:errors path="last_name" class="text-danger"/>
        		<form:input path="last_name" class="form-control"/>
			</div>
			<div class="form-group d-flex flex-column ms-3 pb-3">
				<form:label path="age">Age</form:label>
        		<form:errors path="age" class="text-danger"/>
        		<form:input path="age" class="form-control"/>
			</div>
			<input type="submit" value="Submit"/>
		</form:form>
		<a href="/">DashBoard</a>
	</div>
</body>
</html>