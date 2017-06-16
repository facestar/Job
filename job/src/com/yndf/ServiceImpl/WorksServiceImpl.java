package com.yndf.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yndf.Dao.WorksDao;
import com.yndf.Service.WorksService;
import com.yndf.pojo.Company;
import com.yndf.pojo.Information;
import com.yndf.pojo.Pagebean;
import com.yndf.pojo.Post;
import com.yndf.pojo.Work;

@Service("workservice")
public class WorksServiceImpl implements WorksService
{

	@Resource(name="worksdao")
	private WorksDao workdao;
	@Resource(name="pagebean")
	Pagebean<Work> pagebean;
	//��Ӽ�ְ
	public void addwork(Work work)
	{
		workdao.addwork(work);

	}
	@Override
	public List<Work> findallwork() {
	
		return workdao.findallwork();
	}

	@Override
	public Pagebean<Work> findwtypeandwsex(int page,String wtype,String wsex) {
		pagebean.setNowpage(page);//��ǰҳ
		int pagesize=16;
		pagebean.setPagesize(pagesize);//ÿҳ��ʾ������
		pagebean.setAllcount(workdao.wtypeandwsexfindcount(wtype, wsex));//�ܼ�¼��
	
		if(pagesize>=workdao.wtypeandwsexfindcount(wtype, wsex)){
			pagebean.setAllpage(1);
			int begin=pagesize*(page<1?1:page-1);
			List<Work> list=workdao.findwtypeandwsex(begin, pagesize, wtype, wsex);
			pagebean.setList(list);
			return pagebean;
		}
		pagebean.setAllpage(workdao.wtypeandwsexfindcount(wtype, wsex)%pagesize==0?workdao.wtypeandwsexfindcount(wtype, wsex)/pagesize:(workdao.wtypeandwsexfindcount(wtype, wsex)/pagesize)+1);//��ҳ��
		int begin=pagesize*(page<1?1:page-1);
		List<Work> list=workdao.findwtypeandwsex(begin, pagesize, wtype, wsex);
		pagebean.setList(list);
		return pagebean;
	}
	
	@Override
	public Pagebean<Work> findbegindate(int page,String begindate) {
		pagebean.setNowpage(page);//��ǰҳ
		int pagesize=16;
		pagebean.setPagesize(pagesize);//ÿҳ��ʾ������
		pagebean.setAllcount(workdao.begindatefindcount(begindate));//�ܼ�¼��
		System.out.println(workdao.begindatefindcount(begindate));
		if(pagesize>=workdao.begindatefindcount(begindate)){
			pagebean.setAllpage(1);
			int begin=pagesize*(page<1?1:page-1);
			List<Work> list=workdao.findbegindate(begin, pagesize, begindate);
			pagebean.setList(list);
			return pagebean;
		}
		pagebean.setAllpage(workdao.begindatefindcount(begindate)%pagesize==0?workdao.begindatefindcount(begindate)/pagesize:(workdao.begindatefindcount(begindate)/pagesize)+1);//��ҳ��
		int begin=pagesize*(page<1?1:page-1);
		List<Work> list=workdao.findbegindate(begin, pagesize, begindate);
		pagebean.setList(list);
		return pagebean;
		
	}
	@Override
	public Pagebean<Work> findwtype(int page,String wtype) {
		
		pagebean.setNowpage(page);//��ǰҳ
		int pagesize=16;
		pagebean.setPagesize(pagesize);//ÿҳ��ʾ������
		pagebean.setAllcount(workdao.wtypefindcount(wtype));//�ܼ�¼��
		System.out.println(workdao.wtypefindcount(wtype));
		if(pagesize>=workdao.wtypefindcount(wtype)){
			pagebean.setAllpage(1);
			int begin=pagesize*(page<1?1:page-1);
			List<Work> list=workdao.findwtype(begin, pagesize, wtype);
			pagebean.setList(list);
			return pagebean;
		}
		pagebean.setAllpage(workdao.wtypefindcount(wtype)%pagesize==0?workdao.wtypefindcount(wtype)/pagesize:(workdao.wtypefindcount(wtype)/pagesize)+1);//��ҳ��
		int begin=pagesize*(page<1?1:page-1);
		List<Work> list=workdao.findwtype(begin, pagesize, wtype);
		pagebean.setList(list);
		return pagebean;
		
	}
     /**
      * ����ְ���ͺ����ڲ�ѯ����ѯ������
      */
	@Override
	public Pagebean<Work> findwtypeandbegindate(int page,String wtype, String begindate) {
		pagebean.setNowpage(page);//��ǰҳ
		int pagesize=16;
		pagebean.setPagesize(pagesize);//ÿҳ��ʾ������
		pagebean.setAllcount(workdao.wtypeandbegindatefindcount(wtype, begindate));//�ܼ�¼��
		
		if(pagesize>=workdao.wtypeandwsexfindcount(wtype, begindate)){
			pagebean.setAllpage(1);
			int begin=pagesize*(page<1?1:page-1);
			List<Work> list=workdao.findwtypeandbegindate(begin, pagesize, wtype, begindate);
			pagebean.setList(list);
			return pagebean;
		}
		pagebean.setAllpage(workdao.wtypeandbegindatefindcount(wtype, begindate)%pagesize==0?workdao.wtypeandbegindatefindcount(wtype, begindate)/pagesize:(workdao.wtypeandbegindatefindcount(wtype, begindate)/pagesize)+1);//��ҳ��
		int begin=pagesize*(page<1?1:page-1);
		List<Work> list=workdao.findwtypeandbegindate(begin, pagesize, wtype, begindate);
		pagebean.setList(list);
		return pagebean;}
	/**
     * ���Ա�����ڲ�ѯ����ѯ����������
     */
	@Override
	public Pagebean<Work> findwsexandbegindate(int page,String wsex, String begindate) {
		pagebean.setNowpage(page);//��ǰҳ
		int pagesize=16;
		pagebean.setPagesize(pagesize);//ÿҳ��ʾ������
		pagebean.setAllcount(workdao.wsexandbegindatefindcount(wsex, begindate));//�ܼ�¼��
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(workdao.wsexandbegindatefindcount(wsex, begindate));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		if(pagesize>=workdao.wsexandbegindatefindcount(wsex, begindate)){
			pagebean.setAllpage(1);
			int begin=pagesize*(page<1?1:page-1);
			List<Work> list=workdao.findwsexandbegindate(begin, pagesize, wsex, begindate);
			pagebean.setList(list);
			return pagebean;
		}
		pagebean.setAllpage(workdao.wsexandbegindatefindcount(wsex, begindate)%pagesize==0?workdao.wsexandbegindatefindcount(wsex, begindate)/pagesize:(workdao.wsexandbegindatefindcount(wsex, begindate)/pagesize)+1);//��ҳ��
		int begin=pagesize*(page<1?1:page-1);
		List<Work> list=workdao.findwsexandbegindate(begin, pagesize, wsex, begindate);
		pagebean.setList(list);
		return pagebean;
		
		
		
	}
	@Override
	public Pagebean<Work> findwtypeandwsexandbegindate(int page,String wtype, String wsex, String begindate) {
		pagebean.setNowpage(page);//��ǰҳ
		int pagesize=16;
		pagebean.setPagesize(pagesize);//ÿҳ��ʾ������
		pagebean.setAllcount(workdao.wtypeandwsexandbegindatefindcount(wtype, wsex, begindate));//�ܼ�¼��
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(workdao.wtypeandwsexandbegindatefindcount(wtype, wsex, begindate));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		if(pagesize>=workdao.wtypeandwsexandbegindatefindcount(wtype, wsex, begindate)){
			pagebean.setAllpage(1);
			int begin=pagesize*(page<1?1:page-1);
			List<Work> list=workdao.findwtypeandwsexandbegindate(begin, pagesize, wtype, wsex, begindate);
			pagebean.setList(list);
			return pagebean;
		}
		pagebean.setAllpage(workdao.wtypeandwsexandbegindatefindcount(wtype, wsex, begindate)%pagesize==0?workdao.wtypeandwsexandbegindatefindcount(wtype, wsex, begindate)/pagesize:(workdao.wsexandbegindatefindcount(wsex, begindate)/pagesize)+1);//��ҳ��
		int begin=pagesize*(page<1?1:page-1);
		List<Work> list=workdao.findwtypeandwsexandbegindate(begin, pagesize, wtype, wsex, begindate);
		pagebean.setList(list);
		return pagebean;
	}

