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

//��ע���Ʋ�
@Controller
@RequestMapping("/guanzhu")
public class Guanzhu_controller
{
	//ע��service��
	@Resource(name="userservice")
	private UserService userService;
	@Resource(name="companyservice")
	private CompanyService companyService;
	@Resource(name="guanzhuservice")
	private GuanzhuService guanzhuservice;
	@Resource(name="workservice")
	private WorksService workservice;
	//��ӹ�ע
	@RequestMapping("/addgz")
	public String addguanzhu(Model mav,String uname,int cid,int wid) throws Exception
	{
		String ss=new String(uname.getBytes("iso-8859-1"),"utf-8");
		Company cp=companyService.findbyid(cid);//��ҵ
		Work bb= workservice.findbyid(wid);
		mav.addAttribute("pp",cp);
		mav.addAttribute("cc",bb);
		List<Work> lt=workservice.findBycom_id(cid);
		mav.addAttribute("ll", lt);
		Company com=companyService.findName(ss);
		if(ss==null||ss.equalsIgnoreCase(""))
		{
			mav.addAttribute("msg", "��¼��ſɹ�ע��");
			mav.addAttribute("gz", "+��ע");
			return "/aa.jsp";
		}
		else if(com!=null)//˵����¼��Ϊ��ҵ�û�
		{
			mav.addAttribute("msg", "�㲻��ѧ���û���");
			mav.addAttribute("gz", "+��ע");
			return "/aa.jsp";
		}
		else if(guanzhuservice.findBy2ID(userService.findName(ss).getId(), cid)==null)//th���ڿ�˵�����û�û�й�ע������ҵ
		{
			Guanzhu gz=new Guanzhu();
			gz.setCompany_id(cid);
			gz.setUser_id(userService.findName(ss).getId());
			guanzhuservice.addguanzhu(gz);
			mav.addAttribute("gz", "ȡ����ע");
			return "/aa.jsp";
		}
		else //˵���Ѿ���ע����Ҫȡ����ע
		{
			guanzhuservice.delgz(guanzhuservice.findBy2ID(userService.findName(ss).getId(), cid));
			mav.addAttribute("gz", "+��ע");
			return "/aa.jsp";
		}
		
	}
	@RequestMapping("/addgz2")
	public String addguanzhu2(Model mav,String uname,int cid,int wid) throws Exception
	{
		String ss=new String(uname.getBytes("iso-8859-1"),"utf-8");
		Company cp=companyService.findbyid(cid);//��ҵ
		Work bb= workservice.findbyid(wid);
		mav.addAttribute("pp",cp);
		mav.addAttribute("cc",bb);
		List<Work> lt=workservice.findBycom_id(cid);
		mav.addAttribute("ll", lt);
		Company com=companyService.findName(ss);
		if(ss==null||ss.equalsIgnoreCase(""))
		{
			mav.addAttribute("msg", "��¼��ſɹ�ע��");
			mav.addAttribute("gz", "+��ע");
			return "/bb.jsp";
		}
		else if(com!=null)//˵����¼��Ϊ��ҵ�û�
		{
			mav.addAttribute("msg", "�㲻��ѧ���û���");
			mav.addAttribute("gz", "+��ע");
			return "/bb.jsp";
		}
		else if(guanzhuservice.findBy2ID(userService.findName(ss).getId(), cid)==null)//th���ڿ�˵�����û�û�й�ע������ҵ
		{
			Guanzhu gz=new Guanzhu();
			gz.setCompany_id(cid);
			gz.setUser_id(userService.findName(ss).getId());
			guanzhuservice.addguanzhu(gz);
			mav.addAttribute("gz", "ȡ����ע");
			return "/bb.jsp";
		}
		else //˵���Ѿ���ע����Ҫȡ����ע
		{
			guanzhuservice.delgz(guanzhuservice.findBy2ID(userService.findName(ss).getId(), cid));
			mav.addAttribute("gz", "+��ע");
			return "/bb.jsp";
		}
		
	}
	//�������
	@RequestMapping("/addpinl")
	public String addpinglun(Model mav,String content,int uid,int wid,int cid,int jifen)
	{
		Pinlun pl=new Pinlun();
		pl.setContent(content);
		pl.setCtime(new Timestamp(new Date().getTime()));
		pl.setUser_id(uid);
		pl.setCompany_id(cid);
		guanzhuservice.addpingl(pl);//�������
		//����ҵ�ӷ�
		Pinlun gg=guanzhuservice.findBytID(uid, cid);//�����û�id����ҵid��ѯ�����ۼ�¼
		Company com=companyService.findbyid(cid);//������ҵid�鵽��ҵ
		
		Work bb= workservice.findbyid(wid);//�鵽��ְ
		mav.addAttribute("pp",com);//��
		mav.addAttribute("cc",bb);//
		//��ʾ������ְ
		List<Work> lt=workservice.findBycom_id(cid);
		mav.addAttribute("ll", lt);
		if(gg==null)//���ۼ�¼Ϊ��
		{
			//����ҵ�ӷ�
			com.setJifen(com.getJifen()+jifen);
			companyService.updateUser(com);
			if(guanzhuservice.findBy2ID(uid, cid)==null)//th���ڿ�˵�����û�û�й�ע������ҵ
			{
				mav.addAttribute("gz", "+��ע");
				return "/bb.jsp";
			}
			else 
			{
				guanzhuservice.delgz(guanzhuservice.findBy2ID(uid, cid));
				mav.addAttribute("gz", "ȡ����ע");
				return "/bb.jsp";
			}
		}
		else
		{
			if(guanzhuservice.findBy2ID(uid, cid)==null)//th���ڿ�˵�����û�û�й�ע������ҵ
			{
				mav.addAttribute("gz", "+��ע");
				return "/bb.jsp";
			}
			else 
			{
				guanzhuservice.delgz(guanzhuservice.findBy2ID(uid, cid));
				mav.addAttribute("gz", "ȡ����ע");
				return "/bb.jsp";
			}
		}
		
	}
	
	//��ҵ�����ʷ������Ϣ
	@RequestMapping("/lispinjia")
	public String chapinjia(Model mav,int cid)
	{
		//��ȡ�ʹ湫˾��Ϣ
		Company com=companyService.findbyid(cid);//������ҵid�鵽��ҵ
		mav.addAttribute("pp",com);//��
		
		//��ȡ�˹�˾����������
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
	//�û���ѯ�Լ�����ע����ҵ����Ϣ
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
		//ɾ����ע����ҵ
		@RequestMapping("/shanqiye")
		public ModelAndView deleteGuanzhu(int id)
		{
			ModelAndView mv = new ModelAndView();
			guanzhuservice.deleteGuanzhu(id);
			mv.setViewName("/guanzhu/chaqiye.do");
			return mv;
		}
	
}
