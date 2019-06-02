package com.hong.Bootcrm.mapper;

import org.apache.ibatis.annotations.Insert;

import com.hong.Bootcrm.pojo.User;

public interface UserMapper {
	@Insert("insert into user(username,password) values(#{username},#{password})")
	public int addUser(User user);
	
}
