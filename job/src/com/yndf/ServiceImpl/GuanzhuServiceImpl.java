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
	//��ӹ�ע
	public void addguanzhu(Guanzhu guanzhu)
	{
		guanzhudao.addguanzhu(guanzhu);

	}

	//�����û�Id����ҵID��ѯ����
	public Guanzhu findBy2ID(int uid, int cid)
	{
		
		return guanzhudao.findBy2ID(uid,cid);
	}
	
	//ɾ���˹�ע
	public void delgz(Guanzhu guanzhu)
	{
		guanzhudao.delgz(guanzhu);
	}

	//�������
	public void addpingl(Pinlun pl)
	{
		guanzhudao.addpingl(pl);
		
	}

	//�����û�Id�ͼ�ְID��ѯ����
	public Pinlun findBytID(int uid, int cid)
	{
		
		return guanzhudao.findBytid(uid, cid);
	}

	//������ҵid��ѯ������ҵ���е�����
	public List<Guanzhu> findall()
	{
		return guanzhudao.findall();
	}

	//��ѯ����
	public int postfindcount(int company_id)
	{
		return guanzhudao.postfindcount(company_id);
	}

	//����workid��ѯ������
	public List<Guanzhu> findBywid(int wid)
	{
		return guanzhudao.findBywid(wid);
	}

	//������ҵid��ѯ������ҵ���е�����
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
