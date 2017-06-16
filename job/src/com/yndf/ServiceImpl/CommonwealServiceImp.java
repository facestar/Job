package com.yndf.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yndf.Dao.CommonwealDao;
import com.yndf.Service.CommonwealService;
import com.yndf.pojo.Commonweal;
/**
 * 公益兼职service层实现类
 */
@Service("commonwealservice")
public class CommonwealServiceImp implements CommonwealService {
	@Resource(name="commonwealdao")
	private CommonwealDao commonwealDao;

	@Override
	public Commonweal saveCommonweal(Commonweal commonweal) {
		return commonwealDao.saveCommonweal(commonweal);
	}

	@Override
	public List<Commonweal> selectCommonweal() {
		return commonwealDao.selectCommonweal();
	}

	@Override
	public void deleteCommonweal(int id) {
		commonwealDao.deleteCommonweal(id);
	}

	@Override
	public Commonweal findbyid(int id) {
		
		return commonwealDao.findbyid(id);
	}
}
