<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/htstyles.css">
	<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function() {

		$("#nn").focus(function() {
			if ($(this).val() == "请输入用户名") {
				$(this).val("");
			}
		});
		$("#nn").blur(function() {
			if ($(this).val() == "") {
				$(this).val("请输入用户名");
			}
		});
		$("#mm").focus(function() {
			if ($(this).val() == "请输入密码") {
				$(this).val("");
			}
		});
		$("#mm").blur(function() {
			if ($(this).val() == "") {
				$(this).val("请输入密码");
			}
		});
	});
</script>

<script type="text/javascript">
	var bb = "${bc}"
	if(bb!="")
	{
		alert(bb);
	}
</script>
<script type="text/javascript">
	function denglu()
	{
		var t = document.getElementById("nn").value;
		var h = document.getElementById("mm").value;
		if(t=="请输入用户名"||h=="请输入密码")
		{
			alert("用户名或者密码为空，请重新输入：");
		}else
		{
			var log = document.getElementById("houtaidenglu");
			log.submit();
		}
	}
</script>
  </head>
  
  <body style="background-image: url(images/123.jpg);">
  <form action="/job/admin/login.do" method="post" id="houtaidenglu">
  <div class="h1">
   <input type="text" id="nn" name="aname"  class="h2" value="请输入用户名" style="color:#ccc;font-weight: bold; "/>
    <input type="password" id="mm"  name="apassword" class="h3" value="请输入密码" style="color:#ccc;font-weight: bold; "/>
    <input type="button" value="登录" onclick="denglu()" class="h5"/>
  </div>
  </form>
      <div class="h4">欢迎使用大学生兼职管理系统
        </div>
    
    
  </body>
</html>
