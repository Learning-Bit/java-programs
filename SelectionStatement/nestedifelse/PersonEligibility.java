package com.kn.nestedifelse;

import java.util.Scanner;

/*Problem Statement 16: As a part of a traffic management system, 
 * you are creating a program that determines a person's eligibility for a driving license based on their age 
 * and eyesight score (out of 10). The program should take age and eyesight score as inputs. 
 * A person is eligible for a driving license if they are at least 18 years old and their eyesight score is 6 or above. 
 * If both conditions are met, the program should print "Driving License Eligible". */
public class PersonEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		personEligibility();

	}

	static void personEligibility() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age = scan.nextInt();
		System.out.println("Enter you Eyesight score = ");
		int eyesight = scan.nextInt();
		if (age > 18) 
		{
			if (eyesight >= 6) 
			{
				System.out.println("Your are Eligible for the Driving License"+"Age"+age+"eyesight = "+eyesight);
			}else 
			{
				System.out.println("Not Eligible for the Driving License ");
			}
			
		}else
		{
			System.out.println("Your Under eligible age = "+age);
		}
		scan.close();

	}

}



// output 
/*Enter your age = 
18
Enter you Eyesight score = 
8
Your are Eligible for the Driving LicenseAge18eyesight = 8
Enter your age = 

18
Enter you Eyesight score = 
5
Not Eligible for the Driving License 

Enter your age = 
5
Enter you Eyesight score = 
9
Your Under eligible age = 5


*/
