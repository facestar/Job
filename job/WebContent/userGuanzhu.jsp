<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="Head.jsp" %>
<html>
  <head>
    
    <title>钱包管理</title>
    
	
	<link rel="stylesheet" type="text/css" href="css/qianbaostyles.css">
	

  </head>
  
  <body>
  <hr>
     <div style="width: 1000px;height: 600px;margin: 0 auto;">
        <div >
        <table class="zz" style="width:180px;height:600px;background-color:#C8D4EF">
        <tr> <td id="hide1" style="text-align: center;color:#3D84B0;font-size: 20px;">
        <img src="images/tou.png" style="width: 180px;margin-top: -30px"></img><br>
       个人用户</td> </tr>
        <tr>
         <td id="hide3" style="color:#3D84B0;font-size: 18px;">
          &nbsp;&nbsp;<img src="images/png311591110154581.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top: -27px;margin-left: 64px;" ><a href="/job/user/chaxun.do?uname=${login.uname }" class="zt">个人信息 </a></div>
          </td> 
         </tr> 
       
       <tr> 
        <td id="hide1" style="color:#3D84B0;font-size: 18px;">
        &nbsp;&nbsp;<img src="images/wallet.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top: -27px;margin-left: 64px;" ><a href=" QianBao.jsp"  class="zt">钱包管理</a></div>
        </td> </tr>
        
        <tr> 
        <td id="hide2" style="color:#3D84B0;font-size: 18px;">
         &nbsp;&nbsp;<img src="images/text-message.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top: -27px;margin-left: 64px;" ><a href="/job/findInform.do" class="zt">通知消息</a></div>
        </td> </tr>
        
       
         
        <tr> <td id="hide4" style="color:#3D84B0;font-size: 18px;">
        &nbsp;&nbsp;<img src="images/jianzhiGL.jpg" style="width: 25px;height: 25px;"></img>
             <div style="margin-top: -27px;margin-left: 64px;" > <a href="/job/work/userFindWork.do?username=${login.uname }" class="zt">兼职管理 </a></div>
        </td> </tr>
       </table>
       </div>
       <div style="margin-left: 202px;  border: 1px solid #E1E1E1;width: 796px;height: 35px;margin-top: -600px;background-color:#F5F5F5">
       <div 
       style="width: 100px;height: 25px;
       background-color: #E3E3E3;padding-top: 12px;
       text-align: center;"><a href="/job/findInform.do?uid=${login.id }" class="zt"> 通知信息</a></div>
       <div style="width: 100px;height: 25px;margin-left: 100px;margin-top: -37px;background-color: #BBCBEF;text-align: center;padding-top: 10px;cursor: pointer;"><a href="/job/guanzhu/chaqiye.do?id=${login.id}">关注的企业</a></div>
       </div>
          
       <div class="tongzhi" style="height: 550px;margin-left: 202px;overflow: scroll;">
       
             
					<table  style="text-align: center;border: 1px solid #ccc;font-size: 15px;" >
							<tr style="background-color: #8CABEF" >
							    <td height="29" width="200">序号</td>
								<td height="29" width="410">关注的企业的名称</td>
								<td height="29" width="250">操作</td>
							</tr>		
						<c:forEach items="${yy}" var="po">						
						<tr style="border: 1px solid #ccc;">
						<td>${po.id}</td>
						<td>${po.uname}</td>
					
						<td><a href="/job/guanzhu/shanqiye.do?id=${po.id}">删除</a></td>
						</tr>
					</c:forEach>
					
						</table>     
       </div> 
</div>
       
       
   
  </body>
</html>
  <%@include file="Foot.jsp" %>