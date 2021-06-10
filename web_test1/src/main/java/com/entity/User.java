package com.entity;

public class User {
	public User(String user_name, String pwd) {
		super();
		this.user_name = user_name;
		this.pwd = pwd;
	}
	private String user_name;
	private String pwd;
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
