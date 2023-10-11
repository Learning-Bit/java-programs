package com.kn.ifelse;
/*Problem Statement 18: You are creating a program for a learning management system 
that checks the performance 
 * of a student in three tests. The program should accept scores of three tests. 
 * If all the scores are above 50, 
 * it should print "Passed All". If not, and if the average score is above 50, 
 * it should print "Average Score Passed". */
import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 averageScore();
		
	}

	private static void averageScore() {
		Scanner scan = new Scanner(System.in);
		int Test1,Test2,Test3;
		System.out.println("Enter your test1 = ");
		Test1= scan.nextInt();
		System.out.println("Enter your test2 = ");
		Test2 = scan.nextInt();
		System.out.println("Enter your test3 = ");
		Test3 = scan.nextInt();
		int avg = (Test1+Test2+Test3)/3;
//		int total = avg%3;
		if(Test1>=50&&Test2>=50&&Test3>=50) 
		{
			System.out.println("Passed All -->"+"Test1 = "+Test1+" Test2 = "+Test2+" Test3 = "+Test3);
//			
		}else if(avg>=50) 
			{
			System.out.println("Average Score = "+avg);
		}
		else {
			System.out.println("Better Luck Next Time");
		}
		scan.close();
		
	}
}

//Output


/*Enter your test1 = 
50
Enter your test2 = 
30
Enter your test3 = 
90
Average Score = 56

Enter your test1 = 
50
Enter your test2 = 
50
Enter your test3 = 
50
Passed All -->Test1 = 50 Test2 = 50 Test3 = 50


*/