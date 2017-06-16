package com.yndf.pojo;

/**
 * 大学生用户实体类
 */
public class User {
	private int id;//主键id
	private int age;//年龄
	private String uname;//用户名
	private String upassword;//密码
	private String name;//学生的真实姓名
	private String IDCard;//身份证号码
	private String upostbox;//邮箱
	private String school;//所属学校
	private String area;//工作地区
	private String sex;//性别
	private String study;//学历
	private String uphone ;//电话号码
	private String uqq;//QQ号码
	private String picture;//用户头像
	private int jifen;//积分，素质评定
	private int balance=0;//（余额）
	private int zt=0;//状态
	public int getZt() {
		return zt;
	}
	public void setZt(int zt) {
		this.zt = zt;
	}
	
	public int getJifen()
	{
		return jifen;
	}
	public void setJifen(int jifen)
	{
		this.jifen = jifen;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIDCard() {
		return IDCard;
	}
	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}
	public String getUpostbox() {
		return upostbox;
	}
	public void setUpostbox(String upostbox) {
		this.upostbox = upostbox;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getUqq() {
		return uqq;
	}
	public void setUqq(String uqq) {
		this.uqq = uqq;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	
}
