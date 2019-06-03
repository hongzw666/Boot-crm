package com.hong.Bootcrm.service;

import com.hong.Bootcrm.pojo.SysUser;

public interface SysUserService {
	public SysUser findUser(String usercode,String password);

	//public SysUser findUser(SysUser user);
}
