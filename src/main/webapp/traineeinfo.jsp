<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update</title>
</head>
<body>
	<h3>Trainee Info</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Location</th>
				<th>Domain</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${TRAINEE.id}</td>
				<td>${TRAINEE.name}</td>
				<td>${TRAINEE.location}</td>
				<td>${TRAINEE.domain}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>