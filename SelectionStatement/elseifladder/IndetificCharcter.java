package com.kn.elseifladder;
/*Problem Statement 12: You're designing a software that teaches young kids about different 
 * types of characters. The program should take a character as input. If it's a lowercase vowel, it should print "Lowercase Vowel". If it's an uppercase vowel, it should print "Uppercase Vowel". If it's a lowercase consonant, it should print "Lowercase Consonant". If it's an uppercase consonant, it should print "Uppercase Consonant". If it's a digit,
 *  it should print "Digit". For all other characters, it should print "Special Character".*/
import java.util.Scanner;

public class IndetificCharcter {

	public static void main(String[] args) {
		indentifcCharcter();
		
		
	}

	static void indentifcCharcter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Charcter = ");
		char c = scan.next().charAt(0);
		char a=32;
		char b=64;
		if(c=='a' ||c =='i'|| c=='e'|| c=='o'|| c=='u') {
			System.out.println("Given Charcter is Lower Case Vowel = "+c);
		}
		else if(c=='A' ||c =='I'|| c=='E'|| c=='O'|| c=='U') 
		{
			System.out.println("Given Charcter is Lower Case Vowel = "+c);
		}
		else if(c==a||c<=b) 
		{
			System.out.println("It a Special Charcter or Digits  = "+c);
		}
		else {
			System.out.println("Its not a Vowel Charcter...");
		}
		scan.close();
	}

}




/* output
 * 
 * Enter the Charcter = 
q
It a Special Charcter = q
Enter the Charcter = 
O
Given Charcter is Lower Case Vowel = O
Enter the Charcter = 

*
It a Special Charcter = *

Enter the Charcter = 

K
Its not a Vowel Charcter...




*/

