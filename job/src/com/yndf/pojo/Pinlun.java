package com.yndf.pojo;

import java.sql.Timestamp;

/**
 * 评论实体类
 */
public class Pinlun {
	private int id;//主键
	private int user_id;//谁评论的ID；一个评论对应一个用户，设置一对一映射
	private String content;//（评论内容）
	private Timestamp ctime;//（评论时间）
	private int company_id;//品论的企业对象
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
