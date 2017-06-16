package com.yndf.pojo;

import java.sql.Timestamp;

/*
 * 网站经费
 * */

public class Money
{
	private int id;
	private Timestamp htime;//获得钱的时间
	private int user_id;//交钱的学生用户
	private int company_id;//企业
	private int jmoney;//交了的钱的数量
	private int balance;//余额，网站所有钱
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public Timestamp getHtime()
	{
		return htime;
	}
	public void setHtime(Timestamp htime)
	{
		this.htime = htime;
	}
	public int getUser_id()
	{
		return user_id;
	}
	public void setUser_id(int user_id)
	{
		this.user_id = user_id;
	}
	public int getCompany_id()
	{
		return company_id;
	}
	public void setCompany_id(int company_id)
	{
		this.company_id = company_id;
	}
	public int getJmoney()
	{
		return jmoney;
	}
	public void setJmoney(int jmoney)
	{
		this.jmoney = jmoney;
	}
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
}
