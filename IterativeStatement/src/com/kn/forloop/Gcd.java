package com.kn.forloop;

import java.util.Scanner;

public class Gcd {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		int table =findGcd(num1,num2);
		System.out.println(table);
		scan.close();
	}
	static int findGcd(int num1 ,int num2) {
		int gcd =1;
		for(int i=1;i <=num1 && i<=num2;i++) {
			if(num1%i ==0 && num2%i ==0) {
//				int gcd =1 ;
				gcd = i;
			}
		}
		
		return gcd;
		
	}
}
