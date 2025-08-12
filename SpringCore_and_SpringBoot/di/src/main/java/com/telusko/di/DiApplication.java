package com.telusko.di;

import com.telusko.di.services.Greetings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext container = SpringApplication.run(DiApplication.class, args);

		int count = container.getBeanDefinitionCount();
		System.out.println("Bean definition count " + count);

		Greetings service = container.getBean(Greetings.class);

		System.out.println(service.generateGreetings("Souvik"));
	}

}
