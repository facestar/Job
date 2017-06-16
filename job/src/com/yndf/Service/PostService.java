package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Information;
import com.yndf.pojo.Pagebean;
import com.yndf.pojo.Post;



public interface PostService {
	
	public void postadd(Post post);//�û��������
	public List postfindall_user();//��ѯ��������
	public Post postfind(int id);//��ѯ����
	public Pagebean<Post> findByPage(int nowpage,int allpage);//��ҳ
	public List<Post> findPost();
	public void delPost(int id);
	public List findInform(int uid);//��֪ͨ
	public void informdelete(int id);
	public List<Information> findif();//����ҵ֪ͨ
	public void deleteif(int id);

}
