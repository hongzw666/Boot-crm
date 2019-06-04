package com.hong.Bootcrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hong.Bootcrm.pojo.SysUser;
import com.hong.Bootcrm.service.SysUserService;

@Controller
public class SysUserController {
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/tologin")
	public String tologin() {
		return "login.html";
	} 
	
	
	@RequestMapping(value="/login")
	@ResponseBody
	public String login(String userCode,String userPassword) {
		System.out.println(userCode);
		System.out.println(userPassword);
		SysUser findUser = sysUserService.findUser(userCode,userPassword);
		System.out.println(findUser);
		if (findUser != null) {
			return "ok.html";
		}
		
		return "的酒叟放假的";
	} 
}
