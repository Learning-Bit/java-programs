package com.kn.switchcase;

import java.util.Scanner;

/*Problem Statement 21: You're developing a program to help beginners learn English. 
 * The program should take a number between 0 to 9 as input and print the corresponding English word for the number.*/
public class LearnEnglish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your number betweeen 0 to 9 = ");
		int num = scan.nextInt();
		int learnEnglish = correspondingEnglishWord(num);
		switch (learnEnglish) {
		case 0:
			System.out.println("zero = "+learnEnglish);
			break;
		case 1:
			System.out.println("One = "+learnEnglish);
			break;
		case 2:
			System.out.println("Two = "+learnEnglish);
			break;
		case 3:
			System.out.println("Three = "+learnEnglish);
			break;
		case 4:
			System.out.println("Four = "+learnEnglish);
			break;
		case 5:
			System.out.println("Five= "+learnEnglish);
			break;
		case 6:
			System.out.println("Six = "+learnEnglish);
			break;
		case 7:
			System.out.println("Seven = "+learnEnglish);
			break;
		case 8:
			System.out.println("Eight  = "+learnEnglish);
			break;
		case 9:
			System.out.println("Nine = "+learnEnglish);
			break;
		default:
			System.out.println("---->Not in List---->");
		}
		scan.close();

	}

	 static int correspondingEnglishWord(int num) {
		// TODO Auto-generated method stub
		return num;
	}

}


// output

/*enter your number betweeen 0 to 9 = 
9
Nine = 9

enter your number betweeen 0 to 9 = 

10
---->Not in List---->



*/
