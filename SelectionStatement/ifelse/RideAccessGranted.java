package com.kn.ifelse;
/*
 * Problem Statement 2: Imagine you're designing the software for a new extreme roller coaster ride in an amusement park. The roller coaster has an age restriction - only individuals 12 years or older are allowed on the ride. Your program should take as input the age of a visitor. If the age is 12 or above, the program should print "Ride access granted".
 */
import java.util.Scanner;

public class RideAccessGranted {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age to Ride the roller Goster....");
		int ChildAge = scan.nextInt();
		scan.close();
		RiderAccess(ChildAge);
	}

	 static void RiderAccess(int childAge) {
		// TODO Auto-generated method stub
		 if(childAge >=12) {
			 System.out.println("Access Granted = "+childAge+":)...");
		 }
		 else {
			 System.out.println("Access Not Granted = "+childAge+"👍👍...");

		 }
	}

}




//output
/*
 * Enter Your Age to Ride the roller Goster....
45
Access Granted = 45:)...
Enter Your Age to Ride the roller Goster....
10
Access Not Granted = 10??...

*/
 