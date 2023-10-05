package com.kn.whileloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num = scan.nextInt();
		int temp =  num;
		System.out.println("temp ="+temp);
		int GivenNumber = FindPalindrome(num);
		if(temp == GivenNumber) {
			System.out.println("is plaidrome");
			
		}else {
			System.out.println("is not plaidrome");

		}
		
		scan.close();
		
	}

	static int FindPalindrome(int num) {
		// TODO Auto-generated method stub
		int total = 0;
		while(num>0) {
			int sum = num%10;
//			System.out.print(sum);
			total = total *10+sum;
			num = num/10;
		}
		return total;
	
		
	}

}
