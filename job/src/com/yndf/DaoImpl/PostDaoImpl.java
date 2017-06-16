package com.yndf.DaoImpl;



import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.yndf.Dao.BasicDao;
import com.yndf.Dao.PostDao;
import com.yndf.Util.VoInform;
import com.yndf.pojo.Company;
import com.yndf.pojo.Inform;
import com.yndf.pojo.Information;
import com.yndf.pojo.Post;
import com.yndf.pojo.User;
@Repository("postdao")
public class PostDaoImpl implements PostDao {
    
	@Resource(name="basicdao")
	private BasicDao bs;
	@Override//增加帖子
	public void addpost(Post post) {
		Session session=bs.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		session.save(post);
		transaction.commit();
		
		
		
	}
	//查所有帖子
	public List findallpost_user()
	
	{
		Session session=bs.openSession();
		Query query=session.createQuery("from Post ");
		List li= query.list();
		System.out.println(li);
		return li;
	
	}
	//根据id查帖子
	public Post findpost(int id)
	{
		Session session=bs.openSession();
		Query query=session.createQuery("from Post where id=?");
		query.setParameter(0,id);
		Post li= (Post) query.uniqueResult();
		session.close();
		return li; 
	}
	
	@Override
	public int postfindcount()
	{
		// 查询总记录数
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("select count(*) from Post");
		List<Long> list=query.list();
		transaction.commit();
		if(list.size()>0)
		return list.get(0).intValue();
		return 0;
	}

	@Override
	public List<Post> postfindBypage(int begin, int pagesize)
	{
		// 分页查询
		Session session=bs.openSession();
		Query query=session.createQuery(" from Post");
		query.setFirstResult(begin);
		query.setMaxResults(pagesize);
		List<Post> li=query.list();
		session.flush();
		session.close();
		return li;
	}
	@Override
	public List<Post> findpost() {
		Session session=bs.openSession();
		Query query=session.createQuery(" from Post");
		List<Post> list = query.list();
		session.close();
		return list;
	}
	@Override//删除帖子
	public void delPost(int id) {
		Session session=bs.openSession();
		Transaction transaction = session.beginTransaction();
		Query query=session.createQuery("from Post where id=?");
		query.setParameter(0, id);
		session.delete(query.list().get(0));
		transaction.commit();
		session.close();
	}
	@Override//用户通知查询
	public List<VoInform> findInform(int uid) {
		Session session=bs.openSession();
	     Query query=session.createQuery("select new com.yndf.Util.VoInform(i.id,c.uname,i.icontent) from Inform i,Company c where i.company_id=c.id and i.user_id=?");
	     query.setParameter(0, uid);
	     List<VoInform> li=query.list();
	     session.close();
		return li;
	}
	@Override
	public void delinform(int id) {
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		Inform inform=(Inform) session.get(Inform.class, id);
		session.delete(inform);
		transaction.commit();
		session.close();
	}
	@Override//企业通知查询
	public List<Information> findif() {
		Session session=bs.openSession();
		Query query=session.createQuery("from Information");
		List<Information> lt=query.list();
	    return lt;
	}
	@Override
	public void deleteif(int id) {
		Session session=bs.openSession();
		Transaction transaction=session.beginTransaction();
		Information information=(Information) session.get(Information.class, id);
		session.delete(information);
		transaction.commit();
		session.close();
	}

}