	@Override
	public List<Work> findBycom_id(int comId)
	{
		
		return workdao.findBycom_id(comId);
	}

	@Override
	public List<Work> findwtitle(String wtitle) {
		
		return workdao.findwtitle(wtitle);
	}

	@Override
	public void deletework(int id)
	{
		workdao.deletework(id);
		
	}
	//��ְid��ѯ
	@Override
	public Work findbyid(int id) {
		
		return workdao.findbyid(id);
	}
	//��ҳ
	@Override
	public Pagebean<Work> findallfy(int page) {
		
		pagebean.setNowpage(page);//��ǰҳ
		int pagesize=16;
		pagebean.setPagesize(pagesize);//ÿҳ��ʾ������
		pagebean.setAllcount(workdao.workfindcount());//�ܼ�¼��
		if(pagesize>=workdao.workfindcount()){
			pagebean.setAllpage(1);
			int begin=pagesize*(page<1?1:page-1);
			List<Work> list=workdao.findallfy(begin, pagesize);
			pagebean.setList(list);
			return pagebean;
		}
		
		
		pagebean.setAllpage(workdao.workfindcount()%pagesize==0?workdao.workfindcount()/pagesize:(workdao.workfindcount()/pagesize)+1);//��ҳ��
			int begin=pagesize*(page<1?1:page-1);
			List<Work> list=workdao.findallfy(begin, pagesize);
			pagebean.setList(list);
			return pagebean;
	}
	@Override
	public Pagebean<Work> findwsex(int page, String wsex) {
		
		pagebean.setNowpage(page);//��ǰҳ
		int pagesize=16;
		pagebean.setPagesize(pagesize);//ÿҳ��ʾ������
		pagebean.setAllcount(workdao.wsexfindcount(wsex));//�ܼ�¼��
		System.out.println(workdao.wsexfindcount(wsex));
		if(pagesize>=workdao.wsexfindcount(wsex)){
			pagebean.setAllpage(1);
			int begin=pagesize*(page<1?1:page-1);
			List<Work> list=workdao.findwsex(begin, pagesize, wsex);
			pagebean.setList(list);
			return pagebean;
		}
		pagebean.setAllpage(workdao.wsexfindcount(wsex)%pagesize==0?workdao.wsexfindcount(wsex)/pagesize:(workdao.wsexfindcount(wsex)/pagesize)+1);//��ҳ��
		int begin=pagesize*(page<1?1:page-1);
		List<Work> list=workdao.findwsex(begin, pagesize, wsex);
		pagebean.setList(list);
		return pagebean;
	}
	//��ҵ֪ͨ
	public void addav(Information information) {
		workdao.addav(information);
		
	}

	//��ְ�޸�
	public void updatework(Work work)
	{
		workdao.updatework(work);
		
	}

	


}
