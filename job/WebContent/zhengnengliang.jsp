<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="Head.jsp" %>
<%@ page import="java.util.*"%> 
<%@ page import="java.text.*"%> 


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="css1/jquery.slideBox.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/jquery.slideBox.min.js" type="text/javascript"></script>
<script src="js/jquery.js" type="text/javascript"></script>
<link rel="stylesheet" href="css3/zhengnengliang.css" type="text/css"/>
<script>
	$(function(){
		$("#li3,#li2,#li1,#li4,#li5,#li6,#li7,#li8,#li9").hover(function(){
			$(this).find("span").show();
		},function(){
			$(this).find("span").hide();
		})
	})
</script>
 <%
	 String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()); //获取系统时间 
     %>
</head>

<hr style=" background-color:#00b3ee;">
	<div class="zhuDIV">
		
      <div id="demo3" class="slideBox">
        <ul class="items">
           <li><a href="http://www.jq22.com/" title="天天来兼职，那些年我们一起做过的兼职"><img src="imag/13.jpg"></a></li>
            <li><a href="http://www.jq22.com/" title="教育文化体育"><img src="imag/12.jpg"></a></li>
              <li><a href="http://www.jq22.com/" title="月薪五千，该怎么办？"><img src="img/3.jpg"></a></li>
                <li><a href="http://www.jq22.com/" title="我们的宗旨就是：诚信，求实，创新"><img src="img/8.jpg"></a></li>
                  <li><a href="http://www.jq22.com/" title="靠谱的人，做靠谱的兼职"><img src="img/6.jpg"></a></li>
       </ul>
      </div>
      <!-- 内容div开始 -->
         <div class="gundong" >
            <MARQUEE onmouseover=this.stop() onmouseout=this.start() scrollAmount=1 scrollDelay=60 direction=up width=198 height=200>
            <DIV style="LINE-HEIGHT: 25px; TEXT-ALIGN: center">
             <A href="">一起每天正能量！</A><BR>
             <A href="">如果你喜欢，就加入我们吧！</A><BR>
             <A href="">日行一善，和谐生活！</A><BR>
             <A href="">真爱永恒，点滴做起</A><BR>
             <A href="">传递温暖，拒绝冷漠！</A><BR>
             </DIV></MARQUEE></DIV>
         </div>
         <div style="width:1000px;margin:0 auto;height:900px;border:0px solid; ">
         <div class="neirong">
         <div style="width:350px;height:460px;border:0px solid;float:left;margin-top:40px;overflow:auto;">
         	<c:forEach items="${sg }" var="gs">
								
									<div class="listkk" style="border:#CCCCCC 1px dashed;width:47%;float:left;margin-top:7px;margin-left:5px;">
										<div style="width:100%; text-align:center;">
											<a href="/job/commonweal/findgybyid.do?id=${gs.id }&&gyname=${gs.gyname}">
												<img style="width:100px;height:100px;" title="${gs.wtitle}" src="imagejxg/${gs.wtype }.jpg" />
											</a>
										</div>
										<div style="text-align:center;">
											<table style="width:100%; border:0;">
											  <tr>
												<td title="${gs.wtitle}" style="text-align:center;">
												<a  href="/job/commonweal/findgybyid.do?id=${gs.id }&&gyname=${gs.gyname}">
													${gs.wtitle} 
												</a></td>
												<td style="width:50px;">
										<script type="text/javascript">
									
									         var kaishi=new Date('${gs.begindate} '.replace(/\-/g, "\/"));
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
											  		
											  		
											  			${gs.wsex }
											  		
											  		<br>招聘人数：${gs.wnumber }
											  	</td>
											  </tr>
											</table>
										</div>
									</div>
								
								</c:forEach>
								
         	</div> 
         	<div style="width:330px;height:500px;border:0px solid;float:left;">
         	<div>
         		<img src="imag/2016-12-06_211416.png" style="margin-left: 10px;margin-top: 100px;cursor: pointer;" onclick="window.location.href='/job/commonweal/findggy.do'"/>
         	</div>
         	<div>
         		<img src="imag/2016-12-06_211441.png" style="margin-left: 10px;margin-top: 100px;cursor: pointer;"/>
         	</div>
         	</div>
         	<div style="width:310px;height:500px;border:0px solid;float:left;">
         	     <div>
         		    <p style="font-size:18px;color: #666666;text-align: center;">我们需要正能量</p>
         	     </div>
         	     <div>
         		         <a href="Zdishi.jsp"><img src="imag/2016-12-06_211939.png" style="width: 300px;height: 200px;border: 1px solid #37A2D8;margin-left:3px;"/></a>
         		         <a href="Zdishiyi.jsp"><img src="imag/16.jpg" style="width: 300px;height: 200px;margin-top: 5px;border: 1px solid #666666;margin-left:3px;"/></a>
         	     </div>
         	</div>
         </div> <!-- 内容div结束 -->
         
          <!-- 媒体报道div开始 -->
          <div style="width:100%;height:50px;border:0px solid;">
         <div>
         	<p style="font-size: small;margin-top: 3px;">媒体报道</p>
         </div>
         <div>
         	<img alt="" src="imag/2016-12-06_214847.png" style="margin-top: -5px;"/>
         </div></div>
         <!-- ul列表 -->
         <div>
         	<ul class="ul">
         		<li id="li1"><img alt="" src="imag/2016-12-06_220857.png" style="margin-left: 1px;"/>
         			<span style="font-size: 12px;color: #FCFCFC;margin-left: -150px;background-color: #7C868E;">真爱永恒，点滴做起</span>
         			<p style="font-size: 5px;color: #0099FF;margin-left: 160px;margin-top: -70px;"><a href="Zdiyi.jsp">真爱永恒，点滴做起</a></p>
         			<p style="font-size: 5px;color: #666666;margin-left: 160px;margin-top: 10px;">媒体机构：正能量贴士</p>
         		</li>
         		<li id="li2"><img alt="" src="imag/2016-12-06_220731.png" style="margin-left: 1px;"/>
         			<span style="font-size: 12px;color: #FCFCFC;margin-left: -150px;background-color: #7C868E;">日行一善，和谐生活</span>
         			<p style="font-size: 5px;color: #0099FF;margin-left: 160px;margin-top: -70px;"><a href="Zdier.jsp">日行一善，和谐生活</a></p>
         			<p style="font-size: 5px;color: #666666;margin-left: 160px;margin-top: 10px;">媒体机构：正能量技巧</p>
         		</li>
         		<li id="li3"><img alt="" src="imag/2016-12-06_220810.png" style="margin-left: 1px;"/>
         			<span style="font-size: 12px;color: #FCFCFC;margin-left: -150px;background-color: #7C868E;">传递温暖，拒绝冷漠</span>
         			<p style="font-size: 5px;color: #0099FF;margin-left: 160px;margin-top: -70px;"><a href="Zdisan.jsp">传递温暖，拒绝冷漠</a></p>
         			<p style="font-size: 5px;color: #666666;margin-left: 160px;margin-top: 10px;">媒体机构：正能量故事</p>
         		</li>
         	</ul>
         	<ul class="ul2">
         		<li id="li4"><img alt="" src="imag/2016-12-06_220835.png" style="margin-left: 1px;"/>
         			<span style="font-size: 12px;color: #FCFCFC;margin-left: -150px;background-color: #7C868E;">中国支教联盟</span>
         			<p style="font-size: 5px;color: #0099FF;margin-left: 160px;margin-top: -70px;"><a href="Zdisi.jsp">中国支教联盟</a></p>
         			<p style="font-size: 5px;color: #666666;margin-left: 160px;margin-top: 10px;">媒体机构：公益性支教机构</p>
         		</li>
         		<li id="li5"><img alt="" src="imag/2016-12-06_220913.png" style="margin-left: 1px;"/>
         			<span style="font-size: 12px;color: #FCFCFC;margin-left: -150px;background-color: #7C868E;">中国红十字会</span>
         			<p style="font-size: 5px;color: #0099FF;margin-left: 160px;margin-top: -70px;"><a href="Zdiwu.jsp">中国红十字会</a></p>
         			<p style="font-size: 5px;color: #666666;margin-left: 160px;margin-top: 10px;">媒体机构：慈善救援组织</p>
         		</li>
         		<li id="li6"><img alt="" src="imag/2016-12-06_220928.png" style="margin-left: 1px;"/>
         			<span style="font-size: 12px;color: #FCFCFC;margin-left: -150px;background-color: #7C868E;">壹基金</span>
         			<p style="font-size: 5px;color: #0099FF;margin-left: 160px;margin-top: -70px;"><a href="Zdiliu.jsp">壹基金</a></p>
         			<p style="font-size: 5px;color: #666666;margin-left: 160px;margin-top: 10px;">媒体机构：民间公募基金会</p>
         		</li>
         	</ul>
         	<ul class="ul3">
         		<li id="li7"><img alt="" src="imag/2016-12-06_220947.png" style="margin-left: 1px;"/>
         			<span style="font-size: 12px;color: #FCFCFC;margin-left: -150px;background-color: #7C868E;">世界自然基金会</span>
         			<p style="font-size: 5px;color: #0099FF;margin-left: 160px;margin-top: -70px;"><a href="Zdiqi.jsp">世界自然基金会</a></p>
         			<p style="font-size: 5px;color: #666666;margin-left: 160px;margin-top: 10px;">媒体机构：非政府环境保护</p>
         		</li>
         		<li id="li8"><img alt="" src="imag/2016-12-06_221002.png" style="margin-left: 1px;"/>
         			<span style="font-size: 12px;color: #FCFCFC;margin-left: -150px;background-color: #7C868E;">中国文明网</span>
         			<p style="font-size: 5px;color: #0099FF;margin-left: 160px;margin-top: -70px;"><a href="Zdiba.jsp">中国文明网</a></p>
         			<p style="font-size: 5px;color: #666666;margin-left: 160px;margin-top: 10px;">媒体机构：中国文明网</p>
         		</li>
         		<li id="li9"><img src="imag/2016-12-06_221017.png" style="margin-left: 1px;"/>
         			<span style="font-size: 12px;color: #FCFCFC;margin-left: -150px;background-color: #7C868E;">网络监督正能量</span>
         			<p style="font-size: 5px;color: #0099FF;margin-left: 160px;margin-top: -70px;"><a href="Zdijiu.jsp">网络监督正能量</a></p>
         			<p style="font-size: 5px;color: #666666;margin-left: 160px;margin-top: 10px;">媒体机构：人民网</p>
         		</li>
         	</ul>
         </div>
	</div>
	<%@include file="Foot.jsp" %>

	
		
	

