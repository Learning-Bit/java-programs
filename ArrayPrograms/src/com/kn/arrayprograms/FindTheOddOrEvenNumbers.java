package com.kn.arrayprograms;
//WAJP using array find the   given number what are the odd and even numbers

import java.util.Scanner;

public class FindTheOddOrEvenNumbers {

	public static void main(String[] args) {
		//Array Declaration
		int[] arr;
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
		System.out.println("<--- Array data of the even and odd number are --->");
		for (int i = 0; i <arr.length; i++) {
			if(arr[i]%3 ==0) {
				System.out.println("The Number that are divisible by 3 = "+arr[i]);
			}
		}
		scan.close();
	}

}
