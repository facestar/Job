<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                 <div class="q11"><a href="company221.jsp">查询余额</a></div>
                 <div class="q11"><a href="company222.jsp">查看充值记录</a></div>
               </div>
                     <div class="chongzhik" style="height: 548px;overflow:scroll;">
                     <img src="images/jiaoyi.png" style="width: 794px;"/>
                       <table style="border:1px solid #D7D7D7;width: 793;border-collapse: collapse;font-size: 15px" >
								<tr style="border:1px solid #D7D7D7;font-weight: bold;font-size: 10px;">
									<td style="height:50; width:260;">充值时间</td>
									<td style="height:50; width:220;" >充值金额</td>
									
								</tr>
								<c:forEach items="${li }" var="cx">
								<tr>
									<td style="height:50; width:260;">${cx.rtime }</td>
									<td style="height:50; width:220;">${cx.money }</td>
									
								</tr>
								</c:forEach>
							</table>
                    </div>                    
       
     </div>
 </div>
  </body>
</html>
 <%@include file="Foot.jsp" %>