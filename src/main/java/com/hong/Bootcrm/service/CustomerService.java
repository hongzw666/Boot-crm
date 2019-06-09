package com.hong.Bootcrm.service;

import com.hong.Bootcrm.pojo.Customer;
import com.hong.Bootcrm.utils.Page;

public interface CustomerService {
	//增加用户
	public int addCustomer(Customer customer);
	//查询用户列表
	public Page<Customer> findCustomerList(Integer page,Integer rows,
			String custName,String custSource,String custIndustry,String custLevel);
}
