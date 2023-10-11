package com.kn.ifelse;

import java.util.Scanner;

/*Problem Statement 3: You're helping design the software for a retail store's automatic checkout system.
 *  There's a discount policy in place for purchases exceeding $200. Your Java program should take as input the 
 *  total purchase amount. If the total amount is more than $200, the program should print "Discount of 20% applicable".*/
public class PurchaseDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int amt = scan.nextInt();
		int discount = totalAmount(amt);
		if(discount>=200) {
			System.out.println("Discount of 20% applicable For ="+discount);
		}else {
			System.out.println("Discount of 20% not applicable For ="+discount);
		}
		scan.close();

	}

	static int totalAmount(int amt) {
		// TODO Auto-generated method stub
		return amt;
	}

}

//output 
/*250
Discount of 20% applicable For =250

150
Discount of 20% not applicable For =150

*/
