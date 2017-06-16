package com.yndf.Dao;

import java.util.List;

import com.yndf.pojo.Reply;

public interface ReplyDao {
	 public void addReply(Reply reply);
	 
	  public List<Reply> replyfind(int id);

	public void deletePost(int id);
	  
}
