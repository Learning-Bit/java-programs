package com.kn.whileloop;

import java.util.Scanner;

public class CountTheDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num = scan.nextInt();
		DigitsOfNumber(num);
		scan.close();

	}

	private static void DigitsOfNumber(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		while(num>0) {
			num = num/10;
			count++;
		}System.out.println("The count of the Given Number is = "+count);
		
	}

}
