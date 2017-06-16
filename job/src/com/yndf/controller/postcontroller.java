package com.yndf.controller;




import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;










import com.yndf.Service.CompanyService;
import com.yndf.Service.PostService;
import com.yndf.Service.ReplyService;
import com.yndf.Service.UserService;
import com.yndf.Util.VoInform;
import com.yndf.pojo.Company;
import com.yndf.pojo.Inform;
import com.yndf.pojo.Information;
import com.yndf.pojo.Pagebean;
import com.yndf.pojo.Post;
import com.yndf.pojo.Reply;
import com.yndf.pojo.User;

@Controller
public class postcontroller {
 //注入service
	@Resource(name="postservice")
	private PostService postservice;
	@Resource(name="userservice")
	private UserService userservice;
	@Resource(name="companyservice")
	private CompanyService companyService;
	@Resource(name="replyservice")
	private ReplyService replyservice;
	@RequestMapping("addpost")  //发帖
	public ModelAndView addpost(Post post,String username)
	{
		
		if(username.equals(""))
		{
			ModelAndView ft=new ModelAndView();
		     ft.addObject("mmm","请登录再发帖");
			ft.setViewName("/findallpost.do");
			return ft;
		}
		else
		{
			ModelAndView ft=new ModelAndView();
			post.setPtime(new Timestamp(new Date().getTime()));
			post.setPname(username);
			postservice.postadd(post);
			ft.setViewName("/findallpost.do");
			//代表学生用户的发帖
			
				return ft;
		}
		
	}
		
		@RequestMapping("/findallpost")//查全部帖
    public ModelAndView findallpost()
    {
		ModelAndView ct=new ModelAndView();
			ct.addObject("zd", postservice.findByPage(1,0));
		
			ct.addObject("np", 1);
			ct.setViewName("jzlt.jsp");
	   return ct;
	   
	   
	   //查通知
	   
		  }
		
		@RequestMapping("/findpost")//根据id查询某个帖子和回复
	public ModelAndView findpost(int id)
	{
		ModelAndView ct1=new ModelAndView();
		List<Reply> list = replyservice.findreply(id);
		for(int i=0;i<list.size();i++)//查询头像
		{
			String name = list.get(i).getRname();
			
			User user = userservice.findName(name);
			Company company = companyService.findName(name);
			if(user!=null&&company==null)
			{
				list.get(i).setTupian(user.getPicture());
				
			}else
			{
				list.get(i).setTupian(company.getPicture());
			}
			
		}
		ct1.addObject("tt", list);
		Post post  = postservice.postfind(id);
		User use = userservice.findName(post.getPname());
		Company compan = companyService.findName(post.getPname());
		if(use!=null&&compan==null)
		{
			ct1.addObject("ri",use);
			
		}else
		{
			ct1.addObject("ri",compan);
		}
		ct1.addObject("nm",list);
		ct1.setViewName("/jzlt2.jsp");
		ct1.addObject("zz",postservice.postfind(id));
		return ct1;
	}
		@RequestMapping("/fenye")//分页
		public ModelAndView fenye(int nowpage,int allpage)
		{
			if(nowpage>0&&allpage!=1)
				{
				Pagebean<Post> pagebean=postservice.findByPage(nowpage,0);
				ModelAndView fy=new ModelAndView();
				fy.addObject("np", nowpage);
				fy.addObject("ap", allpage);
				fy.addObject("zd", pagebean);
				fy.setViewName("/jzlt.jsp");
				return fy;
			}
			else if(allpage==1)
			{
				Pagebean<Post> pagebean=postservice.findByPage(nowpage,allpage);
				ModelAndView fy=new ModelAndView();
				fy.addObject("np", nowpage);
				fy.addObject("ap", allpage);
				fy.addObject("zd", pagebean);
				fy.setViewName("/jzlt.jsp");
				return fy;
			}
			else
			{
				Pagebean<Post> pagebean=postservice.findByPage(1,0);
				ModelAndView fy=new ModelAndView();
				fy.addObject("np", nowpage);
				fy.addObject("ap", allpage);
				fy.addObject("zd", pagebean);
				
				fy.setViewName("/jzlt.jsp");
				return fy;
			}
		}

		@RequestMapping("/findInform") //查用户通知
		public ModelAndView findInform(int uid) {
			ModelAndView mav=new ModelAndView();
			List<VoInform> li= postservice.findInform(uid);//所有的通知 消息
			
			mav.addObject("ff", li);
			mav.setViewName("/Tongzhi.jsp");
			return mav;
			
		}
		
		@RequestMapping("/informdelete") //删除用户通知
		public ModelAndView informdelete(int id)
		{
			ModelAndView mav=new ModelAndView();
			postservice.informdelete(id);
			mav.setViewName("/findInform.do");
			return mav;
			
		}

		@RequestMapping("/findif")//企业通知查询
		public ModelAndView findav()
		{
			ModelAndView mav=new ModelAndView();
			List<Information> li=postservice.findif();
			mav.addObject("op", li);
			mav.setViewName("/company33.jsp");
			return mav;
			
		}
		@RequestMapping("/deleteif")//企业删除通知
		public ModelAndView deleteif(int id)
		{
			ModelAndView mav=new ModelAndView();
			postservice.deleteif(id);
			mav.setViewName("/findif.do");
			return mav;
			
		}
}
