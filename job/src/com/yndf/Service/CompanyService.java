package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Company;

/**
 * 企业service层接口
 */
public interface CompanyService {

	
	public void saveCompany(Company company);//企业注册service层接口

	public Company findName(String cname);//根据当前用户查询企业

	public Company login(Company company);//企业登录service层接口

	public Company updateUser(Company company);//企业修改个人中心service接口

	public List<Company> findCompanyAll(Company company);
	
	public List<Company> findCompanyAll2();
	//查询企业ID
	public Company findbyid(int id);

	public void updateCompany(int id, int ss);

	public Company findBalance(int id);
	//审核与禁用
	public void updatecpzt(int id,String state );

	public List<Company> selectCompany(int company_id);


}
