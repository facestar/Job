package com.yndf.DaoImpl;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.yndf.Dao.BasicDao;
import com.yndf.Dao.RechargeCardDao;
import com.yndf.pojo.RechargeCard;

/**
 * ��ֵ����dao��ʵ����
 */
@Repository("rechargeCarddao")
public class RechargeCardDaoImpl implements RechargeCardDao{
	@Resource(name="basicdao")
	private BasicDao basicDao;

	@Override
	//��ֵ��ѯ
	public RechargeCard selectRechargeCard(RechargeCard rechargeCard) {
		Session session = basicDao.openSession();
		Query query = session.createQuery("from RechargeCard where cardnumber=? and rpassword=?");
		query.setParameter(0, rechargeCard.getCardnumber());
		query.setParameter(1, rechargeCard.getRpassword());
		rechargeCard = (RechargeCard)query.uniqueResult();
		session.close();
		return rechargeCard;
	}

	@Override
	//ɾ����ֵ����
	public void deleteCard(int cardnumber) {
		Session session = basicDao.openSession();
		Transaction transaction=session.beginTransaction();
		Query query = session.createQuery("delete RechargeCard as r where r.cardnumber=?");
		query.setParameter(0, cardnumber);
		query.executeUpdate();
		transaction.commit();
		session.close();
	}
}
