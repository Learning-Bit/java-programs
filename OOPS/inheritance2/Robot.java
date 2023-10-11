package com.kd.inheritance2;

import java.util.Scanner;

public class Robot {
	Scanner scan = new Scanner(System.in);
	String name = scan.next();
	
	String type = scan.next();
	public void walk() {
		System.out.println("I can walk...");
	}
	public void  talk() {
		System.out.println("I can talk...");
	}
	public void charge() {
		System.out.println("I can charging myself...");
	}
	
}
