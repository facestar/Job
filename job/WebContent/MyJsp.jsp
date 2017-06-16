<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function(){

   $(".colordiv div").click(function(){
    $(".colordiv div").css("background-color","#ccc"); 
      $(this).css("background-color","#666666");
   })
})
</script>
  </head>
  
  <body>
  <div class="colordiv">
<div>1</div>
</div>
<br><br><br><br><br><br><br>
<div class="colordiv">
<div>2</div>
</div>


  </body>
</html>
