package com.yndf.pojo;
/**
 * ��Ϣʵ����
 */
public class News {
	private int id;//����
	private String sender;//˭����������Ϣ��
	private String receiver;//˭����������Ϣ��
	private String ncontent;//�����ݣ�
	private String ntime;//����ʱ��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	public String getNtime() {
		return ntime;
	}
	public void setNtime(String ntime) {
		this.ntime = ntime;
	}
	
	
}
