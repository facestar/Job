<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="Head.jsp"%>
<%@include file="htmlEdit.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">

<link rel="stylesheet" type="text/css" href="css/bodystyles.css" />
<head>
<title>大学生兼职网</title>

<script type="text/javascript">
	var kk = "${kk}"
	if(kk!="")
	{
		alert(kk);
	}
</script>
</head>
<body>

<hr style="background-color:#00b3ee; width:100%;">

 <div align="center">
	<table class="jjk" width="1000" style="border:#ccc 1px solid;">
		<tr>
	<td>
	<div class="yh">
		 <table 
			style="width:100px;background-color:#e5edf2; text-align:left; padding:8px; border:#CCC 1px solid;">
		
		<tr> 
		  <td align="center"><img src="${ri.picture}" height="60" width="60"
				style="border:#999 1px solid;" ></td>
		</tr>
		<tr> <td>楼主：${zz.pname}</td>
		</tr>
		
		  </table>
		  
				</div>
					</td>
		<td class="td" style="width:720px;border:#CCC 1px solid;">
			  <div align="left" style="padding-left:10px;margin-top:-20px; padding-top:5px;font-size: 20px; font-weight:bold; ">
						主题：<a >${zz.ptitle }</a>
			  </div>
			      <div class="time">&nbsp;发表于： ${zz.ptime}</div>
				      <div style="text-align:left; padding:5px; font-size:13px;color: #666666;font-family:Microsoft YaHei;">
			             <a style="font-size:16px;">&nbsp;内容： ${zz.pcontent}</a><br>
					 </div>
		</td>
				
                <c:forEach items="${tt}" var="wc">
                
				<tr style="height: 50px;">
				
				  <td style="font-size: 15px;" >
				   &nbsp;<div style="border: 1px solid #C0C0C0;width: 62px;height: 62px;margin-left: 17px;">&nbsp;
				    <img src="${wc.tupian }" style="height:60px; width:60px;margin-top: -16px;" ></div>
				   &nbsp; ${wc.rname}</td>
				  
				  <td style="font-size: 15px;"> ${wc.rcontent} </td>
				   <td style="font-size: 15px;"> ${wc.rtime}
				   </td>
				 
				</tr>
				
              </c:forEach>
					</table>
		</div>

<div align="center">
		<table width="1000" border="0">
			<tr>
				<td align="center" >
					<table width="1000" border="0">
							<tr>
								<td width="100%" align="left" >
								
	
	<div style=" border:#aaa3a3 1px solid;width: 1000px;margin-left: -6px;"> 
		<div style="color:#333; font-weight:bold; height:26px; padding-top:8px; padding-left:15px; background-color:#f2f2f2; border-bottom:#aaa3a3 1px solid; font-size:14px;">调戏楼主</div>

											<form action="/job/reply/huitie.do?id=${zz.id }&rname=${login.uname}"method="post">
											<textarea class="htmlEditCss" name="rcontent" ></textarea>
											<input style="height:30px;width:50px; margin-left: 700px;color: #0078D7" type="submit" value="评论">
											</form>
										</div>
 
									
								</td>
							</tr>
						</table>
				</td>
			</tr>
		</table>
	</div>

	<%@include file="Foot.jsp"%>
</body>
</html>

