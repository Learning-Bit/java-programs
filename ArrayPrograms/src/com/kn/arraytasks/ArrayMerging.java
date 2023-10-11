package com.kn.arraytasks;

public class ArrayMerging {
//	To print Array Merging
	public int[] printArrayMerging(int[] arr, int[] brr) {
		int[] crr = new int[arr.length + brr.length];

		for (int i = 0; i < arr.length; i++){
			crr[i] = arr[i];
		}
		int j = 0;
		for (int i = 0; i < crr.length; i++) {
			crr[i] = brr[j];

		}
		return crr;

	}
}
