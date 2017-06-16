package com.yndf.controller;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yndf.Service.PostService;
import com.yndf.Service.ReplyService;
import com.yndf.Service.UserService;
import com.yndf.pojo.Reply;



@Controller

@RequestMapping("/reply")
public class replycontroller {
@Resource(name="replyservice")
private ReplyService replyservice;
@Resource(name="postservice")
private PostService postservice;
@Resource(name="userservice")
private UserService userService;
@RequestMapping("/huitie")//增加回复
	public ModelAndView addreply(Reply reply,int id,String rname) throws UnsupportedEncodingException
	{
	String nn=new String(rname.getBytes("iso-8859-1"),"utf-8");
	if(userService.findName(nn)!=null)
	{
	reply.setRtime(new Timestamp(new Date().getTime()));
	reply.setPost_id(id);
	reply.setRname(nn);
	replyservice.replyadd(reply);
	ModelAndView ht=new ModelAndView();
	ht.setViewName("/findpost.do");
	return ht;}
	else {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("kk", "请登录后再回帖");
		mav.setViewName("/findpost.do");
		return mav;
	}
	
	
	}
@RequestMapping("/findreply")//查看回复
public ModelAndView replyfind(Reply reply,int id)
    {
	ModelAndView ct1=new ModelAndView();
	ct1.addObject("nm", replyservice.findreply(id)) ;
	ct1.setViewName("/jzlt.jsp");
	return ct1;
	}

}
