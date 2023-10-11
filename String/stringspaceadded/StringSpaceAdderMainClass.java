package com.kd.stringspaceadded;

import java.util.Scanner;


public class StringSpaceAdderMainClass {

	public static void main(String[] args) {

		// get an input form the user creating the resources
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString = scan.nextLine();
//	create object of the reverse string
		StringSpaceAdder String = new StringSpaceAdder();
//		call the method of the given object class
		String outputString = String.spaceAdder(inputString);
		System.out.println("outputSting = "+outputString);
//		release the resource
		scan.close();
	
	}

}
