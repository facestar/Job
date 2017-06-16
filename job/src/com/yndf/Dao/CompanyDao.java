package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Company;

/**
 * ��ҵdao��ӿ�
 */
public interface CompanyDao {

	void saveCompany(Company company);//��ҵע��dao��ӿ�

	Company findName(String cname);//��ѯ��ǰ��ҵdao��ӿ�

	Company login(Company company);//��ҵ��¼dao��ӿ�

	Company updateCompany(Company company);//��ҵ�޸ĸ�������dao��ӿ�

	List<Company> findCompanyAll(Company company);
	
	public Company findbyid(int id);

	List<Company> findCompanyAll2();

	void updateCompany(int id, int ss);

	Company findBalance(int id);
	//��������
	public void updatecpzt(int id,String state);

	List<Company> selectCompany(int company_id);

}
