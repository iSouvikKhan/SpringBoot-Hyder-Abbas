package com.telusko.service;

import java.util.List;

import com.telusko.model.cx.Customer;
import com.telusko.model.pd.Product;

public interface ICustomerProductService 
{
	
	List<Customer> getAllCx();
	
	List<Product> getAllProducts();

}
