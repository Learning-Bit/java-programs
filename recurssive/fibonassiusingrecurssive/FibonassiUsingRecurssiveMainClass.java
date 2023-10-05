package com.kd.fibonassiusingrecurssive;

import java.util.Scanner;

public class FibonassiUsingRecurssiveMainClass {

	public static void main(String[] args) {
//		get the input form the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int input = scan.nextInt();

//		creating object 
		FibonassiUsingRecurssive fibo = new FibonassiUsingRecurssive();
//		call the method
		 int result = fibo.fibonassi(input);
//		 print the result 
		 System.out.println("The factorial of the "+input+" = "+result);
//		 release the resource
		 scan.close();
	}

}
