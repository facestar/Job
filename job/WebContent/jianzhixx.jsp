<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.io.*,java.util.*" %>
<%@include file="Head.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'findjianzhi.jsp' starting page</title>
    
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


  </head>
  
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
									
									
										<img width="200" height="100" alt="" src="imagezlogo/mengniu.png">
									
								</div>
								<div style="margin-top:20px;">
									<img width="160" height="80" title="执照认证" src="imagezlogo/zhizhaorenzheng.jpg">
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
						<div class="resumeType" style="background-color: #D5F3F8;">
							<img src="imagezlogo/gear--pencil.png" />公司信息
						</div>
						<div class="partTimeJobBasicInfo" style="border:none; border-left:#999999 1px solid;">
							<div>公司名称：
								<a href="http://www.mengniu.com.cn/">昆明蒙牛乳业销售有限公司</a>
	<!-- 关注在这里 -->				<div style="width: 60px;height: 20px;border: 1px solid;
								text-align: center;padding-top: 3px;margin-left: 450px;margin-top: -15px;
								background-color: red;color: white;font-weight: bold;" class="g1">+关注</div>
							</div>
							<div>公司网址：<a href="http://www.mengniu.com.cn/">http://www.mengniu.com.cn/</a></div>
							<div>公司地址：昆明市官渡区拓东路103号集成广场9楼</div>
							<div>公司介绍：</div>
							<div style="height:auto;">
							
								&nbsp;&nbsp;昆明蒙牛乳业销售有限公司属于蒙牛集团旗下成立的昆明分公司，分公司主要从事蒙牛相关产品的销售工作，经营的品种主要是蒙牛乳品及乳品相关食品，欢迎各位有识朋友加入蒙牛团队并共同创造出昆明的销售奇迹。
							</div>
						</div>
					</div>
				</div>
				<div style="clear:both;">
					<div style="float:left; width:65%; min-height:100px;">
						<div class="resumeType" style=" clear:both;background-color: #D5F3F8;">
							<img src="imagezlogo/system.png" />兼职基本信息【
								<font style="color:#0099FF; font-weight:bold; font-size:16px;">
									蒙牛-诚聘临时促销员数名
									
								</font>】  浏览：<%= djl%>次/报名3人
						</div>
						<div class="partTimeJobBasicInfo" style="border:#CCCCCC 1px dashed;" >
							<div>发布时间：2013-07-01 15:33:41.25</div>
							<div>兼职类型：促销</div>
							<div>兼职地点：昆明市区各大卖场</div>
							
								
									<div>兼职报酬：80.0元/天</div>
									
									
								
									
								<div style="color:#0066FF;">具体的薪酬发放形式，请关注“兼职介绍”，或工作后询问企业工作人员。</div>
							
							<div>招聘人数：10人</div>
							
								<div>兼职录取截止：2013-07-14 </div>
							
							<div>面试时间：2013-07-15 15:01:00.0</div>
							<div>兼职日期：2013-07-16  至 2013-07-31 </div>
							<div>
								兼职要求：
									性别:
									
									
										女,
									
									身高:
									
									
										不限,
									
									学历:
									
									
										不限。
									
							</div>
							<div style="height:auto; padding-bottom:10px;">其他要求：积极乐观，有上进心，能吃苦。最好有健康证。</div>
							<div>兼职介绍：</div>
							<div style="height:auto !important; height:50px;min-height:50px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;上班时间为12：00-21：00，工资分为实习阶段（60元-70元/天）和正式阶段（80元/天）。需要自备一张工商银行的卡最为工资卡，每个月18号统一发放兼职工资。</div>
							<div style="height:65px; padding-top:40px; padding-left:50px;" class="shenqingActionClass">
								<script type="text/javascript">
									var kaishi=new Date('2017-07-16 '.replace(/\-/g, "\/"));
									var jieshu=new Date('2017-07-31 '.replace(/\-/g, "\/"));
									var loginUs='';
									if(new Date()<kaishi){
										document.write("<div style=\"font-size:18px; color:#CC0000; font-weight:bold;float:left;\">我要报名&nbsp;&nbsp;&nbsp;</div>");
										document.write("<div style=\"font-size:18px; color:#CC0000; font-weight:bold;float:left;\">收藏该兼职</div> ");	
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
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;亲爱的用户，请您谨慎的选择兼职，并合理地进行报名，如果您同时进行多次报名，并同时被多家企业录用，那么分身乏术的您，将不能同时参加多次兼职，这势必影响您在本网站内的兼职信誉度，也将对您以后的兼职报名造成不良的影响。当然，如果您选取的多次的兼职时间是不冲突的，那么恭喜您，接下来的时间里，您将获得丰厚的兼职报酬和丰富的兼职经历。
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
					<img src="imagezlogo/diannaojia.png" />该公司其他兼职
				</div>
				<div style="min-width:850px;">
					<iframe src="" frameborder="0" scrolling="no"   name="rightMenusss" style="width:100%;height:80%;"></iframe>
				</div>
			</div>		
		</td>
	  </tr>
	</table>
</div>

      
<%@include file="Foot.jsp" %>
  </body>
</html>
