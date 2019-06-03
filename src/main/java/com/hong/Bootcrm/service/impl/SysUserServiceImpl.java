package com.hong.Bootcrm.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hong.Bootcrm.pojo.SysUser;
import com.hong.Bootcrm.service.SysUserService;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService{

	@Override
	public SysUser findUser(String usercode, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
