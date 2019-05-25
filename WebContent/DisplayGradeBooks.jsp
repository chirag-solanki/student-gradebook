<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>GradeBook System</title>
</head>
<body id="main">
<br><h1 style="text-align: center">GradeBook System</h1><hr><br>

<form action="RetrieveGradeController" method="post" align="center">
<select name="gradeBook">
	<c:forEach items="${gradeBooks}" var="u">
	<option value="${u.gradeBookName}">${u.gradeBookName}</option>
	</c:forEach>
</select>
<input type="submit" value="View Grades">
</form>
</body>
</html>