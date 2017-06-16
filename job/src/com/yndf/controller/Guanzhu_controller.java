package com.yndf.controller;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yndf.Service.CompanyService;
import com.yndf.Service.GuanzhuService;
import com.yndf.Service.UserService;
import com.yndf.Service.WorksService;
import com.yndf.pojo.Company;
import com.yndf.pojo.Guanzhu;
import com.yndf.pojo.Pinlun;
import com.yndf.pojo.User;
import com.yndf.pojo.Work;

//关注控制层
@Controller
@RequestMapping("/guanzhu")
public class Guanzhu_controller
{
	//注入service层
	@Resource(name="userservice")
	private UserService userService;
	@Resource(name="companyservice")
	private CompanyService companyService;
	@Resource(name="guanzhuservice")
	private GuanzhuService guanzhuservice;
	@Resource(name="workservice")
	private WorksService workservice;
	//添加关注
	@RequestMapping("/addgz")
	public String addguanzhu(Model mav,String uname,int cid,int wid) throws Exception
	{
		String ss=new String(uname.getBytes("iso-8859-1"),"utf-8");
		Company cp=companyService.findbyid(cid);//企业
		Work bb= workservice.findbyid(wid);
		mav.addAttribute("pp",cp);
		mav.addAttribute("cc",bb);
		List<Work> lt=workservice.findBycom_id(cid);
		mav.addAttribute("ll", lt);
		Company com=companyService.findName(ss);
		if(ss==null||ss.equalsIgnoreCase(""))
		{
			mav.addAttribute("msg", "登录后才可关注！");
			mav.addAttribute("gz", "+关注");
			return "/aa.jsp";
		}
		else if(com!=null)//说明登录的为企业用户
		{
			mav.addAttribute("msg", "你不是学生用户！");
			mav.addAttribute("gz", "+关注");
			return "/aa.jsp";
		}
		else if(guanzhuservice.findBy2ID(userService.findName(ss).getId(), cid)==null)//th等于空说明此用户没有关注过此企业
		{
			Guanzhu gz=new Guanzhu();
			gz.setCompany_id(cid);
			gz.setUser_id(userService.findName(ss).getId());
			guanzhuservice.addguanzhu(gz);
			mav.addAttribute("gz", "取消关注");
			return "/aa.jsp";
		}
		else //说明已经关注过，要取消关注
		{
			guanzhuservice.delgz(guanzhuservice.findBy2ID(userService.findName(ss).getId(), cid));
			mav.addAttribute("gz", "+关注");
			return "/aa.jsp";
		}
		
	}
	@RequestMapping("/addgz2")
	public String addguanzhu2(Model mav,String uname,int cid,int wid) throws Exception
	{
		String ss=new String(uname.getBytes("iso-8859-1"),"utf-8");
		Company cp=companyService.findbyid(cid);//企业
		Work bb= workservice.findbyid(wid);
		mav.addAttribute("pp",cp);
		mav.addAttribute("cc",bb);
		List<Work> lt=workservice.findBycom_id(cid);
		mav.addAttribute("ll", lt);
		Company com=companyService.findName(ss);
		if(ss==null||ss.equalsIgnoreCase(""))
		{
			mav.addAttribute("msg", "登录后才可关注！");
			mav.addAttribute("gz", "+关注");
			return "/bb.jsp";
		}
		else if(com!=null)//说明登录的为企业用户
		{
			mav.addAttribute("msg", "你不是学生用户！");
			mav.addAttribute("gz", "+关注");
			return "/bb.jsp";
		}
		else if(guanzhuservice.findBy2ID(userService.findName(ss).getId(), cid)==null)//th等于空说明此用户没有关注过此企业
		{
			Guanzhu gz=new Guanzhu();
			gz.setCompany_id(cid);
			gz.setUser_id(userService.findName(ss).getId());
			guanzhuservice.addguanzhu(gz);
			mav.addAttribute("gz", "取消关注");
			return "/bb.jsp";
		}
		else //说明已经关注过，要取消关注
		{
			guanzhuservice.delgz(guanzhuservice.findBy2ID(userService.findName(ss).getId(), cid));
			mav.addAttribute("gz", "+关注");
			return "/bb.jsp";
		}
		
	}
	//添加评论
	@RequestMapping("/addpinl")
	public String addpinglun(Model mav,String content,int uid,int wid,int cid,int jifen)
	{
		Pinlun pl=new Pinlun();
		pl.setContent(content);
		pl.setCtime(new Timestamp(new Date().getTime()));
		pl.setUser_id(uid);
		pl.setCompany_id(cid);
		guanzhuservice.addpingl(pl);//添加评论
		//给企业加分
		Pinlun gg=guanzhuservice.findBytID(uid, cid);//根据用户id和企业id查询到评论记录
		Company com=companyService.findbyid(cid);//根据企业id查到企业
		
		Work bb= workservice.findbyid(wid);//查到兼职
		mav.addAttribute("pp",com);//存
		mav.addAttribute("cc",bb);//
		//显示其他兼职
		List<Work> lt=workservice.findBycom_id(cid);
		mav.addAttribute("ll", lt);
		if(gg==null)//评论记录为空
		{
			//给企业加分
			com.setJifen(com.getJifen()+jifen);
			companyService.updateUser(com);
			if(guanzhuservice.findBy2ID(uid, cid)==null)//th等于空说明此用户没有关注过此企业
			{
				mav.addAttribute("gz", "+关注");
				return "/bb.jsp";
			}
			else 
			{
				guanzhuservice.delgz(guanzhuservice.findBy2ID(uid, cid));
				mav.addAttribute("gz", "取消关注");
				return "/bb.jsp";
			}
		}
		else
		{
			if(guanzhuservice.findBy2ID(uid, cid)==null)//th等于空说明此用户没有关注过此企业
			{
				mav.addAttribute("gz", "+关注");
				return "/bb.jsp";
			}
			else 
			{
				guanzhuservice.delgz(guanzhuservice.findBy2ID(uid, cid));
				mav.addAttribute("gz", "取消关注");
				return "/bb.jsp";
			}
		}
		
	}
	
