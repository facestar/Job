package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Company;
import com.yndf.pojo.Information;
import com.yndf.pojo.Work;

public interface WorksDao
{

	//��Ӽ�ְ
	public void addwork(Work work);
	//��������ѯ
	public List<Work> findallwork();
	
	//��ְ�����ѯ
	public List<Work> findwtitle(String wtitle);
	//��ְid��ѯ
	public Work findbyid(int id);
	public List<Work> findBycom_id(int comId);
	public void deletework(int id);
	//��ְ��ҳ
	public List<Work> findallfy(int begin, int pagesize);
	 public int workfindcount();//��ѯ������
	//��ְ�Ա��ѯ
	 public List<Work> findwsex(int begin, int pagesize,String wsex);
	 public int wsexfindcount(String wsex);
	//��ְ���ͺ��Ա��ѯ
	 public List<Work> findwtypeandwsex(int begin, int pagesize,String wtype,String wsex);
	 public int wtypeandwsexfindcount(String wtype,String wsex);
	//��ְʱ���ѯ
	 public List<Work> findbegindate(int begin, int pagesize,String begindate);
	 public int begindatefindcount(String begindate);
	//��ְ���Ͳ�ѯ
	 public List<Work> findwtype(int begin, int pagesize,String wtype);	
	 public int wtypefindcount(String wtype);
	//��ְ���ͺ�ʱ���ѯ
		public List<Work> findwtypeandbegindate(int begin, int pagesize,String wtype,String begindate);
		public int wtypeandbegindatefindcount(String wtype,String begindate);
	//��ְʱ����Ա��ѯ
	 public List<Work> findwsexandbegindate(int begin, int pagesize,String wsex,String begindate);
	 public int wsexandbegindatefindcount(String wsex,String begindate);
	//��ְ����,�Ա��ʱ���ѯ
	public List<Work> findwtypeandwsexandbegindate(int begin, int pagesize,	String wtype,String wsex,String begindate);
	public int wtypeandwsexandbegindatefindcount(String wtype,String wsex,String begindate);

	//��ҵ֪ͨ����
	public void addav(Information information);
	

	
	//�޸ļ�ְ
	public void updatework(Work work);

}
