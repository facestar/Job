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
 * ��ֵ����controller��
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
	//�û���ֵ����ѯ
	@RequestMapping("/chaxun")
	public ModelAndView selectRechargeCard(RechargeCard rechargeCard,Recharge recharge,User user,HttpSession session)
	{
		ModelAndView mv = new ModelAndView();
		RechargeCard  rc = rechargeCardService.selectRechargeCard(rechargeCard);//��ֵ��ѯ���ź�����ķ���
		if(rc!=null)
		{
			recharge.setRtime(new Timestamp(new Date().getTime()) );
			User existuser = userService.findById(user.getId());
			int s = existuser.getBalance() +  recharge.getMoney();
			recharge.setBalance(s);
			rechargeService.addRecharge(recharge);//��ֵ����
			//user.setBalance(s);
			//user.setId(recharge.getUser_id());
			userService.updateBalance(user.getId(),s);//��ֵ֮���޸��û������ķ���
			rechargeCardService.deleteCard(rechargeCard.getCardnumber());//ɾ�����ŵķ���
			session.setAttribute("hh", rc);
			mv.addObject("yt","��ֵ�ɹ�");
			mv.setViewName("/QianBao.jsp");
		return mv;
		}else
		{
			mv.addObject("yt", "���Ż����������벻��ȷ�����������룺");
			mv.setViewName("/QianBao.jsp");
			return mv;
		}
	}
	//��ҵ��ֵ��ѯ
	@RequestMapping("/qiyechaxun")
	public ModelAndView CompanyRecharge(RechargeCard rechargeCard,Recharge recharge,Company company)
	{
		ModelAndView nv = new ModelAndView();
		RechargeCard  rch = rechargeCardService.selectRechargeCard(rechargeCard);//��ֵ��ѯ���ź�����ķ���
		if(rch!=null)
		{
			recharge.setRtime(new Timestamp(new Date().getTime()) );
			Company existcompany = companyService.findbyid(company.getId());
			int ss = existcompany.getBalance() + recharge.getMoney();
			recharge.setBalance(ss);
			rechargeService.addRecharge(recharge);//��ֵ����
			companyService.updateCompany(company.getId(),ss);//��ֵ֮���޸���ҵ�û������
			rechargeCardService.deleteCard(rechargeCard.getCardnumber());//ɾ�����ŵķ���
			nv.addObject("bv","��ֵ�ɹ���");
			nv.setViewName("/company22.jsp");
			return nv;
		}else
		{
			
			nv.addObject("bv", "���Ż����������벻��ȷ�����������룺");
			nv.setViewName("/company22.jsp");
			return nv;
		}
	}
}
