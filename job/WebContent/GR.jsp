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
           <div class="q13" style="margin-top: -600px; ">
               <div class="q12" >
                 <div class="q11"><a href="/job/user/chaxun.do?uname=${login.uname }" >基本信息</a> </div>
                 <div class="q11"><a href="/job/user/geren.do?uname=${login.uname }">完善信息</a></div>
                 
               </div>
                    <div class="xinxi2" style="height: 540px;">
                    <div style="width: 400px; height: 600px;margin: 0 auto;font-size: 17px;font-family:DFKai-SB">
                  <form method="post" action="/job/user/xiugai.do" >
                    <%@include file="htmlEdit.jsp" %>
                                             个人头像：<input type="text" name="picture" class="uploadfilecss" id="up" style="width:200px;height: 27px; " placeholder="请上传图片" value="${GR.picture}"/><br><br>
                  &nbsp;&nbsp;用户名：<input type="text" name="uname" class="shuru" value="${GR.uname}"/>&nbsp;&nbsp;<input type="hidden" name="upassword" class="shuru" value="${GR.upassword}"/><br><br> 
                  
                                                 真实姓名：<input type="text" name="name" class="shuru" value="${GR.name}"/><br><br>
                    &nbsp;&nbsp;&nbsp;年龄：&nbsp;<input type="text" name="age" class="shuru" value="${GR.age}" onkeyup="this.value=this.value.replace(/\D/g, '')" placeholder="只可以输入数字"/><br><br>
                   &nbsp; &nbsp;性别：
                  <select  name="sex" style="width:200px;height: 27px;">
                  <option value="男">男</option>
                  <option value="女">女</option>
                  </select>
                   
                  <%--  <input type="text" name="sex" class="shuru" value="${GR.sex}" placeholder="只可以输入汉字"/> --%><br><br>
                  &nbsp;&nbsp;&nbsp;学历：&nbsp;<input type="text" name="study" class="shuru" value="${GR.study}"/><br><br>
                  &nbsp;&nbsp;&nbsp;学校：&nbsp;<input type="text" name="school" class="shuru" value="${GR.school}"/><br><br>
									
								工作地区：<input type="text" name="area" class="shuru" value="${GR.area}"/><br><br>
								&nbsp;&nbsp;&nbsp;电话：&nbsp;<input type="text" name="uphone" class="shuru" value="${GR.uphone}"/><br><br>
									&nbsp;&nbsp;身份证：<input type="text" name="IDCard" class="shuru" value="${GR.IDCard}"/><br><br>
							&nbsp;&nbsp;&nbsp;&nbsp;邮箱：<input type="text" name="upostbox" class="shuru" value="${GR.upostbox}"/><br><br>
														<input type="hidden" name="zt" value="${GR.zt}"/>
														<input type="hidden" name="balance" value="${GR.balance}"/>
									<button class="que" type="submit" style="cursor: pointer;">确认</button>
                   
                   </form>
                    </div>
                       
                    </div>           
         </div>
</div>
       
       
   
  </body><br> <%@include file="Foot.jsp" %>
</html>

