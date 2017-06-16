package com.yndf.ServiceImpl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;





import com.yndf.Dao.AdminDao;
/**
 * ����Աservice��ʵ����
 */
import com.yndf.Service.AdminService;
import com.yndf.pojo.Admin;
import com.yndf.pojo.Money;
@Service("adminservice")
public class AdminServiceImpl implements AdminService {
	@Resource(name="admindao")
	private AdminDao adminDao;
	@Override
	public Admin login(Admin admin) {
		
		return adminDao.login(admin);
	}
	@Override
	public List<Money> selectm()
	{
		return adminDao.selectm();
	}
	//����˾��Ǯ
	public void addmoney(Money money)
	{
		adminDao.addmoney(money);
		
	}
	@Override
	public void updatemoney(Money money)
	{
		adminDao.updatemoney(money);
		
	}

}
