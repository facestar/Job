<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="Head.jsp" %>
<html>
  <head>
    
    <title>钱包管理</title>
    
	
	<link rel="stylesheet" type="text/css" href="css/qianbaostyles.css">
	<!--  <script>setTimeout("location.href='http://localhost:8080/job/user/select.do?uname=%E5%B0%8F%E5%BC%BA'",10000)</script>-->
  </head>
  
  <body onload="SomeJavaScriptCode">
  <hr>
     <div style="width: 1000px;height: 600px;margin: 0 auto;">
        <div >
        <table class="zz" style="width:180px;height:600px;background-color:#C8D4EF;border-radius: 5px;">
        <tr> <td id="hide1" style="text-align: center;color:#3D84B0;font-size: 20px;">
        <img src="images/tou.png" style="width: 180px;margin-top: -30px"></img><br>
       个人用户</td> </tr>
      
      <tr>
         <td id="hide3" style="color:#3D84B0;font-size: 18px;">
          &nbsp;&nbsp;<img src="images/png311591110154581.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top: -27px;margin-left: 64px;" ><a href="/job/user/chaxun.do?uname=${login.uname }" class="zt">个人信息 </a></div>
         </td> </tr> 
       <tr> 
        <td id="hide1" style="color:#3D84B0;font-size: 18px;">
        &nbsp;&nbsp;<img src="images/wallet.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top: -27px;margin-left: 64px;" ><a href=" QianBao.jsp"  class="zt">钱包管理</a></div>
        </td> </tr>
        
        <tr> 
        <td id="hide2" style="color:#3D84B0;font-size: 18px;">
         &nbsp;&nbsp;<img src="images/text-message.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top: -27px;margin-left: 64px;" ><a href="/job/findInform.do?uid=${login.id }" class="zt">通知消息</a></div>
        </td> </tr>
        
        
         
        <tr> <td id="hide4" style="color:#3D84B0;font-size: 18px;">
        &nbsp;&nbsp;<img src="images/jianzhiGL.jpg" style="width: 25px;height: 25px;"></img>
             <div style="margin-top: -27px;margin-left: 64px;" > <a href="/job/work/userFindWork.do?username=${login.uname }" class="zt">兼职管理 </a></div>
        </td> </tr>
       </table>
       </div>
           <div class="q1" style="margin-top: -600px; ">
               <div class="q12">
                 <div class="q11">
                     <a href="/job/user/chaxun.do?uname=${login.uname }">基本信息</a>
                  </div>
                        <div class="q11"><a href="/job/user/geren.do?uname=${login.uname }">完善信息</a>
                        </div>
                 
               </div>
                    <div class="xinxi" style="height: 544px;">
								 <table style="width: 794px;height:400;border-collapse: collapse;font-size: 15px;" >
									<tr>
									<td ><h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									用户的基本信息</h4></td>
									</tr>
									<tr >
									<td style="width: 100px;height: 150px;">
									<div style="margin-left:180px; border: 1px solid #ccc;width: 140px;height: 140px;"><img src="${select.picture}" style="width: 140px;height: 140px;"/></div></td>
									
									</tr>
									
									
									<tr style="font-size: 13px;" >
									<td style="height: 40PX;font-weight: bold;">
									 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									 用户名
									 <div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5;margin-left: 175px;">${select.uname}</div></td>
									<td style="height: 40PX;font-weight: bold ">
									真实姓名<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5">${select.name}</div></td>
									</tr>
									
									   <tr style="font-size: 13px;">
									<td style="height: 40PX;font-weight: bold">
									 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									 性别
									 <div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5;margin-left: 175px;">${select.sex}</div></td>
									<td style="height: 40PX;font-weight: bold ">
									年龄<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5">${select.age}</div></td>
									</tr>
									
									  <tr style="font-size: 13px;">
									<td style="height: 40PX;font-weight: bold">
									 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									 学历
									 <div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5;margin-left: 175px;">${select.study}</div></td>
									<td style="height: 40PX;font-weight: bold ">
									学校<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5">${select.school}</div></td>
									</tr>
									
									 <tr style="font-size: 13px;" >
									<td style="height: 40PX;font-weight: bold">
									 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									 工作地区
									 <div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5;margin-left: 175px;">${select.area}</div></td>
									<td style="height: 40PX;font-weight: bold">
									电话<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5">${select.uphone}</div></td>
									</tr>
									
									<tr style="font-size: 13px;">
									<td style="height: 40PX;font-weight: bold">
									 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									 身份证
									 <div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5;margin-left: 175px;">${select.IDCard}</div></td>
									<td style="height: 40PX;font-weight: bold ">
									邮箱<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5">${select.upostbox}</div></td>
									</tr>
									
									<%-- <tr><td>用户名：${select.uname}</td></tr>
									<tr><td>真实姓名：${select.name}</td></tr>
									<tr><td>年龄：${select.age}</td></tr>
									<tr><td>性别：${select.sex}</td></tr>
									<tr><td>学历：${select.study}</td></tr>
									<tr><td>学校：${select.school}</td></tr>
									
									<tr><td>工作地区：${select.area}</td></tr>
									<tr><td>电话：${select.uphone}</td></tr>
									<tr><td>身份证：${select.IDCard}</td></tr>
									<tr><td>邮箱：${select.upostbox}</td></tr> --%>
									
							
								
                        </table>
                    </div>           
         </div>
</div>
       
       
   
  </body><br>  <%@include file="Foot.jsp" %>
</html>
