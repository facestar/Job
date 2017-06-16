package com.yndf.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yndf.Service.AdminService;
import com.yndf.Service.CompanyService;
import com.yndf.Service.PostService;
import com.yndf.Service.ReplyService;
import com.yndf.Service.UserService;
import com.yndf.Service.WorksService;
import com.yndf.pojo.Admin;
import com.yndf.pojo.Company;
import com.yndf.pojo.Post;
import com.yndf.pojo.User;
import com.yndf.pojo.Work;

/**
 * 管理员Controller层
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	@Resource(name="adminservice")
	private AdminService adminService;
	@Resource(name="userservice")
	private UserService userService;
	@Resource(name="companyservice")
	private CompanyService companyService;
	@Resource(name="workservice")
	private WorksService worksService;
	@Resource(name="postservice")
	private PostService postService;
	@Resource(name="replyservice")
	private ReplyService replyService;
	@RequestMapping("/login")
	public ModelAndView login(Admin admin,HttpSession session)
	{
		ModelAndView mv = new ModelAndView();
		Admin existadmin = adminService.login(admin);
		
		/**if(existadmin.getAname().equals("admin")&& existadmin.getApassword().equals("123456"))
		{
			
			//mv.addObject("adminLogin",existadmin);
			session.setAttribute("adminLogin",existadmin);
			mv.addObject("bb", "登录成功！");
			mv.setViewName("/Htshouye.jsp");
			return mv;
			
		}else
		{
			mv.addObject("bb", "你输入的用户名或密码不正确，请重新输入：");
			mv.setViewName("/Htlogin.jsp");
			return mv;
		}*/
		if(existadmin!=null)
		{
			session.setAttribute("adminLogin",existadmin);
			mv.addObject("bc", "登录成功！");
			mv.setViewName("/Htshouye.jsp");
			return mv;
		}else
		{
			mv.addObject("bc", "你输入的用户名或密码不正确，请重新输入：");
			mv.setViewName("/Htlogin.jsp");
			return mv;
		}
	}
	//后台管理员查询用户
	@RequestMapping("/chaxun")
	public ModelAndView findAll(User user)
	{
		ModelAndView mv = new ModelAndView();
		List<User> list = userService.findAll(user);
		mv.addObject("hh",list);
		mv.setViewName("/Htshouye.jsp");
		return mv;
	}
	//后台管理员管理企业用户
	@RequestMapping("/chakan")
	public ModelAndView findAll(Company company)
	{
		ModelAndView mv = new ModelAndView();
		List<Company> list = companyService.findCompanyAll(company);
		mv.addObject("hg",list);
		mv.setViewName("/HtQiye.jsp");
		return mv;
	}
	//管理员查询帖子
	@RequestMapping("/tiezi")
	public ModelAndView findPost()
	{
		ModelAndView mv = new ModelAndView();
		List<Post> list = postService.findPost();
		mv.addObject("tz",list);
		mv.setViewName("/HtLuntan.jsp");
		return mv;
	}
	//管理员删除帖子以及回复者
	@RequestMapping("/shantie")
	public ModelAndView deletePost(int id)
	{
		ModelAndView mv = new ModelAndView();
		postService.delPost(id);
		replyService.deletePost(id);
		mv.setViewName("/admin/tiezi.do");
		return mv;
	}
	//企业账号启用与禁用
	@RequestMapping("/shenheqiye")
	public ModelAndView updatecpzt(int id,String state){
		ModelAndView mv = new ModelAndView();
		companyService.updatecpzt(id, state);
		mv.setViewName("/admin/chakan.do");
		return mv;}
	//用户账号启用与禁用
	@RequestMapping("/shenhegeren")
	public ModelAndView updateuzt(int id,int zt){
		ModelAndView mv = new ModelAndView();
		userService.updatezt(id, zt);
		mv.setViewName("/admin/chaxun.do");
		return mv;}
	//管理员查询企业资料
	@RequestMapping("/findcpzl")
	public ModelAndView findcpzl(int id){
		ModelAndView mv = new ModelAndView();
		Company cpy=companyService.findbyid(id);
		mv.addObject("ypc", cpy);
		mv.setViewName("/Htqiyexiangqing.jsp");
		return mv;
		
	}
	
	//管理员查询user资料
		@RequestMapping("/findcpuser")
		public ModelAndView findcpuser(int id){
			ModelAndView mv = new ModelAndView();
			User us=userService.findById(id);
			mv.addObject("use", us);
			mv.setViewName("/Htfinduser.jsp");
			return mv;
			
		}
}

