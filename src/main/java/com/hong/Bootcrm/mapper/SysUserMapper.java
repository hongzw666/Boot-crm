package com.hong.Bootcrm.mapper;

import java.util.List;

import com.hong.Bootcrm.pojo.SysUser;

public interface SysUserMapper {

	public SysUser findUser(String userCode, String userPassword);
	public List<SysUser> findAllUser();
	public int insertUser(String user_code, String user_name, String user_password);

}
