package com.kn.arrayprograms;

import java.util.Scanner;
//WAJP  to using array to print the string values
public class ArrayDemo1 {

	public static void main(String[] args) {
//		Array Declaration
		String[] arr;
//		Array creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		arr = new String[scan.nextInt()];// if you want to get the size of an array into the user
//		Array intalization
//		arr[0]="AAA";
//		arr[1]="BBB";// if you write like this the code will become reduency so we use another method 
//		arr[2]="CCC";
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + "data =");
			arr[i] = scan.next();
		}
//		Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.err.println("The Array given data form the user is = " + arr[i]);
//			System.out.println(arr[i]);
		}
		scan.close();

	}

}
