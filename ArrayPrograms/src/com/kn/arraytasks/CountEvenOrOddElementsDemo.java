package com.kn.arraytasks;

import java.util.Scanner;

public class CountEvenOrOddElementsDemo {

	public static void main(String[] args) {
		// get the  input form the user 
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the size of the array");
//				Array declare and creation
				int [] arr = new int[scan.nextInt()];
				
//				Array intilization
				for(int i=0;i<arr.length;i++) {
					System.out.println("Enter the "+(i+1)+" Array Element = ");
					arr[i]=scan.nextInt();
				}
//				creating object 
				CountEvenOrOddElements countEvenOrOddElemts = new CountEvenOrOddElements();
				
//				call methods
				countEvenOrOddElemts.countEvenOrOddElementsInArray(arr);
				
//				close scanner
				scan.close();
						
	}

}
