package com.yndf.pojo;

import java.sql.Timestamp;

/**
 * ��ֵ��¼ʵ����
 */
public class Recharge {
	private int id;//����
	private int cardnumber;//����ֵ���ţ�
	private String rpassword;//����ֵ�����룩
	private int money;//����//����Ϊ��ֵ�Ļ���Ϊ���Ѿ��忴����
	private Timestamp rtime;//��ֵʱ��
	private int user_id ; //��ֵ�ߵ�ID��һ����¼��Ӧһ���û�������һ��һӳ��
	private int company_id ;//��ֵ�ߵ�ID��һ����¼��Ӧһ����ҵ������һ��һӳ��
	private int balance=0;//����
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
