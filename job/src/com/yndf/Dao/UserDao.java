package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.User;

/**
 * �û�dao��ӿ�
 */
public interface UserDao {

	void userSave(User user);//�û�ע��dao��ӿ�

	User findName(String uname);//�û���ѯ����dao��ӿ�
	User login(User user);//�û���¼dao��ӿ�

	User updateUser(User user);//�û�������Ϣ�޸�dao��ӿ�

	List<User> findAll(User user);

	//void updateBalance(int id);

	void updateBalance(User user);

	void updateBalance(int id,int s);

	User findById(int id);
	//���ý���
	void updatezt(int id,int zt);
	
}
