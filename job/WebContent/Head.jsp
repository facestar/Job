
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>大学生兼职网</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style>a{text-decoration: none}</style>
	<link rel="stylesheet" type="text/css" href="css/styles.css">

  </head>
  
  <body >
   <div class="maindiv">
    <div class="y1"><img style="height: 160" src="images/1.png"></img>
       <div class="y2">
       <img style="width:450px;height: 90px; " src="images/2.jpg"></img>
       </div>
        <div class="y4">
           <div class="y41"><a href="login.jsp">登录</a></div>
              <div class=y41><a href="register.jsp">注册</a></div>
                 
                 
         </div>
                  <div class="y3">
                    <div class="y31"><a href="/job/gonggao/chakan.do">网站首页</a></div>
                       <div class="y31"><a target="_blank" href="/job/commonweal/findgy.do">正能量频道</a></div>
                         <div class="y31"><a href="/job/findallpost.do">兼职论坛</a></div>
                             <div class="y31"><a href="lianxi1.jsp">联系我们</a></div>
                   </div>
							
                             <input type="hidden" name="username" value="${login.uname}">
                             <div style="font-size: 16px;color:red;">&nbsp;&nbsp;<c:if test="${login.uname !=null}"><a href="/job/user/chaxun.do?uname=${login.uname }">欢迎：${login.uname }</a></c:if>
                             <c:if test="${login.uname ==null}">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;游客你好</c:if>
                             </div>

                       
                               <div class="y5"><img src="images/6.png"></img></div>
                                  <div class="y51">手机扫二维码</div>
    
    </div>
      
  
  
  
  
  
  
  </div>
  </body>
</html>
