<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="Head.jsp" %>
<html>
  <head>
    
    <title>钱包管理</title>
    
	
	<link rel="stylesheet" type="text/css" href="css/qianbaostyles.css">
	

  </head>
  
  <body>
  <hr>
     <div style="width: 1000px;height: 600px;margin: 0 auto; ">
        <div >
        <table class="zz" style="width:180px;height:600px;background-color:#C8D4EF">
        <tr> <td id="hide1" style="text-align: center;color:#3D84B0;font-size: 20px;">
        <img src="images/tou.png" style="width: 180px;margin-top: -30px"></img><br>
       个人用户</td> </tr>
      <tr>
         <td id="hide3" style="color:#3D84B0;font-size: 18px;">
          &nbsp;&nbsp;<img src="images/png311591110154581.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top: -27px;margin-left: 64px;" ><a href="GRxinxi.jsp" class="zt">个人信息 </a></div>
         </td> </tr> 
      
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
           <div class="q1" style="margin-top: -600px; ">
               <div class="q12">
                 <div class="q11"> <a href="QianBao.jsp" >钱包充值</a></div>
                 <div class="q11"><a href="/job/recharge/select.do?id=${login.id}" >查询余额</a></div>
                 <div class="q11"><a href="/job/recharge/jilu.do?id=${login.id}" >查看充值记录</a></div>
               </div>
                    <div class="chongzhik"style="font-family: monospace;font-size:20px; ">
                    <img src="images/yue.jpg" style="width: 100px;height: 100px;"/>
                     &nbsp;&nbsp;&nbsp;&nbsp;  您的账号余额为:${rec.balance}兼职币
                    </div>           
         </div>
   </div>    
       
       
   
  </body>
</html>
 <%@include file="Foot.jsp" %>
