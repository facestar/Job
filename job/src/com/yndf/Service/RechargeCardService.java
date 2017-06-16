package com.yndf.Service;

import com.yndf.pojo.RechargeCard;

/**
 * 充值卡表Service层接口
 */
public interface RechargeCardService {

	RechargeCard selectRechargeCard(RechargeCard rechargeCard);

	void deleteCard(int cardnumber);

}
