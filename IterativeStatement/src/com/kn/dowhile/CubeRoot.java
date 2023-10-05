package com.kn.dowhile;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cubeRoot();

	}

	 static void cubeRoot() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the num = ");
		 double num = scan.nextDouble();
//		 double  root;
//		 do {
//			 root = ;
			 System.out.println("Cube Root of "+ num +"given Number is = "+Math.cbrt(num));


//		 }while(num>0);


		 scan.close();
	}

}
