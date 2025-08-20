package com.telusko.aspect;

import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AlienAOP 
{

//	@Before(value="execution(* com.telusko.rest.*.*(..))")
	@Before(value="execution(* com.telusko.rest.AlienController.*(..))")
	public void beforeAdvice(JoinPoint joinPoint)
	{
		System.out.println("Request Made to "+ joinPoint.getSignature()+ " at "+ LocalTime.now());
	}
	
	@After(value="execution(* com.telusko.rest.AlienController.*(..))")
	public void afterAdvice(JoinPoint joinPoint)
	{
		System.out.println("Request Made to "+ joinPoint.getSignature()+ " at "+ LocalTime.now());
	}
	
	@Before(value="execution(* com.telusko.service.AlienService.*(..))")
	public void beforeAdviceService(JoinPoint joinPoint)
	{
		System.out.println("Request Made to "+ joinPoint.getSignature()+ " at "+ LocalTime.now());
	}
	
	@After(value="execution(* com.telusko..service.AlienService.*(..))")
	public void afterAdviceService(JoinPoint joinPoint)
	{
		System.out.println("Request Made to "+ joinPoint.getSignature()+ " at "+ LocalTime.now());
	}
	
}
