/*Problem Statement 22: You're designing a game that involves guessing the name of a polygon based on the number of sides.
 *  The program should take an integer representing the number of sides of a polygon (3 for triangle, 4 for quadrilateral,
 *   5 for pentagon, 6 for hexagon, 7 for heptagon, 8 for octagon) and print the polygon name.*/
package com.kn.switchcase;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter name of the polugpn based on teh number of sides = ");
		int sides = scan.nextInt();
		int names = nameOfPolygon(sides);
		switch (names) {
		case 3:
			System.out.println("Triangle has an  = "+names+" sides");
			break;
		case 4:
			System.out.println("Quadrilateral has an  = "+names+" sides");
			break;
		case 5:
			System.out.println("Pentagon has an  = "+names+" sides");
			break;
		case 6:
			System.out.println("Hexagon has an  = "+names+" sides");
			break;
		case 7:
			System.out.println("Heptagon has an  = "+names+" sides");
			break;
		case 8:
			System.out.println("Octagon  has an  = "+names+" sides");
			break;
		default:
			System.out.println("---->Not in List---->");
		}
		scan.close();
	}

	static int nameOfPolygon(int sides) {
		// TODO Auto-generated method stub
		return sides;
	}

}

// output
/*enter name of the polugpn based on teh number of sides = 
5
Pentagon has an  = 5sides

enter name of the polugpn based on teh number of sides = 

1
---->Not in List---->


*/



