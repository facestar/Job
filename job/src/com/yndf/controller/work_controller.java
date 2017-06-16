package com.yndf.controller;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yndf.Service.AdminService;
import com.yndf.Service.CompanyService;
import com.yndf.Service.GuanzhuService;
import com.yndf.Service.SignupService;
import com.yndf.Service.UserService;
import com.yndf.Service.WorksService;
import com.yndf.pojo.Company;
import com.yndf.pojo.Information;
import com.yndf.pojo.Guanzhu;
import com.yndf.pojo.Money;
import com.yndf.pojo.Pagebean;
import com.yndf.pojo.Signup;
import com.yndf.pojo.User;
import com.yndf.pojo.Work;

/*
 * 兼职控制层
 * */
@Controller
@RequestMapping("/work")
public class work_controller
{
	@Resource(name="workservice")
	private WorksService workservice;
	@Resource(name="userservice")
	private UserService userService;
	@Resource(name="companyservice")
	private CompanyService companyService;
	@Resource(name="guanzhuservice")
	private GuanzhuService guanzhuservice;
	@Resource(name="signupservice")
	private SignupService signupService;
	@Resource(name="adminservice")
	private AdminService adminService;
	//企业添加兼职
	@RequestMapping("/addwork")
	public String addwork(Model mav,Work work,String username) throws UnsupportedEncodingException
	{
		
	
		Company com=companyService.findName(username);
		if(com.getBalance()>=10)
		{
			//公司消息通知
			Information information =new Information();
			information.setCompany_id(com.getId()); 
			information.setItime(new Timestamp(new Date().getTime()));
			information.setIcontent("你已经成功发布"+work.getWtitle()+"兼职");
			workservice.addav(information);
		
			//扣公司的钱
			com.setBalance(com.getBalance()-10);
			companyService.updateUser(com);
			//判断money表里有无记录
			List<Money> ly=adminService.selectm();//获得表里所有
			if(ly.size()<1)//无记录
			{
				Money admin=new Money();
				admin.setBalance(10);
				admin.setHtime(new Timestamp(new Date().getTime()));
				admin.setId(1);
				adminService.addmoney(admin);
				Money my=new Money();
				my.setCompany_id(com.getId());
				my.setHtime(new Timestamp(new Date().getTime()));
				my.setJmoney(10);
				adminService.addmoney(my);
				
			}
			else
			{
				for(Money mm:ly)
				{
					int id=mm.getId();
					if(id==1)
					{
						mm.setBalance(mm.getBalance()+10);
						adminService.updatemoney(mm);
					}
				}
				
				Money my=new Money();
				my.setCompany_id(com.getId());
				my.setHtime(new Timestamp(new Date().getTime()));
				my.setJmoney(10);
				adminService.addmoney(my);
			}
			
			
			work.setCompany_id(com.getId());
			work.setWtime(new Timestamp(new Date().getTime()));
			work.setWstate("未完成");
			workservice.addwork(work);
		}
		else
		{
			mav.addAttribute("msg", "余额不足请充值！");
		}
		  
		
		
		return "/company44.jsp";
	}
	//点击找兼职查询所有兼职
	@RequestMapping("/findallwork")
	public ModelAndView findallwork(){
		ModelAndView mv=new ModelAndView();
		List<Work> ss=workservice.findallwork();
		
		for(int i=0;i<ss.size();i++)
		{
			int  yj=signupService.countBywid(ss.get(i).getId());
			ss.get(i).setSignumber(yj);
			
		}
		mv.addObject("qb",ss);
		
		mv.setViewName("/Zhaojianzhi.jsp");
		return mv;
		
	}
	//按兼职标题查询兼职信息以及查询该兼职所对应公司信息
	@RequestMapping("/findbyid")
	public ModelAndView findwtitle(String uname,int id,int cid) throws UnsupportedEncodingException{
		ModelAndView mv=new ModelAndView();
		//String ss=new String(uname.getBytes("ISO-8859-1"),"utf-8");
		List<Work> lt=workservice.findBycom_id(cid);
		System.out.println(lt);
		Company cp=companyService.findbyid(cid);//企业
		System.out.println(cp.toString());
		Work bb= workservice.findbyid(id);//
		mv.addObject("ll", lt);
		mv.addObject("pp",cp);
		mv.addObject("cc",bb);
		User uu=userService.findName(uname);
		Company com=companyService.findName(uname);
		if(uu!=null&&com==null)
		{
			if (guanzhuservice.findBy2ID(uu.getId(), cid)!=null)//有关注过
			{
				mv.addObject("gz", "取消关注");
				mv.setViewName("/aa.jsp");
				return mv;
			}
			else
			{
				mv.addObject("gz", "+关注");
				mv.setViewName("/aa.jsp");
				return mv;
			}
			
		}
		else
		{
			mv.addObject("gz", "关注");
			mv.setViewName("/aa.jsp");
			return mv;
		}
		
		
	}
	//按兼职类型性别和时间查询兼职
	@RequestMapping("/findwtype")

