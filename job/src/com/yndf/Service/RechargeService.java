package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Recharge;
import com.yndf.pojo.RechargeCard;

/**
 * ��ֵ����¼service��ӿ�
 */
public interface RechargeService {


	void addRecharge(Recharge recharge);

	List<Recharge> findUser_id(int user_id);

	List<Recharge> findBalance(int balance);

	List<Recharge> selectRecharge(int user_id);

	List<Recharge> seleRecharge(int company_id);

}
