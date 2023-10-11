package com.kn.arrayprograms;

import java.util.Scanner;

public class PositiveNumberCountInArray {

	public static void main(String[] args) {
		// array decaralation and creation get from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		int[] arr = new int[scan.nextInt()];
		// array inatalization get from the user
		for(int i =0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" element need to be store = ");
			arr[i]=scan.nextInt();

		}
		//		To create one method for and call the method to find the how many positive number in the given number
		int postiveNumberCount = countPostiveNumber(arr);	
		System.out.println("The count of the given number = "+postiveNumberCount);
		scan.close();
	}

	 static int countPostiveNumber(int[] arr) {
		 int count = 0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>=0) {
				 count++;
				
			}
		 }
		 return count;
		 
	}

}
