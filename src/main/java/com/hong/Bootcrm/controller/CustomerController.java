package com.hong.Bootcrm.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hong.Bootcrm.pojo.BaseDict;
import com.hong.Bootcrm.pojo.Customer;
import com.hong.Bootcrm.pojo.SysUser;
import com.hong.Bootcrm.service.BaseDictService;
import com.hong.Bootcrm.service.CustomerService;
import com.hong.Bootcrm.utils.Page;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private BaseDictService baseDictService;
	// 客户来源
	@Value("${customer.from.type}")
	private String FROM_TYPE;
	// 客户所属行业
	@Value("${customer.industry.type}")
	private String INDUSTRY_TYPE;
	// 客户级别
	@Value("${customer.level.type}")
	private String LEVEL_TYPE;

	/**
	 * 客户列表
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer rows,
			String custName, String custSource, String custIndustry, String custLevel, Model model) {
		Page<Customer> customers = customerService.findCustomerList(page, rows, custName, custSource, custIndustry,
				custLevel);
		model.addAttribute("page", customers);
		// 客户来源
		List<BaseDict> fromType = baseDictService.findBaseDictByTypeCode(FROM_TYPE);
		// 客户所属行业
		List<BaseDict> industryType = baseDictService.findBaseDictByTypeCode(INDUSTRY_TYPE);
		// 客户级别
		List<BaseDict> levelType = baseDictService.findBaseDictByTypeCode(LEVEL_TYPE);
		// 添加参数
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		model.addAttribute("custName", custName);
		model.addAttribute("custSource", custSource);
		model.addAttribute("custIndustry", custIndustry);
		model.addAttribute("custLevel", custLevel);
		return "customer";
	}

	// 添加客户
	@RequestMapping("/customer/create")
	@ResponseBody
	public String customerCreate(Customer customer, HttpSession session) {

		SysUser sysUser = (SysUser) session.getAttribute("USER_SESSION");
		customer.setCust_create_id(sysUser.getUser_id());

		Date date = new Date();
		Timestamp timestamp = new Timestamp(date.getTime());
		customer.setCust_createtime(timestamp);
		int a = 0;
		if (customer != null) {
			a = customerService.addCustomer(customer);
		}
		
		if (a > 0) {
			System.out.println("大师傅似的犯得上发射点");
			return "OK";
		} else {
			return "F";
		}
	}

}