	public ModelAndView findwtypeandwsex(HttpServletRequest request,HttpServletResponse response,String wtype,String wsex,String begindate,int page){

		ModelAndView mv=new ModelAndView();
		int pag=request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
		if(begindate.equals("")){
		if(wtype.equals("quanbu")&& wsex.equals("不限")){
			Pagebean<Work> ls=workservice.findallfy(pag);
			
			mv.addObject("bp", ls);
			mv.setViewName("/Zhaojianzhi.jsp");
			return mv;       }
		if(wsex.equals("不限")){
		
		Pagebean<Work> ls=workservice.findwtype(pag,wtype);
		   mv.addObject("bp",ls);
		   mv.setViewName("/Zhaojianzhia.jsp");
		   return mv;}
		
		if(wtype.equals("quanbu")&& wsex.equals("男")){
			Pagebean<Work> ls=workservice.findwsex(pag, wsex);
			mv.addObject("bp",ls);
			mv.setViewName("/Zhaojianzhia.jsp");
			return mv;
		}
		if(wtype.equals("quanbu")&& wsex.equals("女")){
			Pagebean<Work> ls=workservice.findwsex(pag, wsex);
			mv.addObject("bp",ls);
			mv.setViewName("/Zhaojianzhia.jsp");
			return mv;
		}
		
		Pagebean<Work> ls=workservice.findwtypeandwsex(pag, wtype, wsex);
		
		mv.addObject("bp",ls);
		mv.setViewName("/Zhaojianzhia.jsp");
		return mv;
		
		}
		else if(wtype.equals("quanbu") && !begindate.equals("")){
			if(wsex.equals("不限")){
				Pagebean<Work> ls=workservice.findbegindate(pag, begindate);
				mv.addObject("bp",ls);
				mv.setViewName("/Zhaojianzhia.jsp");
				return mv;
				
			}
			Pagebean<Work> ls=workservice.findwsexandbegindate(page, wsex, begindate);
			mv.addObject("bp",ls);
			mv.setViewName("/Zhaojianzhia.jsp");
			return mv;
		}
		else if(!wtype.equals("quanbu") && !begindate.equals("")){
			if(wsex.equals("不限")){
				Pagebean<Work> ls=workservice.findwtypeandbegindate(page, wtype, begindate);
				mv.addObject("bp",ls);
				mv.setViewName("/Zhaojianzhia.jsp");
				return mv;
			}
			if(!wsex.equals("不限")){
				Pagebean<Work> ls=workservice.findwtypeandwsexandbegindate(page, wtype, wsex, begindate);
				mv.addObject("bp",ls);
				mv.setViewName("/Zhaojianzhia.jsp");
				return mv;
				
			}
			
		}
		Pagebean<Work> ls=workservice.findbegindate(pag,begindate);
		mv.addObject("bp",ls);
		mv.setViewName("/Zhaojianzhia.jsp");
		return mv;
		
		
	}
	//用户信息验证是否为企业
	@RequestMapping("/yanzhen")
	public String yanzhen(Model mav,String username) throws UnsupportedEncodingException
	{
		String ss=new String(username.getBytes("ISO-8859-1"),"utf-8");
		Company com=companyService.findName(ss);
		User user=userService.findName(username);
		if(user==null&&com!=null)
		{
			return "/company44.jsp";
		}
		else if(user!=null&&com==null)
		{
			mav.addAttribute("msg", "只有企业用户才能发布兼职！");
			
			return "/shouye.jsp";
		}
		else
		{
			mav.addAttribute("msg", "你还未登录！");
			return "/shouye.jsp";	
		}
		
	}
	
