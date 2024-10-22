<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../bootstrap/bootstrap.css">
</head>
<body>
<h2>Welcome to Home Page</h2>

<div class="container">
<table class="table table-bordered table-striped">
	
	<thead>
		<tr>
			<th>Person ID</th>
			<th>Person Name</th>
			<th>Person Mobile No</th>
		</tr>
	</thead>
	
	<tbody>
	
	<c:forEach var="myperson" items="${list}" >
		
		<tr>
			<td> ${myperson.id} </td>
			<td> ${myperson.name} </td>
			<td> ${myperson.mobileno} </td>
		</tr>		
		
	</c:forEach>
	
	
	</tbody>

</table>
</div>



</body>
</html>