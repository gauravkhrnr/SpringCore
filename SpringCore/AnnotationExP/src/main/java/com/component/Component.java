package com.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Component {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	//	Employee employee = context.getBean(Employee.class);
	//	employee.display();
	}
}
