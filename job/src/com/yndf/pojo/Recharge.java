package com.yndf.pojo;

import java.sql.Timestamp;

/**
 * 充值记录实体类
 */
public class Recharge {
	private int id;//主键
	private int cardnumber;//（充值卡号）
	private String rpassword;//（充值卡密码）
	private int money;//（金额）//或者为充值的或者为消费具体看方法
	private Timestamp rtime;//充值时间
	private int user_id ; //充值者的ID；一个记录对应一个用户，设置一对一映射
	private int company_id ;//充值者的ID；一个记录对应一个企业，设置一对一映射
	private int balance=0;//（余额）
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getRpassword() {
		return rpassword;
	}
	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public Timestamp getRtime() {
		return rtime;
	}
	public void setRtime(Timestamp rtime) {
		this.rtime = rtime;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
