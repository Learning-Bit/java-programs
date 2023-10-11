package com.kn.arraytasks;

import java.util.Scanner;

// To create a main method of the array traversing behavoiur
public class ArrayTraversing {

	public static void main(String[] args) {
//		To get the input form the user
		Scanner scan = new Scanner(System.in);
//		Array Decleration and creation
		int [] arr = new int[scan.nextInt()];
//		Array intialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" Array Element = ");
			arr[i]=scan.nextInt();
		}
//		Array Traversing using the create an object 
		ArrayTraversingBehavoiur ArrayTraversingBehavoiur = new ArrayTraversingBehavoiur();
		ArrayTraversingBehavoiur.printArrayElement(arr);
//		close the scanner 
		scan.close();
	}

}
