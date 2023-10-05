package com.kn.patternlearning;

public class PatternTwo {

	public static void main(String[] args) {
		int i,j;
		for(i=5;i>=1;i--) {
			for(j=5;j>=1;j--) {
				if(j<=(6-i)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");

		}
	}

}


//output
/*
     * 
   ** 
  *** 
 **** 
***** 

 */