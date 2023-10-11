package com.kn.switchcase;
/*Problem Statement 27: As part of a calendar application, you are creating a feature 
 * that displays the number of months in a month. 
 * The program should take a month number (1 for January, 2 for February, and so on till*/
import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the month in number = ");
		int number = scan.nextInt();
		int  months= MonthsNumber(number);
		switch(months) {
		case 1:
			System.out.println("January = "+months);
			break;
		case 2:
			System.out.println("Februray = "+months);
			break;
		case 3:
			System.out.println("March = "+months);
			break;		
		case 4:
			System.out.println("April = "+months);
			break;
		case 5:
			System.out.println("May = "+months);
			break;
		case 6:
			System.out.println("June = "+months);
			break;
		case 7:
			System.out.println("July = "+months);
			break;
		case 8:
			System.out.println("August = "+months);
			break;
		case 9:
			System.out.println("September = "+months);
			break;
		case 10:
			System.out.println("October = "+months);
			break;
		case 11:
			System.out.println("November = "+months);
			break;
		case 12:
			System.out.println("December = "+months);
			break;
		default:
				System.out.println("----* Not a Months  *----");
		}
		scan.close();
	}

	private static int MonthsNumber(int number) {
		// TODO Auto-generated method stub
		return number;
	}

}

//output

/*enter the month in number = 
7
July = 7

enter the month in number = 
13
----* Not a Months  *----


*/
