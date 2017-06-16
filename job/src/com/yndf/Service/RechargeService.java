package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Recharge;
import com.yndf.pojo.RechargeCard;

/**
 * 充值卡记录service层接口
 */
public interface RechargeService {


	void addRecharge(Recharge recharge);

	List<Recharge> findUser_id(int user_id);

	List<Recharge> findBalance(int balance);

	List<Recharge> selectRecharge(int user_id);

	List<Recharge> seleRecharge(int company_id);

}
