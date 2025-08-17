package com.telusko.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.model.Student;
import com.telusko.service.IGreetingService;

@WebMvcTest(GreetingController.class)
public class GreetingControllerTest 
{
	
	@MockitoBean
	private IGreetingService service;
	
	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
//	@Disabled
	void testGetWish() throws Exception
	{
		//Mocking
		Mockito.when(service.generateGreeting()).thenReturn("Good Morning");
		
		//RequestObject
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/greet");
		ResultActions result = mockMvc.perform(requestBuilder);
		MvcResult mvcResult = result.andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		int statusCode=response.getStatus();
		
		
		//Assertion  --> expectation vs reality
		
		assertEquals(200,statusCode);
	}
	
	@Test
	void testAddStudentInfo() throws Exception
	{
		//mocking
		Mockito.when(service.addStudent(ArgumentMatchers.any())).thenReturn(true);
		
		
		Student st=new Student(1, "Jyothi", "Bengaluru", 22);
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(st);
		//request
		
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/add-stu")
				.contentType(MediaType.APPLICATION_JSON)
				.content(json);
		
		ResultActions result = mockMvc.perform(requestBuilder);
		MvcResult mvcResult = result.andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		int statusCode=response.getStatus();
		
		//assertion
		
		assertEquals(201,statusCode);

	}
	
	

}
