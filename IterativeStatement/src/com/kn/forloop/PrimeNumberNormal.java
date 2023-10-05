package com.kn.forloop;
import java.util.Scanner;

public class PrimeNumberNormal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		System.out.println(isPrime(num));
		scanner.close();
		}

		public static String isPrime(int num) {

		if (num <= 1) {

		return "Invalid input. Please enter a number greater than 1";

		}

		for (int i = 2; i < num; i++) {

		if (num % i == 0) {

		return num + " is not a prime number.";

		}

		}

		return num + " is a prime number.";

		}

		}
	


