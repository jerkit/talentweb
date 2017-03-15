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
				
		<link rel="stylesheet" href="<c:url value='/css/模板.css'/>">		
		<script type="text/javascript" src="<c:url value='/js/模板.js'/>"></script>
	</head>
	<body>
		<%
			net.togogo.talent.domain.TbUser user = new net.togogo.talent.domain.TbUser();
			user.setUserId(1);
			user.setUserName("求职者aaa");
			request.getSession().setAttribute("current_user",user);

			net.togogo.talent.domain.TbCompany company = new net.togogo.talent.domain.TbCompany();
			company.setCompId(1);
			company.setCompName("世界500强大公司");
			request.getSession().setAttribute("current_company",company);
		%>

		<input type="submit" value="add" id="add_btn"/><br/><br/>
		<input type="submit" value="delete" id="delete_btn"/><br/><br/>
		<input type="submit" value="update" id="update_btn"/><br/><br/>
		<input type="submit" value="searchAll" id="search_btn"/><br/><br/>
		<input type="submit" value="searchPage" id="searchAll_btn"/><br/><br/>

		<script type="text/javascript">
			$(function(){
				$("#add_btn").click(function(){
					var job = window.prompt("岗位");
					var place = window.prompt("工作地点");
					var salary = window.prompt("薪资");
					var degree = window.prompt("学历要求");
					var duty = window.prompt("工作技能");
					var demand = window.prompt("工作经验");
					$.ajax({
			            type: "POST",
			            url: "/hunt/addHunt.do",
			            data:"huntJob="+job+"&huntPlace="+place+"&huntSalary="+salary+"&huntDegree="+degree+"&huntSkill="+duty+"&huntExperience="+demand,
			            success: function(data) {
			               if(data){
			               		console.log(data)
			               		alert(data)
			               }
			            },
			            error: function(jqXHR, textStatus, errorThrown) {
			                alert(jqXHR.status + " : " + jqXHR.statusText);
			            }
			        });
				});

				$("#delete_btn").click(function(){
					var inputData = window.prompt();
					$.ajax({
			            type: "POST",
			            url: "/hunt/deleteHunt.do",
			            data:'huntId='+inputData,
			            success: function(data) {
			               if(data){
			               		console.log(data)
			               		alert(data)
			               }
			            },
			            error: function(jqXHR, textStatus, errorThrown) {
			                alert(jqXHR.status + " : " + jqXHR.statusText);
			            }
			        });
				});

				$("#update_btn").click(function(){
					var id = window.prompt("ID");
					var job = window.prompt("岗位");
					var place = window.prompt("工作地点");
					var salary = window.prompt("薪资");
					var degree = window.prompt("学历要求");
					var duty = window.prompt("工作技能");
					var demand = window.prompt("工作经验");
					$.ajax({
			            type: "POST",
			            url: "/hunt/updateHunt.do",
			            data:"huntId="+id+"&huntJob="+job+"&huntPlace="+place+"&huntSalary="+salary+"&huntDegree="+degree+"&huntSkill="+duty+"&huntExperience="+demand,
			            success: function(data) {
			               if(data){
			               		console.log(data)
			               		alert(data)
			               }
			            },
			            error: function(jqXHR, textStatus, errorThrown) {
			                alert(jqXHR.status + " : " + jqXHR.statusText);
			            }
			        });
				});

				$("#search_btn").click(function(){
					$.ajax({
			            type: "POST",
			            url: contextPath + "/hunt/findHunts.do",
			            success: function(data) {
			               if(data){
			               		console.log(data)
			               		alert(data.length)
			               }
			            },
			            error: function(jqXHR, textStatus, errorThrown) {
			                alert(jqXHR.status + " : " + jqXHR.statusText);
			            }
			        });
				});

				$("#searchAll_btn").click(function(){
					var inputData1 = window.prompt("第几页");
					var inputData2 = window.prompt("每页有几多？");
					$.ajax({
			            type: "POST",
			            url: contextPath + "/hunt/findHuntPages.do",
			            data:"pageIndex="+inputData1+"&pageSize="+inputData2,
			            success: function(data) {
			               if(data){
			               		console.log(data)
			               		alert(data.length)
			               }
			            },
			            error: function(jqXHR, textStatus, errorThrown) {
			                alert(jqXHR.status + " : " + jqXHR.statusText);
			            }
			        });
				});
				
			});
		</script>
	</body>
</html>
