package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Company;
import com.yndf.pojo.Information;
import com.yndf.pojo.Work;

public interface WorksDao
{

	//添加兼职
	public void addwork(Work work);
	//无条件查询
	public List<Work> findallwork();
	
	//兼职标题查询
	public List<Work> findwtitle(String wtitle);
	//兼职id查询
	public Work findbyid(int id);
	public List<Work> findBycom_id(int comId);
	public void deletework(int id);
	//兼职分页
	public List<Work> findallfy(int begin, int pagesize);
	 public int workfindcount();//查询多少条
	//兼职性别查询
	 public List<Work> findwsex(int begin, int pagesize,String wsex);
	 public int wsexfindcount(String wsex);
	//兼职类型和性别查询
	 public List<Work> findwtypeandwsex(int begin, int pagesize,String wtype,String wsex);
	 public int wtypeandwsexfindcount(String wtype,String wsex);
	//兼职时间查询
	 public List<Work> findbegindate(int begin, int pagesize,String begindate);
	 public int begindatefindcount(String begindate);
	//兼职类型查询
	 public List<Work> findwtype(int begin, int pagesize,String wtype);	
	 public int wtypefindcount(String wtype);
	//兼职类型和时间查询
		public List<Work> findwtypeandbegindate(int begin, int pagesize,String wtype,String begindate);
		public int wtypeandbegindatefindcount(String wtype,String begindate);
	//兼职时间和性别查询
	 public List<Work> findwsexandbegindate(int begin, int pagesize,String wsex,String begindate);
	 public int wsexandbegindatefindcount(String wsex,String begindate);
	//兼职类型,性别和时间查询
	public List<Work> findwtypeandwsexandbegindate(int begin, int pagesize,	String wtype,String wsex,String begindate);
	public int wtypeandwsexandbegindatefindcount(String wtype,String wsex,String begindate);

	//企业通知增加
	public void addav(Information information);
	

	
	//修改兼职
	public void updatework(Work work);

}
