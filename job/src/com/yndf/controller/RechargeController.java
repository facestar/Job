package com.yndf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yndf.Service.CompanyService;
import com.yndf.Service.RechargeService;
import com.yndf.Service.UserService;
import com.yndf.pojo.Company;
import com.yndf.pojo.Recharge;
import com.yndf.pojo.User;

/**
 * 充值记录表Controller层
 */
@Controller
@RequestMapping("/recharge")
public class RechargeController {
	@Resource(name="rechargeservice")
	private RechargeService rechargeService;
	@Resource(name="userservice")
	private UserService userService;
	@Resource(name="companyservice")
	private CompanyService companyService;
	//用户查询余额
	@RequestMapping("/select")
	public ModelAndView selectBalance(Recharge recharge,User user)
	{
		ModelAndView mv = new ModelAndView();
		//List<Recharge> Rec = rechargeService.findUser_id(recharge.getUser_id());
		//System.out.println(Rec + "****************/");
		//List<Recharge> rech = rechargeService.findBalance(recharge.getBalance());
		User existuser = userService.findById(user.getId());
		mv.addObject("rec",existuser);
		mv.setViewName("/QianBao3.jsp");
		return mv;
	}
	//用户查询充值记录的方法
	@RequestMapping("/jilu")
	public ModelAndView selectRecharge(Recharge recharge,User user)
	{
		ModelAndView mv = new ModelAndView();
		User exuser = userService.findById(user.getId());
		int s = exuser.getId();
		System.out.println(s + "***************");
		List<Recharge> list = rechargeService.selectRecharge(s);
		mv.addObject("yh",exuser.getUname());
		mv.addObject("jl",list);
		mv.setViewName("/QianBao2.jsp");
		return mv;
	}
	//企业查询余额
	@RequestMapping("/qiyechaxun")
	public ModelAndView findBalance(Company company)
	{
		ModelAndView mv = new ModelAndView();
		Company existcompany = companyService.findBalance(company.getId());
		mv.addObject("com",existcompany.getBalance());
		mv.setViewName("/company221.jsp");
		return mv;
	}
	//企业查询充值记录的方法
	@RequestMapping("/qiyejilu")
	public ModelAndView findRecharge(Recharge recharge,Company company)
	{
		ModelAndView mv = new ModelAndView();
		Company existcompany = companyService.findbyid(company.getId());
		int e = existcompany.getId();
		List<Recharge> list = rechargeService.seleRecharge(e);
		mv.addObject("yp",existcompany.getUname());
		mv.addObject("li",list);
		mv.setViewName("/company222.jsp");
		return mv;
	}
}
