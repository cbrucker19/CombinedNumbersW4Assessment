<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Results</title>
</head>
<body>
<p>
${userAddResult.getFirstNum()} First number <br />
${userAddResult.getSecondNum()} Second Number <br />
${userAddResult.getAddTotal()} Add Total <br />
</p>
<a href="addPage.jsp">Add another group of numbers!</a>
</body>
</html>