package com.kn.arraytasks;

public class SelectionSort {
	public int [] sortElement(int[] arr) {

//		Array Traversing
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			
			for (int j = i + 1; j < arr.length; j++) {
//				int fElements=arr[j],sElement=arr[j+1],tEelement;
				if (arr[j] < arr[index]) {
					arr[index]=arr[j];
					index = j;
				}
				
			}
//			swaping element logic with min value
			int temp = 0;
			temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

}
