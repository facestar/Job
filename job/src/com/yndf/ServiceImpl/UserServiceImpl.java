package com.yndf.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.stereotype.Service;

import com.yndf.Dao.UserDao;
import com.yndf.Service.UserService;
import com.yndf.pojo.User;
/**
 * �û�service��ʵ����
 */
@Service(value="userservice")
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserDao userDao;
	//�û�ע��
	public void userSave(User user) {
		
		userDao.userSave(user);
	}
	@Override
	//�û���ѯ����
	public User findName(String uname) {
		
		return userDao.findName(uname);
	}
	@Override
	//�û���¼
	public User login(User user) {
		
		return userDao.login(user);
	}
	@Override
	//�û�������Ϣ�޸�
	public User updateUser(User user) {
		
		return userDao.updateUser(user);
	}
	@Override
	public List<User> findAll(User user) {
		
		return userDao.findAll(user);
	}
	@Override
	public void updateBalance(int id, int s) {
		userDao.updateBalance(id,s);
	}
	@Override
	public User findById(int id) {
		return userDao.findById(id);
	}
	@Override
	public void updatezt(int id, int zt) {
		userDao.updatezt(id, zt);;
		
	}
	
}
