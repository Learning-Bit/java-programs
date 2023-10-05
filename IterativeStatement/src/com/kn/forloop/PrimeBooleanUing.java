package com.kn.forloop;

import java.util.Scanner;

public class PrimeBooleanUing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean Prime = findPrime(num);
		if(Prime) {
			System.out.println("is prime number");
		}else {
			System.out.println("not a prime number");
		}
		scan.close();

	}

	static boolean findPrime(int num) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		for(int i = 1;i<=num;i++) {
			if(num%i ==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
