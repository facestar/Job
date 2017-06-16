<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="htmlEdit.jsp" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台首页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	
<!-- 表格的css -->
<style type="text/css">
table.hovertable {
	font-family: verdana,arial,sans-serif;font-size:11px;color:#333333;border-width: 1px;border-color: #999999;border-collapse: collapse;
}
table.hovertable th {
	background-color:#c3dde0;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
table.hovertable tr {
	background-color:#d4e3e5;
}
table.hovertable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
</style>
	
	<script type="text/javascript">
	var tt = "${tt}"
	if(tt!="")
	{
		alert(tt);
	}
</script>
	<link rel="stylesheet" type="text/css" href="css/htstyles.css">
	<style> a{ text-decoration:none}</style>
 </head>
  <body>
     <div class="h10">
        <div class="h11" >
           <div class="h12">
             <div style="width: 80px;height: 80px;margin-top: 10px;"><img style="width: 90px;height: 90px;" src="images/tubiao.jpg"></img></div>
               <div class="h15">大学生兼职后台管理</div>
           </div>
              <div class="h13">
                <div class="h131"><img style="width: 50px;height: 50px;" src="img/toux.jpg"></img>
                   <div class="h132">  您好:<br>
                                                              
                         <a href="shouye.jsp"> 退出</a> 
                   </div>
                     <div>电话：1588886699<br>
                                                                          联系方式：0875-5566
                          
                     </div>
                     
                </div>
                 <ul style="font-size: 17px;">
                 <li class="y1" ><img style="width: 20px;height: 18px;" src="images/tou.png"></img><a href="/job/admin/chaxun.do"> 用户管理</a></li>
                 <li class="y2"><img style="width: 20px;height: 18px;" src="images/qiye.jpg"></img><a href="/job/admin/chakan.do">  企业管理</a></li>
                 <li class="y3"><img style="width: 20px;height: 18px;" src="images/tubiao.jpg"></img><a href="/job/commonweal/gongyi.do">  兼职管理</a></li>
                 <li class="y4"><img style="width: 20px;height: 18px;cursor: pointer;" src="images/lunt.jpg"></img><a href="/job/admin/tiezi.do">  论坛管理</a></li>
                 <li class="y5"><img style="width: 20px;height: 18px;" src="images/hezuo.jpg"></img><a href="/job/medium/chaxunmeiti.do">  合作媒体管理</a></li>
                 <li class="y6"><img style="width: 20px;height: 18px;" src="images/shezhi.png"></img><a href="HtXitong.jsp">  系统设置</a></li>
                 
                 </ul>
              </div>
            
                <div class="h14" style="border: 1px  solid white ;overflow:scroll;background-color:#BCD9E1 ">
                
                  <div class="yonghu">
                      <div style="background-color: #6DC1F0 ;font-size: 20px;"> 管理员发布兼职：</div>
                    
                   </div>   

 
          
       <!-- 兼职管理 -->  
       <div class="jianzhi" background-color: #C3DDE0 ">
           <form action="/job/commonweal/save.do" method="post">
						<div style="width:60%;margin-left: 50px;">
						
							<div style="margin-top:5px;">机构名称：<input  name="gyname" title="兼职地点" id="jianzhididian" style="border-radius: 5px;border: 1px solid #ccc;height: 30px" ></div>
							<div style="margin-top:5px;">兼职地点：<input  name="waddress" title="兼职地点" id="jianzhididian" style="border-radius: 5px;border: 1px solid #ccc;height: 30px" ></div>
							<div style="margin-top:5px;">兼职标题：<input  name="wtitle" title="兼职标题" id="jianzhididian" style="border-radius: 5px;border: 1px solid #ccc;height: 30px" ></div>
							<div style="margin-top:5px;">兼职类型：
							  <select class="leixing" name="wtype" id="leixing" style="width: 70px;height: 28px;border-radius: 5px;border: 1px solid #ccc;margin-left: -5px;" > 
                                   <option value="zhiyuanzhe">志愿者</option> 
                                   <option value="yigong">义工</option>
                                   </select>
                            </div>
							<div style="margin-top:5px;">招聘人数：<input  title="兼职人数" name="wnumber" style="border-radius: 5px;border: 1px solid #ccc;height: 30px" onkeyup="this.value=this.value.replace(/\D/g,'')" maxlength="3" value="10">人</div>
							<div style="margin-top:5px;">录取截止：<input  class="Wdate" onClick="WdatePicker()" style="cursor: pointer;border-radius: 5px;border: 1px solid #ccc;height: 30px" title="报名结束时间" name="endtime" readonly="readonly"></div>
							<div style="margin-top:5px;">面试时间：<input  title="面试时间" class="Wdate" onClick="WdatePicker()" name="facetime" style="border-radius: 5px;border: 1px solid #ccc;height: 30px;cursor: pointer;" readonly="readonly"></div>
		
							
							<div style="margin-top:5px;">兼职日期：<input  class="Wdate" onClick="WdatePicker()" title="兼职日期开始" name="begindate" style="cursor: pointer;border-radius: 5px;border: 1px solid #ccc;height: 30px" readonly="readonly">至 <input class="Wdate" onClick="WdatePicker()" title="兼职日期结束" name="enddate" style="cursor: pointer;border-radius: 5px;border: 1px solid #ccc;height: 30px" readonly="readonly"></div>
							
							
								<div style="margin-top:5px;">兼职要求：
									性别:
									<select class="xingbie" name="wsex" id="xb" title="选择性别" style="cursor: pointer;border-radius: 5px;border: 1px solid #ccc;height: 30px">
                                          <option value="">不限</option>
                                          <option value="">男</option>
                                           <option value="">女</option>                       
                                    </select>
									身高:<select class="shengao" name="wheight" id="shengao" title="身高" style="cursor: pointer;border-radius: 5px;border: 1px solid #ccc;height: 30px">
                                          <option value="">不限</option>
                                          <option value="">180以上</option>
                                           <option value="">176-180</option>
                                           <option value="">171-175</option>  
                                           <option value="">166-170</option>  
                                           <option value="">161-165</option> 
                                           <option value="">156-160</option>
                                           <option value="">150-155</option>                            
                                    </select>
									学历:<select class="xueli"  name="wstudy" title="学历" style="cursor: pointer;border-radius: 5px;border: 1px solid #ccc;height: 30px">
                                          <option value="">不限</option>
                                          <option value="">研究生及其以上</option>
                                           <option value="">本科</option>
                                           <option value="">大专</option>  
                                           <option value="">高中</option>  
                                    </select></div>
							
							<div style="margin-top:5px;">
							     <div>其他要求：</div>
							     <div>
							     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea title="其他要求" name="wother" style="width:50%;height:15%;border-radius: 5px;border: 1px solid #ccc;height: 70px"></textarea>
							     </div>
							</div>
							<div style="margin-top:5px;">
							     <div>兼职介绍：</div>
							      <div> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea name="wintroduce" class="htmlEditCss" style="width:50%;height:15%;border-radius: 5px;border: 1px solid #ccc;height: 70px" title="兼职介绍"></textarea></div>
							</div>
							<div style="margin-top:20px;margin-left: 30%;">
							<input type="submit" title="发布兼职" name="" value="发布公益兼职" style="cursor: pointer;background-color: #F35712;color: white;height: 25px;border-radius: 5px;">
							</div>
							</div>
						</form>
         
       
       
     
      
       
       
       
       
       
       
     
     </div>
   </div>
     </div>
  </body>
</html>
