package com.yndf.DaoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.yndf.Dao.BasicDao;
import com.yndf.Dao.GonggaoDao;
import com.yndf.pojo.Gonggao;


@Repository("gonggaodao")
public class GonggaoDaoImpl implements GonggaoDao {
	@Resource(name="basicdao")
	private BasicDao basicDao;
	//公告的添加方法
	public Gonggao add(Gonggao gonggao) {
		Session session = basicDao.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.save(gonggao);
		transaction.commit();
		return gonggao;
		
		
	}
//公告的查询方法
	@Override
	public List<Gonggao> findAll(Gonggao gonggao) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Gonggao");
		List<Gonggao> list = query.list();
		return list;
		
		
		
	}
	@Override
	public void deletegongao(int id) {
		Session session = basicDao.openSession();
		Transaction transaction = session.beginTransaction();
		Gonggao gonggao = session.get(Gonggao.class, id);
		session.delete(gonggao);
		transaction.commit();
		session.close();
	}


	
	}

	
		
	


