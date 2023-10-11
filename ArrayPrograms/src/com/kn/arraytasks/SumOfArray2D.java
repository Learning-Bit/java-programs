package com.kn.arraytasks;

import java.util.Scanner;

public class SumOfArray2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [][] a = new int[3][3];
		int [][] b = new int[3][3];

//		in
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Enter the "+(i+1)+" Array Element = ");
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=scan.nextInt();

			}
		}

		
	}

}
