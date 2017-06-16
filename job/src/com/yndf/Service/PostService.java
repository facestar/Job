package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Information;
import com.yndf.pojo.Pagebean;
import com.yndf.pojo.Post;



public interface PostService {
	
	public void postadd(Post post);//用户添加帖子
	public List postfindall_user();//查询所有帖子
	public Post postfind(int id);//查询帖子
	public Pagebean<Post> findByPage(int nowpage,int allpage);//分页
	public List<Post> findPost();
	public void delPost(int id);
	public List findInform(int uid);//查通知
	public void informdelete(int id);
	public List<Information> findif();//查企业通知
	public void deleteif(int id);

}
