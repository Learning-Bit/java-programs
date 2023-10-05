package com.kn.forloop;

import java.util.Scanner;

//WAJP to find the sum of[(1^2)+(2^2)+(3^2)+.....(n^2)]
public class FindSumOfSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findSumofSquareRoot();

	}

	 static void findSumofSquareRoot() {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your Number =");
		 int num = scan.nextInt();
		 int sum =0;
		 scan.close();
		 for(int i=1;i<=num;i++) {
			 sum = sum+i*2;
			 
		 }System.out.println(sum);

		
	}
	

}
