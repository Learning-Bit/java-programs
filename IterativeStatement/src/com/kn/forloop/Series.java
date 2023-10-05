package com.kn.forloop;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		double Series = findSeries();
		System.out.println("series = "+Series);
	}

	static double findSeries() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the series");
		int num= scan.nextInt();
		scan.close();
		double sum = 0.0;
		double i =1;
		while(i<=num) {
			sum = sum + 1/i;
			i++;
		}
		return sum;

		
		
	}

}
