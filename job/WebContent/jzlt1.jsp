<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="htmlEdit.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<form action="/job/addpost.do" method="post">
<%@include file="Head.jsp"%>
<link rel="stylesheet" type="text/css" href="css/bodystyles.css" />
<head>
<title>大学生兼职网</title>

</head>
<script type="text/javascript">
var rr="${mmm}"
if (rr!="")
{
alert(rr);}
</script>
<body>

<hr style="background-color:#00b3ee; width:100%;">

<div align="center">
<table width="1000" border="0">
			<tr>
				<td align="left" >
					<table width="1000" border="0">
							<tr>
								<td width="100%" align="left" >
								
	
	<div style=" border:#aaa3a3 1px solid;"> 
		<div style="color:#333; font-weight:bold; height:26px; padding-top:8px; padding-left:15px; background-color:#f2f2f2; border-bottom:#aaa3a3 1px solid; font-size:14px;">发表高见</div>
	<div 
											style="padding-top:20px; padding-left:15px; height:470px;">
											
										标题：<input name="ptitle" type="text" style="width: 250px;height: 30px;border-radius: 5px;border: 1px solid #ccc;"><br><br><br>
										内容：<br><br><textarea class="htmlEditCss" style="width: 600px;height: 100px;border-radius: 5px;border: 1px solid #ccc;" name="pcontent" ></textarea>	
										<input type="submit" value="发帖" style="width: 60px;height: 30px;margin-left: 500px;">
										</div>

									</div>
								</td>
							</tr>
						</table>
				</td>
			</tr>
			<tr><td>
					
		<div style="width:200px; text-align: left;float:left;">
			 
			 
		</div>
	
			</td>
			</tr>
		</table>
		
						
	
</div>
</form>
<%@include file="Foot.jsp"%>
</body>
</html>