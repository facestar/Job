package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Guanzhu;
import com.yndf.pojo.Pinlun;

public interface GuanzhuDao
{
	//��ӹ�ע
		public void addguanzhu(Guanzhu guanzhu);

		//�����û�Id����ҵID��ѯ����
		public Guanzhu findBy2ID(int uid, int cid);

		//ɾ���˹�ע
		public void delgz(Guanzhu guanzhu);

		public void addpingl(Pinlun pl);
		
		//�����û�id����ҵid��ѯ���۵�
		public Pinlun findBytid(int uid ,int cid);

		public List<Guanzhu> findall();
		
		public int postfindcount(int  company_id);

		//����workid��ѯ������
		public List<Guanzhu> findBywid(int wid);

		//������ҵid��ѯ������ҵ���е�����
		public List<Pinlun> findBysywID(int cid);

		public void deleteGuanzhu(int id);

		public List<Guanzhu> findByid(int user_id);
}
