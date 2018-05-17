package com.example.demo.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class User {
	private int userID;
	private String name;
	/*
	 * 需要在@configuration中设置json配置
	 */
	@JSONField(format="yyyy-MM-dd")
	private Date birthday;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
