package com.pack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pack.Employee;

@Configuration
public class AppCongig {

	@Bean("emp")
	public Employee getEmployee() {
		
		return new Employee(); 
	}
}
