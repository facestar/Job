package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Reply;



public interface ReplyService {
	public void replyadd(Reply reply);//添加回复
	public List<Reply> findreply(int id);//根据postid查回复
	public void deletePost(int id);
}
