package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Commonweal;

/**
 * �����ְservice��ӿ�
 */
public interface CommonwealService {

	Commonweal saveCommonweal(Commonweal commonweal);

	List<Commonweal> selectCommonweal();

	void deleteCommonweal(int id);
	//ͨ��ID��ѯ��Ϣ
	public Commonweal findbyid(int id);
}
