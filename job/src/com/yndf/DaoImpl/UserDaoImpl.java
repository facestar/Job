package com.yndf.DaoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.yndf.Dao.BasicDao;
import com.yndf.Dao.UserDao;
import com.yndf.pojo.User;
/**
 * �û�dao��ʵ����
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Resource(name="basicdao")
	private BasicDao basicDao;
	//�û�ע��
	public void userSave(User user) {
		Session session = basicDao.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		
	}
	@Override
	//�û���ѯ����
	public User findName(String uname) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from User where uname=?");
		query.setParameter( 0, uname);
		if(query.list().size()>0)
		{
			User user = (User)query.uniqueResult();
			session.close();
			return user;
		}
		session.close();
		return null;
	}
	@Override
	//�û���¼
	public User login(User user) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from User where uname=? and upassword=?");
		query.setParameter(0, user.getUname());
		query.setParameter(1, user.getUpassword());
		user = (User)query.uniqueResult();
		session.close();
		return user;
		
	}
	@Override
	//�û�������Ϣ�޸�
	public User updateUser(User user) {
		Session session = basicDao.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.update(user);
		transaction.commit();
		return user;
	}
	//��ѯ�û�
	@Override
	public List<User> findAll(User user) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from User");
		List<User> list = query.list();
		return list;
	}
	//�û��޸����
	@Override
	public void updateBalance(User user) {
		Session session = basicDao.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(user.getBalance());
		transaction.commit();
	}
	//�û��޸����ķ���
	@Override
	public void updateBalance(int id, int s) {
		System.out.println(id + "***************" + s + "///////////////////////");
		Session session = basicDao.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("update User set balance=? where id=?");
		query.setParameter(0, s);
		query.setParameter(1, id);
		query.executeUpdate();
		System.out.println(id + "***************" + s + "///////////////////////");
		transaction.commit();
		
	}
	//�û����ݵ�ǰID����ѯ���
	@Override
	public User findById(int id) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from User where id=?");
		query.setParameter(0, id);
		User user = (User)query.uniqueResult();
		session.close();
		return user;
	}
	//���ý���
	@Override
	public void updatezt(int id, int zt) {
		Session session = basicDao.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("update User set zt=? where id=?");
		query.setParameter(0, zt);
		query.setParameter(1, id);
		query.executeUpdate();
		transaction.commit();
		session.close();
	}
	
}
