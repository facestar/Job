<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="Head.jsp"%>
<html>
  <head>
   
    
    <title>查询余额</title>
	<link rel="stylesheet" type="text/css" href="css/qianbaostyles.css">
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
          <div class="q1">
               <div class="q12">
                 <div class="q11"><a href="company22.jsp" >钱包充值</a> </div>
                 <div class="q11"><a href="/job/recharge/qiyechaxun.do?id=${ login.id}">查询余额</a></div>
                 <div class="q11"><a href="/job/recharge/qiyejilu.do?id=${ login.id}">查看充值记录</a></div>
               </div>
                     <div class="chongzhik" style="font-family: monospace;font-size:20px; ">
                     <img src="images/yue.jpg" style="width: 100px;height: 100px;"/>
                           &nbsp;&nbsp;&nbsp;&nbsp; 您的账号余额为:${com}
       
     </div>
 </div>
 
</div>
  </body>
</html>
 <%@include file="Foot.jsp" %>