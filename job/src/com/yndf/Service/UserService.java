package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.User;

/**
 * �û�service��ӿ�
 */
public interface UserService {
	public void userSave(User user);//�û�����

	public User findName(String uname);//��ѯ�û���

	public User login(User user);//�û���¼

	public User updateUser(User user);//�û�������Ϣ�޸�;

	public List<User> findAll(User user);

	public void updateBalance(int id, int s);

	public User findById(int id);

	//public void updateBalance(int id);
	//���ý���
		void updatezt(int id,int zt);

}
