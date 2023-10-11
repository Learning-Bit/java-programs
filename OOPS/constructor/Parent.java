package com.kd.constructor;

public class Parent {
	String name ;
	int age;
	
	public Parent() {
		
		super();
		System.out.println("parent with no-arg consturctor");
	}

	public Parent(String name, int age) {
		super();
		System.out.println("parent with 2-arg consturctor");

		this.name = name;
		this.age = age;
		System.out.println("name = "+this.name);
		System.out.println("age = "+this.age);
	}
	
}
