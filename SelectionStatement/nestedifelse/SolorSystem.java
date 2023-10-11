package com.kn.nestedifelse;
/*Problem Statement 33: You're designing an application for space enthusiasts that provides information about the solar system.
 *  The application should take a planet's name as input and outputs its order from the Sun. Consider the order: 
 *  Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune.*/
import java.util.Scanner;

public class SolorSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solorSystem();
		
	}

	static void solorSystem() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Solor System Name = ");
		String name = scan.next();
		if(name.equals("Mercy")) {
			System.out.println("1 - "+name);
		}else if(name.equals("Venus")) {
			System.out.println("2 - "+name);
		}else if(name.equals("Earth")) {
			System.out.println("3 - "+name);
		}else if(name.equals("Mars")) {
			System.out.println("4 - "+name);
		}else if(name.equals("Jupiter")) {
			System.out.println("5 - "+name);
		}else if(name.equals("Saturn")) {
			System.out.println("6 - "+name);
		}else if(name.equals("Uranus")) {
			System.out.println("7 - "+name);
		}else if(name.equals("Neptune")) {
			System.out.println("8 - "+name);
		}
		else {
			System.out.println("It is not a SolorSystem");
		}
		scan.close();
		
	}

}

//output 

/*Enter the Solor System Name = 
Mercy
1 - Mercy

Enter the Solor System Name = 
priya
It is not a SolorSystem

*/
