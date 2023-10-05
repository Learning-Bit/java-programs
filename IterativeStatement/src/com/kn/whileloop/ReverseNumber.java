package com.kn.whileloop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindReverseNumber();

	}

	static void FindReverseNumber() {
		// TODO Auto-generated method stub
		int num , sum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		num = scan.nextInt();
		while(num>0) {
			 sum = num%10;
			System.out.print(sum);
			num = num/10;
		}scan.close();
		
	}

}
