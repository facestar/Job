package com.yndf.pojo;

import java.sql.Timestamp;
/**
 * ��ְʵ����
 */
public class Work {
	private int id;//����ְID����������
	private int wnumber;//����Ƹ������
	private int signumber;//��������
	private int company_id;//�����������ְ����ҵ������ҵID��hbm.xml����ʹ�ö��һӳ�䣺���
	private Timestamp wtime;//��������ְʱ�䣩
	private String wtitle;//������ְ�ı���
	private String gyname;//�����ְ����ҵ����
	private String wtype;//����ְ���ͣ�
	private String waddress;//����ְ�ص㣩
	private String wsalary;//����ְ���꣩
	private String endtime;//��������ֹʱ�䣩
	private String facetime;//������ʱ�䣩
	private String begindate;//����ְ��ʼ���ڣ�
	private String enddate;//����ְ�������ڣ�
	private String wsex;//���Ա�		Ϊ��ְ���Ա�Ҫ��
	private String wheight;//����ߣ����Ҫ��
	private String wstudy;//��ѧ����
	private String wother;//������Ҫ��
	private String wintroduce;//����ְ���ܣ�
	private String xianshi;//������״̬��������ҳ������ʾ�˼�ְ�Ƿ��ѱ���
	private String wstate;//(��ְ��״̬)������
	private int jifen;//���ͷ�
	
	
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
