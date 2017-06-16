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
    
    <title>后台首页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    


<script type="text/javascript">
	var y = "${y}"
	if(y!="")
	{
		alert(y);
	}
</script>
<script type="text/javascript">
	var bc = "${bc}"
	if(bc!="")
	{
		alert(bc);
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

<style>a:link {text-decoration: none;}</style>	
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
                   <div class="h132"><br>  您好:${adminLogin.aname}<br>
                                                             
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
                 <li class="y6"><img style="width: 20px;height: 18px;" src="images/shezhi.png"></img><a href="HtXitong.jsp">  系统设置</a></li>
                 
                 </ul>
              </div>
              <!-- 企业详情 -->
                <div class="h14" style="">
                
                  <div class="yonghu">
                        <div style="background-color: #6DC1F0 ;font-size: 19px;font-family:Microsoft YaHei;color:yellow;text-align: center;">${ypc.uname }详细情况：</div>
                    <div style="float:left; width:40%; min-height:100px;height:auto;">
						
						<div>
							<div style="float:left; width:200px; border:none;">
								<div style="margin-left: 20%;margin-top:40%;">
									
									
										<img width="200" height="100" alt="企业标识" src="${ypc.picture }">
									
								</div>
								<div style="margin-left: 20%;margin-top:40%;">
									<img width="200" height="100" title="执照认证" src="${ypc.zhizhao }">
								</div>
							</div>
							
						</div>
					</div>
					<div style="float:left; width:59%; min-height:100px;height:auto;">
						
						<div class="partTimeJobBasicInfo" style="border:none; ">
							<div style="margin-top:10%;">公司名称：
								<a href="">${ypc.uname }</a>
					
							<div style="margin-top: 10%;">公司网址：<a href="">${ypc.web_url }</a></div>
							<div style="margin-top:10%;">公司联系人：${ypc.linkmen }</div>
							<div style="margin-top: 10%;">公司电话：${ypc.cphone }</div>
							<div style="margin-top:10%; ">公司地址：${ypc.address }</div>
							<div style="margin-top: 10%;">公司介绍：</div>
							<div style="height:auto;">
							
								&nbsp;&nbsp;${ypc.introduce }
							</div>
						</div>
					</div>
				</div>
              </div>   
            </div>    
        </div>   
     
 </div>
  </body>
</html>
