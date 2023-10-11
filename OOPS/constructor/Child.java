package com.kd.constructor;

public class Child extends Parent {
	String name ;
	int age;
	
	public Child() {
		this("dummy");
		System.out.println("child with no-arg constructor");
	}
	

	public Child(String name) {
		this("dum",23);
		System.out.println("child with string arg constructor");

		this.name = name;
	}

	
	public Child(int age) {
		this();
		System.out.println("child with int arg constructor");

		this.age = age;
	}


	public Child(String name, int age) {
		super(name,age);
		System.out.println("child with 2-arg constructor");
		System.out.println("-----before ------");
		System.out.println("name = "+this.name);
		System.out.println("age = "+this.age);
		this.name = name;
		this.age = age;
		System.out.println("----- after ------");

		System.out.println("name = "+this.name);
		System.out.println("age = "+this.age);
	}
	
	
}
