package com.yndf.pojo;


/**
 * ��ҵ�û�ʵ����
 */
public class Company {
	private int id;//����ҵID������
	private String uname;//����ҵ���ƣ�
	private String cpassword;//����ҵ���룩
	private String cpostbox;//����ҵ���䣩
	private String address;//����ҵ��ַ��
	private String linkmen ;//����ϵ�ˣ�
	private String cphone;//����ϵ�绰��
	private String cqq;//����ϵqq��
	private String ctype;//����ҵ���ͣ�
	private String introduce;//����ҵ��飩
	private String web_url;//����ҵ��ַ��
	private String picture;//����ҵͼ�꣩
	private String state="0";//��״̬��//��ע���ѹ�ע
	private String zhizhao;//��ҵִ��
	private int jifen;//��ҵ����������
	private int balance=0;//����
	
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
