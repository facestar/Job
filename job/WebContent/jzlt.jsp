<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@include file="Head.jsp"%>
<link rel="stylesheet" type="text/css" href="css2/lt.css" />

<head>
<title>大学生兼职网</title>
</head>

<body>
<hr style=" background-color:#00b3ee;" size="2" />

	<div align="center" class="center">
	
	<table style="width: 1000px">
	<tr height="40px" style="background-color: #F2F2F2;" >
				<td> <a class="pp" >版块主题</a> </td>
				<td> <a class="pp">发布内容</a> </td>
				<td> <a class="pp">作者</a> </td>
				<td> <a class="pp">发表时间</a> </td>
				<td></td>
			</tr>
	           <tr>
	           <c:forEach items="${zd.list}" var="jk">
			<tr>
			<td><a style="color:#000" href="/job/findpost.do?id=${jk.id}"> ${jk.ptitle }</a></td>
			<td>${jk.pcontent}</td>
			<td>${jk.pname}</td>
			<td>${jk.ptime}</td>
			<td><a href="jzlt2.jsp"></a></td>
			</tr></c:forEach>
	           
	           
	           </tr>
	</table>
	
	
	
		<div style="height: 60px;width: 900px" border="0">
		<div style="width:200px; text-align: left;float:left;">
			<a href="jzlt1.jsp"> <img src="img2/fatie.JPG" /> </a>
		</div>
		<div style="font-size: 17px;color:#000;padding-top:10px;float: right" > 
		   
		    <a href="/job/fenye.do?nowpage=${np-1}&allpage=0">上一页</a>
		    <a href="/job/fenye.do?nowpage=1&allpage=0">1</a>
		    <a href="/job/fenye.do?nowpage=2&allpage=0">2</a>
		    <a href="/job/fenye.do?nowpage=3&allpage=0">3</a>
		    <a href="/job/fenye.do?nowpage=4&allpage=0">4</a>
		    <a >....</a>
		    <a href="/job/fenye.do?nowpage=${np+1 }&allpage=0">下一页</a>
		    <a href="/job/fenye.do?nowpage=0&allpage=1">尾页</a>
		    </div>
		</div>
	</div>
<%@include file="Foot.jsp"%>
</body>
</html>


