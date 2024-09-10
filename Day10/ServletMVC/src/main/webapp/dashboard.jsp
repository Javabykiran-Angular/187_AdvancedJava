<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.tka.entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./bootstrap/bootstrap.css">
</head>
<body>

<%! String username=null; %>

<% 
username=(String)session.getAttribute("myusername");
%>

<h2>Welcome <%=username %></h2>

<table class="table">
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email Id</th>
			<th>Mobile No</th>
		</tr>
	</thead>
	
	<tbody>
		
		<%
			List<Employee> list = (List<Employee>) session.getAttribute("emplist");
			for(Employee e:list){
				%>
				
				<tr>
					<td><%=e.getId() %>  </td>
					<td><%=e.getName() %> </td>
					<td><%=e.getEmailid() %> </td>
					<td><%=e.getMobileno() %> </td>
				</tr>
			
			<%	
			}
		%>
		
		
	</tbody>
	
</table>



</body>
</html>