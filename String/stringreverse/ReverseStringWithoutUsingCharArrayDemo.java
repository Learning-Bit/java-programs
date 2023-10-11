package com.kd.stringreverse;

import java.util.Scanner;

public class ReverseStringWithoutUsingCharArrayDemo {

	public static void main(String[] args) {
// get an input form the user creating the resources
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString = scan.nextLine();
//	create object of the reverse string
		ReverseString reversesString = new ReverseString();
//		call the method of the given object class
		String outputString = reversesString.reverseString(inputString);
		System.out.println("outputSting = "+outputString);
//		release the resource
		scan.close();
	}
	}
