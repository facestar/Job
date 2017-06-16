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
	//ͨ��user-id��ѯ���䱨�����ļ�¼�������ر����ļ�ְid
	public List findByuser_id(int user_id)
	{
		
		return signupDao.findByuser_id(user_id);
	}
	//��ӱ�����¼
	public void addSign(Signup sign)
	{
		//��ӱ�����¼
		signupDao.addSign(sign);
		
	}
	//ͨ��˫id��ѯ�Ƿ񱨹���
	public Signup fingBytID(int uid, int wid)
	{
		
		return signupDao.findBytID(uid,wid);
	}
	//��ѯ��������
	public int countBywid(int wid)
	{
		
		return signupDao.countBywid(wid);
	}
	
	public List<Signup> findBywid(int wid)
	{
		return signupDao.findBywid(wid);
	}

	//�����û�id��ѯ��������
	public int countByuid(int uid)
	{
		return signupDao.countByuid(uid);
	}
	//����֪ͨ
		public void addinform(Inform inform) {
			signupDao.addform(inform);
		}
}
