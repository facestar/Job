package com.yndf.pojo;
/**
 * ����ʵ����
 */
public class Signup {
	private int id;// ��������
	private int work_id;// ��ʾ����ѱ����ļ�ְ���� ��hbm.xml�ļ�ʹ�ö��һӳ�䣻����������Զ�Ӧһ����ְ��
	private int user_id;// �������������û�ID��
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
