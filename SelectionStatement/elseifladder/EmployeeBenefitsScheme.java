package com.kn.elseifladder;
/*Problem Statement 31: You're designing a program for an employee benefits scheme. 
 * The program should check whether an employee is eligible for a bonus based on their years of service and monthly 
 * targets met. The program should take years of service and monthly targets met as inputs. An employee is eligible
 *  for a bonus if they have more than 3 years of service and have met more than 6 monthly targets.
 *   If eligible, it should print "Bonus Eligible".*/
import java.util.Scanner;

public class EmployeeBenefitsScheme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeBenefits();

	}

	static void EmployeeBenefits() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your services = ");
		int services = scan.nextInt();
		System.out.println("Enter your Target = ");
		int target = scan.nextInt();
		
		if(target>=6) {
			if(services>=3) 
			{
				System.out.println("The Candidate Should be Eligible for a bonus ---> "+"target = "+target+" services = "+services);
			}else 
			{
				System.out.println("your Suitabale under the target = "+target+" not as services set = "+services);
			}
		}else if(services>=3) {
			
			if(target>=6) {
				System.out.println("The Candidate Should be Eligible for a bonus ---> "+"target = "+target+" services = "+services);
			}else 
			{
				System.out.println("your Suitabale under the services = "+services+" not as target set = "+target);
			}
		}
		else {
			System.out.println("Sorry your not Eligible for a bonus");

		}scan.close();
		
	}

}

// output
/*Enter your services = 
5
Enter your Target = 
8
The Candidate Should be Eligible for a bonus ---> target = 8 services = 5

Enter your services = 

8
Enter your Target = 
2
your Suitabale under the services = 8 not as target set = 2

Enter your services = 

3
Enter your Target = 
5
your Suitabale under the services = 3 not as target set = 5

*/
