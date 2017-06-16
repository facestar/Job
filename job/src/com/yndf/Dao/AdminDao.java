package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Admin;
import com.yndf.pojo.Money;

/**
 * 管理员DAO层接口
 */
public interface AdminDao {

	//Admin findNameAndPassword(String aname, String apassword);

	Admin login(Admin admin);
	
	public List<Money> selectm();
	//给公司加钱
		public void addmoney(Money money);
		public void updatemoney(Money money);

}
