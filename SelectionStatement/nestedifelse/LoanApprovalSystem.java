package com.kn.nestedifelse;

import java.util.Scanner;

/*
 * Problem Statement 15: You are creating a program for a loan approval system. 
 * The eligibility for a loan is based on both age and income. 
 * A person is eligible if they are at least 18 years old and their annual income is over $40,000.
 *  Write a Java program that accepts age and income as input.
 *   If both conditions are met, the program should print "Loan Approved". 
 */
public class LoanApprovalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age = ");
		int age = scan.nextInt();
		System.out.println("Enter your Income");
		int income = scan.nextInt();
		if (age>=18) {
			if(income>=40000) {
				System.out.println("Loan Approval = "+income);
			}
			else {
				System.out.println("Not Approval = " + income);
			}
		}
		
		scan.close();
	}

}
//output
/*Enter Your Age = 
18
Enter your Income
250
Not Approval = 250
Enter Your Age = 

25
Enter your Income
2556545
Loan Approval = 2556545

*/
