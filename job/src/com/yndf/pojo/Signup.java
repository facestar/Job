package com.yndf.pojo;
/**
 * 报名实体类
 */
public class Signup {
	private int id;// （主键）
	private int work_id;// 表示这个已报名的兼职所属 ；hbm.xml文件使用多对一映射；多个报名可以对应一个兼职；
	private int user_id;// （关联报名的用户ID）
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWork_id() {
		return work_id;
	}
	public void setWork_id(int work_id) {
		this.work_id = work_id;
	}
	public int getUser_id()
	{
		return user_id;
	}
	public void setUser_id(int user_id)
	{
		this.user_id = user_id;
	}
	
	
	
}
