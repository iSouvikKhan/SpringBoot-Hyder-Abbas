package com.telusko.PubsApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.telusko.PubsApp.model.Customer;
import com.telusko.PubsApp.util.AppConstants;

@Service
public class KafkaService 
{

	@Autowired
	private KafkaTemplate<String, Customer> kafkaTemplate;
	
	public String addCxMessage(Customer cx)
	{
		kafkaTemplate.send(AppConstants.TOPIC_NAME, cx);
		return "Customer Data Added into Kafka Server";
	}
}
