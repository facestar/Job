package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Admin;
import com.yndf.pojo.Money;

/**
 * ����ԱService��ӿ�
 */
public interface AdminService {

	//public Admin findNameAndPassword(String aname,String apassword);

	public Admin login(Admin admin);
	public List<Money> selectm();
	//����˾��Ǯ
		public void addmoney(Money money);
		public void updatemoney(Money money);

}
