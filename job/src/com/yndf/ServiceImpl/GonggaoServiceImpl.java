package com.yndf.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yndf.Dao.GonggaoDao;
import com.yndf.Service.GonggaoService;
import com.yndf.pojo.Gonggao;
@Service("gonggaoservice")
public class GonggaoServiceImpl implements GonggaoService {
@Resource(name="gonggaodao")
	private GonggaoDao  gonggaoDao;
	@Override
	public Gonggao add(Gonggao gonggao) {
		return gonggaoDao.add(gonggao);
	}
	
	@Override
	public List<Gonggao> findAll(Gonggao gonggao) {
		
		return gonggaoDao.findAll(gonggao);
	}

	@Override
	public void deletegongao(int id) {
		gonggaoDao.deletegongao(id);
		
	}

	

}
