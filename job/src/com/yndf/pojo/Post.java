package com.yndf.pojo;

import java.sql.Timestamp;

/**
 * ѧ���û�����ʵ����
 */
public class Post {
	private int id;//������ID����������
	private String ptitle;//�����⣩
	private String pcontent;//�����ݣ�
	private Timestamp ptime;//������ʱ�䣩

	private String pname;//������
	
	
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
