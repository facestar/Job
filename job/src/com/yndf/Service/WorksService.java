package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Company;
import com.yndf.pojo.Information;
import com.yndf.pojo.Pagebean;
import com.yndf.pojo.Work;

public interface WorksService
{
	//兼职添加
	public void addwork(Work work);
	public List<Work> findallwork();

	public Pagebean<Work> findwtypeandwsex(int page,String wtype,String wsex);
	public Pagebean<Work> findwsex(int page,String wsex);
	public Pagebean<Work> findbegindate(int page,String begindate);
	public Pagebean<Work> findwtype(int page,String wtype);
	public Pagebean<Work> findwtypeandbegindate(int page,String wtype,String begindate);
	public Pagebean<Work> findwsexandbegindate(int page,String wsex,String begindate);
	public Pagebean<Work> findwtypeandwsexandbegindate(int page,String wtype,String wsex,String begindate);

	//兼职标题查询
    public List<Work> findwtitle(String wtitle);

  //兼职id查询
  	public Work findbyid(int id);


	//通过企业的ID查询其发布过的兼职

	public List<Work> findBycom_id(int comId);
	
	
	
	//企业兼职的删除
	public void deletework(int id);
	//分页
	public Pagebean<Work> findallfy(int page);
	//企业通知添加
	public void addav(Information information);
	
	//兼职修改
	public void updatework(Work work);
	
}
