package com.kn.patternlearning;

public class BinaryPattern {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			
			for (j = 1; j <= 5; j++) {
				if(j<=i) {
					if((j+i)%2 ==1){
						System.out.print("0");
//						System.out.print(j);
//						System.out.print(" ");
					} else {
						System.out.print("1");
					}
				}
				}
				
			System.out.println(" ");

		}
	}

}
