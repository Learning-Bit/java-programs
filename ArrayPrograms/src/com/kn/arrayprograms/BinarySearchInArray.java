package com.kn.arrayprograms;

import java.util.Scanner;

public class BinarySearchInArray {

	public static void main(String[] args) {
//		/Get the input from the user
		Scanner scan = new Scanner(System.in);
//		Array Declaration and Creation
		System.out.println("Enter the size of an array");
		int [] arr= new int[scan.nextInt()];
//		Array intalization
		for(int i=0;i<arr.length;i++) {
			System.err.print("Enter the Elements"+(i+1)+" = ");
			arr[i]=scan.nextInt();
		}
//		create an object 
		BinarySearch binarySearch = new BinarySearch();
//		calling mehtods 
		binarySearch.printBinarySearchElements(arr);
		
		scan.close();
		
	}

}
