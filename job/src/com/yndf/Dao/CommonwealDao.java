package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Commonweal;

/**
 * �����ְdao��ӿ�
 */
public interface CommonwealDao {

	Commonweal saveCommonweal(Commonweal commonweal);

	List<Commonweal> selectCommonweal();

	void deleteCommonweal(int id);
	//ͨ��ID��ѯ��Ϣ
	public Commonweal findbyid(int id);

}