	//企业获得历史评价信息
	@RequestMapping("/lispinjia")
	public String chapinjia(Model mav,int cid)
	{
		//获取和存公司信息
		Company com=companyService.findbyid(cid);//根据企业id查到企业
		mav.addAttribute("pp",com);//存
		
		//获取此公司的所有评论
		List<Pinlun> li=guanzhuservice.findBysywID(cid);
		if(li!=null)
		{
			for(int i=0;i<li.size();i++)
			{
				User u=userService.findById(li.get(i).getUser_id());
				li.get(i).setTupian(u.getPicture());
			}
		}
		mav.addAttribute("pl", li);
		return "/UserPingjia.jsp";
		
	}
	//用户查询自己所关注的企业的信息
		@RequestMapping("/chaqiye")
		public ModelAndView chaGuanZhu(int id,Guanzhu guanzhu)
		{
			ModelAndView mv = new ModelAndView();
			User existuser = userService.findById(id);
			int s = existuser.getId();
			List<Guanzhu> li = guanzhuservice.findByid(s);
			List<Company> com = new ArrayList<Company>();
			for(int i=0;i<li.size();i++)
			{
			 Company eixt = companyService.findbyid(li.get(i).getCompany_id());
			 com.add(eixt);
			}
			mv.addObject("yy",com);
			mv.setViewName("/userGuanzhu.jsp");
			return mv;
		}
		//删除关注的企业
		@RequestMapping("/shanqiye")
		public ModelAndView deleteGuanzhu(int id)
		{
			ModelAndView mv = new ModelAndView();
			guanzhuservice.deleteGuanzhu(id);
			mv.setViewName("/guanzhu/chaqiye.do");
			return mv;
		}
	
}
