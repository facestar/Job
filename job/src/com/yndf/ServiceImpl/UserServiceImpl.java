package com.yndf.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.stereotype.Service;

import com.yndf.Dao.UserDao;
import com.yndf.Service.UserService;
import com.yndf.pojo.User;
/**
 * 用户service层实现类
 */
@Service(value="userservice")
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserDao userDao;
	//用户注册
	public void userSave(User user) {
		
		userDao.userSave(user);
	}
	@Override
	//用户查询姓名
	public User findName(String uname) {
		
		return userDao.findName(uname);
	}
	@Override
	//用户登录
	public User login(User user) {
		
		return userDao.login(user);
	}
	@Override
	//用户个人信息修改
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
