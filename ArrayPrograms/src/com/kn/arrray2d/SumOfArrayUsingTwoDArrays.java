package com.kn.arrray2d;

import java.util.Scanner;

public class SumOfArrayUsingTwoDArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array declaration and creation
		int[][] arr = new int[2][2];
		int[][] brr = new int[2][2];
//		Array intailazation
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + " Array Elements ");

			for (int j = 0; j < arr.length; j++) {
				System.out.println("Enter the " + (j + 1) + " Array Elements ");
				arr[i][j] = scan.nextInt();
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + " Array Elements ");

			for (int j = 0; j < brr.length; j++) {
				System.out.println("Enter the " + (j + 1) + " Array Elements ");
				arr[i][j] = scan.nextInt();
			}

		}
		SummOfArrayElements sumOfArrayElements = new SummOfArrayElements();
		sumOfArrayElements.printSumOfArrayElements(arr, brr);
		scan.close();

	}

}
