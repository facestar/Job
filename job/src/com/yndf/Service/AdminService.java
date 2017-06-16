package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Admin;
import com.yndf.pojo.Money;

/**
 * 管理员Service层接口
 */
public interface AdminService {

	//public Admin findNameAndPassword(String aname,String apassword);

	public Admin login(Admin admin);
	public List<Money> selectm();
	//给公司加钱
		public void addmoney(Money money);
		public void updatemoney(Money money);

}
