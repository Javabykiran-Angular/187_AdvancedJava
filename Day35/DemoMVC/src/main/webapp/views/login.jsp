<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="../bootstrap/bootstrap.css">

</head>
<body>
<h2> Welcome To Login Page </h2>

	
	
	<div class="container">
		<div class="row">
		
		<form action="login" method="post">
				
				<div class="col">
					
						<div class="mt-2 mb-2">
							<label>Username:: </label>
							<input type="text"
							name="username"
							 placeholder="Enter the Username" 
							class="form-control w-25">
							<label>Password:: </label>
							<input type="password" 
							name="password"
							placeholder="Enter the Password" 
							class="form-control w-25">
						</div>
				
				</div>
					<button class="btn btn-success">Login</button>
		</form>
		
		</div>
	
	</div>
	
	

	
	

	
</body>
</html>