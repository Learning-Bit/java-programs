package com.kn.arraytasks;

import java.util.Scanner;

public class SelectionSorting2Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
//		Array declaration and creation 
		int[] arr = new int[scan.nextInt()];
//		Array initialization 
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the " + (i + 1) + " Elements ");
			arr[i] = scan.nextInt();
		}
//		Array object 
		SelectionSorting2 sorts = new SelectionSorting2();
//		mehtod call using object 
		int []brr = sorts.sortElement(arr);
		for(int i=0;i<brr.length;i++) {
			System.out.println(brr[i]);
		}
		scan.close();
	}
	}

