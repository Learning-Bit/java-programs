package com.kd.encapsulation;

import java.util.Scanner;

public class DogMainClass {

	public static void main(String[] args) {
		
		DogClass dc = new DogClass(null, null, 0, null);
		System.out.println("Name = "+dc.getName());
		System.out.println("Color = "+dc.getColor());
		System.out.println("Age = "+dc.getAge());
		System.out.println("Breed = "+dc.getBreed());
		System.out.println("--------");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name = ");
		String name = scan.next();
		System.out.print("Enter the color = ");
		String color = scan.next();
		System.out.print("Enter the age = ");
		int age = scan.nextInt();
		System.out.print("Enter the breed = ");
		String breed = scan.next();
		dc.setName(name);
		dc.setColor(color);
		dc.setAge(age);
		dc.setBreed(breed);
		System.out.println("Name = "+dc.getName());
		System.out.println("Color = "+dc.getColor());
		System.out.println("Age = "+dc.getAge());
		System.out.println("Breed = "+dc.getBreed());
		System.out.println("--------");
		
//		close the scanner
		scan.close();
		
	}

}
