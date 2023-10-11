package com.kn.arraytasks;

import java.util.Scanner;

public class BubbleSortDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
//		Array declearation and creation 
		int []arr=new int[scan.nextInt()];
//		Array intalization 
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the "+(i+1)+" Elements ");
			arr[i]=scan.nextInt();
		}
//		create an object 
		BubbleSort bubbleSort = new BubbleSort();
//		call the method using object or reference varibale
		
		System.out.println("<---- Array after swaped ---->");
//		To itrate the swaped array 
		for(int i :bubbleSort.Sorting(arr)) {
			System.out.println(i+" ");
		}
//		close scanner
		scan.close();
		
	}

}
