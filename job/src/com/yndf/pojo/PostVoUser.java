package com.yndf.pojo;


public class PostVoUser
{
	private int id;//（发帖ID）（主键）
	private String ptitle;//（标题）
	private String pcontent;//（内容）
	private String uname;//发表作者
	
	public PostVoUser()
	{
		super();
	}
	public PostVoUser(int id, String ptitle, String pcontent, String uname)
	{
		super();
		this.id = id;
		this.ptitle = ptitle;
		this.pcontent = pcontent;
		this.uname = uname;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getPtitle()
	{
		return ptitle;
	}
	public void setPtitle(String ptitle)
	{
		this.ptitle = ptitle;
	}
	public String getPcontent()
	{
		return pcontent;
	}
	public void setPcontent(String pcontent)
	{
		this.pcontent = pcontent;
	}
	
	public String getUname()
	{
		return uname;
	}
	public void setUname(String uname)
	{
		this.uname = uname;
	}
	
}
