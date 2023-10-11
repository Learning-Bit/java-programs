package com.kn.arrayprograms;
import java.util.Scanner;

public class FactorialUsingArrays {

	public static void main(String[] args) {
//		To get the value from the user
		Scanner scan = new Scanner(System.in);
		
//		Array Decalartion and Creation 
		int [] arr= new int[scan.nextInt()];
//		Array intilization 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" Array Elements ");
			arr[i]=scan.nextInt();
		}
//		Array Traversing 
		int fact =1;
		for(int i=0;i<arr.length;i++) {
			fact = fact*arr[i];
		}
		System.out.println(fact);
		scan.close();
		
	}

}
