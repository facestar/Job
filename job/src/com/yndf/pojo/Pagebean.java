package com.yndf.pojo;

import java.util.List;

import org.springframework.stereotype.Component;
@Component("pagebean")
public class Pagebean<L>//<L>����
{
	private int nowpage;//��ǰҳ
	private int pagesize;//ÿҳ��ʾ���ټ�¼��(������¼)
	private int allcount;//���ݿ��е����м�¼��
	private int allpage;//��ҳ��
	private List<L> list;//ÿҳ��ʾ������
	public int getNowpage() {
		return nowpage;
	}
	public void setNowpage(int nowpage) {
		this.nowpage = nowpage;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getAllcount() {
		return allcount;
	}
	public void setAllcount(int allcount) {
		this.allcount = allcount;
	}
	public int getAllpage() {
		return allpage;
	}
	public void setAllpage(int allpage) {
		this.allpage = allpage;
	}
	public List<L> getList() {
		return list;
	}
	public void setList(List<L> list) {
		this.list = list;
	}
}
