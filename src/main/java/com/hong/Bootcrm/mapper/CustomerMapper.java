package com.hong.Bootcrm.mapper;

import java.util.List;

import com.hong.Bootcrm.pojo.Customer;

public interface CustomerMapper {

	public List<Customer> selectCustomerList(Customer customer);

	public Integer selectCustomerListCount(Customer customer);

}