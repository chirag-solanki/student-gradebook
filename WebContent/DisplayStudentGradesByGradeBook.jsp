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

<br><h1 style="text-align: center">GradeBook System</h1><hr>


<h2 style="text-align: center"><c:out value="${allGrades[0].gradeBookName}"/> GradeBook</h2><br>

<table id="studentGrade" border="2" align="center">
<tr>
<td><b>Student Name</b></td>
<td><b>Grade</b></td>
</tr>
<c:forEach items="${allGrades}" var="u">
<tr>
<td>${u.studentName}</td>
<td>${u.grade}</td>
</tr>
</c:forEach>
</table><br>

<form method="post" action="HomePageRedirectController" align="center">
	<input type="submit" value="Go to Home Page">	
</form>

</body>
</html>