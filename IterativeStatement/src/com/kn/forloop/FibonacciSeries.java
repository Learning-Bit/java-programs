package com.kn.forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int range = scan.nextInt();
		FindFibonacciSeries(range);
		scan.close();

	}

	static void FindFibonacciSeries(int range) {
		// TODO Auto-generated method stub
		
		
		int firstNumber ,secondNumber;
		firstNumber = 3;
		secondNumber =4;
		for (int i = 1;i<=range;i++) {
			int nextNumber = 0;
			nextNumber = firstNumber+secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			System.out.println("FibonacciSeries = "+nextNumber);

			
		}
		
		
	}

}
