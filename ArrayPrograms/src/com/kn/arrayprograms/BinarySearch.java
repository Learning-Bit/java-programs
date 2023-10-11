package com.kn.arrayprograms;

import java.util.Scanner;

public class BinarySearch {
	public void printBinarySearchElements (int[] arr) {
		Scanner scan = new Scanner(System.in);
		int low=0,high=arr.length-1;
		boolean isElementsFount = false;
		int position =-1;
		int mid=0;
//		to get elements that need to searched 
		System.out.println("Enter the element to searched ");
		int elements = scan.nextInt();
//		To check the given number 
		while(low<=high) {
			mid=(low+high)/2;
			if(elements ==arr[mid]) {
				isElementsFount = true;
				position = mid+1;
				break;
			}
			else if(elements>arr[mid]) {
				low =mid+1;
//				high=high;
			}
			else  {
				high =mid-1;
//				low = low;
			}
		}
		if(isElementsFount) {
			System.out.println("Elements = "+elements+" and the position = "+position);
		}
		else {
			System.out.println("Elements = "+elements+" is not found ");

		}
		scan.close();
	}

}
