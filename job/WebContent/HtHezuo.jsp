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
	<style>
a:link {text-decoration: none;}</style>
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
               <ul style="font-size: 17px;">
                 <li class="y1" ><img style="width: 20px;height: 18px;" src="images/tou.png"></img><a href="/job/admin/chaxun.do"> 用户管理</a></li>
                 <li class="y2"><img style="width: 20px;height: 18px;" src="images/qiye.jpg"></img><a href="/job/admin/chakan.do">  企业管理</a></li>
                 <li class="y3"><img style="width: 20px;height: 18px;" src="images/tubiao.jpg"></img><a href="/job/commonweal/gongyi.do">  兼职管理</a></li>
                 <li class="y4"><img style="width: 20px;height: 18px;cursor: pointer;" src="images/lunt.jpg"></img><a href="/job/admin/tiezi.do">  论坛管理</a></li>
                 <li class="y5"><img style="width: 20px;height: 18px;" src="images/hezuo.jpg"></img><a href="/job/medium/chaxunmeiti.do">  合作媒体管理</a></li>
                 <li class="y6"><img style="width: 20px;height: 18px;" src="images/shezhi.png"></img><a href="/job/gonggao/chaxun.do">  系统设置</a></li>
                 
                 </ul>
              </div>
              <!-- 合作媒体管理 -->
                <div class="h14" style="border: 1px  solid width;overflow:scroll;background-color:#C4DDCD ">
                          
		 <h4 style="font-family:Microsoft YaHei">合作媒体的添加</h4>
            <form method="post" action="/job/medium/meiti.do">
           &nbsp;&nbsp;&nbsp; 媒体名称：<input type="text" name="mname" style="width: 250px;height: 30px;"><br><br>
            <%@include file="htmlEdit.jsp" %>
            &nbsp;&nbsp;&nbsp;  媒体图标：<input type="text" name="micon" class="uploadfilecss" id="up" style="width: 250px;height: 30px;"><br><br>
           &nbsp;&nbsp;&nbsp; 媒体地址：<input type="text" name="url" style="width: 250px;height: 30px;"><br><br>
           &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
           <input type="submit" value="提交" style="cursor: pointer;background-color: #ccc;height: 25px;border-radius: 5px;width: 70px;">
            </form>
              
               <div style="background-color: #6DC1F0 ;font-size: 20px;"> 合作媒体列表：</div>
                    <table class="hovertable">
                          <tr>
                                     <td width="50px" >序号</td>
	                                 <th width="220px;">合作媒体名称</th>
	                                 <th width="250px;">合作媒体网址</th>
	                                 <th width="130px;">合作媒体图片</th>
	                                 <th width="100px;">操作</th>
                        </tr>
                      <c:forEach items="${tt}" var="dr" >
                               <tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
	                                    <td height="60px">${dr.id}</td>
	                                    <td>${dr.mname}</td>
	                                    <td>${dr.url}</td>
	                                    <td><img src="${dr.micon}" style="width: 124px;height: 84px;"/></td>
	                                    <td>
	                                    <form action="/job/medium/shanchuM.do" method="post">
                                          <input type="hidden" name="id" value="${dr.id }">
                                        <input type="submit" value="删除">
                                        </form>
	                                   </td>
                              </tr>
                          </c:forEach> 
                         
                </table>
           </div>
     </div>     
  </div>  
  </body>
</html>
