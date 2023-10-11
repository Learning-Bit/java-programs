package com.kn.ifelse;
/*Problem Statement 8: You are creating a program for a luxury hotel. 
 * The hotel provides senior citizens a special discount on room bookings. 
 * The program should take age as input. If the age is 60 or above, the program should print "Senior Citizen Discount Applicable".
 *  Otherwise, it should print "Regular Charges Applicable".*/
import java.util.Scanner;

public class DiscountForSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Purchasing Amount....");
		int amt = scan.nextInt();
		scan.close();
		double SalesPurchase = Discount(amt);
		if(SalesPurchase > 200) {
		System.out.println("Discount of 20% applicable = "+SalesPurchase);
		}
		else {
			System.out.println(" Discount of 20%  not applicable = " +SalesPurchase);

		}
	}

	static int Discount(int amt) {
		// TODO Auto-generated method stub
		return amt;
	}

}


/* output
Enter Your Purchasing Amount....
2000
Discount of 20% applicable = 2000.0
Enter Your Purchasing Amount....

196
 Discount of 20%  not applicable = 196.0

*/