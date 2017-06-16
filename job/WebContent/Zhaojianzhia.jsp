<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="Head.jsp" %>
<%@include file="htmlEdit.jsp" %>
<%@ page import="java.util.*"%> 
<%@ page import="java.text.*"%>  

  <head>
    <title>My JSP 'Zhaojianzhi.jsp' starting page</title>
	 <link rel="stylesheet" type="text/css" href="css4/css41.css">
	 <script type="text/javascript" src="../WdatePicker.js"></script>
	 <%
	 String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()); //获取系统时间 
     %>

  </head>
 
  <body>
  
  <div id="backHead" title="返回顶端" class="goHead" style="position:fixed; right:0; bottom:0;cursor:pointer; display:none;background-color: #457CE6;color:white;width:100px;height:22px;text-align: center;font-size: 18px;border-radius: 5px;">返回顶端</div>
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
  
      <hr style=" background-color:#00b3ee;">
      <div class="dageda">
         <div class="xuanze">
         <form action="/job/work/findwtype.do?page=1" method="post">
             <div class="xza"> 
                                                              类型   <select class="leixing" name="wtype" id="leixing"  > 
                                   <option value="quanbu">全部</option> 
                                   <option value="chongchang">充场</option> 
                                   <option value="chuandanpaifa">传单派发</option> 
                                   <option value="cuxiaoyuan">促销员</option> 
                                   <option value="dianyuan">店员</option> 
                                   <option value="fuwusheng">服务生</option> 
                                   <option value="gongzuorenyuan">工作人员</option> 
                                   <option value="kefu">客服</option> 
                                   <option value="liyi">礼仪</option> 
                                   <option value="wangzhansheji">网站设计</option> 
                                   <option value="wenjuandiaocha">问卷调查</option> 
                                   <option value="yanyuan">演员</option> 
                                   <option value="yewuyuan">业务员</option> 
                                   <option value="qita">其他</option>
                       </select> 
                   
             </div>
             <div class="xzb">
                                           性别   <select class="xingbie" name="wsex" id="xb" >
                                   <option value="不限">不限</option>
                                   <option value="男">男</option>
                                   <option value="女">女</option>                       
                  </select>
               </div>
               <div class="xzc">兼职日期
                   <input class="Wdate" onClick="WdatePicker()" type="text" style="width:50%;height:100%;border:1px solid;border-color:#666 #ccc #ccc #666;"  name="begindate" readonly="readonly" />
               </div>
               <div class="xzd"><input type="submit" value="搜索" class="sousuo" > </div>
                   </form>
            </div>
         <div class="xz"><p>最新兼职</p></div>
           
         
         
				<div class="kuankuan" style="width:100%;height:80%; border:1px white;overflow: auto;">
					<div	style="width:100%;">
							 <c:if test="${bp.allcount>0}">
							<div style="width:100%;height:30px;border:0px solid;margin-top:20px;">
							<div style="width:100%;height:100%;margin:0 auto;border:0px solid red;text-align: center;color:red;font-size: 24;">本次查询符合条件的兼职一共有${bp.allcount}条</div>
							</div></c:if>
								<c:if test="${bp.allcount==0}">
							<div style="width:100%;height:30px;border:0px solid;margin-top:20px;">
							<div style="width:100%;height:100%;margin:0 auto;border:0px solid red;text-align: center;color:red;font-size: 36;">没有符合条件的兼职</div>
							</div></c:if>
								
									
										
							<c:forEach items="${bp.list}" var="ns">
								
									<div class="listkk" style="border:#CCCCCC 1px dashed;width:24.2%;float:left;margin-top:7px;margin-left:5px;">
										<div style="width:100%; text-align:center;">
											<a target="_blank" href="/job/work/findbyid.do?uname=${login.uname}&&id=${ns.id}&&cid=${ns.company_id}">
												<img title="${ns.wtitle}" src="imagezqy/${ns.wtype }.jpg" />
											</a>
										</div>
										<div style="text-align:center;">
											<table style="width:100%; border:0;">
											  <tr>
												<td title="${ns.wtitle}" style="text-align:center;"><a target="_blank" href="/job/work/findbyid.do?id=${ns.id}&&cid=${ns.company_id}">
													${ns.wtitle} 
												</a></td>
												<td style="width:50px;">
										<script type="text/javascript">
									
									         var kaishi=new Date('${ns.enddate} '.replace(/\-/g, "\/"));
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
											  		
											  		
											  			${ns.wsex }
											  		
											  		<br>招聘人数：${ns.wnumber }/已报名:${ns.signumber }
											  	</td>
											  </tr>
											</table>
										</div>
									</div>
								
								</c:forEach>
								
							
							      
								
				</div></div>
           
      </div>
<%@include file="Foot.jsp" %>
  </body>

