package com.kn.dowhile;

import java.util.Scanner;

public class DivisibleByGivenNumbers {
	public static void main(String [] args) {
		divisibleByGivenNumber();

	}

	 static void divisibleByGivenNumber() {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the number to perform the division = ");
		 int num = scan.nextInt();
		 System.out.println("Enter the Range = ");
		 int range = scan.nextInt();
		 int i = 1;
		 do {
			 if(i%num ==0) {
				 System.out.println("i = "+i);
			 }
			 i++;
		 }while(i<=range);
		 scan.close();
	}

}
