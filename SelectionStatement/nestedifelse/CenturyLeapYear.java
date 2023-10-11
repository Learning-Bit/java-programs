
package com.kn.nestedifelse;
//Problem Statement 14: You're working on a calendar application that provides users with interesting facts about years. The program should first check if the input year is a leap year. If it is, the program should further check if it belongs to the 21st century. If both conditions are true, it should print "21st Century Leap Year". If only the first condition is true, it should print "Leap Year". import java.util.Scanner;

import java.util.Scanner;

public class CenturyLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Leap Year = ");
		int year = scan.nextInt();
//		boolean isleapyear= true;
		if(year %4 ==0) {
				if(year >=2000 )
					
				{
					System.out.println("Is a Century Leap Year "+year);
				}
				else {
					System.out.println("Is a leap Year but not a century = "+year);
				}
			}else {
				System.out.println("Is not a leap year"+year);


			}
			scan.close();
		}
	
		
	}





// output
/* 
 * 50221
It not a leap year50221

2024
Is a leap Year but not a century = 2024

3000
Is not a leap year3000
Is a leap Year but not a century = 3000


*/

