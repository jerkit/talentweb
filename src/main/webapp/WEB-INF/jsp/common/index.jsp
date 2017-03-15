<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/WEB-INF/jsp/common/common.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<title>万才网</title>
		<meta charset="utf-8">
		<meta http-equiv="keywords" content="万才网">
		<meta http-equiv="description" content="万才网">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="shortcut icon" href="<c:url value='/images/favicon.ico'/>" type="image/x-icon"/>
		
		<link rel="stylesheet" href="<c:url value='/css/index.css'/>">		
		<script type="text/javascript" src="<c:url value='/js/index.js'/>"></script>
	</head>
	<body>
		<%@ include file="/WEB-INF/jsp/common/pageHeader.jsp" %>
		<div id="content">
			<div class="container">
				<div id="cHead" class="row">
					<h2 class="col-sm-5">最新招聘信息:</h2>
					<div class="col-sm-1 col-sm-offset-6"><a href="#">更多</a></div>
				</div>
				<div>
					<div class="zpxx">
						<h3><a href='<c:url value="/recruit/recruitDetail.do?recrId="/>'>Java软件工程师</a></h3>
						<p>上海金原子信息技术有限公司</p>
					</div>

				</div>
			</div>
		</div>
	</body>
</html>
