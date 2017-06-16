<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="Head.jsp"%>


<html>
  <head>
    
    
    <title>钱包管理</title>
    <META HTTP-EQUIV="pragma" CONTENT="no-cache"> 
	<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache, must-revalidate"> 
	<META HTTP-EQUIV="expires" CONTENT="Wed, 26 Feb 1997 08:21:57 GMT">
    
	<link rel="stylesheet" type="text/css" href="css/qianbaostyles.css">
	<link rel="stylesheet" type="text/css" href="css/jzglstyles.css">
	<script type="text/javascript">
		function panduan(){
			var te = document.getElementById("kahao").value;
			var he = document.getElementById("mima").value;
			if(te==""||he=="")
			{
				alert("你输入的卡号或者密码为空，请重新输入：");
			}else
			{
				var ee = document.getElementById("qiyechongzhi");
				ee.submit();
			}
		}
	</script>
	<script type="text/javascript">
		var bv = "${bv}"
		if(bv!="")
		{
			alert(bv);
		}
	</script>
  </head>
  
  <body>
     <div style="width: 1000px;height: 600px;margin: 0 auto;border: 1px solid white; ">
    
     <div>
        <table  style="width:200px;height:600px;background-color:#C8D4EF">
        <tr> 
        <td id="hide4" style="font-size: 18px;">
         &nbsp;&nbsp;<img src="images/png311591110154581.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top:-25px;margin-left: 64px;" ><a href="/job/user/chaxun.do?uname=${login.uname }" class="zt">企业信息管理 </a></div>
        </td> </tr>
       
       <tr>
             <td  style="font-size: 18px;">
            &nbsp;&nbsp;<img src="images/jianzhiGL.jpg" style="width: 25px;height: 25px;"></img>
             <div style="margin-top: -27px;margin-left: 64px;" > <a href=" /job/work/comFindWork.do?username=${login.uname }"  class="zt" >兼职管理</a></div>
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
               	<form action="/job/rechargeCard/qiyechaxun.do" method="post" id="qiyechongzhi">
                    <div class="chongzhik">
                    &nbsp;<img src="images/qianduoduo.png"/>
                       <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                       充值卡号:&nbsp;<input type="text" name="cardnumber" id="kahao" class="butt" onkeyup='this.value=this.value.replace(/\D/gi,"")'/><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		                                    充值密码:&nbsp;<input type="password" name="rpassword" id="mima" class="butt" onkeyup='this.value=this.value.replace(/\D/gi,"")'/><br><br>
		                            <input type="hidden" name="money" value="100"/>
		                            <input type="hidden" name="balance" value="${login.balance}"/>
		                            <input type="hidden" name="company_id" value="${login.id}"/> 
		                           <input type="hidden" name="id" value="${login.id}"/>
				            <input type="button" value="提交" onclick="panduan()" style="width: width: 50px;height: 30px;margin-left: 300px;background-color: #8CABEF"/>
                    </div>           
       			</form>
    </div> 
 </div>
  </body>
</html>
 <%@include file="Foot.jsp" %>