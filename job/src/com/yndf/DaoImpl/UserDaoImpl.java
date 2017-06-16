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
 * 用户dao层实现类
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Resource(name="basicdao")
	private BasicDao basicDao;
	//用户注册
	public void userSave(User user) {
		Session session = basicDao.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		
	}
	@Override
	//用户查询名字
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
	//用户登录
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
	//用户个人信息修改
	public User updateUser(User user) {
		Session session = basicDao.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.update(user);
		transaction.commit();
		return user;
	}
	//查询用户
	@Override
	public List<User> findAll(User user) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from User");
		List<User> list = query.list();
		return list;
	}
	//用户修改余额
	@Override
	public void updateBalance(User user) {
		Session session = basicDao.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(user.getBalance());
		transaction.commit();
	}
	//用户修改余额的方法
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
	//用户根据当前ID来查询余额
	@Override
	public User findById(int id) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from User where id=?");
		query.setParameter(0, id);
		User user = (User)query.uniqueResult();
		session.close();
		return user;
	}
	//启用禁用
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
