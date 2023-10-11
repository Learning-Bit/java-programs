package com.kd.constructor.constructorchaining;

public class Student {
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student() {
		// and class the constructor with 2 arugument constructor
		this("priya",12);

	}
}
