package com.yndf.pojo;

import java.sql.Timestamp;

/**
 * ����ʵ����
 */
public class Pinlun {
	private int id;//����
	private int user_id;//˭���۵�ID��һ�����۶�Ӧһ���û�������һ��һӳ��
	private String content;//���������ݣ�
	private Timestamp ctime;//������ʱ�䣩
	private int company_id;//Ʒ�۵���ҵ����
	private String tupian;
	
	public String getTupian()
	{
		return tupian;
	}
	public void setTupian(String tupian)
	{
		this.tupian = tupian;
	}
	public Timestamp getCtime()
	{
		return ctime;
	}
	public void setCtime(Timestamp ctime)
	{
		this.ctime = ctime;
	}
	
	public int getCompany_id()
	{
		return company_id;
	}
	public void setCompany_id(int company_id)
	{
		this.company_id = company_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

	
}
