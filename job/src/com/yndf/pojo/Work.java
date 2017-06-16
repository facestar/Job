package com.yndf.pojo;

import java.sql.Timestamp;
/**
 * 兼职实体类
 */
public class Work {
	private int id;//（兼职ID）（主键）
	private int wnumber;//（招聘人数）
	private int signumber;//报名人数
	private int company_id;//代表发布这个兼职的企业，（企业ID）hbm.xml这里使用多对一映射：外键
	private Timestamp wtime;//（发布兼职时间）
	private String wtitle;//发布兼职的标题
	private String gyname;//公益兼职的企业名称
	private String wtype;//（兼职类型）
	private String waddress;//（兼职地点）
	private String wsalary;//（兼职报酬）
	private String endtime;//（报名截止时间）
	private String facetime;//（面试时间）
	private String begindate;//（兼职开始日期）
	private String enddate;//（兼职结束日期）
	private String wsex;//（性别）		为兼职的性别要求
	private String wheight;//（身高）身高要求
	private String wstudy;//（学历）
	private String wother;//（其他要求）
	private String wintroduce;//（兼职介绍）
	private String xianshi;//（报名状态）用于在页面上显示此兼职是否已报名
	private String wstate;//(兼职的状态)完成与否
	private int jifen;//悬赏分
	
	
	public int getJifen()
	{
		return jifen;
	}

	public void setJifen(int jifen)
	{
		this.jifen = jifen;
	}

	public int getSignumber()
	{
		return signumber;
	}

	public void setSignumber(int signumber)
	{
		this.signumber = signumber;
	}

	public String getWtitle()
	{
		return wtitle;
	}
	public void setWtitle(String wtitle)
	{
		this.wtitle = wtitle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWnumber() {
		return wnumber;
	}
	public void setWnumber(int wnumber) {
		this.wnumber = wnumber;
	}
	
	public String getGyname() {
		return gyname;
	}
	public void setGyname(String gyname) {
		this.gyname = gyname;
	}
	public int getCompany_id()
	{
		return company_id;
	}
	public void setCompany_id(int company_id)
	{
		this.company_id = company_id;
	}
	
	public Timestamp getWtime()
	{
		return wtime;
	}
	public void setWtime(Timestamp wtime)
	{
		this.wtime = wtime;
	}
	public String getWtype() {
		return wtype;
	}
	public void setWtype(String wtype) {
		this.wtype = wtype;
	}
	public String getWaddress() {
		return waddress;
	}
	public void setWaddress(String waddress) {
		this.waddress = waddress;
	}
	public String getWsalary() {
		return wsalary;
	}
	public void setWsalary(String wsalary) {
		this.wsalary = wsalary;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getFacetime() {
		return facetime;
	}
	public void setFacetime(String facetime) {
		this.facetime = facetime;
	}
	public String getBegindate() {
		return begindate;
	}
	public void setBegindate(String begindate) {
		this.begindate = begindate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getWsex() {
		return wsex;
	}
	public void setWsex(String wsex) {
		this.wsex = wsex;
	}
	public String getWheight() {
		return wheight;
	}
	public void setWheight(String wheight) {
		this.wheight = wheight;
	}
	public String getWstudy() {
		return wstudy;
	}
	public void setWstudy(String wstudy) {
		this.wstudy = wstudy;
	}
	public String getWother() {
		return wother;
	}
	public void setWother(String wother) {
		this.wother = wother;
	}
	public String getWintroduce() {
		return wintroduce;
	}
	public void setWintroduce(String wintroduce) {
		this.wintroduce = wintroduce;
	}
	public String getXianshi() {
		return xianshi;
	}
	public void setXianshi(String xianshi) {
		this.xianshi = xianshi;
	}
	public String getWstate() {
		return wstate;
	}
	public void setWstate(String wstate) {
		this.wstate = wstate;
	}

	
}
