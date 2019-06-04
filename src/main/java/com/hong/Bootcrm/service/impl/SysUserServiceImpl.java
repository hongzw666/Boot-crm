package com.hong.Bootcrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hong.Bootcrm.mapper.SysUserMapper;
import com.hong.Bootcrm.pojo.SysUser;
import com.hong.Bootcrm.service.SysUserService;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService{
	@Autowired
	private SysUserMapper sysUserMapper;
	@Override
	public SysUser findUser(String userCode, String userPassword) {
		SysUser sysUser = sysUserMapper.findUser(userCode, userPassword);
		return sysUser;
	}
	@Override
	public List<SysUser> findAllUser() {
		List<SysUser> findAllUser = sysUserMapper.findAllUser();
		return findAllUser;
	}
}
