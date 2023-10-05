package com.kn.gcdusingrecurssive;

import java.util.Scanner;


public class GcdUsingRecurssiveMainClass {

	public static void main(String[] args) {
//		get the input form the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers you need to get the GCD  ");
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();

//		creating object 
		GcdUsingRecurssive gcd = new GcdUsingRecurssive();
//		call the method
		 int result = gcd.gcdOfGiveNumber(input1,input2);
//		 print the result 
		 System.out.println("The factorial of the "+input1+" and "+input2+" = "+result);
//		 release the resource
		 scan.close();
	}

}
