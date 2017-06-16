<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
 <%@include file="Head.jsp" %>
<head>
 <title>注册</title>
  <link rel="stylesheet" type="text/css" href="css/register.css">
  
 <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("#hide").click(function(){
    $(".r4").hide();
    $(".r5").show();
  });
  $("#show").click(function(){
    $(".r4").show();
    $(".r5").hide();
    
  });
});
</script>
 
<script type="text/javascript">
	var ty = "${ty}"
	if(ty!="")
	{
		alert(ty);
	}
</script>
<script type="text/javascript">
	var tr = "${tr}"
	if(tr!="")
	{
		alert(tr);
	}
</script>
<script type="text/javascript">
	var re = "${re}"
	if(re!="")
	{
		alert(re);
	}
</script>
<script type="text/javascript">
function check(){  
    if(document.getElementById("upassword").value!=  
        document.getElementById("quname").value)  
    {  
        document.getElementById("warning").innerHTML="两次密码的输入不一致";  
    }else{  
        document.getElementById("warning").innerHTML="   ";  
    }  
}  
</script>
<script type="text/javascript">
function abc(){  
    if(document.getElementById("cpassword").value!=  
        document.getElementById("qcpassword").value)  
    {  
        document.getElementById("warning2").innerHTML="两次密码的输入不一致";  
    }else{  
        document.getElementById("warning2").innerHTML="   ";  
    }  
}  



</script>





<style>
    #warning{  
    position:absolute;  
    color:red;  
    font-size: 16px;  
    font-weight: normal;  
    font-style: normal;  
    text-decoration: none;  
    }  
</style>

<style>
    #warning2{  
    position:absolute;  
    color:red;  
    font-size: 16px;  
    font-weight: normal;  
    font-style: normal;  
    text-decoration: none;  
    }  
</style>



 </head>
  
  <body>
   <hr> 
   <div class="r1">

     <div class="r2"><img src="images/re.png"></img> 
          <div style="margin-left: 50px;margin-top:-27px;color: white;" id="show"> 学生用户注册  </div> 
     </div>
       <div class="r3"><img src="images/shang.png"></img>
          <div  style="color: white;font-weight: bold;margin-top: -27px;margin-left:50px;" id="hide">商业/公益注册</div>
        </div>
      
             <form action="/job/user/zhuce.do" method="post">
             <div class="r4" >
            &nbsp;用户名：<input type="text" name="uname" style="height: 25px;"/required="required">&nbsp;请输入用户名<br><br>
                                  用户密码：<input  type="password" name="upassword" id="upassword" style="height: 25px;" maxlength="16" required="required"/>&nbsp;最长为16位<br><br>
                                  确认密码：<input  type="password" name="quname"  id="quname" style="height: 25px;" maxlength="16" onblur="check()" required="required" />&nbsp;最长16位 <span id="warning"></span><br><br>
                                 
                                  真实姓名：<input type="text"  name="name" style="height: 25px;"/>&nbsp;请输入真实姓名<br><br> 
                                  身份证号：<input id="tid" type="text" name="IDCard" style="height: 25px;"maxlength="18" />&nbsp;请输入身份证号<br><br>                   
                                  用户邮箱：<input type="text" name="upostbox" style="height: 25px;"/>&nbsp;请输入用户邮箱<br><br>
                                    学校名称：<input type="text" name="school" style="height: 25px;"/>&nbsp;请输入学校名称<br><br>
               <input type="submit" value="注册" class="button" style="cursor: pointer;">
               <input type="button" value="登录" class="button" onclick="window.location.href='login.jsp'" style="cursor: pointer;">
             </div>
             </form>
              <form action="/job/company/zhuce.do" method="post">
                <div class="r5" onMouseout="hidden(this);"style="display: none">
                                        商业/公益名称：<input type="text" name="uname" style="height: 25px;"/>&nbsp;请输入名称<br><br>
                                       商业/公益密码：<input type="password" name="cpassword" id="cpassword" style="height: 25px;"maxlength="16" required="required"/>&nbsp;最长为16位<br><br>
             &nbsp;&nbsp;  确认密码：<input  type="password" name="qcpassword"  id="qcpassword" style="height: 25px;" maxlength="16" onblur="abc()" required="required"/>&nbsp;最长16位 <span id="warning2"></span><br><br>
                <%@include file="htmlEdit.jsp" %>
             &nbsp;&nbsp; 企业执照：<input type="text" name="zhizhao" class="uploadfilecss" id="up" style="width:150px;height: 25px;"/>&nbsp;请上传营业执照<br><br>
             &nbsp;&nbsp; 企业邮箱：<input type="text" name="cpostbox" style="height: 25px;"/>&nbsp;请输入企业邮箱<br><br>                   
             &nbsp;&nbsp; 办公地点：<input type="text" name="address" style="height: 25px;"/>&nbsp;请输入办公地点<br><br>
       &nbsp;&nbsp;&nbsp; 联系人：<input type="text" name="linkmen" style="height: 25px;"/>&nbsp;请输入联系人<br><br>
           &nbsp;&nbsp; 联系电话：<input type="text" name="cphone" style="height: 25px;"/>&nbsp;请输入联系电话<br><br>
           &nbsp;&nbsp;&nbsp; 联系QQ: <input type="text" name="cqq" style="height: 25px;"/>&nbsp;请输入联系QQ<br><br>
               &nbsp;&nbsp;注册企业： <select class="select" name="ctype">
                        <option>企业用户</option>
                        <option>慈善机构</option>
                    </select>
                   <input type="submit" value="注册" class="button1" >
                     <input type="button" value="登录" class="button1" onclick="window.location.href='login.jsp'" style="cursor: pointer;">
               
               </div>
              </form>
                  <div style="margin-left: 600px;margin-top: -530px;color: #666666;font-size: 14px;font-weight: bold;">大学生兼职网使用的协议</div>
                  <div class="r6">
                  一、使用规则、协议接受<br />
