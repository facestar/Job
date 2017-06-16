package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Company;

/**
 * ��ҵservice��ӿ�
 */
public interface CompanyService {

	
	public void saveCompany(Company company);//��ҵע��service��ӿ�

	public Company findName(String cname);//���ݵ�ǰ�û���ѯ��ҵ

	public Company login(Company company);//��ҵ��¼service��ӿ�

	public Company updateUser(Company company);//��ҵ�޸ĸ�������service�ӿ�

	public List<Company> findCompanyAll(Company company);
	
	public List<Company> findCompanyAll2();
	//��ѯ��ҵID
	public Company findbyid(int id);

	public void updateCompany(int id, int ss);

	public Company findBalance(int id);
	//��������
	public void updatecpzt(int id,String state );

	public List<Company> selectCompany(int company_id);


}
