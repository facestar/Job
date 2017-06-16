package com.yndf.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yndf.Service.CompanyService;
import com.yndf.Service.GonggaoService;
import com.yndf.Service.GuanzhuService;
import com.yndf.Service.MediumService;
import com.yndf.Service.SignupService;
import com.yndf.Service.UserService;
import com.yndf.Util.ComparatorCom;
import com.yndf.Util.ComparatorUser;
import com.yndf.pojo.Company;
import com.yndf.pojo.Gonggao;
import com.yndf.pojo.Guanzhu;
import com.yndf.pojo.Signup;
import com.yndf.pojo.User;

@Controller
@RequestMapping("/gonggao")
public class GonggaoAction {
	//ע��service��
		@Resource(name="gonggaoservice")
		private GonggaoService gonggaoservice;
		@Resource(name="mediumservice")
		private MediumService mediumService;
		@Resource(name="companyservice")
		private CompanyService companyService;
		@Resource(name="guanzhuservice")
		private GuanzhuService guanzhuservice;
		@Resource(name="userservice")
		private UserService userService;
		@Resource(name="signupservice")
		private SignupService signupService;
		//�������ӷ���
		@RequestMapping("/add")
		public ModelAndView addgonggao(Gonggao gonggao){
			ModelAndView modelAndView=new ModelAndView();
			modelAndView.addObject("tt",gonggaoservice.add(gonggao));
			modelAndView.setViewName("/gonggao/chaxun.do");
			return modelAndView;
	
		}
		//����Ĳ�ѯ����
		@RequestMapping("/chaxun")
		public ModelAndView selectgonggao(Gonggao gonggao){
			ModelAndView modelAndView=new ModelAndView();
			List<Gonggao> list= gonggaoservice.findAll(gonggao);
			 modelAndView.addObject("tp",list);
			 modelAndView.setViewName("/HtXitong.jsp");
			 return modelAndView;
		}
		//��ҳ����ҳ�湫��Ĳ�ѯ����
				@RequestMapping("/chakan")
				public ModelAndView findgonggao(Gonggao gonggao,HttpSession session){
					ModelAndView modelAndView=new ModelAndView();
					List<Gonggao> list= gonggaoservice.findAll(gonggao);
					 //modelAndView.addObject("tp",list);
					 session.setAttribute("tp",list);
					 
					//��ҵ��ְƷ�����а�
					 List<Company> li=companyService.findCompanyAll2();
					 if(li.size()>=3)
					 {
						 Collections.sort(li,new ComparatorCom());
						 Map gh=new HashMap();
						 gh.put("yi", li.get(0));
						 gh.put("er", li.get(1));
						 gh.put("san", li.get(2));
						 modelAndView.addObject("gh", gh); 
					 }
					 else
					 {
						 modelAndView.addObject("fy", "fy"); 
					 }
					 
					 //��ҵ��ְ��˿���а�
					 Map uzi=new HashMap();
					 Map ls=new HashMap();
					 Map cs=new HashMap();
					 Map cs2=new HashMap();
					 int[] b=new int[li.size()];
					 if(li.size()>=3)
					 {
						 for(int i=0;i<li.size();i++)//��������ҵ���е�id
						 {
							int ji= li.get(i).getId();//��ҵID
							int th=guanzhuservice.postfindcount(ji);//������ҵid��ѯ��ע��������м�¼��
							uzi.put(ji, th);//����¼������ֵջ keyΪji������ҵid
								b[i]=th;//�����м�¼����������
						 }
						 Arrays.parallelSort(b);//���򣬸����м�¼������
						 for(int i=0;i<li.size();i++)//������ҵ����id
						 {
							 int ji= li.get(i).getId();//��ҵID
							int a= (int)uzi.get(ji);//�����Ӧֵջ���ֵ
							
							//��ֵջ���ֵ�����������ֵ�����id����ֵջ
							if(a ==b[b.length-1])
							{
								if(cs.get(ji)==null&&cs.size()<1)
								{
									ls.put("��һ", ji);
									cs.put(ji, ji);//����ǰ��ҵid����ֵջ
								}
								
								else if(cs.size()==1) //��Ϊ�յ�ʱ��˵���ж���,����һ
								{
									ls.put("�ڶ�", ji);
									cs.put(ji, ji);
									
								}
								else if(cs.size()==2)
								{
									ls.put("����", ji);
								}
								
							}
							
							else if(a ==b[b.length-2])
							{
								
								if(cs2.get(ji)==null&&cs2.size()<1)
								{
									ls.put("�ڶ�", ji);
									cs2.put(ji, ji);//����ǰ��ҵid����ֵջ
								}
								else if(cs2.size()==1)
								{
									ls.put("����", ji);
								}
							}
							else if(a ==b[b.length-3])
							{
								ls.put("����",ji );
							}
						 }
						 
						 //����id��ѯ����Ӧ����ҵ��������
						 Company com1=companyService.findbyid((int)ls.get("��һ"));
						 Company com2=companyService.findbyid((int)ls.get("�ڶ�"));
						 Company com3=companyService.findbyid((int)ls.get("����"));
						 Map fs=new HashMap();
						 fs.put("c1", com1);
						 fs.put("c2", com2);
						 fs.put("c3", com3);
						 modelAndView.addObject("fs", fs); 
					 }
					 else
					 {
						 modelAndView.addObject("fy", "fy"); 
					 }
					 
					 
					 //�����������а�
					 List<User> uli=userService.findAll(new User());
					 if(uli.size()>=3)
					 {
					Collections.sort(uli, new ComparatorUser());
					Map gr=new HashMap();
					gr.put("u1", uli.get(0));
					gr.put("u2", uli.get(1));
					gr.put("u3", uli.get(2));
					modelAndView.addObject("sz", gr);}
					 else
					 {
						 modelAndView.addObject("fy", "fy"); 
					 }
					
					//�����������а�
					Map uz=new HashMap();//������
					 Map ha=new HashMap();//�ڶ��������ģ�����
					 Map xx=new HashMap();//����
					 Map hz=new HashMap();//������
					 int[] lw=new int[uli.size()];
					 if(uli.size()>=3)
					 {
						 for(int i=0;i<uli.size();i++)//�����û�������id
							{
								int uid=uli.get(i).getId();//��ȡ�û���id
								int tu=signupService.countByuid(uid);//��ȡ�û���Ӧ�ļ�ְ����
								lw[i]=tu;//������������
								uz.put(uid, tu);//��������ֵջ
							}
							Arrays.parallelSort(lw);//������lw��������
							//��ʼ�Ա�
							for(int i=0;i<uli.size();i++)
							{
								int uid=uli.get(i).getId();//��ȡ�û�id
								int zz=(int) uz.get(uid);//����id��ȡ��Ӧֵ
								if(zz==lw[lw.length-1])
								{
									if(ha.get(uid)==null&&ha.size()<1)
									{
										ha.put(uid, uid);
										hz.put("��һ", uid);
									}
									else if(ha.size()==1)
									{
										ha.put(uid, uid);
										hz.put("�ڶ�", uid);
									}
									else if(ha.size()==2)
									{
										hz.put("����", uid);
									}
								}
								else if(zz==lw[lw.length-2])
								{
									if(xx.get(uid)==null&&xx.size()<1)
									{
										xx.put(uid, uid);
										hz.put("�ڶ�", uid);
									}
									else if(xx.size()==1)
									{
										hz.put("����", uid);
									}
								}
								else if(zz==lw[lw.length-3])
								{
									hz.put("����", uid);
								}
							}
							
							//����id��ѯ��Ӧ���û�
							User uu1=userService.findById((int)hz.get("��һ"));
							User uu2=userService.findById((int)hz.get("�ڶ�"));
							User uu3=userService.findById((int)hz.get("����"));
							Map ue=new HashMap();
							ue.put("uu1", uu1);
							ue.put("uu2", uu2);
							ue.put("uu3", uu3);
							modelAndView.addObject("uus", ue); 
					 }
					
					
					
					 modelAndView.setViewName("/medium/chaxun.do");
					 return modelAndView;
				}
		//����ɾ���ķ���
		@RequestMapping("/shanchu")
		public ModelAndView deletegongao(int id)
		{
			ModelAndView mv=new ModelAndView();
			gonggaoservice.deletegongao(id);
			mv.setViewName("/gonggao/chaxun.do");
			return mv;
		}
}

