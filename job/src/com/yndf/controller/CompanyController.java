package com.yndf.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yndf.Service.CompanyService;
import com.yndf.Service.UserService;
import com.yndf.pojo.Company;
import com.yndf.pojo.User;

/**
 * 企业controller层
 */
@Controller
@RequestMapping("/company")
public class CompanyController {
	@Resource(name="companyservice")
	private CompanyService companyService;
	@Resource(name="userservice")
	private UserService userService;
	@RequestMapping("/zhuce")
	//企业注册的方法
	public ModelAndView saveCompany(Company company)
	{
		ModelAndView ma = new ModelAndView();
		if(companyService.findName(company.getUname())!=null||userService.findName(company.getUname())!=null)
		{
			ma.addObject("tr", "该用户名已存在，请重新输入!");
			ma.setViewName("/register.jsp");
			return ma;
		}
		else
		{
			companyService.saveCompany(company);
			ma.addObject("pl", "注册成功，请登录！");
			ma.setViewName("/login.jsp");
			return ma;
		}
		
	}
	//企业登录
	@RequestMapping("/login")
	public ModelAndView login(Company company,HttpSession session)
	{
		Company existcompany = companyService.findName(company.getUname());
		Company excompany = companyService.login(company);
		System.out.println(existcompany);
		ModelAndView mv = new ModelAndView();
		if(excompany!=null)
		{
		if(excompany.getState().equals("1"))
		{
			session.setAttribute("login", existcompany);
			
			mv.addObject("re", "登录成功！");
			mv.setViewName("/shouye.jsp");
			return mv;}
		else{
			 mv.addObject("re", "你的账号还没审核！");
		     mv.setViewName("/login.jsp");
		      return mv;
		      }
		}else
		{
			mv.addObject("re", "你还没有注册或者账号密码错误，请重新输入：");
			mv.setViewName("/register.jsp");
			return mv;
		}
		
	}
	//修改用户个人中心的方法
		@RequestMapping("/xiugai")
		public ModelAndView updateUser(HttpSession session,Company company) 
		{
			ModelAndView ma = new ModelAndView();
			company.setId(companyService.findName(company.getUname()).getId());
			company.getState();
			Company existcompany = companyService.updateUser(company);
			ma.addObject("select",existcompany);
			ma.setViewName("/CompanyJb.jsp");
			return ma;
			
		}
		
		
}
