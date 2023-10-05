package com.kn.dowhile;
import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		evenSumOfNumber();
		
	}

	 static void evenSumOfNumber() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your Number = ");
		 int num = scan.nextInt();
		 int i=1;
		 int sum = 1;
		 do {
			 if(i%2==0) {
				 sum = sum*i;
//				 i++;
			 }
			 i++;	 
		 }while(i<=num);
		 System.out.println("Sum = "+sum);

		 scan.close();
	}
	 
	 

}
