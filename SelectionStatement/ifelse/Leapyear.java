package com.kn.ifelse;
/*Problem Statement 9: You are creating a program for a calendar application. 
 * The application should be able to identify leap years. 
 * Your Java program should take a year as input and if the year is a leap year, the program should print "Leap Year". 
 * Otherwise, it should print "Non-Leap Year".*/
import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year = ");
		int year = scan.nextInt();
		leapYear(year);
		scan.close();

	}

	static void leapYear(int year) {
		// TODO Auto-generated method stub
		if(year%4 == 0) {
			System.out.println("This  is "+year+" Leap Year");
		}else {
			System.out.println("This  is "+year+" Not a Leap Year");

		}
		
	}

}


// output
/*Enter the year = 
200
This  is 200 Not a Leap Year

Enter the year = 

2000
This  is 2000 Leap Year


*/