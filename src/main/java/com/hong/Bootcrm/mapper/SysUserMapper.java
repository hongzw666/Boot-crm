package com.hong.Bootcrm.mapper;

import org.apache.ibatis.annotations.Param;

import com.hong.Bootcrm.pojo.SysUser;

public interface SysUserMapper {

	public SysUser findUser(@Param("userCode") String userCode, @Param("userPassword") String userPassword);

}
