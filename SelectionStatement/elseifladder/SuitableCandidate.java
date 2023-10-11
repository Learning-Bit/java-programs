/*Problem Statement 19: You're designing a program for a recruitment agency that determines whether a
 *  candidate is suitable for a job role. The program should take years of experience and the candidate's skill 
 *  level as inputs. A candidate is suitable if they have more than 5 years of experience and a skill level above 7. 
 *  If the candidate has the required experience, it should then check their skill level. If both conditions are met,
 *   it should print "Suitable Candidate".*/
package com.kn.elseifladder;

import java.util.Scanner;

public class SuitableCandidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		candidateSkill();
	}

	static void candidateSkill() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Experience = ");
		int experience = scan.nextInt();
		System.out.println("Enter your skill = ");
		int skills = scan.nextInt();
		
		if(skills>=7) {
			if(experience>=5) 
			{
				System.out.println("The Candidate Should be Suitable for this job ---> "+"skills = "+skills+" Experience = "+experience);
			}else 
			{
				System.out.println("your Suitabale under the skills = "+skills+" not as experience set = "+experience);
			}
		}else if(experience>=5) {
			
			if(skills>=7) {
				System.out.println("The Candidate Should be Suitable for this job ---> "+"skills = "+skills+" Experience = "+experience);
			}else 
			{
				System.out.println("your Suitabale under the experience = "+experience+" not as skills set = "+skills);
			}
		}
		else {
			System.out.println("Sorry your not suitable for this job");

		}scan.close();
		
	}

}


// output
/*Enter your skill = 

4
Enter your Experience = 
8
your Suitabale under the experience = 8 not as skills set = 4
Sorry your not suitable for this job


Enter your Experience = 
8
Enter your skill = 
8
The Candidate Should be Suitable for this job ---> skills = 8 Experience = 8

Enter your Experience = 
4
Enter your skill = 
4
Sorry your not suitable for this job



*/