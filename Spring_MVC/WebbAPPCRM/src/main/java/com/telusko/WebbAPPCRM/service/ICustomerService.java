package com.telusko.WebbAPPCRM.service;

import java.util.List;

import com.telusko.WebbAPPCRM.model.Customer;

public interface ICustomerService 
{
	List<Customer> getCustomerInfo();
	void registerCustomer(Customer customer);
	Customer fetchCustomerById(Integer id);
	void deleteCxRecord(Integer id);

}
