package com.kn.switchcase;
/*Problem Statement 28: You're developing a restaurant app which helps the customers to know 
 * the special dish of the WeekInNumber. The application should take a WeekInNumber of the week as input 
 * (1 for MonWeekInNumber, 2 for TuesWeekInNumber, etc.) and outputs the special dish of that WeekInNumber. 
 * Consider the following dishes: MonWeekInNumber - Pasta, TuesWeekInNumber - Tacos, WednesWeekInNumber - Sushi, 
 * ThursWeekInNumber - Steak, FriWeekInNumber - Pizza, SaturWeekInNumber - Lobster, SunWeekInNumber - Brunch.*/
import java.util.Scanner;

public class WeekSpecials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		String WeekInNumber = scan.next();
		System.out.println("Enter the WeekWeekInNumbers in a Number");
		int WeekInNumber = scan.nextInt();
		int dishOfWeek = WeekDays(WeekInNumber);
		switch(dishOfWeek) {
		case 1:
			System.out.println(dishOfWeek+": Pasta");
			break;
		case 2:
			System.out.println(dishOfWeek+": Tacos");
			break;
		case 3:
			System.out.println(dishOfWeek+": Sushi");
			break;
		case 4:
			System.out.println(dishOfWeek+": Steak");
			break;
		case 5:
			System.out.println(dishOfWeek+": Pizza");
			break;
		case 6:
			System.out.println(dishOfWeek+": Lobster");
			break;
		case 7:
			System.out.println(dishOfWeek + ": Brunch");
			break;
			default:
				System.out.println("Not in a weeks");
		}
//		if(dishOfWeekInNumbers.equals("MonWeekInNumber")) {
//			System.out.println("Pasta");
//		}
		scan.close();
	}

	static int WeekDays(int WeekInNumber) {
		// TODO Auto-generated method stub
		return WeekInNumber;
	}

}


//output

/*Enter the WeekWeekInNumbers in a Number
4
4: Steak

Enter the WeekWeekInNumbers in a Number

8
Not in a weeks

*/
