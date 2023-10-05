package com.kd.factorialusingrecurssive;

import java.util.Scanner;

public class FactorialUsingRecurssiveMainClass {

	public static void main(String[] args) {
//		get the input form the user
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number you need to get the factorial value ");
		int input = scan.nextInt();
//		creating object 
		FactorialUsingRecurssive fact = new FactorialUsingRecurssive();
//		call the method
		 int result = fact.factorialNumber(input);
//		 print the result 
		 System.out.println("The factorial of the "+input+" = "+result);
//		 release the resource
		 scan.close();
		
	}

}
