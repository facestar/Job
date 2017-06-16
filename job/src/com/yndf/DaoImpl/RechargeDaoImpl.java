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
 * ��ֵ��¼dao��ʵ����
 */
@Repository("rechargedao")
public class RechargeDaoImpl implements RechargeDao{
	@Resource(name="basicdao")
	private BasicDao basicDao;

	@Override
	//��ֵ�ķ���
	public void addRecharge(Recharge recharge) {
		Session session = basicDao.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(recharge);
		transaction.commit();
		session.close();
	}

	@Override
	//�����û�Id����ѯ��ֵ��¼���ֵ���û�
	public List<Recharge> findUser_id(int user_id) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Recharge where user_id=?");
		query.setParameter(0, user_id);
		List<Recharge> list = query.list();
		session.close();
		return list;
	}

	@Override
	//��ѯ�û����
	public List<Recharge> findBalance(int balance) {
		Session session = basicDao.openSession();
		return null;
	}
	//�û����ݵ�ǰID��ѯ��ֵ��¼
	@Override
	public List<Recharge> selectRecharge(int user_id) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from Recharge where user_id=?");
		query.setParameter(0, user_id);
		List<Recharge> li = query.list();
		session.close();
		return li;
	}
	//��ҵ���ݵ�ǰ�û�ID��ѯ��ֵ��¼
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
