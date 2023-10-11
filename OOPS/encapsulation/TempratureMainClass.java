package com.kd.encapsulation;

import java.util.Scanner;

public class TempratureMainClass {

	public static void main(String[] args) {
//		to get the input form the user
		Temprature t1 = new Temprature();
		System.out.println("Temprature = "+t1.getTemprature());
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the temprature = ");
		int temprature = scanner.nextInt();
		t1.setTemprature(temprature);
		System.out.println("Temprature = "+t1.getTemprature());
// close the resource
		scanner.close();
	}

}
