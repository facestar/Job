<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="Head.jsp"%>
<%@include file="htmlEdit.jsp" %>
<html>
  <head>
    <title>企业管理</title>
    
	
	<link rel="stylesheet" type="text/css" href="css/jzglstyles.css">


  </head>
  
  <body>
     <div style="width: 1000px;height: 600px;margin: 0 auto;border: 1px solid white; ">
    
     <div>
        <table  style="width:200px;height:600px;background-color: #C8D4EF">
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
             <div style="margin-top:-25px;margin-left: 64px;" > <a href="company33.jsp" class="zt">消息管理 </a></div>
        </td> </tr> 
        <tr> 
        <td id="hide4" style="font-size: 18px;">
        &nbsp;&nbsp;<img src="images/mail_send.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top:-25px;margin-left: 64px;" > <a href="company44.jsp" class="zt">发布兼职 </a></div>
        </td> </tr>
       
       </table>
      </div>
           <div class="j5">
                 <div class="g1">
                     <div class="g11"><a href="/job/user/chaxun.do?uname=${login.uname }">企业基本信息</a></div>
                     <div class="g12"><a href="/job/user/geren.do?uname=${login.uname }">完善信息</a></div>
                </div>
                          <div style="width: 800px;height:500px;">
                          <form action="/job/company/xiugai.do" method="post">
							<table style="width: 800px;height:500px;margin-left: 150px;" >
									<tr><td >企业头像：<input type="text" name="picture" class="uploadfilecss" id="up" style="width:200px;height: 27px; " placeholder="请上传图片" value="${GR.picture}"/></td></tr>
									<tr><td >企业名称：<input type="text"name="uname"style="width:200px;height: 27px;border-radius: 4px;border: 1px solid #ccc; " value="${GR.uname }"><input type="hidden"name="cpassword"style="width:200px;height: 27px;border-radius: 4px;border: 1px solid #ccc; " value="${GR.cpassword }"></td></tr>
								
									<tr><td >企业邮箱：<input type="text"name="cpostbox"style="width:200px;height: 27px;border-radius: 4px;border: 1px solid #ccc; " value="${GR.cpostbox }"></td></tr>
									<tr><td >企业类型: <input type="text"name="ctype"style="width:200px;height: 27px; border-radius: 4px;border: 1px solid #ccc;" value="${GR.ctype }"></td></tr>
									<tr><td >&nbsp;联系人：<input type="text" name="linkmen"style="width:200px;height: 27px;border-radius: 4px;border: 1px solid #ccc; " value="${GR.linkmen }"></td></tr>
									<tr><td >联系方式：<input type="text" name="cphone" style="width:200px;height: 27px; border-radius: 4px;border: 1px solid #ccc;"value="${GR.cphone }"></td></tr>
									<tr><td > &nbsp;联系qq: <input type="text" name="cqq"style="width:200px;height: 27px;border-radius: 4px;border: 1px solid #ccc; " value="${GR.cqq }"></td></tr>
									<tr><td > 企业地址: <input type="text" name="address"style="width:200px;height: 27px;border-radius: 4px;border: 1px solid #ccc; " value="${GR.address }"></td></tr>
									<tr><td > 企业网址: <input type="text" name="web_url"style="width:200px;height: 27px;border-radius: 4px;border: 1px solid #ccc; " value="${GR.web_url}"></td></tr>
									<tr><td >企业简介：<input type="text" name="introduce"style="width:200px;height: 80px; border-radius: 4px;border: 1px solid #ccc;" value="${GR.introduce }" style="height: 100px;"placeholder="请输入公司的简介"></td></tr>
									<tr><td >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="hidden" name="zhizhao" value="${GR.zhizhao }">
									<input type="hidden" name="state" value="${GR.state}">
									<input type="hidden" name="balance" value="${GR.balance}">
									<input type="submit" name="" value="保存" style="width: 55px;height: 35px;background-color:#FFAA25;border-radius: 4px;border: 1px solid #ccc; "/></td></tr>
				    	</table>
				    	</form>
						</div>		
                       
          </div>
                      
      
          
             
     
     </div>
  </body>
</html><br>
<%@include file="Foot.jsp" %>
