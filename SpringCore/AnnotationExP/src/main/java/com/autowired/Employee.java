package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	//@Autowired
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
