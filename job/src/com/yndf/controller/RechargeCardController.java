package com.yndf.controller;


import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yndf.Service.CompanyService;
import com.yndf.Service.RechargeCardService;
import com.yndf.Service.RechargeService;
import com.yndf.Service.UserService;
import com.yndf.pojo.Company;
import com.yndf.pojo.Recharge;
import com.yndf.pojo.RechargeCard;
import com.yndf.pojo.User;

/**
 * 充值卡表controller层
 */
@Controller
@RequestMapping("/rechargeCard")
public class RechargeCardController {
	@Resource(name="rechargeCardservice")
	private RechargeCardService rechargeCardService;
	@Resource(name="rechargeservice")
	private RechargeService rechargeService;
	@Resource(name="userservice")
	private UserService userService;
	@Resource(name="companyservice")
	private CompanyService companyService;
	//用户充值卡查询
	@RequestMapping("/chaxun")
	public ModelAndView selectRechargeCard(RechargeCard rechargeCard,Recharge recharge,User user,HttpSession session)
	{
		ModelAndView mv = new ModelAndView();
		RechargeCard  rc = rechargeCardService.selectRechargeCard(rechargeCard);//充值查询卡号和密码的方法
		if(rc!=null)
		{
			recharge.setRtime(new Timestamp(new Date().getTime()) );
			User existuser = userService.findById(user.getId());
			int s = existuser.getBalance() +  recharge.getMoney();
			recharge.setBalance(s);
			rechargeService.addRecharge(recharge);//充值方法
			//user.setBalance(s);
			//user.setId(recharge.getUser_id());
			userService.updateBalance(user.getId(),s);//充值之后修改用户的余额的方法
			rechargeCardService.deleteCard(rechargeCard.getCardnumber());//删除卡号的方法
			session.setAttribute("hh", rc);
			mv.addObject("yt","充值成功");
			mv.setViewName("/QianBao.jsp");
		return mv;
		}else
		{
			mv.addObject("yt", "卡号或者密码输入不正确，请重新输入：");
			mv.setViewName("/QianBao.jsp");
			return mv;
		}
	}
	//企业充值查询
	@RequestMapping("/qiyechaxun")
	public ModelAndView CompanyRecharge(RechargeCard rechargeCard,Recharge recharge,Company company)
	{
		ModelAndView nv = new ModelAndView();
		RechargeCard  rch = rechargeCardService.selectRechargeCard(rechargeCard);//充值查询卡号和密码的方法
		if(rch!=null)
		{
			recharge.setRtime(new Timestamp(new Date().getTime()) );
			Company existcompany = companyService.findbyid(company.getId());
			int ss = existcompany.getBalance() + recharge.getMoney();
			recharge.setBalance(ss);
			rechargeService.addRecharge(recharge);//充值方法
			companyService.updateCompany(company.getId(),ss);//充值之后修改企业用户的余额
			rechargeCardService.deleteCard(rechargeCard.getCardnumber());//删除卡号的方法
			nv.addObject("bv","充值成功！");
			nv.setViewName("/company22.jsp");
			return nv;
		}else
		{
			
			nv.addObject("bv", "卡号或者密码输入不正确，请重新输入：");
			nv.setViewName("/company22.jsp");
			return nv;
		}
	}
}
