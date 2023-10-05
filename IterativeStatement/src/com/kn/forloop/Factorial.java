package com.kn.forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = scan.nextInt();
		
		int factorical=FindFactorial(num);
		System.out.println("factorial = "+factorical);
		scan.close();

		

	}

	static int FindFactorial(int num) {
		int fact = 1;

		for(int i=num;i<=5;i++) {
			fact = fact*i;
			
		}
		return fact;

	}

}
