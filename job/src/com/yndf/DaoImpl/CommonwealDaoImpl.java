package com.yndf.DaoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.yndf.Dao.BasicDao;
import com.yndf.Dao.CommonwealDao;
import com.yndf.pojo.Commonweal;
import com.yndf.pojo.User;
/**
 * 公益兼职dao层实现类
 */
@Repository("commonwealdao")
public class CommonwealDaoImpl implements CommonwealDao {
	@Resource(name="basicdao")
	private BasicDao basicDao;

	@Override
	public Commonweal saveCommonweal(Commonweal commonweal) {
		Session session = basicDao.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(commonweal);
		transaction.commit();
		session.close();
		return commonweal;
	}

	@Override
	public List<Commonweal> selectCommonweal() {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Commonweal");
		List<Commonweal> lis = query.list();
		session.close();
		return lis;
	}

	@Override
	public void deleteCommonweal(int id) {
		Session session = basicDao.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from Commonweal where id=?");
		query.setParameter(0, id);
		session.delete(query.list().get(0));
		transaction.commit();
		session.close();
	}

	@Override
	public Commonweal findbyid(int id) {
		Session session = basicDao.openSession();
		
		Query query = session.createQuery("from Commonweal where id=?");
		query.setParameter(0, id);
		Commonweal com=(Commonweal) query.uniqueResult();
		session.flush();
		session.close();
		return com;
	}
}
