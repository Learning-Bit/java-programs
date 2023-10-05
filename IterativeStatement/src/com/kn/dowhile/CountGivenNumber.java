package com.kn.dowhile;

import java.util.Scanner;

public class CountGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countNumber();
	}

	 static void countNumber() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your Number = ");
		 int num = scan.nextInt();
		 int count =0;
		 do {
			 num = num/10;
			 count++;
		 }while(num>0);
		 System.out.println("count = "+count);
		 scan.close();
	}

}
