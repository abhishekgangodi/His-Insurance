<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Contact Info</h1>
<h2>${msg}</h2>
<form:form action = "saveContact" modelAttribute="account" method = "POST">
	<table>
	<tr>
	<td>First name :</td>
	<td><input type="text" name="firstName"/></td>
	</tr>
	<tr>
	<td>Last name :</td>
	<td><input type="text" name="lastName"/></td>
	</tr>
	<tr>
	<td>Email :</td>
	<td><input type = "text" name="Email"/></td>
	</tr>
	<tr>
	 <td>Gender :</td>
	 <td><form:radiobutton path="gender" value="M" /> Male <form:radiobutton
	  path="gender" value="F" /> Fe-Male</td>
	</tr>
	<tr>
	<td></td>
	<td><input type = "Submit" value = "Create"></td>
	</tr>
</table>
</form:form>

</body>
</html>