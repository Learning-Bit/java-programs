package com.kn.array3d;

import java.util.Scanner;

public class ArrayJaggedUsing3d {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Array Declaration
		int[][][] a;
// Array Creation
		a = new int[scan.nextInt()][][];
		a[0] = new int[3][];
		a[0][0] = new int[2];
		a[0][1] = new int[4];
		a[0][2] = new int[1];

		a[1] = new int[2][3];

		a[2] = new int[2][];
		a[2][0] = new int[2];
		a[2][1] = new int[1];

		a[3] = new int[2][2];
		

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = scan.nextInt();
				}
			}
		}
		System.out.println("---->Array data---->");
//		Array Traversing
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.println(a[i][j][k]);
				}
			}

		}
		scan.close();

	}

}
