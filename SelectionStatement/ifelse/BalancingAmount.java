package com.kn.ifelse;

import java.util.Scanner;

/*Problem Statement 7: You're developing a software tool for a financial institution.
 *  The software should be able to validate if the input balance amount is positive or negative.
 *   Write a Java program that takes a balance amount as input. 
 *   If the amount is less than 0, the program should print "Negative Balance".
 *    Otherwise, it should print "Positive Balance".*/
public class BalancingAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Amount in the Account = ");
		int amt = scan.nextInt();
		ValidateAmount(amt);
		scan.close();
		
	}

	 static void ValidateAmount(int amt) {
		// TODO Auto-generated method stub
		if(amt>0) {
			System.out.println("The Give Account has an  "+ amt+" is Positive Balance");
		}else {
			System.out.println("The Give Account has an  "+ amt+" is Negative Balance");

		}
	}

}


// output

/*Enter your Amount in the Account = 
255
The Give Account has an  255 is Positive Balance

Enter your Amount in the Account = 

-2254
The Give Account has an  -2254 is Negative Balance


*/
