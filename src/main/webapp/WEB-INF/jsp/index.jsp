<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
</head>
<body>

<form action="/login.do">
	<input type="text" name="email"/>
	<input type="password" name="password"/>
	
	<input type="submit" name="login" value="登录"/>
	<input type="submit" name="registor" value="注册"/>

	<input type="hidden" name="login_status" value="1">
	<span style="color: red">${error }</span>
</form>


</body>
</html>