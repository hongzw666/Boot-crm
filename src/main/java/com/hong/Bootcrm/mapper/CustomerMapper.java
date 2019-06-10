package com.hong.Bootcrm.mapper;

import java.util.List;

import com.hong.Bootcrm.pojo.Customer;

public interface CustomerMapper {

	public List<Customer> selectCustomerList(Customer customer);

	public Integer selectCustomerListCount(Customer customer);
	
	public int addCustomer(Customer customer);

	public int deleteCustomer(Integer id);
	
<<<<<<< HEAD
	public Customer getCustomer(Integer id);
	
=======
>>>>>>> branch 'master' of https://github.com/hongzw666/Boot-crm.git
	public int UpdateCustomer(Customer customer);
	
}
