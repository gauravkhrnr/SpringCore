package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class AppConfig {

	
	@Autowired
	Employee emploee;
//	@Bean(name="emp")
//	public Employee getEmployee() {
//		
//		return new Employee();
//	}
}
