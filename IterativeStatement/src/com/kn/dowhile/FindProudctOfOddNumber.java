package com.kn.dowhile;
// WAJP to find the product of 'n' odd numbers.
import java.util.Scanner;

public class FindProudctOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productOfOddNumbers();
		

	}

	 static void productOfOddNumbers() {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the number = ");
		 int num = scan.nextInt();
		 int i =1;
		 int sum =1;
		 do {
			 if(i%2 !=0) {
				sum = sum*i; 
				 System.out.println(sum);

			 }
			 i++;
		 }while(i<=num);
		 scan.close();
		
	}

}
