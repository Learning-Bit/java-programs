package com.kd.giventhestringuniquecharcter;
import java.util.Scanner;


public class GivenTheStringUniqueCharcterMain {

	public static void main(String[] args) {
//		get the input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
//		decleare the string
		String s1=scan.nextLine();
//		object calling
		GivenTheStringUniqueCharcter character = new GivenTheStringUniqueCharcter();
		String output = character.isCount(s1);
		System.out.println(output);
//		realese the resource
		scan.close();
				
	}

}
