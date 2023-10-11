package com.kd.romanNumber;

import java.util.Scanner;

public class NumberCovertIntoRomananNumber {
	public String covertIntoRomanNumber(String [] input,int[]arr) {
		StringBuffer sb=new StringBuffer();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to convert romanNumber");
		int num =scan.nextInt();
		for(int i=0;i<input.length;i++) {
			while(num>=arr[i]) {
				num = num-arr[i];
				sb.append(input[i]);
			}
		}
		scan.close();

		return sb.toString();
	}
}
