package com.kn.whileloop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigit();
	}

	static void SumOfDigit() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number = ");
		int num ,temp ;
		int sum =0;
		temp = 0;
		num = scan.nextInt();
		while(num>0) {
		

		sum = num%10;
		temp = temp+sum;
			num = num /10;

		}
		System.out.print("The sum of the given number is = "+temp);

		scan.close();
		
	}

}
