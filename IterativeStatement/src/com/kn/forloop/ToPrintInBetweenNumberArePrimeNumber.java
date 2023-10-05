package com.kn.forloop;

public class ToPrintInBetweenNumberArePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPrimeNumber();

	}

	static void findPrimeNumber() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 91; i++) {
			if (i % 1 == 0) {
				if (i % 2 == 0) {
					System.out.println("It is not prime number "+i);
				} else {
					System.out.println("It is a prime number " + i);

				}
			}
		}
	}
		
	}

