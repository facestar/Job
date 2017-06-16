package com.yndf.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.annotations.Source;
import org.springframework.stereotype.Service;

import com.yndf.Dao.RechargeDao;
import com.yndf.Service.RechargeService;
import com.yndf.pojo.Recharge;
import com.yndf.pojo.RechargeCard;

/**
 * 充值卡记录Service层实现类
 */
@Service("rechargeservice")
public class RechargeServiceImpl implements RechargeService{
	@Resource(name="rechargedao")
	private RechargeDao rechargeDao;
	@Override
	public void addRecharge(Recharge recharge) {
		rechargeDao.addRecharge(recharge);
	}
	@Override
	public List<Recharge> findUser_id(int user_id) {
		return rechargeDao.findUser_id(user_id);
	}
	@Override
	public List<Recharge> findBalance(int balance) {
		return rechargeDao.findBalance(balance);
	}
	@Override
	public List<Recharge> selectRecharge(int user_id) {
		return rechargeDao.selectRecharge(user_id);
	}
	@Override
	public List<Recharge> seleRecharge(int company_id) {
		return rechargeDao.seleRecharge(company_id);
	}
}