<br />
欢迎来到大学生兼职网。感谢浏览。本站提供包括信息浏览、发布等服务（以下称“服务”）。无论您以任何方式使用服务，均被认为您已经阅读和接受本协议。您需要经常查看本协议，以便知晓这些修订。如果您不同意其中的任何部分或者任何修订，您唯一的解决办法是立刻停止使用服务。使用本网站您应在适当的栏目或地区发布信息，不要做任何不良行为，包括：<br />
<br />
1、违反任何法律或我们的禁止性内容规则，<br />
<br />
2、内容不实或有误导性；<br />
<br />
3、侵犯任何第三方权利、为了增加流量而故意引导他人到某个网站或论坛；<br />
<br />
4、传播病毒或其它任何可能损害本网或本网站用户利益或财产的技术； 对本网站的内部构造施加不合理的负荷或妨碍本网站的正常运行；<br />
<br />
5、未经他人同意而获取或收集其信息，包括联系电话、电子邮件地址等；<br />
<br />
如果我们认为用户在制造问题或其行动违反了我们规则的内容或精神，我们可以限制或终止我们的服务、删除网站上的内容，并采取技术和法律手段使得该用户离开本网站并采取处理。<br />
<br />
无论您以任何的方式使用本公司的服务，包括但不限于浏览网站上发布的类信息，在使用服务之前，您必须阅读、同意并接受本用户协议和隐私权声明中所含的所有条款和条件，包括以下明示载明的及因被提及而纳入的条款和条件。您以任何方式使用服务的行为，无论您是否已经成为本公司的注册用户，将被视为您已经阅读、同意并接受所有条款和条件。<br />
<br />
6、版规<br />
<br />
用户发布的信息必须合法、真实、有效，用户单独承担发布内容的责任。<br />
<br />
为了网站的健康发展，所有本站用户都需要遵守版规。违反版规会被信息删除，或者终止帐号，屏蔽IP地址等，或法律诉讼。<br />
<br />
版规，违规将被删除所有信息：<br />
<br />
1.不允许发布与求职招聘无关或违反法律法规的信息；<br />
<br />
2.不允许发布近似重复信息；不允许注册多个用户同时发布；<br />
<br />
3.不允许发布网赚加盟、贷款、交友、充场、开户、回拨卡等信息；<br />
<br />
4.KTV酒吧的所有招聘只能发到“KTV/酒吧”类目；<br />
<br />
5.信息必须发布在正确的分类下；<br />
<br />
6.每个人都有权利举报他认为不好的信息，多人举报的信息将被删除；<br />
<br />
8.大学生兼职网是同城招聘，只能发布本地招聘信息；<br />
<br />
8.招聘单位不使用单位全称，招聘使用企业名称与营业执照上的名称不一致的；<br />
<br />
9.薪酬不符合市场规律。<br />
<br />
违反以上版规，信息将会删除。情节严重者或多次违反者用户名将被删除、永久禁止发布。<br />
<br />
您可以不使用沃客来来兼职网，如果使用就需要遵守。<br />
<br />
二、免责<br />
<br />
鉴于本网站仅作为用户网上发布信息的网络平台提供者，并非信息的发布者；用户明确同意使用本网站的风险由用户独自承担。服务提供是建立在收取适当服务费用的基础上。本网站明确表示不提供任何类型的担保，不论是明确的或隐含的。本网站不担保服务一定能满足用户的要求，也不担保服务不会受中断，对服务的及时性、安全性、真实性、出错发生都不作担保。本网站拒绝提供任何担保，包括信息能否准确、及时、顺利地传送。用户理解并接受下载或通过本网站产品服务取得的任何信息资料取决于用户自己，并由其承担系统受损、资料丢失以及其它任何风险。对在本站上得到的任何服务、招聘信息，都不作担保。用户不会从本网站收到口头或书面的意见或信息，本网站也不会在这里作明确担保。<br />
<br />
大学生兼职网为用户提供论坛、相关评论表等。如果您访问这些区域，您公布的任何信息都会成为公共信息。沃客来来兼职网提醒您慎重考虑！另外，您在这些区域发表言论及/或发布信息都属个人行为，不代表沃客来来兼职网的立场，沃客来来兼职网不对此类个人言论及个人行为承担任何负责。<br />
<br />
用户使用本网址将承担一定风险，本网址的提供的材料，沃客来来兼职网对材料不作任何明示的或暗示的保证。沃客来来兼职网不能保证材料的特殊目的不受阻挠或不出错误、不能保证错误一定能得到纠正，也不能保证本网址或制成本网址的材料不会含有病毒或其他有害成分。在涉及有关材料的使用或使用结果方面，沃客来来兼职网对材料的正确性、准确性、可靠性及其他同时不作出任何保证或说明。用户(而不是沃客来来兼职网)将承担因此而造成的一切必要的服务、修补和改正费用，除非现行的法律法规另有明文规定。<br />
<br />
三、结束服务<br />
<br />
用户或大学生兼职网可随时根据实际情况中断服务。本站不需对任何个人或第三方负责而随时中断服务。用户若反对任何服务条款的建议或对后来的条款修改有异议，或对本站服务不满，用户只有以下的追索权：<br />
<br />
1、不再使用本站的服务。<br />
<br />
2、结束用户使用本站服务的资格。<br />
<br />
3、通告沃客来来兼职网停止该用户的服务。<br />
<br />
结束用户服务后，用户使用沃客来来兼职网服务的权利马上中止。<br />
<br />
本站保留单方面终止任何用户账户的权利。当用户的帐号被终止后，在没有获得解封以前，不允许再次申请新的帐号。<br />
<br />
四、法律声明<br />
<br />
用户和大学生兼职网一致同意有关本协议以及使用本站的服务产生的争议交由仲裁解决，但是沃客来来兼职网有权选择采取诉讼方式，并有权选择受理该诉讼的有管辖权的法院。<br />
<br />
1、版权： <br />
<br />
A、此网址的所有内容和图表受《中华人民共和国著作权法》及相关法律法规和中国加入的所有知识产权方面的国际条约的保护。沃客来来兼职网对网站内容享有完整的著作权，未经其允许，不得以任何形式复制和采用。在内容和图表不作任何修改、保留性内容未做修改以及得到沃客来来兼职网的许可的情况下，沃客来来兼职网的网上材料可作为网外信息方面其他非商业性的用途。<br />
<br />
B、申请使用沃客来来兼职网内容的许可按特别批准原则进行；沃客来来兼职网欢迎各方的申请；请把请求直接提交 给service@makelailai.com。 <br />
<br />
C、请勿擅自复制或采用沃客来来兼职网所创造的用以制成网页的HTML。沃客来来兼职网对其html享有著作权。同时 沃客来来兼职网对其网址上的所有图标、图饰、图表、色彩、文字表述及其组合、版面设计、数据库均享有完全的著作权，对发布的信息均享有专有的发布和使用权，未经沃客来来兼职网同意，不得擅自复制、使用或转载。<br />
<br />
2、 商标： <br />
<br />
大学生兼职网的商标属于沃客来来兼职网所有。<br />
<br />
大学生兼职网上的沃客来来兼职网合作者的商标属于合作者所有。 <br />
<br />
3、 责任承担： <br />
<br />
大学生兼职网并无随时监视此网址，但保留对其实施实时监视的权利。对于他方输入的，不是沃客来来兼职网发布的材料，沃客来来兼职网概不负任何法律责任。应聘信息发布方必须对其存入简历中心的个人简历及材料的格式、内容的准确性和合法性独立承担一切法律责任。招聘信息的发布方对其在职位数据库公布的材料独立承担一切法律责任。<br />
<br />
大学生兼职网不保证对某一种职位描述会有一定数目的使用者来浏览，也不保证会有一位特定的使用者来 浏览。对于其他网址链接在本网址的内容，沃客来来兼职网概不负法律责任。<br />
<br />
4、 网站使用： <br />
<br />
A.明确禁止条款： <br />
<br />
大学生兼职网只能用于合法目的，即个人寻找职业和雇主寻找雇员。沃客来来兼职网明确禁止任何其他用途，所有使用者必须保证不用于下列任何一种用途：<br />
<br />
(1). 在简历中心公布虚假的、不完整的或不准确的简历资料（包括以为他人寻找全职或兼职工作之目的发布的简历），公布不是简历的资料，如意见、通知、商业广告或其他内容。<br />
<br />
(2). 本公司的竞争同行用此方法寻求与雇主的业务联络。 <br />
<br />
(3). 擅自删除或修改任何其他个人或公司公布的资料。 <br />
<br />
(4). 擅自打印、复制或使用有关雇员的任何个人资料或有关雇主的商业信息。未经同意，给公布信息 的个人或公司发电子邮件、打电话、寄信或进行其他任何形式的接触。<br />
<br />
B.网址安全规则： <br />
<br />
禁止使用者破坏或企图破坏沃客来来兼职网的安全规则，其中包括但不限于: <br />
<br />
(1). 接触未经许可的数据或进入未经许可的服务器或帐户; <br />
<br />
(2). 没有得到许可，企图探查，扫描或测试系统或网络的弱点，或者破坏安全措施； <br />
<br />
(3). 企图干涉对用户及网络的服务，包括，并不限于，通过超载， "邮件炸弹"或"摧毁"等手段; <br />
<br />
(4). 发送促销，产品广告及服务的E-mail； <br />
<br />
(5). 伪造TCP/IP数据包名称或部分名称。破坏系统或网络可能导致犯罪,51job.com将调查、干预此类 破坏行为的发生，并将与执法当局合作，起诉此类破坏行为的使用者。 <br />
<br />
C.总则： <br />
<br />
严禁出现下列三种情况： <br />
<br />
(1). 违反任何现行法律法规； <br />
<br />
(2). 侵犯他人的著作权及其他知识产权，侵害他人的商业机密或侵犯他人的隐私权等其他个人权利； <br />
<br />
(3). 利用本网址传送、分发、储存属于诽谤、淫秽、威胁、辱骂性的材料，毁损他人材料。 <br />
<br />
5. 暂停与中止使用：<br />
<br />
任何经大学生兼职网确认已违反了网站使用规则的用户，将收到一份书面警告。在该用户同意以书面形式 表示不再有任何犯规行为时，沃客来来兼职网有权决定是否给予其暂停使用的处理。但是，沃客来来兼职网可以不提出警告而马上暂停或终止对该用户的服务，如果沃客来来兼职网认为确有其必要；而对屡犯者将立即受到暂停使用或终止使用的处理。<br />
<br />
6. 除外： <br />
<br />
除了本网址在信息保密中提出的条款外，使用者理解并同意，大学生兼职网在不公开姓名的情况下，可以为用户应聘或招聘的目的向第三方提供综合性的资料。除非司法行政等公务需要，在未经本人同意的情况下，沃客来来兼职网将不向任何第三方公开用户相关资料。<br />
<br />
五、用户隐私免责声明 <br />
<br />
1、用户隐私制度<br />
<br />
当您到我们网站上注册并填写简历的时候，您会被要求提供一系列个人基本信息，如您的姓名、地址、电子邮件、电话号码等等。尊重用户个人隐私是本网站的一项基本政策。所以，本站一定不会公开、编辑或透露用户的注册资料及保存在本网各项服务中的非公开内容，除非本站在诚信的基础上认为透露这些信息在以下几种情况是必要的： <br />
<br />
（1）遵守有关法律规定，包括在国家有关机关查询时，提供用户在本站网页上发布的信息内容及其发布时间、互联网地址或者域名； <br />
<br />
（2）遵从本网站产品服务程序； <br />
<br />
（3）在紧急情况下竭力维护用户个人和社会大众的隐私安全； <br />
<br />
（4）本网站认为必要的其他情况下。 <br />
<br />
2、用户的帐号、密码和安全性　　<br />
<br />
您一旦注册成功成为用户，您将得到一个密码和帐号。如果您未保管好自己的帐号和密码而对您、本网站或第三方造成的损害，您将负全部责任。另外，每个用户都要对其帐户中的所有活动和事件负全责。您可随时改变您的密码。用户同意若发现任何非法使用用户帐号或安全漏洞的情况，立即通告本网站。
</p>
<br />
七、大学生兼职网保留随时修正本用户协议的权利。
                  </div>
                      <div style="margin-left: 550px;color:#666666;font-size: 14px;margin-top: 10px;">
                      <form>
                                                           接收服务协议：
                         <input type="radio" checked="checked" name="Sex" value="male" />&nbsp;&nbsp;
                     
                                                             不接受服务协议：
                          <input type="radio" name="Sex" value="female" />
                         </form>
					
				    </div>
                      
     </div>
   
  </body>
  <%@include file="Foot.jsp" %>
