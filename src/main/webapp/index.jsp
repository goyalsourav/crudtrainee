<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h2>welcome to the login page</h2>
	<form action="trainees/login" method="post">
		Login Id <input type="text" name="username" required autofocus /> <br>
		Password <input type="password" name="password" required autofocus />
		<br> <input type="Submit" value="Login">
	</form>
</body>
</html>