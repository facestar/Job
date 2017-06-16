package com.yndf.pojo;
/**
 * 媒体合作实体类
 */
public class Medium {
	private int id;//（媒体ID）
	private String mname;//（媒体名字）
	private String micon;//（媒体图标）
	private String url;//（媒体链接地址）
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMicon() {
		return micon;
	}
	public void setMicon(String micon) {
		this.micon = micon;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	
}
