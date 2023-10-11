package com.kn.arrayprograms;

import java.util.Scanner;

//
public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Array Declaration
		int[] arr;
		int sum =0;
//		Array creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		arr = new int[scan.nextInt()];// if you want to get the size of an array into the user
//		Array intalization
//		arr[0]="AAA";
//		arr[1]="BBB";// if you write like this the code will become reduency so we use another method 
//		arr[2]="CCC";
		for (int i = 0; i <arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + "data =");
			arr[i] = scan.nextInt();
		}
//		Array back side Traversing
		for (int i = 0; i <arr.length; i++) {
			sum = sum+arr[i];
		}
		System.out.println("Sum of the array = "+sum);
		scan.close();


	}

}
