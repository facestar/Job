package com.yndf.pojo;
/**
 * 关注的实体类
 */
public class Guanzhu {
	private int id;//主键
	private int user_id;//（用户ID）
	private int company_id;//被关注的企业的ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	
	
}
