package com.yndf.pojo;

import java.sql.Timestamp;
/**
 * 回复贴的实体类
 */
public class Reply {
	private int id;//主键
	private int post_id;//回复对应帖子的ID，hbm.xml这里使用一对一映射：外键
	private String tupian;//头像
	private String rcontent;//回复的内容
	private Timestamp rtime;//回复的时间
	private String rname;//回帖者
	
	public String getTupian()
	{
		return tupian;
	}
	public void setTupian(String tupian)
	{
		this.tupian = tupian;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	
	
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public Timestamp getRtime() {
		return rtime;
	}
	public void setRtime(Timestamp rtime) {
		this.rtime = rtime;
	}
	
	
}
