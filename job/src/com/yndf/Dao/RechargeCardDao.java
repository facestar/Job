package com.yndf.Dao;

import com.yndf.pojo.RechargeCard;

/**
 * ��ֵ����dao��ӿ�
 */
public interface RechargeCardDao {

	RechargeCard selectRechargeCard(RechargeCard rechargeCard);

	void deleteCard(int cardnumber);

}
