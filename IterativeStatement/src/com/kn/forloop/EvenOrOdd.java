package com.kn.forloop;

import java.util.Scanner;

//13. Write a program to print all the even numbers between 1 and n.
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scan.nextInt();
		EvenNumber(num);
		scan.close();
		

	}

	private static void EvenNumber(int num) {
		// TODO Auto-generated method stub
		for(int i =1;i<=num;i++) {
			if(i%2== 0) {
				System.out.println("Even Numbers are "+i);
			}
		}
//		return 0;
	}

}
