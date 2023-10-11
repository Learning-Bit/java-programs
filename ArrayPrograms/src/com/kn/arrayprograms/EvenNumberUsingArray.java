package com.kn.arrayprograms;
// WAJP using array find the even number in  given number 
import java.util.Scanner;

public class EvenNumberUsingArray {

	public static void main(String[] args) {
		//Array Declaration
		int[] arr;
//		Array creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		arr = new int[scan.nextInt()];// if you want to get the size of an array into the user
//		Array intalization
//		arr[0]="AAA";
//		arr[1]="BBB";// if you write like this the code will become reduency so we use another method 
//		arr[2]="CCC";
		for (int i = 0; i <arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + "data =");
			arr[i] = scan.nextInt();
		}
//		Array back side Traversing
		System.out.println("<--- Array data of the even number are --->");
		for (int i = 0; i <arr.length; i++) {
			if(arr[i]%2 ==0) {
				System.out.println("The Even Number in Array = "+arr[i]);
			}
		}
		scan.close();

	}
	
	/*
	 Enter the 1data =
22
Enter the 2data =
33
Enter the 3data =
43
Enter the 4data =
66
Enter the 5data =
11
<--- Array data of the even number are --->
The Even Number in Array = 22
The Even Number in Array = 66*/
}
