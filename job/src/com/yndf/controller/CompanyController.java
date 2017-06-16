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
 * ��ҵcontroller��
 */
@Controller
@RequestMapping("/company")
public class CompanyController {
	@Resource(name="companyservice")
	private CompanyService companyService;
	@Resource(name="userservice")
	private UserService userService;
	@RequestMapping("/zhuce")
	//��ҵע��ķ���
	public ModelAndView saveCompany(Company company)
	{
		ModelAndView ma = new ModelAndView();
		if(companyService.findName(company.getUname())!=null||userService.findName(company.getUname())!=null)
		{
			ma.addObject("tr", "���û����Ѵ��ڣ�����������!");
			ma.setViewName("/register.jsp");
			return ma;
		}
		else
		{
			companyService.saveCompany(company);
			ma.addObject("pl", "ע��ɹ������¼��");
			ma.setViewName("/login.jsp");
			return ma;
		}
		
	}
	//��ҵ��¼
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
			
			mv.addObject("re", "��¼�ɹ���");
			mv.setViewName("/shouye.jsp");
			return mv;}
		else{
			 mv.addObject("re", "����˺Ż�û��ˣ�");
		     mv.setViewName("/login.jsp");
		      return mv;
		      }
		}else
		{
			mv.addObject("re", "�㻹û��ע������˺�����������������룺");
			mv.setViewName("/register.jsp");
			return mv;
		}
		
	}
	//�޸��û��������ĵķ���
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
