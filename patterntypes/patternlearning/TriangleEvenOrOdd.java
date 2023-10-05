package com.kn.patternlearning;

public class TriangleEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=5;i++) {
			k=1;
			for(j=1;j<=9;j++) {
				if((j>=(7-i))&&(j<=(4+i))&& k==1) {
					System.out.print("*");
//					System.out.print(j);
					k=0;
//					System.out.print(" ");
				}else {
					System.out.print(" ");
					k=1;
				}
			}
			System.out.println(" ");
		}

		
	}
}


