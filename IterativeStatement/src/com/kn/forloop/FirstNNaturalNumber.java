package com.kn.forloop;

import java.util.Scanner;

public class FirstNNaturalNumber {
	public static void main(String [] args) {
		firsnNatrulaNumber();
		
	}

	static void firsnNatrulaNumber() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num = scan.nextInt();
		for(int i=0;i<=num;i++) {
			int sum = 0;
			sum = sum+i;
			System.out.println("sum ="+sum);
		}
		scan.close();
	}
	
}
