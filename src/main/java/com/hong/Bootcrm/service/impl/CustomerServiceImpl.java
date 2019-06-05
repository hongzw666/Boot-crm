package com.hong.Bootcrm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hong.Bootcrm.mapper.CustomerMapper;
import com.hong.Bootcrm.pojo.Customer;
import com.hong.Bootcrm.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public int addCustomer(Customer customer) {
		return customerMapper.addCustomer(customer);
	}

}
