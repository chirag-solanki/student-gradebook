<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>GradeBook System</title>
</head>
<body id="main">
	<br><h1 style="text-align: center">GradeBook System</h1><hr>
	<!-- Output GradeBook that was created -->
	
	<h2 style="text-align: center">${gradeBook.gradeBookName} is created</h2><br>
	
	<form method="post" action="HomePageRedirectController" align="center">
		<input type="submit" value="Go to Home Page">
	</form><br>
	<form method="post" action="EnterStudentGradesController" align="center">
		<input type="hidden" name="gradeBookName" value="${gradeBook.gradeBookName}">
		<input type="hidden" name="semester" value="${gradeBook.semester}">
		<input type="submit" value="Start Adding Grades to this GradeBook">
	</form>	
</body>
</html>