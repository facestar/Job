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

           <div class="j1" style="overflow: scroll;">

            <h4 >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;企业发布的兼职</h4>
          <table>
          <tr style="background-color: #8CABEF">
          <td class="j2" style="width: 100px">序号</td>
           <td class="j3"style="width: 400px">兼职名称</td>
             <td class="j3" style="width: 200px">兼职时间</td>
              <td class="j3" style="width: 200px">操作</td>
              <td class="j3" style="width: 200px"></td>
              
          </tr>
          <c:forEach items="${ff}" var="h" varStatus="hu">
              <tr>
          <td class="j2">${hu.index+1}</td>
           <td class="j3">${h.wtitle}</td>
            <%-- <td class="j3">${h.wstate }</td> --%>
             <td class="j3">${h.begindate }</td>

              <td class="j3"> <a href="/job/work/deletework.do?id=${h.id}&username=${login.uname}">删除 </a>
              <a href="/job/work/wancheng.do?id=${h.id}">
              <c:if test="${h.wstate eq '未完成'}">
              点击完成</c:if></a>
             <a style="color: red;">  <c:if test="${h.wstate eq '已完成'}">
              已完成</c:if></a>  </td>


              <td class="j3"><a href="/job/user/findComuser.do?wid=${h.id}">查看报名人数 </a>  </td>

          </tr></c:forEach>


          </table>
         
       </div>
           
      
          
             
     
     </div>
  </body>
</html><br>
<%@include file="Foot.jsp" %>
