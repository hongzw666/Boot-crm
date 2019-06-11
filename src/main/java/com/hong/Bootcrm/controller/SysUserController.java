package com.hong.Bootcrm.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hong.Bootcrm.pojo.SysUser;
import com.hong.Bootcrm.service.SysUserService;

@Controller
public class SysUserController {
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/tologin")
	public String tologin() {
		return "login";
	} 
	
	
	@RequestMapping("/login")
	public String login(String usercode,String password,Model model,HttpSession session) {
		System.out.println(usercode);
		System.out.println(password);
		SysUser findUser = sysUserService.findUser(usercode,password);
		System.out.println(findUser);
		if (findUser != null) {
			session.setAttribute("USER_SESSION", findUser);
			return "redirect : list";
		}
		model.addAttribute("msg","账号或密码错误，请重新输入");
		return "login";
	} 
	
	@RequestMapping("/tocustomer")
	public String tocustomer() {
		
		return "customer";
	} 

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect : tologin";
	} 
	
	@RequestMapping("/zc")
	public String tozc() {
		return "register";
	} 
	
	@RequestMapping("/success")
	public String zc(String user_code,String user_name,String uesr_password,Map<String,Object> map) {
		SysUser sysUser=sysUserService.findUser(user_code,uesr_password);
		if(sysUser == null) {
			sysUserService.insertUser( user_code, user_name, uesr_password);
			map.put("msg", "注册成功");
			return "login";
		}
		map.put("msg", "账号已存在，请重新输入！");
		return "register";
		
	}
	
}
