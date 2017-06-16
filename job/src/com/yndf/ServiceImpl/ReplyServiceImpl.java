package com.yndf.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yndf.Dao.ReplyDao;
import com.yndf.Service.ReplyService;
import com.yndf.pojo.Reply;
@Service("replyservice")
public class ReplyServiceImpl implements ReplyService {
@Resource(name="replydao")
private ReplyDao replydao;
	@Override
	public void replyadd(Reply reply) {
		// TODO Auto-generated method stub
    replydao.addReply(reply);
	}
	@Override
  public List<Reply> findreply(int id)
  {
	return  replydao.replyfind(id);
  }
	@Override
	public void deletePost(int id) {
		replydao.deletePost(id);
		
	}



}
