package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Recharge;
import com.yndf.pojo.RechargeCard;

/**
 * ��ֵ��¼DAO��ӿ�
 */
public interface RechargeDao {

	void addRecharge(Recharge recharge);
	List<Recharge> findBalance(int balance);
	List<Recharge> findUser_id(int user_id);
	List<Recharge> selectRecharge(int user_id);
	List<Recharge> seleRecharge(int company_id);

}
