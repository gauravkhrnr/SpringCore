package com.pack;

public class Employee {

	private String name;
	
	public Employee(String name) {
		
		System.out.println("Initialise");
		this.name = name;
	}
	public void display() {
		
		System.out.println(name);
	}
}
