package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Guanzhu;
import com.yndf.pojo.Inform;
import com.yndf.pojo.Signup;

/*
 * ������Sevice
 */
public interface SignupService
{
	//ͨ��user-id��ѯ���䱨�����ļ�¼�������ر����ļ�ְid
	public List findByuser_id(int user_id);

	//��ӱ�����¼
	public void addSign(Signup sign);
	
	//ͨ��˫id��ѯ�Ƿ񱨹���
	public Signup fingBytID(int uid,int wid);
	
	//��ѯ��������
	public int countBywid(int wid);
	
	//����workid��ѯ������
	public List<Signup> findBywid(int wid);
	
	//�����û�id��ѯ��������
	public int countByuid(int uid);
	
	//����֪ͨ
		public void addinform(Inform inform);
}
