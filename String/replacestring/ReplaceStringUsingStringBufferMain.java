package com.kd.replacestring;

import java.util.Scanner;

public class ReplaceStringUsingStringBufferMain {
	public static void main(String args[]) {
//		take an input form the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString = scan.nextLine();
//	create object of the reverse string
		ReplaceStringUsingStringBuffer replaceString = new ReplaceStringUsingStringBuffer();
//		call the method of the given object class
		String outputString = replaceString.replaceString(inputString);
		System.out.println("outputOfReplaceString = "+outputString);
//		release the resource
		scan.close();
	}
}
