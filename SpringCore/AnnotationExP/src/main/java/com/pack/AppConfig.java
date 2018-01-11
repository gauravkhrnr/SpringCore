package com.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

	@Bean("emp")
	@Lazy(value=true)
	public Employee getEmployee() {
		
		return new Employee("Gaurav");
	}
}
