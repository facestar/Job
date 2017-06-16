<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="Head.jsp" %>
<head>
 <title>个人中心之兼职管理</title>
    <link rel="stylesheet" type="text/css" href="css/jzglstyles.css">
</head>
  
  <body>
  <div style="width: 1000px;height: 700px;margin: 0 auto;">
      <div >
       <table class="zz" style="width:180px;height:700px;background-color:#C8D4EF">
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
        <div class="j1" style="margin-top: -700px;height: 700px; overflow:scroll">
       <h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;申请的兼职列表</h4>
          <table>
          <tr>
          <td class="j2" style="width: 50px;">序号</td>
           <td class="j3" style="width: 300px;">兼职名称</td>
            <td class="j3" style="width: 100px;">兼职状态</td>
             <td class="j3" style="width: 50px;">兼职时间</td>
              <td class="j3" style="width: 100px;">操作</td>
          </tr>
          <c:forEach items="${ff}" var="h" varStatus="hu">
              <tr>
          <td class="j2">${hu.index+1}</td>
           <td class="j3">${h.wtitle}</td>
            <td class="j3">${h.wstate }</td>
             <td class="j3">${h.begindate }</td>
              <td class="j3" style="width: 100px;"><a href="/job/work/tiaojifen.do?wid=${h.id}&uname=${login.uname}">查看兼职信息</a></td>
          </tr></c:forEach>
               
          </table>
          
       </div>
</div>
  </body><br>
  <%@include file="Foot.jsp" %>
