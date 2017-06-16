<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.io.*,java.util.*" %>
<%@include file="Head.jsp" %>
<%@ page import="java.text.*"%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>兼职详细信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
	.g1:HOVER {
	cursor: pointer;
    }
	</style>
	 <!-- <link rel="stylesheet" type="text/css" href="css4/css41.css"> -->

      <%
	 String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()); //获取系统时间 
     %>
  </head>
  <script type="text/javascript">
  var msg="${msg}";
  if(msg!="")
  {
  	alert(msg);
  }
  </script>
  
  <body>
  <%
    Integer djl = 
      (Integer)application.getAttribute("djl");
    if( djl ==null || djl == 0 ){
       /* 第一次访问 */
       /* out.println("欢迎访问菜鸟教程!"); */
       djl = 1;
    }else{
       /* 返回访问值 */
       /* out.println("欢迎再次访问菜鸟教程!"); */
       djl += 1;
    }
    application.setAttribute("djl", djl);
%>
  <hr style=" background-color:#00b3ee;">
 	
<div id="backHead" title="返回顶端" class="goHead" style="position:fixed; right:0; bottom:0;cursor:pointer; display:none;">返回顶端</div>
<script>
	window.onscroll=function(){
		if(document.body.scrollTop||document.documentElement.scrollTop>0){
			document.getElementById('backHead').style.display="block";
		}else{
			document.getElementById('backHead').style.display="none";
		}
	};
	$(document).ready(function(){
		$("#backHead").click(function(){
			$("html, body").animate({ scrollTop: 0 }, 120);
		})
		
	});
</script>


<div align="center">
	<table width="1000" border="0">
	  <tr>
		<td width="1000" valign="top">
			<div style="margin-top:5px;">
				<div>
					<div style="float:left; width:40%; min-height:100px;height:auto;">
						<div class="resumeType" style="background-color: #D5F3F8;font-size: 20px;">
							<img src="imagezlogo/system.png" />企业图章
						</div>	
						<div>
							<div style="float:left; width:200px; border:none;">
								<div>
									
									
										<img width="200" height="100" alt="" src="${pp.picture }">
									
								</div>
								<div style="margin-top:20px;">
									<img width="160" height="80" title="执照认证" src="${pp.zhizhao }">
								</div>
							</div>
							<div style="float:left; width:150px; text-align:left; padding-left: 20px;">
								<div>
									
									
										<img title="2" width="100" height="100" src="imagezlogo/jianzhixiaomaibu.jpg"/>
									
									
								</div>
								<div>
									
									
										<img title="5" width="100" height="100" src="imagezlogo/minjianyiren.jpg"/>
									
								</div>
							</div>
						</div>
					</div>
					<div style="float:left; width:59%; min-height:100px;height:auto;">
						<div class="resumeType" style="background-color: #D5F3F8;font-size: 20px;">
							<img src="imagezlogo/gear--pencil.png" />公司信息
						</div>
						<div class="partTimeJobBasicInfo" style="border:none; border-left:#999999 1px solid;">
							<div style="height: 25px;">公司名称：
								<a href="http://www.mengniu.com.cn/">${pp.uname }</a>
	
							</div>
							<div style="height: 25px;">公司网址：<a href="http://www.mengniu.com.cn/">${pp.web_url }</a></div>
							<div style="height: 25px;">公司地址：${pp.address }</div>
							<div style="height: 25px;">公司介绍：</div>
							<div style="height:100px;">
								&nbsp;&nbsp;${pp.introduce }
							</div>
						</div>
					</div>
		       </div>
		</div>
	</table>			
</div>
          <div style="width: 1000px;height: 600px;border: 1px solid #C0C0C0;margin-left: 170px;overflow: scroll;">
          
             <div style="background-color: #D5F3F8;font-size: 20px;"><img src="images/text-message.png" style="width: 25px;height: 25px;"/><div style="margin-top: -23px;margin-left: 25px;">用户的评论内容</div>
              </div>
           <c:forEach items="${pl }" var="yu">
              <div style="border:1px solid #C0C0C0;width: 1000px;height:120px;margin-top: 0px;">
                  
                   <div style="border: 1px solid #C0C0C0; width: 80px;height: 80px;margin-top: 17px;margin-left: 10px;"><img style="width: 80px;height: 80px;" src="${yu.tupian }"> </div>
                      <div style="margin-left: 120px;margin-top: -80px">${yu.content} </div>
                      
              </div>
              </c:forEach> 
            
              
          </div>
          
           

  </body>
</html><br>
<%@include file="Foot.jsp" %>