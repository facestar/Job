package com.yndf.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yndf.Dao.SignupDao;
import com.yndf.Service.SignupService;
import com.yndf.pojo.Guanzhu;
import com.yndf.pojo.Inform;
import com.yndf.pojo.Signup;
@Service("signupservice")
public class SignupServiceImpl implements SignupService
{

	@Resource(name="signupdao")
	private SignupDao signupDao;
	//通过user-id查询出其报名过的记录，并返回报名的兼职id
	public List findByuser_id(int user_id)
	{
		
		return signupDao.findByuser_id(user_id);
	}
	//添加报名记录
	public void addSign(Signup sign)
	{
		//添加报名记录
		signupDao.addSign(sign);
		
	}
	//通过双id查询是否报过名
	public Signup fingBytID(int uid, int wid)
	{
		
		return signupDao.findBytID(uid,wid);
	}
	//查询报名人数
	public int countBywid(int wid)
	{
		
		return signupDao.countBywid(wid);
	}
	
	public List<Signup> findBywid(int wid)
	{
		return signupDao.findBywid(wid);
	}

	//根据用户id查询报名人数
	public int countByuid(int uid)
	{
		return signupDao.countByuid(uid);
	}
	//增加通知
		public void addinform(Inform inform) {
			signupDao.addform(inform);
		}
}
