package com.kd.printnonduplicatechar;

import java.util.Scanner;


public class PrintNonDuplicateCharMainClass {

	public static void main(String[] args) {


//		get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
//		declare the string
		String inputString=scan.nextLine();
//		object calling
		PrintNonDuplicateChar characterCount = new PrintNonDuplicateChar();
		characterCount.duplicateCharCheck(inputString);
//		leaving the resource
		scan.close();
	
	
	}

}
