<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add or Subtract Days From Date</title>
</head>
<body>
<h2>Add or Subtract Days From Date</h2>
		<form action="GetResult" method="get">
		<input type="hidden" name="choice" value="2" readonly>
			Date (dd-m-yyyy): <input type="text" name="input1">
			<br><br>
			Days: <input type="text" name="input2">
			<br><br>
			<input type="radio" name="flag" value="1"> Add
			<input type="radio" name="flag" value="-1"> Subtract
			<br><br>
			<input type="submit" value="submit">
		</form>
		<br><br>
		<a href="index.html">HOME</a>
</body>
</html>