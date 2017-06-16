package com.yndf.DaoImpl;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;









import com.yndf.Dao.BasicDao;
/**
 * 企业dao层实现类
 */
import com.yndf.Dao.CompanyDao;
import com.yndf.pojo.Company;
@Repository("companydao")
public class CompanyDaoImpl implements CompanyDao {
	@Resource(name="basicdao")
	private BasicDao basicDao;
	//企业注册的方法
	@Override
	public void saveCompany(Company company) {
		Session session = basicDao.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.save(company);
		transaction.commit();
		
	}
	//根据企业用户名查询当前企业
	@Override
	public Company findName(String cname) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Company where uname=?");
		query.setParameter(0,cname);
		if(query.list().size()>0)
		{
			Company company = (Company)query.uniqueResult();
			session.close();
			return company;
		}
		session.close();
		return null;
	}
	//企业登录的方法
	@Override
	public Company login(Company company) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Company where uname=? and cpassword=?");
		query.setParameter(0, company.getUname());
		query.setParameter(1, company.getCpassword());
		company = (Company)query.uniqueResult();
		session.close();
		return company;
	}
	//企业修改个人信息的方法
	@Override
	public Company updateCompany(Company company) {
		Session session = basicDao.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.update(company);
		transaction.commit();
		return company;
	}
	@Override
	public List<Company> findCompanyAll(Company company) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Company");
		List<Company> list = query.list();
		session.close();
		return list;
	}
	//根据ID查询企业
	@Override
	public Company findbyid(int id) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Company where id=?");
		query.setParameter(0, id);
		Company company=(Company) query.uniqueResult();
		return company;
	}
	@Override
	public List<Company> findCompanyAll2()
	{
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Company");
		List<Company> list = query.list();
		session.close();
		return list;
	}
	@Override
	public void updateCompany(int id, int ss) {
		Session session = basicDao.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("update Company set balance=? where id=?");
		query.setParameter(0, ss);
		query.setParameter(1, id);
		query.executeUpdate();
		transaction.commit();
		session.close();
	}
	@Override
	public Company findBalance(int id) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Company where id=?");
		query.setParameter(0, id);
		Company company =(Company) query.uniqueResult();
		session.close();
		return company;
	}
	@Override
	public void updatecpzt(int id,String state) {
		Session session = basicDao.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("update Company set state=? where id=?");
		query.setParameter(0, state);
		query.setParameter(1, id);
		query.executeUpdate();
		transaction.commit();
		session.close();
		
	}
	@Override
	public List<Company> selectCompany(int company_id) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Company where id=?");
		query.setParameter(0, company_id);
		List<Company> li = query.list();
		return li;
	}

}
