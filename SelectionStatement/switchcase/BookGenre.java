package com.kn.switchcase;
/*Problem Statement 29: You're designing a program for a library which provides information about 
 * different book genres. The program should take a genre number as input and print the corresponding genre. 
 * Consider the following genres: 1 - Fiction, 2 - Non-Fiction, 3 - Fantasy, 4 - Mystery, 5 - Biography.*/
import java.util.Scanner;

public class BookGenre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Genre Number 1 to 5 = ");
		int genreNum = scan.nextInt();
		int DifferentGenre = BookGenreNumber(genreNum);
		switch(DifferentGenre) {
		case 1:
			System.out.println("Fiction = "+DifferentGenre);
			break;
		case 2:
			System.out.println("Fiction = "+DifferentGenre);
			break;
		case 3:
			System.out.println("Fiction = "+DifferentGenre);
			break;
		case 4:
			System.out.println("Fiction = "+DifferentGenre);
			break;
		case 5:
			System.out.println("Fiction = "+DifferentGenre);
			break;
		default:
				System.out.println("Not in Genre");
		}scan.close();

	}

	static int BookGenreNumber(int genreNum) {
		// TODO Auto-generated method stub
		
		return genreNum;
	}

}


// output

/*Enter the Genre Number 1 to 5 = 

4
Fiction = 4

Enter the Genre Number 1 to 5 = 
7
Not in Genre

*/
