package com.yndf.DaoImpl;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.yndf.Dao.BasicDao;
import com.yndf.Dao.MediumDao;
import com.yndf.pojo.Medium;



@Repository("mediumdao")
public class MediumDaoImpl implements MediumDao {
	@Resource(name="basicdao")
	private BasicDao basicDao;
//����ý�����ӷ���
	public Medium add(Medium medium) {
		Session session = basicDao.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.save(medium);
		transaction.commit();
		return medium;
	}

	@Override
	//����ý�����ӣ�������ھͲ������
	public Medium findmname(String mname) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Medium where mname=?");
		query.setParameter(0, mname);
		if(query.list().size()>0)
		{
			
			Medium medium = (Medium)query.uniqueResult();
			session.close();
			return medium;
		}
		session.close();
		return null;
	}
	//����ý��Ĳ��ҷ���
	@Override
	public List<Medium> findAll() {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Medium");
		List<Medium> list = query.list();
		return list;
		
		
		
	}
//ɾ��ý��ķ���

	@Override
	public boolean del(int id) {
		Session session = basicDao.openSession();
		Transaction transaction = session.beginTransaction();
		Medium medium=(Medium) session.get(Medium.class, id);
		session.delete(medium);
		transaction.commit();
		session.close();
		return false;
	}

	@Override
	public Object findById(int id) {
		Session session=basicDao.openSession();
		Query query=session.createQuery("from Medium where id=?");
		query.setParameter(0, id);
		List<Medium> li=  query.list();
		session.close();
		return li;
		
		
	
	}

		
	
		
		
	}

	


