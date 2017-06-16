package com.yndf.pojo;


/**
 * 企业用户实体类
 */
public class Company {
	private int id;//（企业ID）主键
	private String uname;//（企业名称）
	private String cpassword;//（企业密码）
	private String cpostbox;//（企业邮箱）
	private String address;//（企业地址）
	private String linkmen ;//（联系人）
	private String cphone;//（联系电话）
	private String cqq;//（联系qq）
	private String ctype;//（企业类型）
	private String introduce;//（企业简介）
	private String web_url;//（企业网址）
	private String picture;//（企业图标）
	private String state="0";//（状态）//关注与已关注
	private String zhizhao;//企业执照
	private int jifen;//企业的信誉集合
	private int balance=0;//（余额）
	
	public String getZhizhao() {
		return zhizhao;
	}
	public void setZhizhao(String zhizhao) {
		this.zhizhao = zhizhao;
	}

	
	
	public int getJifen()
	{
		return jifen;
	}
	public void setJifen(int jifen)
	{
		this.jifen = jifen;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getUname()
	{
		return uname;
	}
	public void setUname(String uname)
	{
		this.uname = uname;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getCpostbox() {
		return cpostbox;
	}
	public void setCpostbox(String cpostbox) {
		this.cpostbox = cpostbox;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLinkmen() {
		return linkmen;
	}
	public void setLinkmen(String linkmen) {
		this.linkmen = linkmen;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getCqq() {
		return cqq;
	}
	public void setCqq(String cqq) {
		this.cqq = cqq;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getWeb_url() {
		return web_url;
	}
	public void setWeb_url(String web_url) {
		this.web_url = web_url;
	}
	
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
