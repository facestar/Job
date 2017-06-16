package com.yndf.pojo;

import java.sql.Timestamp;

/**
 * 学生用户发帖实体类
 */
public class Post {
	private int id;//（发帖ID）（主键）
	private String ptitle;//（标题）
	private String pcontent;//（内容）
	private Timestamp ptime;//（发表时间）

	private String pname;//发帖者
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}
	public Timestamp getPtime() {
		return ptime;
	}
	public void setPtime(Timestamp ptime) {
		this.ptime = ptime;
	}
	
}
