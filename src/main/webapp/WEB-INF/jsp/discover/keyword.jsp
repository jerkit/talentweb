<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
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
			request.getSession().setAttribute("current_user",user);
		%>

		<input type="submit" value="add" id="add_btn"/><br/><br/>
		<input type="submit" value="delete" id="delete_btn"/><br/><br/>
		<input type="submit" value="update" id="update_btn"/><br/><br/>
		<input type="submit" value="search" id="search_btn"/><br/><br/>
		<input type="submit" value="searchAll" id="searchAll_btn"/><br/><br/>
<<<<<<< .mine
<div id="test"></div>
=======
		<input type="submit" value="searchPage" id="searchPage_btn"/><br/><br/>
		<input type="submit" value="searchAllPage" id="searchAllPage_btn"/><br/><br/>

>>>>>>> .r32
		<script type="text/javascript">
			$(function(){
				$("#add_btn").click(function(){
					var inputData = window.prompt();
					$.ajax({
			            type: "POST",
			            url: "/keyword/addKeyword.do",
			            data:"keyword="+inputData,
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
			            url: "/keyword/deleteKeyword.do",
			            data:'keywordId='+inputData,
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
					var inputData = window.prompt();
					$.ajax({
			            type: "POST",
			            url: "/keyword/updateKeywordHeat.do",
			            data:"keywordId="+inputData,
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
			            url: contextPath + "/keyword/findKeywords.do",
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
					$.ajax({
			            type: "POST",
			            url: contextPath + "/keyword/findAllKeywords.do",
			            success: function(data) {
			               if(data){
			               		console.log(data)
			               		alert(data.length)
			               	$("#test").text(data[0].keyword)
			               	
			               		for(var i=0;i<data.length;i++){
			               			$("#test").append("<div>"+data[i].keyword+"</div>")
			               		}
			               	
			               }
			            },
			            error: function(jqXHR, textStatus, errorThrown) {
			                alert(jqXHR.status + " : " + jqXHR.statusText);
			            }
			        });
				});

				$("#searchPage_btn").click(function(){
					var inputData1 = window.prompt("第几页");
					var inputData2 = window.prompt("每页有几多？");
					$.ajax({
			            type: "POST",
			            url: contextPath + "/keyword/findKeywordsPage.do",
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

				$("#searchAllPage_btn").click(function(){
					var inputData1 = window.prompt("第几页");
					var inputData2 = window.prompt("每页有几多？");
					$.ajax({
			            type: "POST",
			            url: contextPath + "/keyword/findAllKeywordsPage.do",
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
