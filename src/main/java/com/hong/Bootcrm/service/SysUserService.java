package com.hong.Bootcrm.service;

import java.util.List;

import com.hong.Bootcrm.pojo.SysUser;

public interface SysUserService {
	public SysUser findUser(String userCode,String userPassword);
	public List<SysUser> findAllUser();
	//public SysUser findUser(SysUser user);
	public int insertUser(String user_code, String user_name, String user_password);
}
