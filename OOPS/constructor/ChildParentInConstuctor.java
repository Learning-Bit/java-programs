package com.kd.constructor;

public class ChildParentInConstuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child("priya",22);
		System.out.println("Main class constructor ");
		System.out.println("name = "+c.name);
		System.out.println("age = "+c.age);

	}

}
