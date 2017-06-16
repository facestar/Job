<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<form action="${pageContext.request.contextPath }/work/addwork.do?name=${login.uname}" method="post">
<%@include file="Head.jsp"%>
<%@ include file="htmlEdit.jsp" %>
<html>
  <head>
    <title>企业管理</title>
    
	
	<link rel="stylesheet" type="text/css" href="css/jzglstyles.css">


  </head>
  <script type="text/javascript">
  var msg="${msg}"
  if(msg!="")
  {
  alert(msg);}
  </script>
  <body>
     <div style="width: 1000px;height: 600px;margin: 0 auto;border: 1px solid white; ">
    
     <div>
        <table  style="width:200px;height:600px;background-color:#C8D4EF">
       <tr> 
        <td id="hide4" style="font-size: 18px;">
         &nbsp;&nbsp;<img src="images/png311591110154581.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top:-25px;margin-left: 64px;" > <a href="/job/user/chaxun.do?uname=${login.uname }" class="zt">企业信息管理 </a></div>
        </td> </tr>
       
        <tr>
             <td  style="font-size: 18px;">
            &nbsp;&nbsp;<img src="images/jianzhiGL.jpg" style="width: 25px;height: 25px;"></img>
             <div style="margin-top: -27px;margin-left: 64px;" > <a href="/job/work/comFindWork.do?username=${login.uname }"  class="zt" >兼职管理</a></div>
             </td>
       </tr>
        <tr> <td id="hide2" style="font-size: 18px;">
       &nbsp;&nbsp;<img src="images/wallet.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top:-25px;margin-left: 64px;" ><a href="company22.jsp" class="zt">钱包管理</a></div>
             </td> </tr>
        <tr> 
        <td id="hide3" style="font-size: 18px;">
       &nbsp;&nbsp;<img src="images/text-message.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top:-25px;margin-left: 64px;" > <a href="/job/findif.do" class="zt">消息管理 </a></div>
        </td> </tr> 
        <tr> 
        <td id="hide4" style="font-size: 18px;">
        &nbsp;&nbsp;<img src="images/mail_send.png" style="width: 25px;height: 25px;"></img>
             <div style="margin-top:-25px;margin-left: 64px;" > <a href="company44.jsp" class="zt">发布兼职 </a></div>
        </td> </tr>
        
       </table>
      </div>
           <div class="j1" style="margin-top: -600px">
              <div  style="width:100%;margin:0 auto; border:#CCCCCC 1px dashed;height: 100%" >
		 <div style="width:100%;
         height:4%;
         border: 0px solid;
         text-align:center;
         background-color: #D5F3F8;
         font-size:24;
         color:#0099FF;">企业兼职发布</div>
         <input type="hidden" name="name" value="">
				
						<div style="width:50%;margin:0 auto;">
						<div style="margin-top:5px;">兼职类型：
							    <select class="leixing" name="wtype" id="jianzhileixing"  title="兼职类型" style="cursor: pointer;width: 100px;"> 
                                   <option value="chongchang">充场</option> 
                                   <option value="chuandanpaifa">传单派发</option> 
                                   <option value="cuxiaoyuan">促销</option> 
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
                   
                            </div><br>
							<div style="margin-top:5px;">兼职标题：  <input type="text" name="wtitle" value="诚聘-xx"></div>
							<div style="margin-top:20px;">兼职地点： <input  id="jianzhididian" title="兼职地点" name="waddress" ></div>
							<div style="margin-top:20px;">兼职报酬： <input  name="wsalary" title="兼职报酬" onkeyup="this.value=this.value.replace(/\D/g,'')" maxlength="3" value="10">元/天</div>
							<div style="margin-top:20px;">招聘人数： <input  name="wnumber" title="兼职人数" onkeyup="this.value=this.value.replace(/\D/g,'')" maxlength="2" value="10">人</div>
							<div style="margin-top:20px;">录取截止： <input  name="endtime" class="Wdate" onClick="WdatePicker()" style="cursor: pointer;" title="报名结束时间" id="jianzhijieshushijian" readonly="readonly"></div>
							<div style="margin-top:20px;">面试时间： <input name="facetime" title="面试时间" id="jianzhimianshishijian" class="Wdate" onClick="WdatePicker()" readonly="readonly" style="cursor: pointer;"></div>
		
							
							<div style="margin-top:20px;">兼职日期：
							<input  name="begindate" class="Wdate" onClick="WdatePicker()" title="兼职日期开始" id="jianzhiriqi" style="cursor: pointer; width:120px;" readonly="readonly" >&nbsp;至&nbsp; 
							<input class="Wdate" name="enddate" onClick="WdatePicker()" title="兼职日期结束" id="jianzhiriqijieshu" style="cursor: pointer;width:110px;" readonly="readonly"></div>
							<div style="margin-top:20px;">
							兼职积分：<label><input name="jifen" type="radio" checked="checked" value="5" />5分 </label>
                                   <label><input name="jifen" type="radio" value="4" />4分 </label>
                                   <label><input name="jifen" type="radio" value="3" />3分 </label>
                                   <label><input name="jifen" type="radio" value="2" />2分 </label>
                                   <label><input name="jifen" type="radio" value="1" />1分 </label><br><br>
									性别:
									<select class="xingbie" name="wsex" id="xb" title="选择性别" style="cursor: pointer;">
                                          <option value="不限">不限</option>
                                          <option value="男">男</option>
                                           <option value="女">女</option>                       
                                    </select>
									身高:<select class="shengao" name="wheight" id="shengao" title="身高" style="cursor: pointer;">
                                          <option value="不限">不限</option>
                                          <option value="180以上">180以上</option>
                                           <option value="176-180">176-180</option>
                                           <option value="171-175">171-175</option>  
                                           <option value="166-170">166-170</option>  
                                           <option value="161-165">161-165</option> 
                                           <option value="156-160">156-160</option>
                                           <option value="150-155">150-155</option>                            
                                    </select>
								学历:<select class="xueli" name="wstudy" id="xueli" title="学历" style="cursor: pointer;">
                                          <option value="不限">不限</option>
                                           <option value="本科">本科</option>
                                           <option value="大专">大专</option>  
                                           <option value="高中">高中</option>  
                                    </select></div>
							
							<div style="margin-top:20px;">

							   兼职要求：<input type="text" name="wother"  style="width:200px;height: 27px; " >

							</div>
							<div style="margin-top:20px;">
							     <div>兼职介绍：</div>
							      <div><textarea name="wintroduce" style="width:50%;height:10%;" title="兼职介绍"></textarea></div>
							</div>
							<div style="margin-top:10px;"><input type="submit" title="发布兼职" name="" value="发布兼职" style="cursor: pointer;width: 70px;height: 25px;"></div>
							</div>
					
						</div>
					</div>
                           
  
									
			
		
         
       </div>
           
      
          
             
     
  </body>
</html>
<%@include file="Foot.jsp" %>	</form>
