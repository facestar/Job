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
	//注入service层
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
		//公告的添加方法
		@RequestMapping("/add")
		public ModelAndView addgonggao(Gonggao gonggao){
			ModelAndView modelAndView=new ModelAndView();
			modelAndView.addObject("tt",gonggaoservice.add(gonggao));
			modelAndView.setViewName("/gonggao/chaxun.do");
			return modelAndView;
	
		}
		//公告的查询方法
		@RequestMapping("/chaxun")
		public ModelAndView selectgonggao(Gonggao gonggao){
			ModelAndView modelAndView=new ModelAndView();
			List<Gonggao> list= gonggaoservice.findAll(gonggao);
			 modelAndView.addObject("tp",list);
			 modelAndView.setViewName("/HtXitong.jsp");
			 return modelAndView;
		}
		//首页加载页面公告的查询方法
				@RequestMapping("/chakan")
				public ModelAndView findgonggao(Gonggao gonggao,HttpSession session){
					ModelAndView modelAndView=new ModelAndView();
					List<Gonggao> list= gonggaoservice.findAll(gonggao);
					 //modelAndView.addObject("tp",list);
					 session.setAttribute("tp",list);
					 
					//企业兼职品牌排行榜
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
					 
					 //企业兼职粉丝排行版
					 Map uzi=new HashMap();
					 Map ls=new HashMap();
					 Map cs=new HashMap();
					 Map cs2=new HashMap();
					 int[] b=new int[li.size()];
					 if(li.size()>=3)
					 {
						 for(int i=0;i<li.size();i++)//遍历出企业所有的id
						 {
							int ji= li.get(i).getId();//企业ID
							int th=guanzhuservice.postfindcount(ji);//根据企业id查询关注表里的所有记录数
							uzi.put(ji, th);//将记录数放入值栈 key为ji就是企业id
								b[i]=th;//将所有记录数存入数组
						 }
						 Arrays.parallelSort(b);//排序，给所有记录数排序，
						 for(int i=0;i<li.size();i++)//遍历企业所有id
						 {
							 int ji= li.get(i).getId();//企业ID
							int a= (int)uzi.get(ji);//获得相应值栈里的值
							
							//若值栈里的值等于数组里的值，则把id存入值栈
							if(a ==b[b.length-1])
							{
								if(cs.get(ji)==null&&cs.size()<1)
								{
									ls.put("第一", ji);
									cs.put(ji, ji);//将当前企业id存入值栈
								}
								
								else if(cs.size()==1) //不为空的时候说明有东西,大于一
								{
									ls.put("第二", ji);
									cs.put(ji, ji);
									
								}
								else if(cs.size()==2)
								{
									ls.put("第三", ji);
								}
								
							}
							
							else if(a ==b[b.length-2])
							{
								
								if(cs2.get(ji)==null&&cs2.size()<1)
								{
									ls.put("第二", ji);
									cs2.put(ji, ji);//将当前企业id存入值栈
								}
								else if(cs2.size()==1)
								{
									ls.put("第三", ji);
								}
							}
							else if(a ==b[b.length-3])
							{
								ls.put("第三",ji );
							}
						 }
						 
						 //根据id查询到相应的企业。。。。
						 Company com1=companyService.findbyid((int)ls.get("第一"));
						 Company com2=companyService.findbyid((int)ls.get("第二"));
						 Company com3=companyService.findbyid((int)ls.get("第三"));
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
					 
					 
					 //个人素质排行榜
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
					
					//个人能力排行榜
					Map uz=new HashMap();//存数的
					 Map ha=new HashMap();//第二个存数的，工具
					 Map xx=new HashMap();//工具
					 Map hz=new HashMap();//正经的
					 int[] lw=new int[uli.size()];
					 if(uli.size()>=3)
					 {
						 for(int i=0;i<uli.size();i++)//遍历用户的所有id
							{
								int uid=uli.get(i).getId();//获取用户的id
								int tu=signupService.countByuid(uid);//获取用户相应的兼职数量
								lw[i]=tu;//将数放入数组
								uz.put(uid, tu);//将数放入值栈
							}
							Arrays.parallelSort(lw);//对数组lw进行排序
							//开始对比
							for(int i=0;i<uli.size();i++)
							{
								int uid=uli.get(i).getId();//获取用户id
								int zz=(int) uz.get(uid);//根据id获取相应值
								if(zz==lw[lw.length-1])
								{
									if(ha.get(uid)==null&&ha.size()<1)
									{
										ha.put(uid, uid);
										hz.put("第一", uid);
									}
									else if(ha.size()==1)
									{
										ha.put(uid, uid);
										hz.put("第二", uid);
									}
									else if(ha.size()==2)
									{
										hz.put("第三", uid);
									}
								}
								else if(zz==lw[lw.length-2])
								{
									if(xx.get(uid)==null&&xx.size()<1)
									{
										xx.put(uid, uid);
										hz.put("第二", uid);
									}
									else if(xx.size()==1)
									{
										hz.put("第三", uid);
									}
								}
								else if(zz==lw[lw.length-3])
								{
									hz.put("第三", uid);
								}
							}
							
							//根据id查询相应的用户
							User uu1=userService.findById((int)hz.get("第一"));
							User uu2=userService.findById((int)hz.get("第二"));
							User uu3=userService.findById((int)hz.get("第三"));
							Map ue=new HashMap();
							ue.put("uu1", uu1);
							ue.put("uu2", uu2);
							ue.put("uu3", uu3);
							modelAndView.addObject("uus", ue); 
					 }
					
					
					
					 modelAndView.setViewName("/medium/chaxun.do");
					 return modelAndView;
				}
		//公告删除的方法
		@RequestMapping("/shanchu")
		public ModelAndView deletegongao(int id)
		{
			ModelAndView mv=new ModelAndView();
			gonggaoservice.deletegongao(id);
			mv.setViewName("/gonggao/chaxun.do");
			return mv;
		}
}

