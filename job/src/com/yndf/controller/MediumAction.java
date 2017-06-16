package com.yndf.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yndf.Service.MediumService;
import com.yndf.pojo.Medium;
import com.yndf.pojo.User;

@Controller
@RequestMapping("/medium")
public class MediumAction  {
	//ע��service��
	@Resource(name="mediumservice")
	private MediumService mediumservice;
	//��Ӻ���ý��
	@RequestMapping("/meiti")
	public ModelAndView addmedium(Medium medium){
		ModelAndView modelAndView=new ModelAndView();
		if(mediumservice.findname(medium.getMname())!=null)
		{
			modelAndView.addObject("tt", "�����Ѿ���ӹ��ĺ���ý�壬�Ѳ������");
			modelAndView.setViewName("/HtHezuo.jsp");
			return modelAndView;
			 }
		   else{
		
		modelAndView.addObject("tt", mediumservice.add(medium));
		modelAndView.setViewName("/medium/chaxunmeiti.do");
		return modelAndView;
		}
	}
//����ý��Ĳ���
	@RequestMapping("/chaxunmeiti")
	public ModelAndView findAllmedium(){
		 ModelAndView modelAndView=new ModelAndView();
		List<Medium> list= mediumservice.findAll();
		 modelAndView.addObject("tt",list);
		 modelAndView.setViewName("/HtHezuo.jsp");
		 return modelAndView;
	 }
	//����ý��Ĳ���
		@RequestMapping("/chaxun")
		public ModelAndView selectMedium(HttpSession session){
			 ModelAndView modelAndView=new ModelAndView();
			List<Medium> list= mediumservice.findAll();
			 //modelAndView.addObject("tt",list);
			 session.setAttribute("tt",list);
			 modelAndView.setViewName("/shouye.jsp");
			 return modelAndView;
		 }
   //����ý���ɾ��
	@RequestMapping("/shanchuM")
	public ModelAndView delmedium(int id){
		ModelAndView modelAndView=new ModelAndView();
		 mediumservice.delmedium(id);
		 modelAndView.addObject("tt", mediumservice.findById(id));
		 modelAndView.setViewName("/medium/chaxunmeiti.do");
		 return modelAndView;
		
		
	
		
	}
}
