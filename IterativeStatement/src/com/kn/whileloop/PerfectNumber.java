package com.kn.whileloop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumbers();
		

	}

	static void PerfectNumbers() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Number = ");
		int num = scan.nextInt();
		int i = 1,sum = 0;
		while(i<num) {
			if(num%i ==0) {
				sum = sum + i;
			}i++;
		}if(num ==sum) {
			System.out.println("It is Perfect Number");
		}else {
			System.out.println("Not a Perfect Number");
		}
		scan.close();
	}

}
