package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Guanzhu;
import com.yndf.pojo.Pinlun;

public interface GuanzhuService
{
	//添加关注
	public void addguanzhu(Guanzhu guanzhu);
	
	//根据用户Id和企业ID查询报名
	public Guanzhu findBy2ID(int uid,int cid);

	//删除此关注
	public void delgz(Guanzhu guanzhu);
	
	//添加评论
	public void addpingl(Pinlun pl);
	
	//根据用户Id和兼职ID查询评论
	public Pinlun findBytID(int uid,int cid);
		
	public List<Guanzhu> findall();
	
	public int postfindcount(int  company_id);
	
	//根据workid查询到所有
	public List<Guanzhu> findBywid(int wid);
	
	//根据企业id查询到该企业所有的评论
	public List<Pinlun> findBysywID( int cid);

	public void deleteGuanzhu(int id);

	public List<Guanzhu> findByid(int user_id);
}
