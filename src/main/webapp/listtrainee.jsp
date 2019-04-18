<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>list trainees</title>
</head>
<body>

	<h3>Trainees Details</h3>
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
			<c:forEach var="trainee" items="${TRAINEESLIST}">
				<tr>
					<td>${trainee.id}</td>
					<td>${trainee.name}</td>
					<td>${trainee.location}</td>
					<td>${trainee.domain}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>