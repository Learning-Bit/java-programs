package com.kn.switchcase;
/*Problem Statement 26: You are developing a weekday management software for a company.
 *  The program should take a weekday number (1 for Monday, 2 for Tuesday, and so on till 7 for Sunday) 
 *  and print the corresponding day.*/
import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the day in number");
		int number = scan.nextInt();
		int days = weeekDays(number);
		switch(days) {
		case 1:
			System.out.println("Monday = "+days);
			break;
		case 2:
			System.out.println("Tuesday = "+days);
			break;
		case 3:
			System.out.println("Wensday = "+days);
			break;		
		case 4:
			System.out.println("Thursday = "+days);
			break;
		case 5:
			System.out.println("Friday = "+days);
			break;
		case 6:
			System.out.println("saturday = "+days);
			break;
		case 7:
			System.out.println("Sunday = "+days);
			break;
			default:
				System.out.println("----* Not a WeekDays *----");
		}
		scan.close();

	}

	private static int weeekDays(int number) {
		// TODO Auto-generated method stub
		return number;
	}

}



//output
/*enter the day in number

1
Monday = 1

enter the day in number

8
----* Not a WeekDays *----

*/
