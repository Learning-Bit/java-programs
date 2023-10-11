package com.kn.elseifladder;


import java.util.Scanner;

/*Problem Statement 5: You're creating a typing software that helps users improve their typing skills. 
 * One part of the software focuses on capital letters. Your program should accept a character as input. 
 * If the character is a capital letter, the program should print "Capital letter detected".
 */
public class CaptialLetterDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character = ");
		char c = scan.next().charAt(0);
		char letterdetect = CaptialLetter(c);
		if (letterdetect >= 65 && letterdetect <= 90) {
			System.out.println("Capital Letter Detect = "+letterdetect);
		}else if (letterdetect >=97 && letterdetect <= 122){
			System.out.println("This Small  Letter  = "+letterdetect);

		}else if(letterdetect >= 32 && letterdetect <=64) {
			System.out.println("These are special character or Digits = "+letterdetect);
		}
		else {
			System.out.println("Sorry...improve your skills..");
		}
		scan.close();
		
	}

	static char CaptialLetter(char c) {
		// TODO Auto-generated method stub
		return c;
	}

}




// output
/*Enter the character = 

E
Capital Letter Detect = E

Enter the character = 
o
This Small  Letter  = o

Enter the character = 
*
These are special character or Digits = *

Enter the character = 
9
These are special character or Digits = 9




*/