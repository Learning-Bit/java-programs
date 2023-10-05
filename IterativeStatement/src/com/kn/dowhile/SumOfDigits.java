package com.kn.dowhile;

import java.util.Scanner;

//WATP to find the sum of digits of a number until the sum becomes a single digit.
public class SumOfDigits {

	public static void main(String[] args) {
		FindSumOfDigits();
	}

	 static void FindSumOfDigits() {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter your number = ");
		 int num = scan.nextInt();
		 int sum = 0,s=0;
		 do {
			 int digits = num%10;
			 sum = sum +digits;
			 num = num/10;
			 
			 
		 }
		 while(num>0);			 
		 System.out.print(sum);

		 do {
			 int d = sum%10;
			 s = s+d;
			 sum= sum/10;
			 
			 
		 }while(sum>0);
		 System.err.print(s);

		 scan.close();
		
	}

}
