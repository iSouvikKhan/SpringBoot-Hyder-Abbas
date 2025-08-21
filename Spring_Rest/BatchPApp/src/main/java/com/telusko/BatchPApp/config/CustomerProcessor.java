package com.telusko.BatchPApp.config;

import org.springframework.batch.item.ItemProcessor;

import com.telusko.BatchPApp.model.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> 
{

	@Override
	public Customer process(Customer item) throws Exception {
		//logic to process the data //filter
		return item;
	}

}
