package com.kn.ifelse;

import java.util.Scanner;

/*Problem Statement 6: As an IT specialist at a university, you have been tasked to create a program that helps 
 * in marking student's grades. The program should take a student's score as an input. 
 * If the score is 60 or above, the program should print "Passed". In all other cases, it should print "Failed".*/
public class MarkingStudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your mark = ");
		int mark = scan.nextInt();
		int markingStudent = StudentsGrade(mark);
		if(markingStudent >=60) {
			System.out.println("Passed = "+mark);
		}else {
			System.out.println("Failed = "+mark);
		}scan.close();
	}

	static int StudentsGrade(int mark) {
		// TODO Auto-generated method stub
		return mark;
	}

}

// output
/*
 * Enter your mark = 
75
Passed = 75

Enter your mark = 
55
Failed = 55

*/
