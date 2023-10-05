package com.kn.forloop;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfnNumbers();

	}

	static void SumOfnNumbers() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = scan.nextInt();
		for(int i = 1;i<=num;i++) {
			int sum = i*i;
			System.out.println("Sum of "+i+" N the numbers = "+sum);

		}scan.close();
		
	}

}
