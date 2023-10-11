package com.kn.arrray2d;

import java.util.Scanner;

public class FriendsListUsingJaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration
		int[][] arr;
//		Array Creation 
		System.out.println("Enter the number of batches = ");
		arr = new int[scan.nextInt()][];
		for(int i =0;i<arr.length;i++) {
			System.out.println("how many friend you have in each batch = ");

			arr[i]=new int[scan.nextInt()];
		}
		
		
		
//		Array Intalization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the"+(i+1)+ "batch  = ");
			for(int j=0;j<arr.length;j++) {
				System.out.println("Enter the "+(j+1)+"friends  = ");		
				arr[i][j]=scan.nextInt();
				
			}
		}
		System.out.println("<----- Array data ---->");
//		Array Traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println("The Batch A"+(i+1)+ " friends = ");
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i][j]);		
//				arr[i][j]=scan.nextInt();
				
			}
		}
		scan.close();

	}

}
