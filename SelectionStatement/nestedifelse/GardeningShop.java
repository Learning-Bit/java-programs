package com.kn.nestedifelse;
/*Problem Statement 30: You're creating an application for a gardening shop that provides advice on the type of 
 * fertilizer to use based on the type of plant. The application should take a plant type as input 
 * (1 for Roses, 2 for Sunflowers, 3 for Orchids, 4 for Cacti, 5 for Ferns) and suggest the type of fertilizer to use. 
 * Consider the following fertilizers: Roses - Rose Food, Sunflowers - All Purpose Fertilizer, Orchids - Orchid Fertilizer,
 *  Cacti - Cactus Mix, Ferns - Organic Compost.*/
import java.util.Scanner;

public class GardeningShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlantName();
	}

	 static void PlantName() {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number ");
			int num = scan.nextInt();
			String Rose ="rose";
			String Sunflower = "sunflower";
			String Orchids = "orchids";
			String Cacti = "cacti";
			String Ferns = "ferns";
			if(num ==1) {
				System.out.println(Rose+" - Rose Food ");
			}
			else if(num ==2) 
				{
					System.out.println(Sunflower+" -  All Purpose Fertilizer");
				}
			else if(num ==3) {
				System.out.println(Orchids +" - Orchid Fertilizer");
			}else if(num ==4) {
				System.out.println(Cacti +" - Cactus Mix");
			}else if(num ==5) {
				System.out.println(Ferns +" - Organic Compost");
			}else {
				System.out.println("Not Available");
			}
		scan.close();
	}

}


//output

/*Enter the number 
2
sunflower -  All Purpose Fertilizer

Enter the number 

6
Not Available

*/
