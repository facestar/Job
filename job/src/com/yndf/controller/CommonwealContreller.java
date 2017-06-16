package com.yndf.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yndf.Service.CommonwealService;
import com.yndf.Service.CompanyService;
import com.yndf.pojo.Commonweal;
import com.yndf.pojo.Company;
import com.yndf.pojo.Work;

/**
 * 公益兼职controller层
 */
@Controller
@RequestMapping("/commonweal")
public class CommonwealContreller {
	@Resource(name="companyservice")
	private CompanyService companyService;
	@Resource(name="commonwealservice")
	private CommonwealService commonwealService;
	//后台管理员增加公益兼职
		@RequestMapping("/save")
		public ModelAndView saveCommonweal(Commonweal commonweal)
		{
			ModelAndView mv = new ModelAndView();
			Commonweal existCommonweal = commonwealService.saveCommonweal(commonweal);
			mv.addObject("add",existCommonweal);
			mv.setViewName("/commonweal/gongyi.do");
			return mv;
		}
		//后台管理员查询公益兼职
		@RequestMapping("/gongyi")
		public ModelAndView selectCommonweal()
		{
			List<Commonweal> li = commonwealService.selectCommonweal();
				ModelAndView mv = new ModelAndView();
				mv.addObject("ss",li);
				mv.setViewName("/HtJianzhi.jsp");
				return mv;
		}
		//后台管理员删除公益兼职
		@RequestMapping("/shanchu")
		public ModelAndView deleteCommonweal(int id)
		{
			commonwealService.deleteCommonweal(id);
			ModelAndView mv = new ModelAndView();
			mv.setViewName("/commonweal/gongyi.do");
			return mv;
		}
		//页面查询公益兼职
		@RequestMapping("/findgy")
		public ModelAndView findCommonweal()
		{
			List<Commonweal> lv = commonwealService.selectCommonweal();
			System.out.println(lv);
				ModelAndView mv = new ModelAndView();
				mv.addObject("sg",lv);
				mv.setViewName("/zhengnengliang.jsp");
				return mv;
		}
		
		//页面查询公益兼职
		@RequestMapping("/findggy")
		public ModelAndView findggyCommonweal()
		{
			List<Commonweal> lv = commonwealService.selectCommonweal();
				ModelAndView mv = new ModelAndView();
				mv.addObject("sg",lv);
				mv.setViewName("/Zhaojianzhi.jsp");
				return mv;
		}
				
		
		/**
		 * 点击标题根据id和公司姓名查询
		 * 公益详情页面
		 * @throws UnsupportedEncodingException 
		 */
		@RequestMapping("/findgybyid")
		public ModelAndView findbyidxiangqing(int id,String gyname) throws UnsupportedEncodingException
		{
			ModelAndView mv = new ModelAndView();
			String gname=new String(gyname.getBytes("ISO-8859-1"),"utf-8");
			Commonweal com= commonwealService.findbyid(id);
			Company cp=companyService.findName(gname);
			mv.addObject("cpy", cp);
			mv.addObject("cmw",com);
			mv.setViewName("/znlz.jsp");
			return mv;
		}	

}
