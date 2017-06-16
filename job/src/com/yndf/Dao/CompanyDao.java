package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Company;

/**
 * 企业dao层接口
 */
public interface CompanyDao {

	void saveCompany(Company company);//企业注册dao层接口

	Company findName(String cname);//查询当前企业dao层接口

	Company login(Company company);//企业登录dao层接口

	Company updateCompany(Company company);//企业修改个人中心dao层接口

	List<Company> findCompanyAll(Company company);
	
	public Company findbyid(int id);

	List<Company> findCompanyAll2();

	void updateCompany(int id, int ss);

	Company findBalance(int id);
	//审核与禁用
	public void updatecpzt(int id,String state);

	List<Company> selectCompany(int company_id);

}
