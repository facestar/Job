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
 * 充值卡表dao层实现类
 */
@Repository("rechargeCarddao")
public class RechargeCardDaoImpl implements RechargeCardDao{
	@Resource(name="basicdao")
	private BasicDao basicDao;

	@Override
	//充值查询
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
	//删除充值卡号
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
