<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Share Price</title>
</head>
<body>
<h1 align="center"> Welcome to SharePrice </h1>

<table border="2px" align="center">
<a:forEach var="shares" items="${data}">
<tr>
<th> Stock </th>
<th> Quote </th>
</tr>
<tr>
<td><a href="${shares.stock_name}?name=${shares.stock_name}"> ${shares.stock_name} </a></td>
<td> ${shares.quote} </td>
</tr>
</a:forEach>
</table>

</body>
</html>