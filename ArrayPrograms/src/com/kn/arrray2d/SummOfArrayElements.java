package com.kn.arrray2d;

public class SummOfArrayElements {

	public void printSumOfArrayElements (int[][] arr,int[][] brr) {
		int [][]crr = new int[arr.length][brr[0].length];
//		Array inatilization
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr.length;j++) {
				crr[i][j]=arr[i][j]+brr[i][j];

			}
		}
		for(int i =0;i<crr.length;i++) {
			for(int j=0;j<crr.length;j++) {
				System.out.println(crr[i][j]);
			}
//			System.out.println(arr[i]);
			

		}
		
	}

}
