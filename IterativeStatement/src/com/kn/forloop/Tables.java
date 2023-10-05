package com.kn.forloop;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = scan.nextInt();
		givenNumber(num);
		scan.close();
		
	}

	static void givenNumber(int num) {
		// TODO Auto-generated method stub
		for(int i = 1 ;i<=10;i++) {
			int multiple;
			multiple = num * i;
//			multiple = i;
			System.out.println(num+"*"+i+" = "+multiple);
		}

		
		
	}

}
