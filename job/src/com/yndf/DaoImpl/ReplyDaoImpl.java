package com.yndf.DaoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.yndf.Dao.BasicDao;
import com.yndf.Dao.ReplyDao;
import com.yndf.pojo.Reply;
@Repository("replydao")
public class ReplyDaoImpl implements ReplyDao {
	@Resource(name="basicdao")
	private BasicDao bs;
	@Override
	public void addReply(Reply reply) {
		Session session=bs.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		session.save(reply);
	
		transaction.commit();
		
	}

	@Override
	public List<Reply> replyfind(int id) {
		Session session=bs.openSession();
		Query query= session.createQuery("from Reply where post_id=?");
		query.setParameter(0, id);
		List<Reply> jj=query.list();
		session.close();
		return jj;
	}

	@Override
	public void deletePost(int id) {
		Session session=bs.openSession();
		Transaction transaction = session.beginTransaction();
		Query query= session.createQuery("from Reply where post_id=?");
		query.setParameter(0, id);
		if(query.list().size()>0)
		{
		for(int i=0;i<query.list().size();i++)
		{
			session.delete(query.list().get(i));
		}
		transaction.commit();}
		session.close();
		
	}

}
