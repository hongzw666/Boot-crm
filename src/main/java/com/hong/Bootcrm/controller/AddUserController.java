package com.hong.Bootcrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hong.Bootcrm.pojo.User;
import com.hong.Bootcrm.service.UserService;
import com.hong.Bootcrm.service.impl.UserServiceImpl;

@Controller
public class AddUserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/toAddUser")
	public String toAddUser() {
		return "login.html";
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "ok";
	}
	
	
}
