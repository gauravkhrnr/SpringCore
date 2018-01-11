package com.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiredP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = (Employee)context.getBean(Employee.class);
		employee.display();
	}

}
