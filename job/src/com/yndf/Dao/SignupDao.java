package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Inform;
import com.yndf.pojo.Signup;

public interface SignupDao
{

	//通过user-id查询出其报名过的记录，并返回报名的兼职id
	public List findByuser_id(int user_id);

	//添加报名记录
	public void addSign(Signup sign);

	//通过双id查询是否报过名
	public Signup findBytID(int uid, int wid);

	//查询报名人数
	public int countBywid(int wid);

	public List<Signup> findBywid(int wid);

	//根据用户id查询报名人数
	public int countByuid(int uid);
	//增加通知
		public void addform(Inform inform);

}
