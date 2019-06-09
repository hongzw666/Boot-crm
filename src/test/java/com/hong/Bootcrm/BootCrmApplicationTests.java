package com.hong.Bootcrm;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hong.Bootcrm.mapper.CustomerMapper;
import com.hong.Bootcrm.mapper.SysUserMapper;
import com.hong.Bootcrm.pojo.Customer;
import com.hong.Bootcrm.pojo.SysUser;
import com.hong.Bootcrm.pojo.User;
import com.hong.Bootcrm.service.CustomerService;
import com.hong.Bootcrm.service.SysUserService;
import com.hong.Bootcrm.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootCrmApplicationTests {
	@Autowired
	UserService userService1;
	@Autowired
	SysUserService sysUserService;
	@Autowired
	CustomerService customerService;
	@Autowired
	CustomerMapper customerMapper;


	@Test
	public void contextLoads() {

	}

	@Test
	public void aaa() {
		User user = new User();
		user.setUsername("av");
		user.setPassword("aa");
		userService1.addUser(user);
	}

	@Test
	public void finTUser() {
		SysUser findServiceUser = sysUserService.findUser("a", "c");
		System.out.println(findServiceUser);
	}

	@Test
	public void findAllUser() {
		List<SysUser> findAllUser = sysUserService.findAllUser();
		for (SysUser sysUser : findAllUser) {
			System.out.println(sysUser);
		}
	}
	
	@Test
	public void addCustomer() {
		
		Customer customer = new Customer("springboot中", 667, 668, "110", "112", "119", "springcloud", "400-6666666", "13300001111", "100866", "广州科贸", "2019-06-05 10:32:03");
		
		customerService.addCustomer(customer);
		
	}
	
	@Test
	public void findUser() {
		Customer customer = new Customer("1", 1,1, "1", "1", "1", "1", "1", "1", "1", "1",
							  "2019-06-09 15:24:33");
							 
		
		List<Customer> selectCustomerList = customerMapper.selectCustomerList(customer);
		for (Customer customer2 : selectCustomerList) {
			System.out.println(customer2);
		}
		
	}
		
	
	
	
}
