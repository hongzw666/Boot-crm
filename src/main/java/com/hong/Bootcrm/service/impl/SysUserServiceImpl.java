package com.hong.Bootcrm.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hong.Bootcrm.mapper.SysUserMapper;
import com.hong.Bootcrm.pojo.SysUser;
import com.hong.Bootcrm.service.SysUserService;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService{
	private SysUserMapper sysUserMapper;
	@Override
	public SysUser findUser(String usercode, String userpassword) {
		SysUser sysUser = sysUserMapper.findUser(usercode, userpassword);
		return sysUser;
	}

}
