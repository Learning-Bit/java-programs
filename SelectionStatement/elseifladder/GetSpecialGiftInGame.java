package com.kn.elseifladder;

import java.util.Scanner;

/*Problem Statement 32: You're creating a game that includes a feature to 
 * check if a player has found a special item in the game. The special item is found 
 * if the player has more than 10 gold coins, the player's level is above 5, and the player has a special key. 
 * The program should first check if the player has more than 10 gold coins and then if the player's level is above 5. 
 * If both conditions are met, the program should check if the player has the special key. If all conditions are met, 
 * it should print "Special Item Found".*/
public class GetSpecialGiftInGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FountSpecialItem();
	}

	static void FountSpecialItem() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your GodCoin = ");
		int GoldCoin = scan.nextInt();
		System.out.println("Enter your PlayerLevel = ");
		int PlayerLevel = scan.nextInt();
		
		if(GoldCoin>10) {
			if (PlayerLevel>5)
			{
				System.out.println("The Player has an Special Item Found  ---> "+"PlayerLevel = "+PlayerLevel+" GodCoin = "+GoldCoin);
			}else 
			{
				System.out.println("your Suitabale under the PlayerLevel = "+PlayerLevel+" not as GoldCoin = "+GoldCoin);
			}
		}else if(PlayerLevel>5) 
		{
			if(GoldCoin>10) 
			{
				System.out.println("The Player has an Special Item Found ---> "+"target = "+GoldCoin+" services = "+PlayerLevel);
			}else 
			{
				System.out.println("your Suitabale under the GoldCoin = "+GoldCoin+" not as PlayerLevel = "+PlayerLevel);
			}
		}else
		{
		System.out.println("Sorry your not Eligible for a bonus");
		} 
		scan.close();
		}
	}


// output

/*Enter your GodCoin = 
12
Enter your PlayerLevel = 
7
The Player has an Special Item Found  ---> PlayerLevel = 7 GodCoin = 12
*/
