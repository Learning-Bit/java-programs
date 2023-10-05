package com.kn.whileloop;

import java.util.Scanner;

//8. Write a program to find the largest number less than a given number which is a palindrome.
public class LargestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Range = ");
		int range = scan.nextInt();
		largestPalindrome(range);
//		isPalindrome();
		scan.close();

	}

	static void largestPalindrome(int range) {
		// TODO Auto-generated method stub
		int i = range;
		while(i>=1) {
			if(isPalindrome(i)) {
				System.out.println("The Given range = "+range+" of the largest Palindrome is = "+i);
				break;
			}i--;
		}
		
	}

	static boolean isPalindrome(int num) {
		int sum =0,digit,temp = num;
		while(num>0) {
			digit = num%10;
			sum = sum*10+digit;
			num = num/10;
		}if(temp == sum) {
			return true;
		}return false;
		
	}

}
