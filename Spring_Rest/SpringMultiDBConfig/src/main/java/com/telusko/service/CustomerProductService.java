package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.model.cx.Customer;
import com.telusko.model.pd.Product;
import com.telusko.repo.cx.ICustomerRepo;
import com.telusko.repo.pd.IProductRepo;

@Service
public class CustomerProductService implements ICustomerProductService
{
	@Autowired
	private ICustomerRepo repo1;
	
	@Autowired
	private IProductRepo repo2;

	@Override
	public List<Customer> getAllCx() {
		
		return repo1.findAll();
	}

	@Override
	public List<Product> getAllProducts() {
		
		return repo2.findAll();
	}

}
