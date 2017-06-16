package com.yndf.ServiceImpl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yndf.Dao.MediumDao;
import com.yndf.Service.MediumService;
import com.yndf.pojo.Medium;
@Service("mediumservice")
public class MediumServiceImpl implements MediumService {
 @Resource(name="mediumdao")
private MediumDao  mediumDao;

	@Override
	public Medium add(Medium medium) {
		return mediumDao.add(medium);
	}

	@Override
	public Medium findname(String mname) {
		
		return 	mediumDao.findmname(mname);
	}

	@Override
	public List<Medium> findAll() {

		return mediumDao.findAll();
	}

	@Override
	public boolean delmedium(int id) {
		
		
		return  mediumDao.del(id);
	}

	@Override
	public Object findById(int id) {
		// TODO Auto-generated method stub
		return  mediumDao.findById(id);
	}

	

	

	

}
