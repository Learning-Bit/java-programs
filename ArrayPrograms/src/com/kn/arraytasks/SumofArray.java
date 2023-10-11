package com.kn.arraytasks;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
// get the  input form the user 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
//		Array declare
		int [] arr = new int[scan.nextInt()];
		
//		Array intialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" Array Element = ");
			arr[i]=scan.nextInt();
		}
		
//		Array Traversing using the create an object[SumOfArray is reference variable] 
		SumOfArrayElements sumOfArrayElements = new SumOfArrayElements();
		
//		To create a one variable to return the methods[calling the methods name]
		 
		System.out.println("Sum of the Array Element : "+sumOfArrayElements.calculateSumOfArray(arr));
		//		close the scanner 
		scan.close();
	}
	}


