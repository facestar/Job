package com.yndf.pojo;

import java.sql.Timestamp;

public class Inform {
 private int id;
 private int company_id;
 private int user_id;
 private String icontent;
 private Timestamp itime;
public int getId() {
	return id;
}
public Timestamp getItime() {
	return itime;
}
public void setItime(Timestamp itime) {
	this.itime = itime;
}
public void setId(int id) {
	this.id = id;
}
public int getCompany_id() {
	return company_id;
}
public void setCompany_id(int company_id) {
	this.company_id = company_id;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getIcontent() {
	return icontent;
}
public void setIcontent(String icontent) {
	this.icontent = icontent;
}

 
}
