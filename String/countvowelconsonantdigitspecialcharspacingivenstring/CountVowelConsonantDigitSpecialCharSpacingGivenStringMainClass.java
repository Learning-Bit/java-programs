package com.kd.countvowelconsonantdigitspecialcharspacingivenstring;

import java.util.Scanner;


public class CountVowelConsonantDigitSpecialCharSpacingGivenStringMainClass {

	public static void main(String[] args) {

//		get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
//		declare the string
		String inputString=scan.nextLine();
//		object calling
		CountVowelConsonantDigitSpecialCharSpacingGivenString count = new CountVowelConsonantDigitSpecialCharSpacingGivenString();
		count.countCharcter(inputString);
//		leaving the resource
		scan.close();
	}

	}


