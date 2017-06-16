package com.yndf.ServiceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yndf.Dao.RechargeCardDao;
import com.yndf.Service.RechargeCardService;
import com.yndf.pojo.RechargeCard;

/**
 *充值卡表service层实现类
 */
@Service("rechargeCardservice")
public class RechargeCardServiceImpl implements RechargeCardService{
	@Resource(name="rechargeCarddao")
	private RechargeCardDao rechargeCardDao;

	@Override
	public RechargeCard selectRechargeCard(RechargeCard rechargeCard) {
		return rechargeCardDao.selectRechargeCard(rechargeCard);
	}

	@Override
	public void deleteCard(int cardnumber) {
		rechargeCardDao.deleteCard(cardnumber);
	}
}
