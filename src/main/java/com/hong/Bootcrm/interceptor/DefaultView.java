package com.hong.Bootcrm.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class DefaultView implements WebMvcConfigurer{
	@Autowired 
	private LoginInterceptor loginInterceptor;
	static boolean flag = false;
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("login");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
		flag = true; 
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginInterceptor)
		.addPathPatterns("/**").excludePathPatterns("/list","/logout","/getCustomerById","/update","/success","/zc","/delete","/create","/tologin","/login","/css/**","/js/**","/fonts/**","/images/**");
	}
}
