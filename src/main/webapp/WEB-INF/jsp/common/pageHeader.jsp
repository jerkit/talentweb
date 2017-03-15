<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/WEB-INF/jsp/common/common.jsp" %>

<link rel="stylesheet" href="<c:url value='/css/pageHeader.css'/>">		
<script type="text/javascript" src="<c:url value='/js/pageHeader.js'/>"></script>

<div id="pageHeader">
	<div class="container">
		<img src="<c:url value='/images/logo.png'/>">
		<div id="pageHeaderLink" class="pull-right">
			<a href="<c:url value='/page/login.do'/>">登录</a> / 
			<a href="<c:url value='/page/register.do'/>">注册</a>
		</div>
	</div>
</div>
<div id="banner">
	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
			<li data-target="#carousel-example-generic" data-slide-to="2"></li>
		</ol>
		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="<c:url value='/images/banner_01.jpg'/>" alt="This is a picture!" style="height: 400px;width: 100%;">
				<div class="carousel-caption">
					<h2></h2>
				</div>
			</div>
			<div class="item">
				<img src="<c:url value='/images/banner_02.jpg'/>" alt="This is a picture!" style="height: 400px;width: 100%;">
				<div class="carousel-caption">
					<h2></h2>
				</div>
			</div>
			<div class="item">
				<img src="<c:url value='/images/banner_03.jpg'/>" alt="This is a picture!" style="height: 400px;width: 100%;">
				<div class="carousel-caption">
					<h2></h2>
				</div>
			</div>
		</div>
		<!-- Controls -->
		<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			<span class="sr-only">Previous</span>
		</a>
		<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
			<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
</div>
<div id="nav">
	<ul class="nav nav-tabs nav-justified">
		<li role="presentation" class="active"><a href="<c:url value='/page/index.do'/>">首页</a></li>
		<li role="presentation"><a href="<c:url value='/page/discover.do'/>">发现</a></li>
		<li role="presentation"><a href="<c:url value='/page/publish.do'/>">发布</a></li>
		<li role="presentation"><a href="<c:url value='/page/massege.do'/>">消息</a></li>
		<li role="presentation"><a href="<c:url value='/page/resume.do'/>">我的简历</a></li>
		<li role="presentation"><a href="<c:url value='/page/account.do'/>">我的账户</a></li>
    </ul>
</div>