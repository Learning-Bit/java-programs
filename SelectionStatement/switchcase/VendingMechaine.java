package com.kn.switchcase;
/*Problem Statement 25: You are developing a software for a vending machine. 
 * The program should take a product code as input and output the product name. 
 * The product codes are 1 for "Coke", 2 for "Pepsi", 3 for "Water", 4 for "Juice", 5 for "Tea".*/
import java.util.Scanner;

public class VendingMechaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the code = ");
		int code = scan.nextInt();
		int value = vendingMechine(code);
		switch (value) {
		case 1:
			System.out.println("--> coke <--");
			break;
		case 2:
			System.out.println("--> Pepsi <--");
			break;
		case 3:
			System.out.println("--> Water <--");
			break;
		case 4:
			System.out.println("--> Juice <--");
			break;
		case 5:
			System.out.println("--> Tea <--");
			break;
			default:
				System.out.println("...> Sorry Not in the Vending Mechiane <....");
		}
		scan.close();

	}

	static int vendingMechine(int code) {
		// TODO Auto-generated method stub
		return code;
	}

}


// output

/*Enter the code = 

1
--> coke <--
Enter the code = 
6
...> Sorry Not in the Vending Mechiane <....

*/