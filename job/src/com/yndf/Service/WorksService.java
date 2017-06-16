package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Company;
import com.yndf.pojo.Information;
import com.yndf.pojo.Pagebean;
import com.yndf.pojo.Work;

public interface WorksService
{
	//��ְ���
	public void addwork(Work work);
	public List<Work> findallwork();

	public Pagebean<Work> findwtypeandwsex(int page,String wtype,String wsex);
	public Pagebean<Work> findwsex(int page,String wsex);
	public Pagebean<Work> findbegindate(int page,String begindate);
	public Pagebean<Work> findwtype(int page,String wtype);
	public Pagebean<Work> findwtypeandbegindate(int page,String wtype,String begindate);
	public Pagebean<Work> findwsexandbegindate(int page,String wsex,String begindate);
	public Pagebean<Work> findwtypeandwsexandbegindate(int page,String wtype,String wsex,String begindate);

	//��ְ�����ѯ
    public List<Work> findwtitle(String wtitle);

  //��ְid��ѯ
  	public Work findbyid(int id);


	//ͨ����ҵ��ID��ѯ�䷢�����ļ�ְ

	public List<Work> findBycom_id(int comId);
	
	
	
	//��ҵ��ְ��ɾ��
	public void deletework(int id);
	//��ҳ
	public Pagebean<Work> findallfy(int page);
	//��ҵ֪ͨ���
	public void addav(Information information);
	
	//��ְ�޸�
	public void updatework(Work work);
	
}
