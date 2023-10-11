package com.kn.arraytasks;

//import java.util.Scanner;

public class InsertionSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the size of the array ");
//		Array declaration and creation 
		int[] arr = {135,79,48,69,21,99,32,58,19,6};
//		Array initialization 
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + " Elements " +arr[i]);
//			arr[i] = scan.nextInt();
		}
//		Array object 
		InsertionSorting sorts = new InsertionSorting();
//		mehtod call using object 
		int []brr = sorts.InsertionSortElement(arr);
		for(int i=0;i<brr.length;i++) {
			System.out.println(brr[i]);
		}
//		scan.close();

	}

}
