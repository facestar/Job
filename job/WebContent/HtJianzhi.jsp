<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台企业管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript">
	var y = "${y}"
	if(y!="")
	{
		alert(y);
	}
</script>
	<style>
a:link {text-decoration: none;}</style>
<!-- 表格的css -->
<style type="text/css">
table.hovertable {
	font-family: verdana,arial,sans-serif;font-size:11px;color:#333333;border-width: 1px;border-color: #999999;border-collapse: collapse;
}
table.hovertable th {
	background-color:#c3dde0;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
table.hovertable tr {
	background-color:#d4e3e5;
}
table.hovertable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
</style>
	
	<link rel="stylesheet" type="text/css" href="css/htstyles.css">

  </head>
  
  <body>
     <div class="h10">
           <div class="h11" >
               <div class="h12">
                     <div style="width: 80px;height: 80px;margin-top: 10px;"><img style="width: 90px;height: 90px;" src="images/tubiao.jpg"></img></div>
                     <div class="h15">大学生兼职后台管理</div>
              </div>
                <div class="h13">
                   <div class="h131"><img style="width: 50px;height: 50px;" src="img/toux.jpg"></img>
                      <div class="h132">  <br>  您好:${adminLogin.aname} <br>
                                                             
                         <a href="Htlogin.jsp"> 退出</a> 
                     </div>
                         <div>电话：1588886699<br>
                                                                          联系方式：0875-5566
                          
                        </div>
                     
                </div>
                 <ul>
                 <li class="y1"><img style="width: 20px;height: 18px;" src="images/tou.png"></img><a href="/job/admin/chaxun.do"> 用户管理</a></li>
                 <li class="y2"><img style="width: 20px;height: 18px;" src="images/qiye.jpg"></img><a href="/job/admin/chakan.do">  企业管理</a></li>
                 <li class="y3"><img style="width: 20px;height: 18px;" src="images/tubiao.jpg"></img><a href="/job/commonweal/gongyi.do">  兼职管理</a></li>
                 <li class="y4"><img style="width: 20px;height: 18px;" src="images/lunt.jpg"></img><a href="/job/admin/tiezi.do">  论坛管理</a></li>
                 <li class="y5"><img style="width: 20px;height: 18px;" src="images/hezuo.jpg"></img><a href="/job/medium/chaxunmeiti.do">  合作媒体管理</a></li>
                 <li class="y6"><img style="width: 20px;height: 18px;" src="images/shezhi.png"></img><a href="/job/gonggao/chaxun.do">  系统设置</a></li>
                 
                 </ul>
              </div>
              <!-- 用户管理 -->
                <div class="h14" style="border: 1px  solid width;overflow:scroll;">
                         <div style="background-color: #6DC1F0 ;font-size: 19px;font-family:Microsoft YaHei"> 企业用户列表：</div>
                    <table class="hovertable" style="font-size:15;text-align: center;">
                          <tr>
                                     <td width="50px">序号</td>
	                                 <th width="150px;">公益企业名称</th>
	                                 <th width="250px;">公益兼职标题</th>
	                                 <th width="150px;">公益兼职类型</th>
	                                 <th width="200px;"><a href="Htfabujianzhi.jsp">发布公益兼职</a></th>
                        </tr>
                      		<c:forEach items="${ss }" var="nm">
                               <tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
	                                    <td>${nm.id}</td>
	                                    <td>${nm.gyname}</td>
	                                    <td>${nm.wtitle}</td>
	                                    <td><img title="${nm.wtitle}" src="imagejxg/${nm.wtype }.jpg" /></td>
	                                    <td><a href="/job/commonweal/shanchu.do?id=${ nm.id}">删除</a> </td>
                              </tr>
						</c:forEach>
                </table>
              </div>
              
           </div>
         </div>  
  </body>
</html>
