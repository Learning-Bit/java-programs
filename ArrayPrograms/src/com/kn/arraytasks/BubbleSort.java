package com.kn.arraytasks;

public class BubbleSort {
//	Method creating for the bubble sorting
	public int[] Sorting(int[] arr) {
//		Array Traversing
		for(int i=0;i<arr.length;i++) {
			boolean isSwaped = false;
			for(int j=0;j<arr.length-1-i;j++){
//				int fElements=arr[j],sElement=arr[j+1],tEelement;
				if(arr[j]>arr[j+1]) {
					int temp =0;
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwaped = true;
				}
			}if(isSwaped==false) {
				break;
			}
		}
		return arr;
		
	}
}
