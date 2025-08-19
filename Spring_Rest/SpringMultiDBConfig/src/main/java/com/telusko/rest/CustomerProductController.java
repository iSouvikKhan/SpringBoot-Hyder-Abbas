package com.telusko.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.cx.Customer;
import com.telusko.model.pd.Product;
import com.telusko.service.ICustomerProductService;

@RestController
public class CustomerProductController 
{

	@Autowired
	private ICustomerProductService service;
	
	@GetMapping("/get-cx")
	public ResponseEntity<List> getAllCxInfo()
	{
		List<Customer> cx = service.getAllCx();
		return new ResponseEntity<List>(cx, HttpStatus.OK);
	}
	
	@GetMapping("/get-products")
	public ResponseEntity<List> getAllProductInfo()
	{
		List<Product> pd = service.getAllProducts();
		return new ResponseEntity<List>(pd, HttpStatus.OK);
	}
}
