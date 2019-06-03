package com.hong.Bootcrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hong.Bootcrm.pojo.SysUser;
import com.hong.Bootcrm.service.SysUserService;

@Controller
public class SysUserController {
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/tologin")
	public String tologin() {
		return "html/login.html";
	} 
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST )
	@ResponseBody
	public String login(String userCode,String userPassword) {
		
		SysUser findUser = sysUserService.findUser(userCode,userPassword);
		if (findUser!=null) {
			return "ok.html";
		}
		
		return "的酒叟放假的";
	} 
}
