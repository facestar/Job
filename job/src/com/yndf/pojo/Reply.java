package com.yndf.pojo;

import java.sql.Timestamp;
/**
 * �ظ�����ʵ����
 */
public class Reply {
	private int id;//����
	private int post_id;//�ظ���Ӧ���ӵ�ID��hbm.xml����ʹ��һ��һӳ�䣺���
	private String tupian;//ͷ��
	private String rcontent;//�ظ�������
	private Timestamp rtime;//�ظ���ʱ��
	private String rname;//������
	
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
