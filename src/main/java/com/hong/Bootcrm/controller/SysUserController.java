package com.hong.Bootcrm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hong.Bootcrm.pojo.SysUser;
import com.hong.Bootcrm.service.SysUserService;

@Controller
public class SysUserController {
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestBody SysUser user) {
		
		SysUser findUser = sysUserService.findUser( user.getUserCode(),user.getUserPassword());
		if (findUser!=null) {
			return "ok.html";
		}
		
		return "的酒叟放假的";
	} 
}
