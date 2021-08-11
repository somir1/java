<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>Books</title>
</head>
<body>
<h1>All Books</h1>
<table class="table table-dark table-striped">
	<thead>
    <tr>
    	<th scope="col">Id</th>
		<th scope="col">Title</th>
        <th scope="col">Description</th>
        <th scope="col">Language</th>
        <th scope="col">Number of Pages</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items= '${allBooks}' var = 'b'> 
    <tr>
    	<td>${b.id}</td>
      	<td><a href= "/book/show/${b.id}">${b.title}</a></td>
      	<td>${b.description }</td>
      	<td>${b.language}</td>
      	<td>${b.numberOfPages}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<a href="/create">Add a Book</a>
</body>
</html>