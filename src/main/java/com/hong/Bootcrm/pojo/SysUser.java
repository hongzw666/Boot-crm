package com.hong.Bootcrm.pojo;

public class SysUser {

	private int user_id;
	private String user_code;
	private String user_name;
	private String user_password;
	private int user_state;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_code() {
		return user_code;
	}

	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public int getUser_state() {
		return user_state;
	}

	public void setUser_state(int user_state) {
		this.user_state = user_state;
	}

	@Override
	public String toString() {
		return "SysUser [user_id=" + user_id + ", userCode=" + user_code + ", user_name=" + user_name
				+ ", user_password=" + user_password + ", user_state=" + user_state + "]";
	}

}
