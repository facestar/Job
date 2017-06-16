package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.User;

/**
 * 用户dao层接口
 */
public interface UserDao {

	void userSave(User user);//用户注册dao层接口

	User findName(String uname);//用户查询名字dao层接口
	User login(User user);//用户登录dao层接口

	User updateUser(User user);//用户个人信息修改dao层接口

	List<User> findAll(User user);

	//void updateBalance(int id);

	void updateBalance(User user);

	void updateBalance(int id,int s);

	User findById(int id);
	//启用禁用
	void updatezt(int id,int zt);
	
}
