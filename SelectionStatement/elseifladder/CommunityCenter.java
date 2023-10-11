package com.kn.elseifladder;
/*Problem Statement 13: You're creating a program for a community center that categorizes 
 * individuals based on their age for different activities. The program should accept an 
 * age as input. For age between 0 and 12, it should print "Child". For age between 13 and 19, 
 * it should print "Teen". For age between 20 and 59, 
 * it should print "Adult". For age 60 and above, it should print "Senior Citizen".*/
import java.util.Scanner;

public class CommunityCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age = ");
		int age = scan.nextInt();
		int CommunityCenter = DifferentCategorizes(age);
		if(CommunityCenter<=12) {
			System.out.println("Child = "+CommunityCenter);
		}else if(CommunityCenter==13 || CommunityCenter <=19) {
			System.out.println("Teen = "+CommunityCenter);
		}else if(CommunityCenter==20 || CommunityCenter<=59) {
			System.out.println("Adult = "+CommunityCenter);
		}else if(CommunityCenter>=60) {
			System.out.println("Senior Citizen = "+CommunityCenter);
		}
		scan.close();
	}

	 static int DifferentCategorizes(int age) {
		// TODO Auto-generated method stub
		return age;
	}

}



//output
/*
 * Enter your Age = 
52
Teen = 52 

*Enter your Age = 
9
Child = 9


Enter your Age = 

23
Adult = 23

Enter your Age = 
95
Senior Citizen = 95


*/

