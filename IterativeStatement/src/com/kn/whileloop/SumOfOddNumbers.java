package com.kn.whileloop;

import java.util.Scanner;

//[24.7.23]2. Write a program to calculate the sum of first n odd numbers.
public class SumOfOddNumbers {

	public static void main(String[] args) {
		OddNumber();
	}

	static void OddNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Odd Numbers");
		int odd = scan.nextInt();
		int i =1;
		int sum = 0;

		while (i<=odd) {
			if(i % 2 != 0) {
				sum = sum + i;
			}i++;
		}System.out.println(sum);

//		System.out.println("not odd");

		scan.close();
	}

}
