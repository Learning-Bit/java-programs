package com.kd.encapsulation;

import java.util.Scanner;

public class StudentMainClass {

	public static void main(String[] args) {
		StudentClass sc = new StudentClass(0, null, 0, null);
		System.out.println(" \n Roll Number = "+sc.getRollNumber()+" \n Name = "+sc.getName()+" \n Marks = "+sc.getMarks()+" \n Gender = "+sc.getGender());
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the RollNumber = ");
		int rollNumber = scanner.nextInt();
		sc.setRollNumber(rollNumber);
		System.out.print("Enter the Name = ");
		String name = scanner.next();
		sc.setName(name);
		System.out.print("Enter the marks = ");
		int marks = scanner.nextInt();
		sc.setMarks(marks);
		System.out.print("Enter the Gender = ");
		String gender = scanner.next();
		sc.setGender(gender);
		System.out.println(" Roll Number = "+sc.getRollNumber()+"\n Name = "+sc.getName()+" \n Marks = "+sc.getMarks()+" \n Gender = "+sc.getGender());
//		 close the scanner
		scanner.close();
	}

}
