<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>Languages</title>
</head>
<body>
	<table class="table table-dark table-striped">
	<thead>
    <tr>
    	<th scope="col">Id</th>
		<th scope="col">Name</th>
        <th scope="col">Creator</th>
        <th scope="col">Version</th>
        <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items= '${allLang}' var = 'b'> 
    <tr>
    	<td>${b.id}</td>
      	<td><a href= "/book/show/${b.id}">${b.name}</a></td>
      	<td>${b.creator}</td>
      	<td>${b.version}</td>
      	<td><p><a href="/lang/edit/${b.id}">Edit</a> | <a href="/lang/delete/${b.id}">Delete</a></p></td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<form:form  action='/languages' method='POST' modelAttribute='Lang'>
	<div class="d-flex flex-column ms-3 pb-3">
        <form:label path='name'>Name:</form:label>
        <form:errors path='name'/>
        <form:input path='name'/>
    </div>
    <div class="d-flex flex-column ms-3 pb-3">
        <form:label path='creator'>Creator:</form:label>
        <form:errors path='creator'/>
        <form:input path='creator'/>
    </div>
    <div class="d-flex flex-column ms-3 pb-3">
         <form:label path='version'>Version:</form:label>
         <form:errors path='version'/>
         <form:input path='version'/>
    </div>
    <input type="submit" value="Add Language">
</form:form>
</body>
</html>