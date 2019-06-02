package com.hong.Bootcrm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hong.Bootcrm.mapper.UserMapper;
import com.hong.Bootcrm.pojo.User;
import com.hong.Bootcrm.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int addUser(User user) {
		System.out.println(this.userMapper);
		return this.userMapper.addUser(user);
	}

}
