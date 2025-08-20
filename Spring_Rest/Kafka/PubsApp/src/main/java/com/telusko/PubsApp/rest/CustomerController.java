package com.telusko.PubsApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.PubsApp.model.Customer;
import com.telusko.PubsApp.service.KafkaService;

@RestController
public class CustomerController {

	@Autowired
	private KafkaService service;
	
	@PostMapping("/addcx")
	public String addCx(@RequestBody Customer cx)
	{
		return service.addCxMessage(cx);
	}
}
