package com.kn.patternlearning;

public class ThreeDimensionalPattern {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=9;j++) {
				if((j!=(7-i))&&(j>(4+i))) {
					System.out.print("*");
//					System.out.print(j);
//					System.out.print(" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");

		}
	}

}
