package com.kn.ifelse;
/*
 * Problem Statement 4: Your task is to create a program for a voting registration system. According to the law, a person is eligible to vote if their age is 18 or above. Your Java program should accept a person's age as input. If the age is 18 or above, the program should print "Voter registration eligible".
 */
import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int votingage  = VoterRegistration(age);
		if(votingage>18) {
			System.out.println("Your are eligible to vote = "+votingage);
		}else {
			System.out.println("Your are  not eligible to vote = "+votingage);

		}
		scan.close();

	}

	static int VoterRegistration(int age) {
		// TODO Auto-generated method stub
		return age;
	}

}
