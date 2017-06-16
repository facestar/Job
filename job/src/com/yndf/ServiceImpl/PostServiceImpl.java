package com.yndf.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;



import com.yndf.Dao.PostDao;
import com.yndf.Service.PostService;
import com.yndf.pojo.Information;
import com.yndf.pojo.Pagebean;
import com.yndf.pojo.Post;

@Service("postservice")
public class PostServiceImpl implements PostService {
	@Resource(name="postdao")
    private PostDao postdao;
	@Resource(name="pagebean")
	Pagebean<Post> pagebean;
	@Override
	public void postadd(Post post) {
		// �������
		
      postdao.addpost(post);
      	
	}
    @Override
	public List postfindall_user()
	{
	    return postdao.findallpost_user(); 
	}
    @Override
    public Post postfind(int id)
    {
    	return postdao.findpost(id);
    }
    @Override
    public Pagebean<Post> findByPage(int nowpage,int allpage)
    {
    	pagebean.setNowpage(nowpage);//��ǰҳ
		int pagesize=6;
		pagebean.setPagesize(pagesize);//ÿҳ��ʾ������
		pagebean.setAllcount(postdao.postfindcount());//�ܼ�¼��
		pagebean.setAllpage(postdao.postfindcount()/pagesize);//��ҳ��
		System.out.println(postdao.postfindcount());
		if(allpage==1)
		{
			if(postdao.postfindcount()%pagesize==0)
			{
				int begin=(postdao.postfindcount()/pagesize-1)*pagesize;
				List<Post> list=postdao.postfindBypage(begin, pagesize);
				pagebean.setList(list);
				return pagebean;
			}
			else
			
			{
			int begin=(postdao.postfindcount()/pagesize)*pagesize;
			List<Post> list=postdao.postfindBypage(begin, pagesize);
			pagebean.setList(list);
			return pagebean;
			}
		}
		else
		{
		int begin=(nowpage-1)*pagesize;
		List<Post> list=postdao.postfindBypage(begin, pagesize);
		pagebean.setList(list);
		return pagebean;
		}
    }
	@Override
	public List<Post> findPost() {
		return postdao.findpost();
	}
	@Override
	public void delPost(int id) {
		postdao.delPost(id);
	}
	@Override
	public List findInform(int uid) {
		return postdao.findInform(uid);
		
	}
	@Override
	public void informdelete(int id) {
		postdao.delinform(id);
		
	}
	@Override
	public List<Information> findif() {
		
		return postdao.findif();
	}
	@Override
	public void deleteif(int id) {
		postdao.deleteif(id);
		
	}
}
