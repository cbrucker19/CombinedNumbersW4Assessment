<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Multiply Results Page</title>
</head>
<body>
<p>
${userMultResult.getFirstNum()} First number <br />
${userMultResult.getSecondNum()} Second Number <br />
${userMultResult.getMultiTotal()} Add Total <br />
</p>
<a href="multPage.jsp">Add another group of numbers!</a>
</body>
</html>