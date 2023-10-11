package com.kd.countthegivenstringincharacter;

import java.util.Scanner;


public class CountTheGivenStringInCharacterMainClass {

	public static void main(String[] args) {

//		get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
//		declare the string
		String inputString=scan.nextLine();
//		object calling
		CountTheGivenStringInCharacter characterCount = new CountTheGivenStringInCharacter();
		characterCount.countTheStringCharacter(inputString);
//		leaving the resource
		scan.close();
	
	}

}
