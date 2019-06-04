package com.hong.Bootcrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hong.Bootcrm.pojo.SysUser;
import com.hong.Bootcrm.service.SysUserService;
import com.hong.Bootcrm.service.impl.SysUserServiceImpl;


@SpringBootApplication
@MapperScan("com.hong.Bootcrm.mapper")
public class BootCrmApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootCrmApplication.class, args);

		

	}
}
