package com.kn.arraytasks;
// main class of the sum of the array
public class SumOfArrayElements{
//	to print 
public int calculateSumOfArray(int[] arr) {
		int sum =0;
		System.out.println("**********");
//		Print the array element
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		return sum;
	
	}
	


}
