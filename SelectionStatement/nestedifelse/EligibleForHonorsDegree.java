package com.kn.nestedifelse;

import java.util.Scanner;

/* program statement :[20] You're creating a software for a university that determines whether a student is eligible for an honors degree.
 *  The program should take the student's GPA and the number of courses completed as input.
 *   A student is eligible for an honors degree if they have a GPA of more than 3.5 and have completed more than 120 credits.
 *    If the student has the required GPA, it should then check the number of courses completed.
 *     If both conditions are met, it should print "Eligible for Honors Degree".*/
public class EligibleForHonorsDegree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		eligibleForHonorDegree();

	}

	static void eligibleForHonorDegree() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your GPA = ");
		double GPA = scan.nextDouble();
		System.out.println("Enter your Completed Credits  = ");
		int numCourse = scan.nextInt();
		if(GPA>=3.5) {
			if(numCourse>=120) {
				System.out.println("Eligible for Honors Degree");
			}else {
				System.out.println("You have a GPA = "+GPA+" , but not Completed the expected Credits = "+numCourse);
			}
		}else {
			System.out.println("----> Your Not Eligible for Honor Degree ---->");
		}
		scan.close();
	}

}




//output
/*Enter your GPA = 

4
Enter your Completed Credits  = 
152
Eligible for Honors Degree

Enter your GPA = 
4
Enter your Completed Credits  = 
100
You have a GPA = 4.0 , but not Completed the expected Credits = 100

Enter your GPA = 

3
Enter your Completed Credits  = 
50
----> Your Not Eligible for Honor Degree ---->


*/