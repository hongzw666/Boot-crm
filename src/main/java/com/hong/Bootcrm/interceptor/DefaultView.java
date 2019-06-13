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
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/Boot_crm").setViewName("login");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginInterceptor)
		.addPathPatterns("/**").excludePathPatterns("/Boot_crm/list","/Boot_crm/logout","/Boot_crm/success","/Boot_crm/zc","/Boot_crm/tologin","/Boot_crm/login","/Boot_crm/css/**","/Boot_crm/js/**","/Boot_crm/fonts/**","/Boot_crm/images/**");
	}
}
