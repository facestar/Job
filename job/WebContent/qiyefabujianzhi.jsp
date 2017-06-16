<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="Head.jsp" %>
<%@ include file="htmlEdit.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>企业发布兼职</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  </head>
  <body>
  <hr style=" background-color:#00b3ee;">
		<div  style="width:1000px;margin:0 auto; border:#CCCCCC 1px dashed; background-image: url('imagezqy/3jpg.jpg');" >
		 <div style="width:100%;
         height:6%;
         border: 0px solid;
         text-align:center;
         background-color: #D5F3F8;
         font-size:30;
         color:#0099FF;">xx企业兼职发布</div>
				<form action="" method="post">
						<div style="width:50%;margin:0 auto;">
						<div style="margin-top:20px;">兼职类型：
							    <select class="leixing" name="leixing" id="jianzhileixing"  title="兼职类型" style="cursor: pointer;border-radius: 5px;width: 20%;"> 
                                   <option value="1">全部</option> 
                                   <option value="2">充场</option> 
                                   <option value="3">传单派发</option> 
                                   <option value="4">促销</option> 
                                   <option value="5">店员</option> 
                                   <option value="6">翻译</option> 
                                   <option value="7">服务生</option> 
                                   <option value="8">工作人员</option> 
                                   <option value="9">会计</option> 
                                   <option value="10">家教</option> 
                                   <option value="11">客服</option> 
                                   <option value="12">礼仪</option> 
                                   <option value="13">模特</option> 
                                   <option value="14">摄影</option> 
                                   <option value="15">网站设计</option> 
                                   <option value="16">问卷调查</option> 
                                   <option value="17">舞蹈</option> 
                                   <option value="18">校园招聘</option> 
                                   <option value="19">演员</option> 
                                   <option value="20">业务员</option> 
                                   <option value="21">主持</option>
                                   <option value="22">其他</option>
                       </select> </div>
							
							<div style="margin-top:20px;">兼职地点：<input  id="jianzhididian" title="兼职地点" id="jianzhididian" style="border-radius: 5px;border: 1px solid #ccc;" ></div>
							<div style="margin-top:20px;">兼职报酬：<input  title="兼职报酬" id="jianzhibaochou" style="border-radius: 5px;border: 1px solid #ccc;">元/天</div>
							<div style="margin-top:20px;">招聘人数：<input  title="兼职人数" id="jianzhirenshu" style="border-radius: 5px;border: 1px solid #ccc;">人</div>
							<div style="margin-top:20px;">录取截止：<input  class="Wdate" onClick="WdatePicker()" style="cursor: pointer;border-radius: 5px;border: 1px solid #ccc;" title="报名结束时间" id="jianzhijieshushijian"></div>
							<div style="margin-top:20px;">面试时间：<input  title="面试时间" id="jianzhimianshishijian" style="border-radius: 5px;border: 1px solid #ccc;"></div>
		
							
							<div style="margin-top:20px;">兼职日期：<input  class="Wdate" onClick="WdatePicker()" title="兼职日期开始" id="jianzhiriqi" style="cursor: pointer;border-radius: 5px;border: 1px solid #ccc;">至 <input class="Wdate" onClick="WdatePicker()" title="兼职日期结束" id="jianzhiriqijieshu" style="cursor: pointer;border-radius: 5px;border: 1px solid #ccc;"></div>
							
							
								<div style="margin-top:20px;">兼职要求：
									性别:
									<select class="xingbie" name="xb" id="xb" title="选择性别" style="cursor: pointer;border-radius: 5px;border: 1px solid #ccc;">
                                          <option value="">不限</option>
                                          <option value="">男</option>
                                           <option value="">女</option>                       
                                    </select>
									身高:<select class="shengao" name="shengao" id="shengao" title="身高" style="cursor: pointer;border-radius: 5px;border: 1px solid #ccc;">
                                          <option value="">不限</option>
                                          <option value="">180以上</option>
                                           <option value="">176-180</option>
                                           <option value="">171-175</option>  
                                           <option value="">166-170</option>  
                                           <option value="">161-165</option> 
                                           <option value="">156-160</option>
                                           <option value="">150-155</option>                            
                                    </select>
									学历:<select class="xueli" name="xueli" id="xueli" title="学历" style="cursor: pointer;border-radius: 5px;border: 1px solid #ccc;">
                                          <option value="">不限</option>
                                          <option value="">研究生及其以上</option>
                                           <option value="">本科</option>
                                           <option value="">大专</option>  
                                           <option value="">高中</option>  
                                    </select></div>
							
							<div style="margin-top:20px;">
							     <div>其他要求：</div>
							     <div>
							     <textarea title="其他要求" style="width:50%;height:20%;border-radius: 5px;border: 1px solid #ccc;"></textarea>
							     </div>
							</div>
							<div style="margin-top:20px;">
							     <div>兼职介绍：</div>
							      <div><textarea style="width:50%;height:20%;border-radius: 5px;border: 1px solid #ccc;" title="兼职介绍"></textarea></div>
							</div>
							<div style="margin-top:20px;"><input type="submit" title="发布兼职" name="" value="发布兼职" style="cursor: pointer;"></div>
							</div>
						</form>
						</div>
						
  </body>
  <%@ include file="Foot.jsp" %>
</html>
