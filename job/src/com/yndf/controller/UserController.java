package com.yndf.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yndf.Service.CompanyService;
import com.yndf.Service.SignupService;
import com.yndf.Service.UserService;
import com.yndf.pojo.Company;
import com.yndf.pojo.Signup;
import com.yndf.pojo.User;

/**
 * 用户controller层
 */
@Controller
@RequestMapping("/user")
public class UserController{
	//注入service层
	@Resource(name="userservice")
	private UserService userService;
	@Resource(name="companyservice")
	private CompanyService companyService;
	@Resource(name="signupservice")
	private SignupService signupService;
	//用户注册
	@RequestMapping("/zhuce")
	public ModelAndView userSave(User user)
	{
		ModelAndView vn = new ModelAndView();
		if(userService.findName(user.getUname())!=null||companyService.findName(user.getUname())!=null)
		{
			
			vn.addObject("ty", "此用户名已被使用，请重新输入");
			vn.setViewName("/register.jsp");
			return vn;
		}
		else{
		userService.userSave(user);
		vn.setViewName("/login.jsp");
		return vn;
		}
		
	}
	//用户登录
	@RequestMapping("/login")
	public ModelAndView login(User user,HttpSession session)
	{
		User existuser = userService.login(user);
		ModelAndView mv = new ModelAndView();
		if(existuser!=null)
		{
			
			if(existuser.getZt()==1)
			{
				session.setAttribute("login", existuser);
				//mv.addObject("login", existuser);
				mv.addObject("ut", "登录成功");
				mv.setViewName("/shouye.jsp");
				return mv;
			}
			else
			{
				mv.addObject("ut", "你账号没审核");
				mv.setViewName("/login.jsp");
				return mv;
			}
		}
		
		else
		{
			mv.addObject("ut", "你还没有注册,或者账号密码错误！");
			mv.setViewName("/login.jsp");
			return mv;
		}
	}
	//用户信息查询
	@RequestMapping("/chaxun")
	public ModelAndView selectUser(HttpSession session,HttpServletRequest request) throws UnsupportedEncodingException
	{
		ModelAndView nv = new ModelAndView();
		String tt = request.getParameter("uname");
		String ss = new String (tt.getBytes("ISO-8859-1"),"utf-8");
		User existuser = userService.findName(ss);
		Company existcompany = companyService.findName(ss);
		if(existuser!=null&&existcompany==null)
		{
			session.setAttribute("select", existuser);
			//nv.addObject("select", existuser);
			nv.setViewName("/GRxinxi.jsp");
			return nv;
		}
		else
		{
			//session.setAttribute("select", existcompany);
			nv.addObject("select", existcompany);
			nv.setViewName("/CompanyJb.jsp");
			return nv;
		}
		
	}
	//个人信息完善
	@RequestMapping("/geren")
	public ModelAndView selectUserGR(HttpSession session,HttpServletRequest request) throws UnsupportedEncodingException
	{
		ModelAndView nv = new ModelAndView();
		//System.out.println(username + "14945123132");
		String tt = request.getParameter("uname");
		String ss = new String (tt.getBytes("ISO-8859-1"),"utf-8");
		User existuser = userService.findName(ss);
		Company existcompany = companyService.findName(ss);
		if(existuser!=null&&existcompany==null)
		{
			//session.setAttribute("GR", existuser);
			nv.addObject("GR", existuser);
			nv.setViewName("/GR.jsp");
			return nv;
		}
		else
		{
			//session.setAttribute("select", existcompany);
			nv.addObject("GR", existcompany);
			nv.setViewName("/CompanyXg.jsp");
			return nv;
			
			
		}
		
	}
	//修改用户个人中心的方法
	@RequestMapping("/xiugai")
	public ModelAndView updateUser(HttpSession session,User user) 
	{
		ModelAndView ma = new ModelAndView();
		
		user.setId(userService.findName(user.getUname()).getId());
		User existuser = userService.updateUser(user);
			ma.addObject("select",existuser);
			ma.setViewName("/GRxinxi.jsp");
			return ma;
		
	}
	
	//查看企业兼职报名了的用户
	@RequestMapping("/findComuser")
	public String findcomu(Model mav,int wid)
	{
		List<User> uli=new ArrayList<User>();
		List<Signup> sli=signupService.findBywid(wid);//根据兼职id查询到所有报名
		for(Signup ui:sli)
		{
			User us=userService.findById(ui.getId());//获得报名此兼职的所有用户
			uli.add(us);
		}
		mav.addAttribute("us", uli);
		return "/CompanyB.jsp";
	}
}
