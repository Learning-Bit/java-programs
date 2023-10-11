package com.kn.ifelse;

import java.util.Scanner;

public class PostiveNumber {
/*
 * Problem Statement 1: As a software developer, you're tasked with creating a simple validation system for a data entry application. The application is meant to process only positive integers. In order to guide user input, the system should print a guiding message "Positive number - processing..." if the entered number is greater than zero.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
//		int GetNumber = isPositiveNumber(number);
//		if(GetNumber > 0) {
//			System.out.println("The Given number is Positive Number ="+GetNumber);
//		}
//		else {
//			System.out.println("The Given number is Negative Number ="+GetNumber);
//
//		}
		isPositiveNumber(number);
		scan.close();
	}

	 static void  isPositiveNumber(int number) {
		// TODO Auto-generated method stub
		 if(number>0) {
			 System.out.println("The Given number is Positive Number ="+number);
		 }
		 else {
			 System.out.println("The Given number is Negative Number ="+number);
		 }
//		return number;
	}

}




// output
/*Enter the number

1111343543
The Given number is Positive Number =1111343543*/





