package com.kn.arrayprograms;
// WAJP  to using array back side traversing
import java.util.Scanner;

public class ArrayPatternInDecrements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Array Declaration
		String[] arr;
//		Array creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		arr = new String[scan.nextInt()];// if you want to get the size of an array into the user
//		Array intalization
//		arr[0]="AAA";
//		arr[1]="BBB";// if you write like this the code will become reduency so we use another method 
//		arr[2]="CCC";
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("Enter the " + (i + 1) + "data =");
			arr[i] = scan.next();
		}
//		Array back side Traversing
		for (int i = arr.length - 1; i >= 0; i--) {
			System.err.println("The Array given data form the user is = " + arr[i]);
//			System.out.println(arr[i]);
		}
		scan.close();

	}

}


/* output
 Enter the size of the array = 
2
Enter the 2data =

AA
Enter the 1data =
bb
The Array given data form the user is = AA
The Array given data form the user is = bb
*/