	//企业兼职管理，查询企业发布过的兼职
	@RequestMapping("comFindWork")
	public String comchawork(Model mav,String username) throws UnsupportedEncodingException
	{
		String ss=new String(username.getBytes("ISO-8859-1"),"utf-8");
		Company com=companyService.findName(ss);
		mav.addAttribute("ff",workservice.findBycom_id(com.getId()));
		return "/company11.jsp";
	}

	//企业兼职的删除
	@RequestMapping("/deletework")
	public String deletework(Model mav,int id,String username) throws Exception
	{
		workservice.deletework(id);
		String ss=new String(username.getBytes("ISO-8859-1"),"utf-8");
		Company com=companyService.findName(ss);
		mav.addAttribute("ff",workservice.findBycom_id(com.getId()));
		return "/company11.jsp";
	}
	//学生用户查询兼职
	@RequestMapping("userFindWork")
	public String userchawork(Model mav,String username) throws UnsupportedEncodingException
	{
		String ss=new String(username.getBytes("ISO-8859-1"),"utf-8");
		User com=userService.findName(ss);
		List li=signupService.findByuser_id(com.getId());//获取兼职id集合
		if(li!=null)//获取报名表里的work_id，一个用户应该会有多个兼职所以用集合
		{
			List<Work> yy=new ArrayList<Work>();
			for(int i=0;i<li.size();i++)
			{
				Work e=workservice.findbyid((int)li.get(i));
				yy.add(e);
			}
			
			mav.addAttribute("ff",yy);
			return "/Jzgl.jsp";
		}
		else
		{
			return "/Jzgl.jsp";
		}
	}
	
	//跳转评分页面
	@RequestMapping("/tiaojifen")
	public String tiaojifen(Model mav,String uname,int wid) throws Exception
	{
		//下个页面需要公司信息，兼职信息
		String ss=new String(uname.getBytes("ISO-8859-1"),"utf-8");
		Work ww=workservice.findbyid(wid);//兼职
		Company com=companyService.findbyid(ww.getCompany_id());//公司信息
		List<Work> lt=workservice.findBycom_id(ww.getCompany_id());
		mav.addAttribute("pp",com);//企业
		mav.addAttribute("cc",ww);
		mav.addAttribute("ll", lt);
		
		 if(guanzhuservice.findBy2ID(userService.findName(ss).getId(), ww.getCompany_id())==null)//th等于空说明此用户没有关注过此企业
		{
			mav.addAttribute("gz", "+关注");
			return "/bb.jsp";
		}
		else 
		{
			guanzhuservice.delgz(guanzhuservice.findBy2ID(userService.findName(ss).getId(), ww.getCompany_id()));
			mav.addAttribute("gz", "取消关注");
			return "/bb.jsp";
		}
		
	}
	
	@RequestMapping("/fenye")//分页
	public ModelAndView fenye(HttpServletRequest request,HttpServletResponse response)
	{
		
		int page=request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
		{
			Pagebean<Work> ls=workservice.findallfy(page);
			ModelAndView mv=new ModelAndView();
			
			
			mv.addObject("bp", ls);
			mv.setViewName("/Zhaojianzhi.jsp");
			return mv;
		
		
		}
	}
	
	//企业兼职变成完成
	@RequestMapping("/wancheng")
	public String wancheng(Model mav,int id)
	{
		List<Signup> li=signupService.findBywid(id);//获取所有做了这个兼职的人
		Work w=workservice.findbyid(id);
		//积分的添加
		
		if(li.size()>0)
		{
			//状态的改变
			
			w.setWstate("已完成");
			workservice.updatework(w);
			mav.addAttribute("wc", "已完成");
			
			for(Signup gz:li)
			{
				//获取用户
				User uu=userService.findById(gz.getUser_id());
				uu.setJifen(uu.getJifen()+w.getJifen());
				userService.updateUser(uu);
			}
		}
		
		//这个企业的所有兼职
		mav.addAttribute("ff", workservice.findBycom_id(w.getCompany_id()));
		
		return "/company11.jsp";
	}

}
