package com.kn.forloop;

//import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		findPrimeNumber(10);
	}

	static void findPrimeNumber(int num) {
		// TODO Auto-generated method stub
		int count = 0;

		for(int i=1;i<=num;i++) {
			if(num%i == 0 ) {
				count++;
//				System.out.println("count = "+count);
			
			}
//				else {
//				System.out.println("i = "+i);
//			}
			
		}
		if(count == 2) {
			System.out.println("It is a prime Number");
		}else {
			System.out.println("It is not a prime Number");
		}
	}

}
