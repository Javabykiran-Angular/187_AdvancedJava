<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome To JSP </h2>

<%! 
	int count=0;

%>

<% 
	count++;
	if(count%2==0){
	%>
	<h2 style="color: green;">Count is
	<%=count %>
	 Even Number.</h2>	
	<% 
	//	out.write("count is even Number");
	}else{
	//	out.write("count is Odd Number");
	
		%>
	<h2 style="color: red;">Count is 
	<%=count %>
	Odd Number..</h2>	
		
	<%	
	}
	%>





</body>
</html>