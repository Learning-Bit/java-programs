package com.kd.charcount;

import java.util.Scanner;

public class CharCountInGivenStringMain {

	public static void main(String[] args) {
//		get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
//		decleare the string
		String s1=scan.nextLine();
//		object calling
		CharCountInGivenString character = new CharCountInGivenString();
		String output = character.isCount(s1);
		System.out.println(output);
//		realese the resource
		scan.close();
				
	}

}
