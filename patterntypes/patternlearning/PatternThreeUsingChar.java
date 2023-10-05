package com.kn.patternlearning;

public class PatternThreeUsingChar {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i>=j) {
//					System.out.print("*");
					System.out.print((char)(j+64));
//					System.out.print(i);
				}else {
					System.out.print("-");
				}
			}
			System.out.println(" ");

		}
	}

}


//output
/*
A---- 
AB--- 
ABC-- 
ABCD- 
ABCDE
 */
