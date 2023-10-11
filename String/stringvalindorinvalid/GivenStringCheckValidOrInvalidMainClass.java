package com.kd.stringvalindorinvalid;

import java.util.Scanner;


public class GivenStringCheckValidOrInvalidMainClass {

	public static void main(String[] args) {

//		get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
//		declare the string
		String input=scan.nextLine();
//		object calling
		GivenStringCheckValidOrInvalid count = new GivenStringCheckValidOrInvalid();
		count.stringChecking(input);
//		leaving the resource
		scan.close();
	}

}
