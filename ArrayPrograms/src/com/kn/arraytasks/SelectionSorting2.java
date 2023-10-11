package com.kn.arraytasks;

public class SelectionSorting2 {
	public int[] sortElement(int[] arr) {

//		Array Traversing
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			int min = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
//				int fElements=arr[j],sElement=arr[j+1],tEelement;
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}

			}
//			swaping element logic with min value
			
			int temp = arr[i];
			arr[i] = min;
			arr[index] = temp;
		}
		return arr;
	}
}
