<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
<!-- 需要引入jquery.js,bootstrap.js文件 -->
<script type="text/javascript" src="/bootstrap/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>

<link href="/bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">
<link>
</head>
<body>
<table class="table">
	<tr>
		<td>公司名称</td>
		<td>招聘岗位</td>
		<td>工作地点</td>
		<td>待遇薪酬</td>
		<td>学历要求</td>
		<!-- <td>岗位职责</td>
		<td>岗位要求</td> -->
		<td>发布时间</td>
	</tr>
	<c:forEach var="r" items="${recruits }">
		<tr>
		<td>${r.compName }</td>
		<td>${r.recrJob }</td>
		<td>${r.recrPlace }</td>
		<td>${r.recrSalary }</td>
		<td>${r.recrDegree }</td>
		<%-- <td>${r.recrDuty }</td>
		<td>${r.recrDemand }</td> --%>
		<td>${r.recrDate }</td>
	</tr>
	</c:forEach>
</table>
<nav>
  <ul class="pagination">
    <li>
      <a href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <c:forEach var="page" begin="1" end="${pageInfo.pageNum }">
    <li><a href="#">${page }</a></li>
    </c:forEach>
    
    <li>
      <a href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>


</body>
</html>