package com.yndf.DaoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.yndf.Dao.BasicDao;
import com.yndf.Dao.WorksDao;
import com.yndf.pojo.Company;
import com.yndf.pojo.Information;
import com.yndf.pojo.Post;
import com.yndf.pojo.Work;
@Repository("worksdao")
public class WorksDaoImpl implements WorksDao
{

	@Resource(name="basicdao")
	private BasicDao bs;
	//兼职的添加
	public void addwork(Work work)
	{
		Session session=bs.openSession();
		Transaction tr=session.beginTransaction();
		session.save(work);
		tr.commit();
		session.flush();
		session.clear();
		session.close();
		

	}
	@Override
	public List<Work> findallwork() {
		Session session=bs.openSession();
		Query query=session.createQuery("from Work order by id desc");
		List<Work> ls=query.list();
		session.close();
		
		return ls;
	}

	@Override
	public List<Work> findwtypeandwsex(int begin, int pagesize,String wtype,String wsex) {
		Session session=bs.openSession();
		Query query=session.createQuery("from Work where wtype=? and wsex=? order by id desc");
		query.setParameter(0, wtype);
		query.setParameter(1, wsex);
		query.setFirstResult(begin);
		query.setMaxResults(pagesize);
		List<Work> ls=query.list();
		
		session.flush();
		session.close();
		return ls;
	}
	@Override
	public List<Work> findwsex(int begin, int pagesize,String wsex) {
		Session session=bs.openSession();
		Query query=session.createQuery("from Work where wsex=? order by id desc");
		query.setParameter(0, wsex);
		query.setFirstResult(begin);
		query.setMaxResults(pagesize);
		List<Work> ls=query.list();
		
		session.flush();
		session.close();
		return ls;
	}
	@Override
	public List<Work> findbegindate(int begin, int pagesize,String begindate) {
		Session session=bs.openSession();
		Query query=session.createQuery("from Work where begindate=? order by id desc");
		query.setParameter(0, begindate);
		/*query.setFirstResult(begin);
		query.setMaxResults(pagesize);*/
		List<Work> ls=query.list();
		
		session.flush();
		session.close();
		return ls;
	}
	@Override
	public List<Work> findwtype(int begin, int pagesize,String wtype) {
		Session session=bs.openSession();
		Query query=session.createQuery("from Work where wtype=? order by id desc");
		
		query.setParameter(0, wtype);
		/*query.setFirstResult(begin);
		query.setMaxResults(pagesize);*/
		List<Work> ls=query.list();
		session.flush();
		session.close();
		return ls;
	}
	@Override
	public List<Work> findwtypeandbegindate(int begin, int pagesize,String wtype, String begindate) {
		Session session=bs.openSession();
		Query query=session.createQuery("from Work where wtype=? and begindate=? order by id desc");
		query.setParameter(0, wtype);
		query.setParameter(1, begindate);
		/*query.setFirstResult(begin);
		query.setMaxResults(pagesize);*/
		List<Work> ls=query.list();
		session.close();
		return ls;
	}
	@Override
	public List<Work> findwsexandbegindate(int begin, int pagesize,String wsex, String begindate) {
		Session session=bs.openSession();
		Query query=session.createQuery("from Work where wsex=? and begindate=? order by id desc");
		query.setParameter(0, wsex);
		query.setParameter(1, begindate);
		/*query.setFirstResult(begin);
		query.setMaxResults(pagesize);*/
		List<Work> ls=query.list();
		session.close();
		return ls;
	}
	@Override
	public List<Work> findwtypeandwsexandbegindate(int begin, int pagesize,String wtype, String wsex, String begindate) {
		Session session=bs.openSession();
		Query query=session.createQuery("from Work where wtype=? and wsex=? and begindate=? order by id desc");
		query.setParameter(0, wtype);
		query.setParameter(1, wsex);
		query.setParameter(2, begindate);
		/*query.setFirstResult(begin);
		query.setMaxResults(pagesize);*/
		List<Work> ls=query.list();
		session.close();
		return ls;
	}

	//根据企业的ID查询出其发布过的兼职
	public List<Work> findBycom_id(int comId)
	{
		Session session=bs.openSession();
		Query query=session.createQuery("from Work where company_id=? order by id desc");
		query.setParameter(0, comId);
		 List<Work> li=query.list();
		 session.close();
		return li;
	}

