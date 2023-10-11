package com.kn.ifelse;
/*
 * Problem Statement 10: Imagine you're creating a simple number categorization program. The program should take a number as input. If the number is a multiple of 5, the program should print "Multiple of 5". In all other cases, it should print "Not a multiple of 5".
 * */
import java.util.Scanner;

public class MultiplicationOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int number = scan.nextInt();
		scan.close();
		int product=MulOfFive(number);
		if (product%5==0) {
			System.out.println("The Given Number is Multiply by 5 = "+product);
		}else {
			System.out.println("The Given Number is Not a Multiply of 5 = "+product);
		}
	}

	 static int MulOfFive(int number) {
		// TODO Auto-generated method stub
		return number;
	}

}



/*Output
Enter the Number 
25
The Given Number is Multiply by 5 = 25
Enter the Number 
23
The Given Number is Not a Multiply of 5 = 23

*/
