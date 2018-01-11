package com.component;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Employee {

	private String name = "Gaurav";
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Initialise");
	}
	public Employee(String name) {
		
		System.out.println("Initialise");
		this.name = name;
	}
	public void display() {
		
		System.out.println(name);
	}
}
