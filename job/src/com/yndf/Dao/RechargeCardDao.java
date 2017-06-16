package com.yndf.Dao;

import com.yndf.pojo.RechargeCard;

/**
 * 充值卡表dao层接口
 */
public interface RechargeCardDao {

	RechargeCard selectRechargeCard(RechargeCard rechargeCard);

	void deleteCard(int cardnumber);

}
