package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.User;

/**
 * 用户service层接口
 */
public interface UserService {
	public void userSave(User user);//用户增加

	public User findName(String uname);//查询用户名

	public User login(User user);//用户登录

	public User updateUser(User user);//用户个人信息修改;

	public List<User> findAll(User user);

	public void updateBalance(int id, int s);

	public User findById(int id);

	//public void updateBalance(int id);
	//启用禁用
		void updatezt(int id,int zt);

}
