
package com.kn.forloop;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your base = ");
		int base = scan.nextInt();
		System.out.println("enter your exponent = ");
		int exponent = scan.nextInt();
		int PowerOfNumber = findPower(base,exponent);
		System.out.println("PowerOfNumber = "+PowerOfNumber);
		scan.close();
	}

	static int findPower(int base, int exponent) {
		// TODO Auto-generated method stub
		int power = 1;
		for(int i=1;i<=exponent;i++) {
			power = power*base;
		}
		return power;
	}

}
