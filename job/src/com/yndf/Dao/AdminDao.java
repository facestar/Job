package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Admin;
import com.yndf.pojo.Money;

/**
 * ����ԱDAO��ӿ�
 */
public interface AdminDao {

	//Admin findNameAndPassword(String aname, String apassword);

	Admin login(Admin admin);
	
	public List<Money> selectm();
	//����˾��Ǯ
		public void addmoney(Money money);
		public void updatemoney(Money money);

}
