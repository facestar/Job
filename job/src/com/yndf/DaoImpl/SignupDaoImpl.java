package com.yndf.DaoImpl;



import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.yndf.Dao.BasicDao;
import com.yndf.Dao.SignupDao;
import com.yndf.pojo.Guanzhu;
import com.yndf.pojo.Inform;
import com.yndf.pojo.Signup;
@Repository("signupdao")
public class SignupDaoImpl implements SignupDao
{

	@Resource(name="basicdao")
	private BasicDao bs;
	//通过user-id查询出其报名过的记录，并返回报名的兼职id
	public List findByuser_id(int user_id)
	{
		Session session=bs.openSession();
		Query query=session.createQuery("from Signup where user_id=?");
		query.setParameter(0, user_id);
		List<Signup> list=(List<Signup>) query.list();
		if(list.size()>0)
		{
			List li=new ArrayList();
			for(int i=0;i<list.size();i++)
			{
				li.add(list.get(i).getWork_id());
				
			}
			session.close();
			return li;	
			
		}
		return null;
		
	}
	//添加报名记录
	public void addSign(Signup sign)
	{
		Session session=bs.openSession();
		Transaction tr=session.beginTransaction();
		session.save(sign);
		tr.commit();
		session.close();
		
	}
	//通过双id查询是否报过名
	public Signup findBytID(int uid, int wid)
	{
		Session session=bs.openSession();
		Query query=session.createQuery("from Signup where user_id=? and work_id=?");
		query.setParameter(0, uid);
		query.setParameter(1, wid);
		Signup sign=(Signup) query.uniqueResult();
		session.close();
		return sign;
	}
	//查询报名人数
	public int countBywid(int wid)
	{
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("select count(*) from Signup where work_id=?");
		query.setParameter(0, wid);
		List<Long> list=query.list();
		transaction.commit();
		session.close();
		if(list.size()>0)
		return list.get(0).intValue();
		return 0;
	}
	
	//根据workid查询到所有
		public List<Signup> findBywid(int wid)
		{
			Session session=bs.openSession();
			Query query=session.createQuery("from Signup where work_id=?");
			query.setParameter(0, wid);
			List<Signup> li=query.list();
			session.close();
			return li;
		}
		//根据用户id查询报名人数
		public int countByuid(int uid)
		{
			Session session=bs.openSession();
			Transaction transaction=session.beginTransaction();
			Query query=session.createQuery("select count(*) from Signup where user_id=?");
			query.setParameter(0, uid);
			List<Long> list=query.list();
			transaction.commit();
			session.close();
			if(list.size()>0)
			return list.get(0).intValue();
			return 0;
		}
		//增加通知
		public void addform(Inform inform) {
			Session session=bs.openSession();
			Transaction tr=session.beginTransaction();
			session.save(inform);
			tr.commit();
			session.close();
			
		}

}
