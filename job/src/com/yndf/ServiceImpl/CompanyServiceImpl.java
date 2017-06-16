package com.yndf.ServiceImpl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;






import com.yndf.Dao.CompanyDao;
/**
 * 企业service层实现类
 */
import com.yndf.Service.CompanyService;
import com.yndf.pojo.Company;
@Service("companyservice")
public class CompanyServiceImpl implements CompanyService {
	@Resource(name="companydao")
	private CompanyDao companyDao;

	@Override
	//查询当前企业的service层实现类
	public Company findName(String cname) {
		
		return companyDao.findName(cname);
	}

	@Override
	//企业注册service层实现类
	public void saveCompany(Company company) {
		companyDao.saveCompany(company);
		
	}

	@Override
	//企业登录的service层实现类
	public Company login(Company company) {
		
		return companyDao.login(company);
	}

	@Override
	//企业修改个人中心的service层实现类
	public Company updateUser(Company company) {
		
		return companyDao.updateCompany(company);
	}

	@Override
	public List<Company> findCompanyAll(Company company) {
		
		return companyDao.findCompanyAll(company);
	}
    //根据id查询企业信息
	@Override
	public Company findbyid(int id) {
		
		return companyDao.findbyid(id);
	}

	@Override
	public List<Company> findCompanyAll2()
	{
		// TODO Auto-generated method stub
		return companyDao.findCompanyAll2();
	}

	@Override
	public void updateCompany(int id, int ss) {
		companyDao.updateCompany(id,ss);
	}

	@Override
	public Company findBalance(int id) {
		return companyDao.findBalance(id);
	}

	@Override
	public void updatecpzt(int id, String state) {
		
		companyDao.updatecpzt(id, state);
	}

	@Override
	public List<Company> selectCompany(int company_id) {
		return companyDao.selectCompany(company_id);
	}

	
}
