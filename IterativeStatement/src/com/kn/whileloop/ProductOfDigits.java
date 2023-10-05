package com.kn.whileloop;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productOfDigits();
	}

	static void productOfDigits() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number = ");
		int num = scan.nextInt();
		int temp = 1;
		while(num>0) {
			int sum = num%10;
			temp = temp * sum;
			num = num/10;
		}
		System.out.println(temp);
		scan.close();
	}

}
