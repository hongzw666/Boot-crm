package com.hong.Bootcrm.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hong.Bootcrm.mapper.CustomerMapper;
import com.hong.Bootcrm.pojo.Customer;
import com.hong.Bootcrm.service.CustomerService;
import com.hong.Bootcrm.utils.Page;

@Service("CustomerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	//客户列表
	@Override
	public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource,
			String custIndustry, String custLevel) {
		Customer customer = new Customer();
		if (StringUtils.isNotBlank(custName)) {
			customer.setCust_name(custName);
		}
		if (StringUtils.isNotBlank(custSource)) {
			customer.setCust_source(custSource);
		}
		if (StringUtils.isNotBlank(custIndustry)) {
			customer.setCust_industry(custIndustry);
		}
		if (StringUtils.isNotBlank(custLevel)) {
			customer.setCust_level(custLevel);
		}
		customer.setStart((page-1) * rows);
		customer.setRows(rows);
		List<Customer> customers = customerMapper.selectCustomerList(customer);
		Integer count = customerMapper.selectCustomerListCount(customer);
		Page<Customer> result = new Page<>();
		result.setPage(page);
		result.setRows(customers);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}
	
	//增加用户
	@Override
	public int addCustomer(Customer customer) {
		return customerMapper.addCustomer(customer);
	}
		

	@Override
	public int deleteCustomer(Integer id) {
		
		return customerMapper.deleteCustomer(id);
	}

	@Override
	public Customer getCustomerById(Integer id) {
		
		return customerMapper.getCustomerById(id);
	}

	@Override
	public int updateCustomer(Customer customer) {
		
		return customerMapper.UpdateCustomer(customer);
	}

}
