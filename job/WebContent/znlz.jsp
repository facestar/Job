<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.io.*,java.util.*" %>
<%@include file="Head.jsp" %>
<%@ page import="java.text.*"%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>aa</title>
    
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
	<table width="960" border="0">
	  <tr>
		<td width="960" valign="top">
			<div style="margin-top:5px;">
				<div>
					<div style="float:left; width:40%; min-height:100px;height:auto;">
						<div class="resumeType" style="background-color: #D5F3F8;">
							<img src="imagezlogo/system.png" />企业图章
						</div>	
						<div>
							<div style="float:left; width:200px; border:none;">
								<div>
									
									
										<img width="200" height="100" alt=""  src="${cpy.picture}">
									
								</div>
								<div style="margin-top:20px;">
									<img width="160" height="80" title="执照认证" src="${cpy.zhizhao }">
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
						<div class="resumeType" style="background-color: #D5F3F8;margin-top: 10px;">
							<img src="imagezlogo/gear--pencil.png" />公司信息
						</div>
						<div class="partTimeJobBasicInfo" style="border:none; border-left:#999999 1px solid;">
							<div style="margin-top: 10px;">公司名称：
								<a href="http://www.mengniu.com.cn/">${cpy.uname }</a>
	<!-- 关注在这里 -->							
							<div style="margin-top: 10px">公司网址：<a href="http://www.mengniu.com.cn/">${cpy.web_url }</a></div>
							<div>公司地址：${cpy.address }</div>
							<div>公司介绍：</div>
							<div style="height:auto;">
							
								&nbsp;&nbsp;${cpy.introduce }
							</div>
						</div>
					</div>
				</div>
				<div style="clear:both;">
					<div style="float:left; width:65%; min-height:100px;">
						<div class="resumeType" style=" clear:both;background-color: #D5F3F8;">
							<img src="imagezlogo/system.png" />兼职基本信息【
								<font style="color:#0099FF; font-weight:bold; font-size:16px;">
									${cmw.wtitle}
									
								</font>】  浏览：<%= djl%>次
						</div>
						<div class="" style="border:#CCCCCC 1px dashed;" >
							<div style="margin-top:5px;">发布时间：${cmw.wtime}</div>
							<div style="margin-top:5px;">兼职类型：如图所示<div style=";"><img title="${cmw.wtitle}" src="imagejxg/${cmw.wtype }.jpg" /></div></div>
							<div style="margin-top:5px;">兼职地点：${cmw.waddress}</div>
						    <div style="margin-top:5px;">招聘人数：${cmw.wnumber}人</div>
							<div style="margin-top:5px;">兼职录取截止：${cmw.endtime} </div>
							<div style="margin-top:5px;">面试时间：${cmw.facetime}</div>
							<div style="margin-top:5px;">兼职日期：${cmw.begindate}  至 ${cmw.enddate} </div>
							<div style="margin-top:5px;">兼职要求：性别:${cmw.wsex} 身高:${cmw.wheight}学历:${cmw.wstudy}</div>
							<div style="height:auto; padding-bottom:10px;margin-top:5px;">其他要求：${cmw.wother}</div>
							<div style="margin-top:5px;">兼职介绍：</div>
							<div style="height:auto !important; height:50px;min-height:50px;margin-top:5px;">&nbsp;&nbsp;${cmw.wintroduce}</div>
							<div style="height:65px; padding-top:40px; padding-left:50px;" class="shenqing">
								<script type="text/javascript">
									var kaishi=new Date('${cc.begindate} '.replace(/\-/g, "\/"));
									var jieshu=new Date('<%=datetime%>'.replace(/\-/g, "\/"));
									var loginUs='';
									if(jieshu<kaishi){
										document.write("<div onclick=\"window.location.href='${pageContext.request.contextPath }/signup/baoming.do?username=${login.uname}&wid=${cc.id}&cid=${pp.id}&gz=${gz}'\" style=\"font-size:18px;  color:#CC0000;  font-weight:bold;float:left;cursor: pointer;\">我要报名&nbsp;&nbsp;&nbsp;</div>");
									
									}else{
										document.write("<div style=\"font-size:18px; color:#CC0000; font-weight:bold;\">该兼职报名已经结束！</div>");
									}
								</script>
							</div>
						</div>
					</div>
					<div style="float:left; width:34%; min-height:100px;">
						<div class="resumeType" style="background-color: #D5F3F8;">    
							<img src="imagezlogo/diannaojia.png" />报名须知
						</div>
						<div style="text-align:left; padding:5px; color:#000000; font-size:14px; background-color:#FFFFCC;">
							&nbsp;&nbsp;亲爱的用户，请您谨慎的选择兼职，并合理地进行报名，如果您同时进行多次报名，并同时被多家企业录用，那么分身乏术的您，将不能同时参加多次兼职，这势必影响您在本网站内的兼职信誉度，也将对您以后的兼职报名造成不良的影响。当然，如果您选取的多次的兼职时间是不冲突的，那么恭喜您，接下来的时间里，您将获得丰厚的兼职报酬和丰富的兼职经历。
						</div>
						<div>
							<div class="resumeType" style="background-color: #D5F3F8;">
								<img src="imagezlogo/diannaojia.png" />我要评价
							</div>
							<div>
								<div style="width:97%; height:auto !important; min-height:150px; overflow: border:#999999 1px solid; height:150px; padding:8px; text-align:left;">
									
									
									
									
										登录并且您已经成功应聘才能评价该公司，请&nbsp;<a href="login.jsp">登录</a>
									
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<div class="resumeType" style="clear:both;background-color: #D5F3F8; ">
					<img src="imagezlogo/diannaojia.png" />该公司所有兼职
				</div>
				<div style="width:100%;min-height: 200px;">
					
							
							<c:forEach items="${ll}" var="lv">
								
									<div class="listkk" style="border:#CCCCCC 1px dashed;width:24.2%;float:left;margin-top:7px;margin-left:5px;">
										<div style="width:100%; text-align:center;">
											<a target="_blank" href="jianzhixx.jsp">
												<img title="${lv.wtitle}" src="imagezqy/${lv.wtype }.jpg" />
											</a>
										</div>
										<div style="text-align:center;">
											<table style="width:100%; border:0;">
											  <tr>
												<td title="${lv.wtitle}" style="text-align:center;"><a target="_blank" href="/job/work/findbyid.do?id=${lv.id}&&cid=${lv.company_id}">
													${lv.wtitle} 
												</a></td>
												<td style="width:50px;">
										<script type="text/javascript">
									
									         var kaishi=new Date('${lv.enddate} '.replace(/\-/g, "\/"));
									            var dangqian=new Date('<%=datetime%> '.replace(/\-/g, "\/"));
									      if(dangqian<kaishi){
										           document.write("<div style=\"font-size:16px; color:#CC0000; font-weight:bold;\">未完成！</div>");
									       }else{
										          document.write("<div style=\"font-size:16px; color:#CC0000; font-weight:bold;\">已完成！</div>");
									            }
								         </script>
												</td>
											  </tr>
											  <tr>
											  	<td colspan="2" style="text-align:center;">
											  		性别要求：
											  		
											  		
											  			${lv.wsex }
											  		
											  		<br>招聘人数：${lv.wnumber }/已报人数：****1
											  	</td>
											  </tr>
											</table>
										</div>
									</div>
								
								</c:forEach>
					
				</div>
			</div>		
		</td>
	  </tr>
	</table>
</div>

      
<%@include file="Foot.jsp" %>
  </body>
</html>

