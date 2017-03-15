<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>登录</title>
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- 需要引入jquery.js,bootstrap.js文件 -->
<script type="text/javascript" src="/bootstrap/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>

<style type="text/css">
.header {
	height: 50px;
	line-height: 50px;
}

.header p {
	height: 50px;
	text-align: center;
	border-bottom: 3px solid #ccc;
}

.header p span {
	font-family: '黑体';
	font-size: 30px;
}

.header p a {
	font-size: 20px;
	padding-top: 15px;
}

.header a:hover, .nologin a:hover {
	text-decoration: none;
}

.img-responsive {
	padding: 20px 0;
}

.code {
	margin-left: 0;
}

.radio, .nologin {
	padding-bottom: 15px;
}
</style>
</head>

<body>
	<header>
	<div class="header">
		<p>
			<a href="#"
				class="glyphicon glyphicon-menu-left col-xs-1 col-xs-offset-4"></a>
			<span class="col-xs-2 text-center">登录</span>
		</p>
	</div>
	</header>

	<img src="/images/head portrait.jpg"
		class="img-responsive center-block" alt="register head portrait">

	<form class="form-horizontal" action="/login/login.do">
		<div class="form-group">
			<div class="col-xs-1 col-xs-offset-4 text-right">
				<img src="/images/photo.png" alt="photo">
			</div>
			<div class="col-xs-3">
				<input type="email" class="form-control" id="registerInputEmail"
					placeholder="邮箱" name="email">
			</div>
		</div>
		<div class="form-group">
			<div class="col-xs-1 col-xs-offset-4 text-right">
				<img src="/images/photo.png" alt="photo">
			</div>
			<div class="col-xs-3">
				<input type="password" class="form-control"
					id="registerInputPassword" placeholder="密码" name="password">
			</div>
		</div>
		<div class="radio col-xs-2 col-xs-offset-5">
			<label> <input type="radio" name="optionsRadios"
				id="optionsRadios1" value="1" checked> 个人&nbsp&nbsp
			</label> <label> <input type="radio" name="optionsRadios"
				id="optionsRadios2" value="2"> 企业
			</label>
			<span style="color: red">${msg }</span>
		</div>
		<div class="col-xs-4 col-xs-offset-5 nologin">
			<a href="#">忘记密码</a> <a href="#" class="col-xs-offset-3">快速注册</a>
		</div>
		<button class="btn btn-default col-xs-3 col-xs-offset-5" type="submit">登录</button>
	</form>

</body>
</html>
