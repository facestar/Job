<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
 <%@include file="Head.jsp" %>
<head>
   <title>登录</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
    
    <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("#hide").click(function(){
    $(".l4").hide();
  });
  $("#show").click(function(){
    $(".l4").show();
    
  });
});
</script>
<script>
$(document).ready(function(){
  $("#hide").click(function(){
    $(".l5").show();
   
  });
  $("#show").click(function(){
    $(".l5").hide();
  });
});
</script>
<script type="text/javascript">
	
	var ut = "${ut}"
	if(ut!="")
	{
		alert(ut);
	}
</script>
<script type="text/javascript">
	var re = "${re}"
	if(re!="")
	{
		alert(re);
	}
</script>
	</head>
  
  <body>
 <div class="l1">
    <hr>
       <div class="l2"><img src="images/re.png"></img>
         <div style="margin-left: 50px;margin-top:-27px;color: white;" id="show">学生用户登录</div>
       </div>
        
             <div class="l3"><img src="images/shang.png"></img>
                 <div style="color: white;font-weight: bold;margin-top: -26px;margin-left: 40px;" id="hide">商业/公益登录</div>
             </div><br>
             	<form action="/job/user/login.do" method="post">
                 <div class="l4">
                                                用户名： <input type="text" name="uname" style="height: 25px;"/>&nbsp;请输入用户名<br><br>
           &nbsp;密码： <input type="password" name="upassword" style="height: 25px;" maxlength="10"/>&nbsp;最长为10位<br><br>

                      <input type="button" value="注册" class="button1" onclick="window.location.href='register.jsp'" style="cursor: pointer;">
                      <input type="submit" value="登录" class="button1" style="cursor: pointer;">
                     </div>
                     </form>
                     	<form action="/job/company/login.do" method="post">
                          <div class="l5" onMouseout="hidden(this);"style="display: none">
                                                                商业/慈善名称：<input type="text" name="uname" style="height: 25px;"/>&nbsp;请输入名称<br><br>&nbsp;&nbsp; 
                        &nbsp; &nbsp;密码:<input type="password" name="cpassword" style="height: 25px;"maxlength="16"/>&nbsp;最长为16位<br><br>
                       <input type="button" value="注册" class="button2" onclick="window.location.href='register.jsp'" style="cursor: pointer;">
                         <input type="submit" value="登录" class="button2">
                           </div>
                 		</form>
       
       
 </div>
  </body>
  <%@include file="Foot.jsp" %>
