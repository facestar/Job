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
	//ͨ��user-id��ѯ���䱨�����ļ�¼�������ر����ļ�ְid
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
	//��ӱ�����¼
	public void addSign(Signup sign)
	{
		Session session=bs.openSession();
		Transaction tr=session.beginTransaction();
		session.save(sign);
		tr.commit();
		session.close();
		
	}
	//ͨ��˫id��ѯ�Ƿ񱨹���
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
	//��ѯ��������
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
	
	//����workid��ѯ������
		public List<Signup> findBywid(int wid)
		{
			Session session=bs.openSession();
			Query query=session.createQuery("from Signup where work_id=?");
			query.setParameter(0, wid);
			List<Signup> li=query.list();
			session.close();
			return li;
		}
		//�����û�id��ѯ��������
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
		//����֪ͨ
		public void addform(Inform inform) {
			Session session=bs.openSession();
			Transaction tr=session.beginTransaction();
			session.save(inform);
			tr.commit();
			session.close();
			
		}

}
