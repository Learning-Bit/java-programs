package com.kn.switchcase;
/*Problem Statement 35: You're building an interactive weather application. 
 * The application takes a weather condition as input (1 for Sunny, 2 for Rainy, 3 for Snowy, 4 for Windy) 
 * and suggests an activity. Consider*/
import java.util.Scanner;

public class WeatherCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weather condition = ");
		int num = scan.nextInt();
		int condition = ClimaticName(num);
		switch(condition) {
		case 1:
			System.out.println("Sunny");
			break;
		case 2:
			System.out.println("Rainy");
			break;
		case 3:
			System.out.println("Snowy");
			break;
		case 4:
			System.out.println("Windy");
			break;
		default:
				System.out.println("Not a Weather ");
		}
		scan.close();

	}

	static int ClimaticName(int num) {
		// TODO Auto-generated method stub
		return num;
	}

}

//output

/*Enter the weather condition = 
2
Rainy

Enter the weather condition = 

5
Not a Weather 


*/
