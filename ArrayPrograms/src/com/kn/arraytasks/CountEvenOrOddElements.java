package com.kn.arraytasks;

public class CountEvenOrOddElements {
//	methods for countEvenOrOddElementsInArray 
	public void countEvenOrOddElementsInArray(int[] arr) {
		int evenCount = 0, oddCount =0;
		
		for(int i=0;i<arr.length;i++) {
//			count the given array elements 
			if(arr[i]%2==0) {
				
				evenCount++;
				
			}else {
				oddCount++;
			}
			
		}
		System.out.println("The OddNumber In the Array = "+oddCount);
		System.out.println("The EvenNumber In the Array = "+evenCount);

	}
}
