package com.kn.arrayprograms;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
//		Get input form the user
		Scanner scan = new Scanner(System.in);

//		Array declaration and creation 
		int [] arr = new int [scan.nextInt()];
//		Array intalization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" Array Elements : ");
			arr[i] = scan.nextInt();
		}
//		To check the given Array can an duplicate Number
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					break;
				}
				
			}
		}
		scan.close();
	}

}
