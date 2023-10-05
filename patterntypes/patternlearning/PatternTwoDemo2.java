package com.kn.patternlearning;
/* WAJP using pattern print the 
 * 11111 
-2222 
--333 
---44 
----5*/
public class PatternTwoDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i<=j) {
					System.out.print(i);
//					System.out.print(j);
				}else {
					System.out.print("-");
				}
			}
			System.out.println(" ");

		}
	}
 
}

// ouptut
/*
11111 
-2222 
--333 
---44 
----5
 * */
