<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="htmlEdit.jsp" %>
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
                      <div class="h132">  <br>  您好:${adminLogin.aname} 
                                                             
                         <a href="shouye.jsp"> 退出</a> 
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
              <!-- 系统设置 -->
                <div class="h14" style="border: 1px  solid width;overflow:scroll; background-color: #C4DDCD; font-size:17px;">
                      <!--    地址：昆明市民航路229号昆明人力资源中心大学生创业园16号<br><br>
						
						
								联系人：陈经理
								电话：18083869694<br>
							
							         联系人：杨经理
								电话：15198801941
					
					<br><br>
							传真：0871-63344393
							邮编：650031
						
						<br><br>
						        大学生兼职网-校园客服QQ：1981806426<br>
							大学生兼职网-企业客服QQ：1684498880<br>
							大学生兼职网-综合客服QQ：873077033
						
						<br><br>
						<span style="color:#003399;">大学生兼职网QQ交流</span><br>
						<span style="color:#003399;">群：学生群 </span>
						<span style="color:#003399;">92333977</span>
							
						<p> -->
						<p style="font-weight: bold;">系统公告的添加</p>
						<div style="margin-top: -20px;">
						<form method="post" action="/job/gonggao/add.do">
						&nbsp;&nbsp;
						   <textarea type="text" class="htmlEditCss" style="width: 250px ;height: 40px;" name="neirong"></textarea><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						   <input type="submit" value="提交" style="width: 50px;height:30px;cursor: pointer;"/>
						</form>
						</div>
						
						
		             <div style="background-color: #6DC1F0 ;font-size: 20px;"><a href="/job/gonggao/chaxun.do"> 公告列表：</a></div>
                    <table class="hovertable">
                          <tr>
                                     <td width="120px" >序号</td>
	                                 <th width="550px;">添加的内容</th>
	                                 <th width="100px;">操作</th>
                        </tr>
                      		<c:forEach items="${tp}" var="pp">
                               <tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
	                                    <td height="60px">${pp.id}</td>
	                                    <td>${pp.neirong}</td>
	                                      <td>
	                                        <form action="/job/gonggao/shanchu.do" method="post">
                                            <input type="hidden" name="id" value="${pp.id }">
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
