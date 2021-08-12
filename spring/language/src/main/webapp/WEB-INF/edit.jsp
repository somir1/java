<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>${info.name}</title>
</head>
<body>
	<form:form action='/update/${info.id}' method='POST' modelAttribute='info'>
	<div>
        <form:label path='name'>Name:</form:label>
        <form:errors path='name'/>
        <form:input path='name'/>
    </div>
    <div>
        <form:label path='creator'>Creator:</form:label>
        <form:errors path='creator'/>
        <form:input path='creator'/>
    </div>
    <div>
         <form:label path='version'>Version:</form:label>
         <form:errors path='version'/>
         <form:input path='version'/>
    </div>
    <input type="submit" value="Update">
</form:form>
</body>
</html>