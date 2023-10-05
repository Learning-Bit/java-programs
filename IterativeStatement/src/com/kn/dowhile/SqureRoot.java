package com.kn.dowhile;

import java.util.Scanner;

public class SqureRoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number you want to known of Squareroot = ");
		int num = scan.nextInt();
		double rootOfNumber = squareRoot(num);
		System.out.println("The Square Root of the Given Number = "+rootOfNumber);
		scan.close();
	}

	static double squareRoot(int num) {
		// TODO Auto-generated method stub
		double valueOfSquareRoot = Math.sqrt(num);
		return valueOfSquareRoot;
	}

}
