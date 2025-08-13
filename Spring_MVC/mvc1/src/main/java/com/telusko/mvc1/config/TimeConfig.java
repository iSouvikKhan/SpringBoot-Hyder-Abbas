package com.telusko.mvc1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class TimeConfig {

    @Bean
    public LocalTime timebean()
    {
        return LocalTime.now();
    }

    // you can directly use LocalTime object but it is not recommended
    // whenever u r using any method from any object it is recommended to make sure that IOC container is aware of that
    // hand over that to IOC container and let IOC container give it to you
    // @Bean annotation handed over the method to IOC container
}
