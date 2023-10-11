package com.kn.elseifladder;
/*
 * Problem Statement 11: As part of a school assignment, you are creating a program to categorize integers. 
 * The program should take an integer as input. If the integer is less than 0, it should print "Negative".
 *  If the integer is greater than 0, it should print "Positive". If the integer is exactly 0, it should print "Zero".
 * */
import java.util.Scanner;

public class AssignmentGrading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Assignment Marks ");
		int marks = scan.nextInt();
		scan.close();
		int value= Grading(marks);
		if (value>0) {
			System.out.println("Your Assignment marks is positive = "+value);
		}else if(value==0) {
			System.out.println(" Your Assignment marks is zero = "+value);
		}
		else if(value<0) {
			System.out.println(" Your Assignment marks is negative = "+value);
		}
		else {
			System.out.println(" Sorry Try agian later-----");
		}
	}

	 static int Grading(int marks) {
		// TODO Auto-generated method stub
		return marks;
	}
}



/*Enter the Assignment Marks 
45
Your Assignment marks is positive = 45

Enter the Assignment Marks 
0
 Your Assignment marks is zero = 0
 
Enter the Assignment Marks 

-98956
 Your Assignment marks is negative = -98956

*/


