package com.yndf.pojo;
/**
 * 充值卡表
 */
public class RechargeCard {
	private int id;//主键
	private int cardnumber;//（充值卡号）
	private String rpassword;//（充值卡密码）
	private int money;//（金额）//或者为充值的或者为消费具体看方法
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
	
	
}
