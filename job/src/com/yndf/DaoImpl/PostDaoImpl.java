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
	@Override//��������
	public void addpost(Post post) {
		Session session=bs.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		session.save(post);
		transaction.commit();
		
		
		
	}
	//����������
	public List findallpost_user()
	
	{
		Session session=bs.openSession();
		Query query=session.createQuery("from Post ");
		List li= query.list();
		System.out.println(li);
		return li;
	
	}
	//����id������
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
		// ��ѯ�ܼ�¼��
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
		// ��ҳ��ѯ
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
	@Override//ɾ������
	public void delPost(int id) {
		Session session=bs.openSession();
		Transaction transaction = session.beginTransaction();
		Query query=session.createQuery("from Post where id=?");
		query.setParameter(0, id);
		session.delete(query.list().get(0));
		transaction.commit();
		session.close();
	}
	@Override//�û�֪ͨ��ѯ
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
	@Override//��ҵ֪ͨ��ѯ
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
