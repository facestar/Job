package com.yndf.Service;

import com.yndf.pojo.RechargeCard;

/**
 * ��ֵ����Service��ӿ�
 */
public interface RechargeCardService {

	RechargeCard selectRechargeCard(RechargeCard rechargeCard);

	void deleteCard(int cardnumber);

}
