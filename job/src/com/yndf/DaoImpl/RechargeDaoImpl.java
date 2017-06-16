package com.yndf.DaoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.yndf.Dao.BasicDao;
import com.yndf.Dao.RechargeDao;
import com.yndf.pojo.Recharge;
import com.yndf.pojo.RechargeCard;

/**
 * 充值记录dao层实现类
 */
@Repository("rechargedao")
public class RechargeDaoImpl implements RechargeDao{
	@Resource(name="basicdao")
	private BasicDao basicDao;

	@Override
	//充值的方法
	public void addRecharge(Recharge recharge) {
		Session session = basicDao.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(recharge);
		transaction.commit();
		session.close();
	}

	@Override
	//根据用户Id来查询充值记录表充值的用户
	public List<Recharge> findUser_id(int user_id) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Recharge where user_id=?");
		query.setParameter(0, user_id);
		List<Recharge> list = query.list();
		session.close();
		return list;
	}

	@Override
	//查询用户余额
	public List<Recharge> findBalance(int balance) {
		Session session = basicDao.openSession();
		return null;
	}
	//用户根据当前ID查询充值记录
	@Override
	public List<Recharge> selectRecharge(int user_id) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Recharge where user_id=?");
		query.setParameter(0, user_id);
		List<Recharge> li = query.list();
		session.close();
		return li;
	}
	//企业根据当前用户ID查询充值记录
	@Override
	public List<Recharge> seleRecharge(int company_id) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Recharge where company_id=?");
		query.setParameter(0, company_id);
		List<Recharge> lis = query.list();
		session.close();
		return lis;
	}
}
