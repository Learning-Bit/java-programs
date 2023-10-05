package com.kn.patterntypes;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0;
		for(i=1;i<=9;i++) {
			if(i<=5) {
				k++;
			}else {
				k--;
			}
			for(j=5;j>=1;j--) {
				if(j<=k) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
