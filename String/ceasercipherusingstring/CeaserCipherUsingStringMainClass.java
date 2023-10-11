package com.kd.ceasercipherusingstring;

import java.util.Scanner;


public class CeaserCipherUsingStringMainClass {

	public static void main(String[] args) {
//		get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
//		declare the string
		String inputString=scan.nextLine();
//		object calling
		CeaserCipherUsingString anagramString = new CeaserCipherUsingString();
		String outputString = anagramString.cipherText(inputString);
		System.out.println("The Cipher Text of the Give String = "+outputString);
//		leaving the resource
		scan.close();
	}

}
