package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Inform;
import com.yndf.pojo.Signup;

public interface SignupDao
{

	//ͨ��user-id��ѯ���䱨�����ļ�¼�������ر����ļ�ְid
	public List findByuser_id(int user_id);

	//��ӱ�����¼
	public void addSign(Signup sign);

	//ͨ��˫id��ѯ�Ƿ񱨹���
	public Signup findBytID(int uid, int wid);

	//��ѯ��������
	public int countBywid(int wid);

	public List<Signup> findBywid(int wid);

	//�����û�id��ѯ��������
	public int countByuid(int uid);
	//����֪ͨ
		public void addform(Inform inform);

}
