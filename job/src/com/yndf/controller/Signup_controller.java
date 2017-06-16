package com.yndf.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yndf.Service.AdminService;
import com.yndf.Service.CompanyService;
import com.yndf.Service.GuanzhuService;
import com.yndf.Service.SignupService;
import com.yndf.Service.UserService;
import com.yndf.Service.WorksService;
import com.yndf.pojo.Company;
import com.yndf.pojo.Inform;
import com.yndf.pojo.Money;
import com.yndf.pojo.Signup;
import com.yndf.pojo.User;
import com.yndf.pojo.Work;

@Controller
@RequestMapping("/signup")
public class Signup_controller
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
	//ѧ���û�������ְ
	@RequestMapping("/baoming")
		public String signwork(Model mav,String username,int wid,int cid ,String gz) throws Exception
		{
			String ss=new String(username.getBytes("ISO-8859-1"),"utf-8");
			String gzz=new String(gz.getBytes("ISO-8859-1"),"utf-8");
			//�жϵ�¼���Ǻ��û�
			User uu=userService.findName(ss);
			Company com=companyService.findName(ss);
			Company cp=companyService.findbyid(cid);//��ҵ
			Work bb= workservice.findbyid(wid);
			mav.addAttribute("pp",cp);
			mav.addAttribute("cc",bb);
			List<Work> lt=workservice.findBycom_id(cid);
			mav.addAttribute("ll", lt);
			
			
			
			
			if(uu==null&&com==null)
			{
				
				mav.addAttribute("msg", "�������¼�����ԣ�");
				mav.addAttribute("gz", gzz);
				return "/aa.jsp";
			}
			else if(uu!=null&&com==null)
			{ 
				if(uu.getBalance()>=10)
				{
					//֪ͨ����
					Inform inform =new Inform();
					inform.setCompany_id(cid);
					inform.setUser_id(uu.getId());
					inform.setItime(new Timestamp(new Date().getTime()));
					inform.setIcontent(uu.getUname()+"�㱨����"+bb.getWtitle()+"��ְ�ѳɹ�,����"+bb.getBegindate()+"�μ�����");
					signupService.addinform(inform); 
					
					//�û�����Ҫ����
					uu.setBalance(uu.getBalance()-10);
					userService.updateUser(uu);
					
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
						my.setUser_id(uu.getId());
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
						my.setUser_id(uu.getId());
						my.setHtime(new Timestamp(new Date().getTime()));
						my.setJmoney(10);
						adminService.addmoney(my);
					}
					if(signupService.fingBytID(uu.getId(), wid)==null)
					{
					//��ӱ�����¼
					Signup sign=new Signup();
					sign.setUser_id(uu.getId());
					sign.setWork_id(wid);
					signupService.addSign(sign);
					
					//��ְ�ı���������1
					bb.setSignumber(bb.getSignumber()+1);
					workservice.updatework(bb);
					mav.addAttribute("msg", "�����ɹ���");
					mav.addAttribute("gz", gzz);
					return "/aa.jsp";
					}
					else
					{
						mav.addAttribute("msg", "���Ѿ�����������");
						mav.addAttribute("gz", gzz);
						return "/aa.jsp";
					}
				}
				else
				{
					mav.addAttribute("msg", "�������ֵ��");
					mav.addAttribute("gz", gzz);
					return "/aa.jsp";
				}
			}
			
			else
			{
				mav.addAttribute("msg", "����㲻��ѧ���û�������������");
				mav.addAttribute("gz", gzz);
				return "/aa.jsp";
			}
			
		}
	@RequestMapping("/baoming2")
	public String signwork2(Model mav,String username,int wid,int cid ,String gz) throws Exception
	{
		String ss=new String(username.getBytes("ISO-8859-1"),"utf-8");
		String gzz=new String(gz.getBytes("ISO-8859-1"),"utf-8");
		//�жϵ�¼���Ǻ��û�
		User uu=userService.findName(ss);
		Company com=companyService.findName(ss);
		Company cp=companyService.findbyid(cid);//��ҵ
		Work bb= workservice.findbyid(wid);
		List<Work> lt=workservice.findBycom_id(cid);
		mav.addAttribute("ll", lt);
		mav.addAttribute("pp",cp);
		mav.addAttribute("cc",bb);
		if(uu==null&&com==null)
		{
			mav.addAttribute("msg", "��¼��Ϣ�ѹ��ڣ�");
			mav.addAttribute("gz", gzz);
			return "/aa.jsp";
		}
		else if(uu!=null&&com==null)
		{
			if(signupService.fingBytID(uu.getId(), wid)==null)
			{
			//��ӱ�����¼
			Signup sign=new Signup();
			sign.setUser_id(uu.getId());
			sign.setWork_id(wid);
			signupService.addSign(sign);
			mav.addAttribute("msg", "�����ɹ���");
			mav.addAttribute("gz", gzz);
			return "/bb.jsp";
			}
			else
			{
				mav.addAttribute("msg", "���Ѿ�����������");
				mav.addAttribute("gz", gzz);
				return "/bb.jsp";
			}
		}
		else
		{
			mav.addAttribute("msg", "����㲻��ѧ���û�������������");
			mav.addAttribute("gz", gzz);
			return "/bb.jsp";
		}
		
	}

}
