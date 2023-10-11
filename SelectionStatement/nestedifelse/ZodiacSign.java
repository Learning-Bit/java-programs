package com.kn.nestedifelse;

import java.util.Scanner;

/*Problem Statement 34: You are creating a game where players choose their characters based on characteristics associated 
 * with Zodiac signs. The program should take a Zodiac sign as input and print the characteristic associated with that 
 * Zodiac sign. Consider the following characteristics: Aries - Adventurous, Taurus - Dependable, Gemini - Expressive, 
 * 
 * Cancer - Intuitive, Leo - Passionate, Virgo - Analytical, Libra - Diplomatic, Scorpio - Determined, Sagittarius - 
 * Philosophical, Capricorn - Organized, Aquarius - Original, Pisces - Compassionate.*/
public class ZodiacSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zodiacSign();
	}

	static void zodiacSign() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Zodiac Sign Name = ");
		String name = scan.next();
		if(name.equals("Aries")) {
			System.out.println("Adventurous - "+name);
		}else if(name.equals("Taurus")) {
			System.out.println("Dependable - "+name);
		}else if(name.equals("Gemini")) {
			System.out.println("Expressive - "+name);
		}else if(name.equals("Cancer")) {
			System.out.println("Intuitive - "+name);
		}else if(name.equals("Leo")) {
			System.out.println("Passionate - "+name);
		}else if(name.equals("Virgo")) {
			System.out.println("Analytical - "+name);
		}else if(name.equals("Libra")) {
			System.out.println("Diplomatic - "+name);
		}else if(name.equals("Scorpio")) {
			System.out.println("Determined - "+name);
		}else if(name.equals("Sagittarius")) {
			System.out.println("Philosophical - "+name);
		}else if(name.equals("Capricorn")) {
			System.out.println("Organized - "+name);
		}else if(name.equals("Aquarius")) {
			System.out.println("Original - "+name);
		}else if(name.equals("Pisces")) {
			System.out.println("Compassionate - "+name);
		}
		else {
			System.out.println("It is not a Zodiac Sign name");
		}
		scan.close();
		
		
	}

}


//output
/*Enter the Zodiac Sign Name = 
Cancer
Intuitive - Cancer

Enter the Zodiac Sign Name = 

priya
It is not a Zodiac Sign name

*/
