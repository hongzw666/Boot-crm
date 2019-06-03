package com.hong.Bootcrm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hong.Bootcrm.pojo.SysUser;
import com.hong.Bootcrm.pojo.User;
import com.hong.Bootcrm.service.SysUserService;
import com.hong.Bootcrm.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootCrmApplicationTests {
	@Autowired
	UserService userService1;
	@Autowired
	SysUserService sysUserService;
	
	@Test
	public void contextLoads() {
	}
	@Test
	public void aaa() {
		User user = new User();
		user.setUsername("aa");
		user.setPassword("aa");
		userService1.addUser(user);
	}
	@Test
	public void finUser() {
		SysUser findUser = sysUserService.findUser("1","1");
		System.out.println(findUser);
	}
}
