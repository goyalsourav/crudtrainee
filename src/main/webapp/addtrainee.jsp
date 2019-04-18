<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Trainee</title>
</head>
<body>
	<h3>Enter Trainee details</h3>
	<form action="trainees/save" method="post">
		Trainee Id<input type="text" name="id" required autofocus /> <br>
		Trainee Name<input type="text" name="name" required autofocus /> <br>
		Trainee Location <input type="radio" name="location" value="Chennai"> Chennai
  <input type="radio" name="location" value="Bangalore">Bangalore
  <input type="radio" name="location" value="Pune"> Pune
  <input type="radio" name="location" value="Mumbai"> Mumbai
  <br>
  Trainee Domain<select name= "domain" placeholder="Select">
  
  
  <option   value="java">java</option>
  <option  value=".net">.net</option>
  <option   value="html">html</option>
  <option   value="css">css</option>
</select> 
<br>
		<input type="submit" value="Add trainee">
	</form>
</body>
</html>
