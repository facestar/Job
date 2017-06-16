package com.yndf.Dao;

import java.util.List;





import com.yndf.Util.VoInform;
import com.yndf.pojo.Inform;
import com.yndf.pojo.Information;
import com.yndf.pojo.Post;


public interface PostDao {
  public void addpost(Post post);
  public List findallpost_user();
  public Post findpost(int id);
  public int postfindcount();
	public List<Post> postfindBypage(int begin, int pagesize);
	public List<Post> findpost();
	public void delPost(int id);
	public List<VoInform> findInform(int uid);
	public void delinform(int id);
	public List<Information> findif();
	public void deleteif(int id);
}
