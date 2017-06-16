package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Gonggao;


public interface GonggaoDao {
	Gonggao add(Gonggao gonggao);
  
	List<Gonggao> findAll(Gonggao gonggao);

	void deletegongao(int id);
}
