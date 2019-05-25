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
<h2 style="text-align: center">${studentGrade.gradeBookName} GradeBook</h2><br>

<table id="studentGrade" border="2" align="center">
	<tr>
		<td><b>Student Name</b></td>
		<td><b>Student Grade</b></td>
	</tr>
	<c:forEach items="${allUsers}" var="u">
	<tr>
		<td>${u.studentName}</td>
		<td>${u.grade}</td>
	</tr>
	</c:forEach>
</table><br>

<form method="post" action="InsertStudentGradeController2" align="center">

<table align="center">
	<tr>
		<td><b>Student Name</b></td>
		<td><input type="text" name="studentName" maxlength="15"></td>
	</tr>
	<tr>
		<td><b>Student Grade</b></td>
		<td><input type="text" name="grade"></td>
	</tr>	
</table><br><br>
	<input type="hidden" name="gradeBookName" value="${gradeBook.gradeBookName}">
	<input type="hidden" name="semester" value="${gradeBook.semester}">
	<input type="submit" value="Add New Grade">
</form><br>
<form method="post" action="SaveGradesController" align="center">
	<input type="hidden" name="gradeBookName" value="${gradeBook.gradeBookName}">
	<input type="hidden" name="semester" value="${gradeBook.semester}">
	<input type="submit" value="Save All Grades">	
</form>
</body>
</html>