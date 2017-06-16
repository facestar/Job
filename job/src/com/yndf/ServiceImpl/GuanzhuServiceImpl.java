package com.yndf.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;






import org.springframework.stereotype.Service;

import com.yndf.Dao.GuanzhuDao;
import com.yndf.Service.GuanzhuService;
import com.yndf.pojo.Guanzhu;
import com.yndf.pojo.Pinlun;
@Service("guanzhuservice")
public class GuanzhuServiceImpl implements GuanzhuService
{
	@Resource(name="guanzhudao")
	private GuanzhuDao guanzhudao;
	//添加关注
	public void addguanzhu(Guanzhu guanzhu)
	{
		guanzhudao.addguanzhu(guanzhu);

	}

	//根据用户Id和企业ID查询报名
	public Guanzhu findBy2ID(int uid, int cid)
	{
		
		return guanzhudao.findBy2ID(uid,cid);
	}
	
	//删除此关注
	public void delgz(Guanzhu guanzhu)
	{
		guanzhudao.delgz(guanzhu);
	}

	//添加评论
	public void addpingl(Pinlun pl)
	{
		guanzhudao.addpingl(pl);
		
	}

	//根据用户Id和兼职ID查询评论
	public Pinlun findBytID(int uid, int cid)
	{
		
		return guanzhudao.findBytid(uid, cid);
	}

	//根据企业id查询到该企业所有的评论
	public List<Guanzhu> findall()
	{
		return guanzhudao.findall();
	}

	//查询数量
	public int postfindcount(int company_id)
	{
		return guanzhudao.postfindcount(company_id);
	}

	//根据workid查询到所有
	public List<Guanzhu> findBywid(int wid)
	{
		return guanzhudao.findBywid(wid);
	}

	//根据企业id查询到该企业所有的评论
	public List<Pinlun> findBysywID(int cid)
	{
		return guanzhudao.findBysywID(cid);
	}

	@Override
	public void deleteGuanzhu(int id) {
		guanzhudao.deleteGuanzhu(id);
	}

	@Override
	public List<Guanzhu> findByid(int user_id) {
		
		return guanzhudao.findByid(user_id);
	}

}
