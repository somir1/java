<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
	<h1>Please fill out the survey</h1>
	<form action="/results" method = "post">
		<div class = "main">
			<div>
				<label>Your Name:</label>
				<input type="text" id="name" name="fullname">
			</div>
			<div>
				<label>Dojo Location:</label>
				<select  id="location" name="location">
                    <option value="Seattle">Seattle</option>
                    <option value="Los Angeles">Los Angeles</option>
                    <option value="Dallas">Dallas</option>
                    <option value="Chicago">Chicago</option>
                </select>
			</div>
			<div>
				<label for="favlang">Favorite Language</label>
                <select class="forms form-control border border-dark" id="language" name="favlang">
                    <option value="Python">Python</option>
                    <option value="JavaScript">JavaScript</option>
                    <option value="HTML">HTML</option>
                    <option value="CSS">CSS</option>
                </select>
			</div>
			<div>
				<label for="comments">Comments (Optional)</label>
                <textarea id="comment" rows="2" name="comment"></textarea>
			</div>
		</div>
		<input type = "submit" value = "Submit">
	</form>
</body>
</html>