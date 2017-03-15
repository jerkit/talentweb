<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<td>id</td>
		<td>帐号</td>
		<td>密码</td>
	</tr>
	<c:forEach var="a" items="${admins }">
		<tr>
		<td>${a.adminId }</td>
		<td>${a.adminAccount }</td>
		<td>${a.adminPassword }</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>