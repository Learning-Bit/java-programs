package com.kd.romanNumber;

import java.util.Scanner;

public class NumberCovertIntoRomananNumberMainClass {

	public static void main(String[] args) {
//		get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
//		declare the string
		String []input=new String[scan.nextInt()];
		for(int i=0;i<input.length;i++) {
			input[i]=scan.next();
		}
//		enter the int
		System.out.println("Enter the value ");
		int [] arr= new int[scan.nextInt()];
//		object calling
		NumberCovertIntoRomananNumber count = new NumberCovertIntoRomananNumber();
		String result = count.covertIntoRomanNumber(input, arr);
		System.out.println(result);
//		leaving the resource
		scan.close();
	}

}
