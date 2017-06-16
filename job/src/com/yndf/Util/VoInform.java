package com.yndf.Util;

import java.sql.Timestamp;

public class VoInform
{
	 private int id;
	 private String uname;
	 private String icontent;
	 
	public VoInform()
	{
		super();
	}
	public VoInform(int id, String uname, String icontent)
	{
		super();
		this.id = id;
		this.uname = uname;
		this.icontent = icontent;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getUname()
	{
		return uname;
	}
	public void setUname(String uname)
	{
		this.uname = uname;
	}
	public String getIcontent()
	{
		return icontent;
	}
	public void setIcontent(String icontent)
	{
		this.icontent = icontent;
	}
	 
}
