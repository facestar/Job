package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Reply;



public interface ReplyService {
	public void replyadd(Reply reply);//��ӻظ�
	public List<Reply> findreply(int id);//����postid��ظ�
	public void deletePost(int id);
}
