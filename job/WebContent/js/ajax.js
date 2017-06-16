
 //解决跳出回调函数问题
function ajaxFormSubmit(formId) {
  isSubmit=true;
    var frm=document.getElementById(formId);
    var dataPara = getFormJson(frm);
     if(isSubmit){
       $.ajax({
            url: frm.action,
            type: frm.method,
            data: dataPara,
            success:function(res){
       $(".mainContent").html(res);
         }
        });
    }
}

 //将form中的值转换为键值对。
function getFormJson(frm) {
    var o = {};
    var a = $(frm).serializeArray();
    $.each(a, function () {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                 o[this.name] = [o[this.name]];
            }
               if(this.value!=""){
               o[this.name]+=","+this.value;
            }
            //o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
} 

/*两次密码匹配  用户名不为空的判断 start*/
function panduan(){
     var e="";
	 var yhxm=$(".ygxm").val();
	 var gh=$(".gh").val();
	 if(gh==null||gh==""){
	    $(".uNTiShi").show();$(".gh").css({"border-color":"red"});return false;
	   }
      else if(gh!=null&&gh!=""){
        
		 $(".uNTiShi").css({"display":"none"});
		 $(".gh").css({"border-color":""});
		
	$.ajax({url:"users.do?action=findzhuce",
		async: false,//改为异步方式
		type: "POST",
		data:{userName:gh,e:e},
		success:function(re){
		if(re=="亲!这个工号已经分配给其他人了，请重新输入"){ alert(re);}
	      else if(re=="-！恭喜该工号可用-！")
	       {
			var pw1=$(".psw1").val();
			  if(pw1==null||pw1=="")
				{ 
				  $(".uPss1").show(); $(".psw1").css({"border-color":"red"});
				}
								
				  else if(pw1!=null&&pw1!="")
			      {		  
					   $(".uPss1").css({"display":"none"});
					   $(".psw1").css({"border-color":""});
					   var pw2=$(".psw2").val();	
						if(pw1!==pw2)
							{
							 $(".uPss2").show();$(".psw2").css({"border-color":"red"});return false;
							}
						
					 else if(pw1==pw2)
					 {	
						 $(".uPss2").css({"display":"none"});
					     $(".psw2").css({"border-color":""});
					 			var yhm=$(".ygxm").val();						 	
												
							  	 if(yhxm==null||yhxm=="")
							  	 	{  $(".uNm").show();
							  	 	   $(".ygxm").css({"border-color":"red"});
							  	 	return false;;
						  	 	    }
							  	  else if(yhxm!=null&&yhxm!="")
							    	{
							  	 		$(".uNm").css({"display":"none"});
										$(".ygxm").css({"border-color":""});
										e="yes";												 
			     			}
	                  }	//if(pw1==pw2)		 	
						
		     	 }//else if(pw1!=null||pw1!="")
	         } //else if(re=="-！恭喜该工号可用-！")		
	     }
      }); //post对应		
   }//else if(gh!=null||gh!="")	
     return e;		
 }
/*两次密码匹配  用户名不为空的判断 end*/


function zhuCeZhiX(zc){
	//alert(zc.value);
	var s=panduan();
	if(s){zc=$(".formIds")[0].id;ajaxFormSubmit(zc);}
	else{alert("大神呀！您的输入不合法，请重新输入。");}
	
  }


//修改密码





