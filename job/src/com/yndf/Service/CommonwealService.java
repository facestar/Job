package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Commonweal;

/**
 * 公益兼职service层接口
 */
public interface CommonwealService {

	Commonweal saveCommonweal(Commonweal commonweal);

	List<Commonweal> selectCommonweal();

	void deleteCommonweal(int id);
	//通过ID查询信息
	public Commonweal findbyid(int id);
}
