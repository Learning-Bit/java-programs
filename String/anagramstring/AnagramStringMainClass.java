package com.kd.anagramstring;

import java.util.Scanner;

public class AnagramStringMainClass {

	public static void main(String[] args) {
//		get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
//		declare the string
		String inputString=scan.nextLine();
		String inputString1=scan.nextLine();
//		object calling
		AnagramString anagramString = new AnagramString();
		boolean outputString = anagramString.anagramStringUsingSort(inputString, inputString1);
		if(outputString) {
			System.err.println("inputString = "+inputString+" "+"inputString2 = "+" "+inputString1+" are the anagaramStrings");
		}else {
			System.err.println("inputString = "+inputString+" "+"inputString2 = "+" "+inputString1+" are not the anagaramStrings");

		}
//		leaving the resource
		scan.close();
	}

}
