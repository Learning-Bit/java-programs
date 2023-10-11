package com.kn.arraytasks;

import java.util.Scanner;

public class MergingThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int []arr=new int[scan.nextInt()];
		System.out.println("Enter the size of the brr array ");
		int [] brr= new int[scan.nextInt()];
		System.out.println("Enter the size of the crr array ");
		int[] crr = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" array elements : ");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<brr.length;i++) {
			System.out.println("Enter the "+(i+1)+" array elements : ");
			brr[i]=scan.nextInt();
		}
		for(int i=0;i<crr.length;i++) {
			System.out.println("Enter the "+(i+1)+" array elements : ");
			crr[i]=scan.nextInt();
		}
		
		int [] drr= printMergingThreeArray(arr,brr,crr);
		System.out.println(drr);
		scan.close();

	}

	public static int[] printMergingThreeArray(int[] arr, int[] brr, int[] crr) {
		int [] drr=new int[arr.length+brr.length+crr.length];
		for(int i=0;i<arr.length;i++) {
			drr[i] = arr[i];
		}
		for(int i=0;i<brr.length;i++) {
			drr[arr.length+i]=brr[i];
		}
		for(int i=0;i<crr.length;i++) {
			drr[arr.length+brr.length+i]=crr[i];
		}
		
		return drr;
	}

}
