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
 * ��ְ���Ʋ�
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
	//��ҵ��Ӽ�ְ
	@RequestMapping("/addwork")
	public String addwork(Model mav,Work work,String username) throws UnsupportedEncodingException
	{
		
	
		Company com=companyService.findName(username);
		if(com.getBalance()>=10)
		{
			//��˾��Ϣ֪ͨ
			Information information =new Information();
			information.setCompany_id(com.getId()); 
			information.setItime(new Timestamp(new Date().getTime()));
			information.setIcontent("���Ѿ��ɹ�����"+work.getWtitle()+"��ְ");
			workservice.addav(information);
		
			//�۹�˾��Ǯ
			com.setBalance(com.getBalance()-10);
			companyService.updateUser(com);
			//�ж�money�������޼�¼
			List<Money> ly=adminService.selectm();//��ñ�������
			if(ly.size()<1)//�޼�¼
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
			work.setWstate("δ���");
			workservice.addwork(work);
		}
		else
		{
			mav.addAttribute("msg", "�������ֵ��");
		}
		  
		
		
		return "/company44.jsp";
	}
	//����Ҽ�ְ��ѯ���м�ְ
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
	//����ְ�����ѯ��ְ��Ϣ�Լ���ѯ�ü�ְ����Ӧ��˾��Ϣ
	@RequestMapping("/findbyid")
	public ModelAndView findwtitle(String uname,int id,int cid) throws UnsupportedEncodingException{
		ModelAndView mv=new ModelAndView();
		//String ss=new String(uname.getBytes("ISO-8859-1"),"utf-8");
		List<Work> lt=workservice.findBycom_id(cid);
		System.out.println(lt);
		Company cp=companyService.findbyid(cid);//��ҵ
		System.out.println(cp.toString());
		Work bb= workservice.findbyid(id);//
		mv.addObject("ll", lt);
		mv.addObject("pp",cp);
		mv.addObject("cc",bb);
		User uu=userService.findName(uname);
		Company com=companyService.findName(uname);
		if(uu!=null&&com==null)
		{
			if (guanzhuservice.findBy2ID(uu.getId(), cid)!=null)//�й�ע��
			{
				mv.addObject("gz", "ȡ����ע");
				mv.setViewName("/aa.jsp");
				return mv;
			}
			else
			{
				mv.addObject("gz", "+��ע");
				mv.setViewName("/aa.jsp");
				return mv;
			}
			
		}
		else
		{
			mv.addObject("gz", "��ע");
			mv.setViewName("/aa.jsp");
			return mv;
		}
		
		
	}
	//����ְ�����Ա��ʱ���ѯ��ְ
	@RequestMapping("/findwtype")

	public ModelAndView findwtypeandwsex(HttpServletRequest request,HttpServletResponse response,String wtype,String wsex,String begindate,int page){

		ModelAndView mv=new ModelAndView();
		int pag=request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
		if(begindate.equals("")){
		if(wtype.equals("quanbu")&& wsex.equals("����")){
			Pagebean<Work> ls=workservice.findallfy(pag);
			
			mv.addObject("bp", ls);
			mv.setViewName("/Zhaojianzhi.jsp");
			return mv;       }
		if(wsex.equals("����")){
		
		Pagebean<Work> ls=workservice.findwtype(pag,wtype);
		   mv.addObject("bp",ls);
		   mv.setViewName("/Zhaojianzhia.jsp");
		   return mv;}
		
		if(wtype.equals("quanbu")&& wsex.equals("��")){
			Pagebean<Work> ls=workservice.findwsex(pag, wsex);
			mv.addObject("bp",ls);
			mv.setViewName("/Zhaojianzhia.jsp");
			return mv;
		}
		if(wtype.equals("quanbu")&& wsex.equals("Ů")){
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
			if(wsex.equals("����")){
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
			if(wsex.equals("����")){
				Pagebean<Work> ls=workservice.findwtypeandbegindate(page, wtype, begindate);
				mv.addObject("bp",ls);
				mv.setViewName("/Zhaojianzhia.jsp");
				return mv;
			}
			if(!wsex.equals("����")){
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
	//�û���Ϣ��֤�Ƿ�Ϊ��ҵ
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
			mav.addAttribute("msg", "ֻ����ҵ�û����ܷ�����ְ��");
			
			return "/shouye.jsp";
		}
		else
		{
			mav.addAttribute("msg", "�㻹δ��¼��");
			return "/shouye.jsp";	
		}
		
	}
	
	//��ҵ��ְ������ѯ��ҵ�������ļ�ְ
	@RequestMapping("comFindWork")
	public String comchawork(Model mav,String username) throws UnsupportedEncodingException
	{
		String ss=new String(username.getBytes("ISO-8859-1"),"utf-8");
		Company com=companyService.findName(ss);
		mav.addAttribute("ff",workservice.findBycom_id(com.getId()));
		return "/company11.jsp";
	}

	//��ҵ��ְ��ɾ��
	@RequestMapping("/deletework")
	public String deletework(Model mav,int id,String username) throws Exception
	{
		workservice.deletework(id);
		String ss=new String(username.getBytes("ISO-8859-1"),"utf-8");
		Company com=companyService.findName(ss);
		mav.addAttribute("ff",workservice.findBycom_id(com.getId()));
		return "/company11.jsp";
	}
	//ѧ���û���ѯ��ְ
	@RequestMapping("userFindWork")
	public String userchawork(Model mav,String username) throws UnsupportedEncodingException
	{
		String ss=new String(username.getBytes("ISO-8859-1"),"utf-8");
		User com=userService.findName(ss);
		List li=signupService.findByuser_id(com.getId());//��ȡ��ְid����
		if(li!=null)//��ȡ���������work_id��һ���û�Ӧ�û��ж����ְ�����ü���
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
	
	//��ת����ҳ��
	@RequestMapping("/tiaojifen")
	public String tiaojifen(Model mav,String uname,int wid) throws Exception
	{
		//�¸�ҳ����Ҫ��˾��Ϣ����ְ��Ϣ
		String ss=new String(uname.getBytes("ISO-8859-1"),"utf-8");
		Work ww=workservice.findbyid(wid);//��ְ
		Company com=companyService.findbyid(ww.getCompany_id());//��˾��Ϣ
		List<Work> lt=workservice.findBycom_id(ww.getCompany_id());
		mav.addAttribute("pp",com);//��ҵ
		mav.addAttribute("cc",ww);
		mav.addAttribute("ll", lt);
		
		 if(guanzhuservice.findBy2ID(userService.findName(ss).getId(), ww.getCompany_id())==null)//th���ڿ�˵�����û�û�й�ע������ҵ
		{
			mav.addAttribute("gz", "+��ע");
			return "/bb.jsp";
		}
		else 
		{
			guanzhuservice.delgz(guanzhuservice.findBy2ID(userService.findName(ss).getId(), ww.getCompany_id()));
			mav.addAttribute("gz", "ȡ����ע");
			return "/bb.jsp";
		}
		
	}
	
	@RequestMapping("/fenye")//��ҳ
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
	
	//��ҵ��ְ������
	@RequestMapping("/wancheng")
	public String wancheng(Model mav,int id)
	{
		List<Signup> li=signupService.findBywid(id);//��ȡ�������������ְ����
		Work w=workservice.findbyid(id);
		//���ֵ����
		
		if(li.size()>0)
		{
			//״̬�ĸı�
			
			w.setWstate("�����");
			workservice.updatework(w);
			mav.addAttribute("wc", "�����");
			
			for(Signup gz:li)
			{
				//��ȡ�û�
				User uu=userService.findById(gz.getUser_id());
				uu.setJifen(uu.getJifen()+w.getJifen());
				userService.updateUser(uu);
			}
		}
		
		//�����ҵ�����м�ְ
		mav.addAttribute("ff", workservice.findBycom_id(w.getCompany_id()));
		
		return "/company11.jsp";
	}

}
