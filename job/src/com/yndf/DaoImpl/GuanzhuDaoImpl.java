package com.yndf.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.yndf.Dao.BasicDao;
import com.yndf.Dao.GuanzhuDao;
import com.yndf.pojo.Guanzhu;
import com.yndf.pojo.Pinlun;
@Repository("guanzhudao")
public class GuanzhuDaoImpl implements GuanzhuDao
{

	@Resource(name="basicdao")
	private BasicDao bs;
	//添加兼职
	public void addguanzhu(Guanzhu guanzhu)
	{
		Session session=bs.openSession();
		Transaction tr=session.beginTransaction();
		session.save(guanzhu);
		tr.commit();
		session.close();

	}

	//根据用户Id和企业ID查询报名
	public Guanzhu findBy2ID(int uid, int cid)
	{
		Session session=bs.openSession();
		Query query=session.createQuery("from Guanzhu where user_id=? and company_id=?");
		query.setParameter(0, uid);
		query.setParameter(1, cid);
		if(query.list().size()>0)
		{
			Guanzhu gg=(Guanzhu) query.list().get(0);
			session.close();
			return gg;
		}
		session.close();	
		return null;
	}

	//删除关注
	public void delgz(Guanzhu guanzhu)
	{
		Session session=bs.openSession();
		Transaction tr=session.beginTransaction();
		session.delete(guanzhu);
		tr.commit();
		session.close();
		
	}

	//添加评论
	public void addpingl(Pinlun pl)
	{
		Session session=bs.openSession();
		Transaction tr=session.beginTransaction();
		session.save(pl);
		tr.commit();
		session.close();
		
	}

	@Override
	public Pinlun findBytid(int uid, int cid)
	{
		Session session=bs.openSession();
		Query query=session.createQuery("from Pinlun where user_id=? and company_id=?");
		query.setParameter(0, uid);
		query.setParameter(1, cid);
		if(query.list().size()>0)
		{
			Pinlun gg=(Pinlun) query.list().get(0);
			session.close();
			return gg;
		}
		session.close();	
		return null;
	}

	//查询所有
	public List<Guanzhu> findall()
	{
		Session session=bs.openSession();
		Query query=session.createQuery("from Guanzhu");
		List<Guanzhu> li=query.list();
		session.close();
		return li;
	}
	public int postfindcount(int  company_id)
	{
		// 查询总记录数
				Session session=bs.openSession();
				Transaction transaction=session.beginTransaction();
				Query query=session.createQuery("select count(*) from Guanzhu where company_id=?");
				query.setParameter(0, company_id);
				List<Long> list=query.list();
				transaction.commit();
				if(list.size()>0)
				return list.get(0).intValue();
				return 0;
	}

	//根据workid查询到所有
	public List<Guanzhu> findBywid(int wid)
	{
		Session session=bs.openSession();
		Query query=session.createQuery("select count(*) from Guanzhu where work_id=?");
		query.setParameter(0, wid);
		List<Guanzhu> li=query.list();
		session.close();
		return li;
	}

	@Override
	public List<Guanzhu> findByid(int user_id) {
		Session session=bs.openSession();
		Query query=session.createQuery("from Guanzhu where user_id=?");
		query.setParameter(0, user_id);
		List<Guanzhu> li=query.list();
		session.close();
		return li;
	}

	@Override
	public void deleteGuanzhu(int id) {
		Session session=bs.openSession();
		Transaction tr=session.beginTransaction();
		Query query = session.createQuery("delete Guanzhu as g where g.company_id=?");
		query.setParameter(0, id);
		query.executeUpdate();
		tr.commit();
		session.close();
	}

	//根据企业id查询到该企业所有的评论
	public List<Pinlun> findBysywID(int cid) {
		Session session=bs.openSession();
		Query query=session.createQuery("from Pinlun where company_id=?");
		query.setParameter(0, cid);
		List<Pinlun> li=query.list();
		session.close();	
		return li;
	}

}
