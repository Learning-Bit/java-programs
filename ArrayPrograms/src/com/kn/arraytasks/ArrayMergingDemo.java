package com.kn.arraytasks;

import java.util.Scanner;

public class ArrayMergingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		To get input form the user 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the arr Array : ");
		
//		Array Declaration and Creation 
		int []arr= new int [scan.nextInt()];
		
		System.out.print("Enter the size of the brr Array : ");
		int []brr = new int[scan.nextInt()];
		
		 
//		 Array Intalization
		  for(int i=0;i<arr.length;i++) {
			  System.out.println("Enter the "+(i+1)+" Array Elements ");
			  arr[i] = scan.nextInt();
		  }
		  
		  for(int i=0;i<brr.length;i++) {
			  System.out.println("Enter the "+(i+1)+" Array Elements ");
			  brr[i] = scan.nextInt();
		  }
		  
	
		  
//		  create an object
		  
		  ArrayMerging arrayMerging = new ArrayMerging();
		  
//		  calling the methods
		  
		  System.out.println(arrayMerging.printArrayMerging(arr, brr));
		  
//		  close the scanner
		  
		  scan.close();


		

	}

}
