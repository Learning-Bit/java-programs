package com.kn.whileloop;
//1. Write a program to find the largest digit in a number.
import java.util.Scanner;

public class LargestDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Number = ");
		int num = scan.nextInt();
		int Number =LargestNumber(num);
		System.out.println("The Greater digits in Given Number is = "+Number);
		scan.close();

	}

	private static  int LargestNumber(int num) {
		// TODO Auto-generated method stub
		int temp = -1;
		while(num>0) {
			int digit = num%10;
			if(digit>temp) {
				temp = digit;
			}num = num/10;
		}return temp;
		
	}

}
