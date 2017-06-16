package com.yndf.DaoImpl;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;









/**
 * 管理员DAO层实现类
 */
import com.yndf.Dao.AdminDao;
import com.yndf.Dao.BasicDao;
import com.yndf.pojo.Admin;
import com.yndf.pojo.Money;
@Repository("admindao")
public class AdminDaoImpl implements AdminDao {
	@Resource(name="basicdao")
	private BasicDao basicDao;
	/**
	 * 
	 
	@Override
	public Admin findNameAndPassword(String aname, String apassword) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Admin where aname=? and apassword=?");
		query.setParameter(0,aname);
		query.setParameter(1, apassword);
		if(query.list().size()>0)
		{
			Admin admin = (Admin)query.uniqueResult();
			session.close();
			return admin;
		}
		session.close();
		return null;
	}
	*/
	@Override
	public Admin login(Admin admin) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Admin where aname=? and apassword=?");
		query.setParameter(0, admin.getAname());
		query.setParameter(1, admin.getApassword());
		if(query.list().size()>0)
		{
			admin = (Admin)query.uniqueResult();
			session.close();
			return admin;
		}
		session.close();
		return null;
	}
	
	//给公司加钱
	public void addmoney(Money money)
	{
		Session session = basicDao.openSession();
		Transaction tr=session.beginTransaction();
		session.save(money);
		tr.commit();
		session.close();
	}
	
	//查询网站里的记录，若有
	public List<Money> selectm()
	{
		Session session = basicDao.openSession();
		Query query=session.createQuery("from Money");
		List<Money> li=query.list();
		session.close();
		return li;
	}
	
	//更新Money
	public void updatemoney(Money money)
	{
		Session session = basicDao.openSession();
		Transaction tr=session.beginTransaction();
		session.update(money);
		tr.commit();
		session.close();
	}
	
}
