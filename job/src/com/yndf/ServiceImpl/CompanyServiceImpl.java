package com.yndf.ServiceImpl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;






import com.yndf.Dao.CompanyDao;
/**
 * ��ҵservice��ʵ����
 */
import com.yndf.Service.CompanyService;
import com.yndf.pojo.Company;
@Service("companyservice")
public class CompanyServiceImpl implements CompanyService {
	@Resource(name="companydao")
	private CompanyDao companyDao;

	@Override
	//��ѯ��ǰ��ҵ��service��ʵ����
	public Company findName(String cname) {
		
		return companyDao.findName(cname);
	}

	@Override
	//��ҵע��service��ʵ����
	public void saveCompany(Company company) {
		companyDao.saveCompany(company);
		
	}

	@Override
	//��ҵ��¼��service��ʵ����
	public Company login(Company company) {
		
		return companyDao.login(company);
	}

	@Override
	//��ҵ�޸ĸ������ĵ�service��ʵ����
	public Company updateUser(Company company) {
		
		return companyDao.updateCompany(company);
	}

	@Override
	public List<Company> findCompanyAll(Company company) {
		
		return companyDao.findCompanyAll(company);
	}
    //����id��ѯ��ҵ��Ϣ
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
