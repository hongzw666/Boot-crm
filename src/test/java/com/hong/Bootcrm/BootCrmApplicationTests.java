package com.hong.Bootcrm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hong.Bootcrm.pojo.User;
import com.hong.Bootcrm.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootCrmApplicationTests {
	@Autowired
	UserService userService1;

	
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
}
