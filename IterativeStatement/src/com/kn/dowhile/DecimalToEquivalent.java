package com.kn.dowhile;
//WATP to convert a decimal value into into equivalent binary value
import java.util.Scanner;

public class DecimalToEquivalent {

	public static void main(String[] args) {
		FindBinaryValue();
	}

	 static void FindBinaryValue() {
		 int binary =0;
		 int pValue =1;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your Number = ");
		 int num = scan.nextInt();
//		 int temp = num;
		 
		 while(num>0){
			 int r = num %2;
			 binary =binary+pValue*r;
			 pValue=pValue *10;
			 num = num/2;
		 }
		 System.out.println(binary);
		 scan.close();
	}

}
