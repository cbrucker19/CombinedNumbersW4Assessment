<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddingPage</title>
</head>
<body>
<form action="getAddServlet" method="post">
	Enter the first number: 
	<input type="text" name="firstNum" size="10">
	Enter the second number: 
	<input type="text" name="secondNum" size="10">
	<input type="submit" value="Add numbers together"/>
	</form>
	<a href="index.jsp">Return to homepage!</a>
</body>
</html>