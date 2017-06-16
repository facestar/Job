<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="Head.jsp"%>
<html>
  <head>
    <title>企业管理</title>
    
	
	<link rel="stylesheet" type="text/css" href="css/jzglstyles.css">


  </head>
  
  <body>
     <div style="width: 1000px;height: 600px;margin: 0 auto;border: 1px solid white; ">
    
     <div>
        <table  style="width:200px;height:600px;background-color:#C8D4EF">
        <tr> 
        <td id="hide4" style="font-size: 18px;">
         &nbsp;&nbsp;<img src="images/png311591110154581.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top:-25px;margin-left: 64px;" > <a href="/job/user/chaxun.do?uname=${login.uname }" class="zt">企业信息管理 </a></div>
        </td> </tr>
       
        <tr>
             <td  style="font-size: 18px;">
            &nbsp;&nbsp;<img src="images/jianzhiGL.jpg" style="width: 25px;height: 25px;"></img>
             <div style="margin-top: -27px;margin-left: 64px;" > <a href="/job/work/comFindWork.do?username=${login.uname }"  class="zt" >兼职管理</a></div>
             </td>
       </tr>
        <tr> <td id="hide2" style="font-size: 18px;">
       &nbsp;&nbsp;<img src="images/wallet.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top:-25px;margin-left: 64px;" ><a href="company22.jsp" class="zt">钱包管理</a></div>
             </td> </tr>
        <tr> 
        <td id="hide3" style="font-size: 18px;">
       &nbsp;&nbsp;<img src="images/text-message.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top:-25px;margin-left: 64px;" > <a href="/job/findif.do" class="zt">消息管理 </a></div>
        </td> </tr> 
        <tr> 
        <td id="hide4" style="font-size: 18px;">
        &nbsp;&nbsp;<img src="images/mail_send.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top:-25px;margin-left: 64px;" > <a href="company44.jsp" class="zt">发布兼职 </a></div>
        </td> </tr>
       
       </table>
      </div>
           <div class="j5" style="background-color:">
                 <div class="g1">
                     <div class="g11"><a href="/job/user/chaxun.do?uname=${login.uname }">企业基本信息</a></div>
                     <div class="g12"><a href="/job/user/geren.do?uname=${login.uname }">完善信息</a></div>
                 </div>
                         <div>
							<table style="width: 400px;height:300px;margin-left: 130px;margin-top: 20px;color: #551A8B;font-family:monospace;font-weight: bold;font-size: 13px;" >
									<tr >
									  
									   <td><div style="height: 140PX;width:170px; border-radius: 5px;border:1px solid #D5D5D5;margin-top: -30px">
									  <img title="兼职图片类型" src="${select.picture}" style="width: 170px;height: 140px;"/>
									   </div></td>
								      <td style="height: 140PX;">企业头像</td>
								    <tr>
									<tr >
									<td style="height: 40PX; ">
									企业名称<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px; font-family:serif;padding-top: 12px; background-color:#F5F5F5 ">${select.uname}</div></td>
									
									<td style="height: 40PX; ">
									企业邮箱<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5">${select.cpostbox}</div></td>
								    </tr>
								    
								    
									<tr>
								    <td style="height: 40PX;">
								         办公地点<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5"> ${select.address}</div></td>
									<td style="height: 40PX; ">
									网址<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5">${select.web_url}</div>
									</td>
									</tr>
								
									<tr >
									<td style="height: 40PX;">
									 联系人<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5">${select.linkmen}</div></td>
									<td style="height: 40PX; ">
									联系方式<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5">${select.cphone}</div></td>
									
									</tr>
									
									<tr>
									<td style="height: 40PX; ">
									联系qq<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5">${select.cqq}</div></td>
									<td style="height: 40PX; ">
									企业地址<div style="border-radius: 5px;border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5"> ${select.address}</div></td>  
									</tr>
									<tr >
									<td style="height: 40PX; ">
									联系qq<div style="border-radius: 5px; border:1px solid #D5D5D5;height: 25PX;width:170px;padding-top: 12px;background-color:#F5F5F5">${select.cqq}</div></td>
									 
									</tr>
									
									
									
									
									
				    	</table>
					</div>			
                       
          </div>
                      
      
          
             
     
     </div>
  </body>
</html><br>
<%@include file="Foot.jsp" %>