	//兼职标题查询的实现
	@Override
	public List<Work> findwtitle(String wtitle) {
		Session session=bs.openSession();
		Query query=session.createQuery("from Work where wtitle=?");
		query.setParameter(0, wtitle);
		 List<Work> li=query.list();
		 session.close();
		return li;
	}

	//企业兼职的删除
	public void deletework(int id)
	{
		Session session=bs.openSession();
		Transaction tx=session.beginTransaction();
		Work work=session.get(Work.class, id);
		session.delete(work);
		tx.commit();
		session.close();
		
	}
	//兼职id查询的DAO层实现
	@Override
	public Work findbyid(int id) {
		Session session=bs.openSession();
		Query query=session.createQuery("from Work where id=?");
		query.setParameter(0, id);
		Work work=(Work) query.uniqueResult();
		session.close();
		return work;
	}
	//全查询分页
	@Override
	public List<Work> findallfy(int begin, int pagesize) {
		
		Session session=bs.openSession();
		Query query=session.createQuery(" from Work order by id desc ");
		query.setFirstResult(begin);
		query.setMaxResults(pagesize);
		List<Work> li=query.list();
		session.flush();
		session.close();
		return li;
	}
	//查询总的有多少条
	@Override
	public int workfindcount() {
		
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("select count(*) from Work");
		List<Long> list=query.list();
		transaction.commit();
		if(list.size()>0)
		return list.get(0).intValue();
		return 0;
		
	}
	@Override
	public int wsexfindcount(String wsex) {
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("select count(*) from Work where wsex=?");
		query.setParameter(0, wsex);
		List<Long> list=query.list();
		transaction.commit();
		if(list.size()>0)
		return list.get(0).intValue();
		return 0;
		
		
	}
	@Override
	public int wtypeandwsexfindcount(String wtype, String wsex) {
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("select count(*) from Work where wtype=? and wsex=?");
		query.setParameter(0, wtype);
		query.setParameter(1, wsex);
		List<Long> list=query.list();
		transaction.commit();
		if(list.size()>0)
		return list.get(0).intValue();
		return 0;
	}
	@Override
	public int begindatefindcount(String begindate) {
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("select count(*) from Work where begindate=?");
		query.setParameter(0,begindate);
		List<Long> list=query.list();
		transaction.commit();
		if(list.size()>0)
		return list.get(0).intValue();
		return 0;
	}
	@Override
	public int wtypefindcount(String wtype) {
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("select count(*) from Work where wtype=?");
		query.setParameter(0,wtype);
		List<Long> list=query.list();
		
		transaction.commit();
		session.close();
		if(list.size()>0)
		return list.get(0).intValue();
		return 0;
	}
	@Override
	public int wtypeandbegindatefindcount(String wtype, String begindate) {
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("select count(*) from Work where wtype=? and begindate=?");
		query.setParameter(0, wtype);
		query.setParameter(1, begindate);
		List<Long> list=query.list();
		transaction.commit();
		session.close();
		if(list.size()>0)
		return list.get(0).intValue();
		return 0;
	}
	/**
	 * 计算查询性别和日期总数
	 */
	@Override
	public int wsexandbegindatefindcount(String wsex, String begindate) {
		
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("select count(*) from Work where wsex=? and begindate=?");
		query.setParameter(0, wsex);
		query.setParameter(1, begindate);
		List<Long> list=query.list();
		transaction.commit();
		session.close();
		if(list.size()>0)
		return list.get(0).intValue();
		return 0;
	}
	@Override
	public int wtypeandwsexandbegindatefindcount(String wtype, String wsex, String begindate) {
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("select count(*) from Work where wtype=? and wsex=? and begindate=?");
		query.setParameter(0, wtype);
		query.setParameter(1, wsex);
		query.setParameter(2, begindate);
		List<Long> list=query.list();
		transaction.commit();
		session.close();
		if(list.size()>0)
		return list.get(0).intValue();
		return 0;
	}
	@Override
	public void addav(Information information) {
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(information);
	    transaction.commit();
	    session.clear();
	    session.close();
		
	}
	
	//修改兼职
	public void updatework(Work work)
	{
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(work);
		transaction.commit();
		session.close();
	}
	


}
