package com.kn.forpatterns;

public class PatterDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print(i);
				}
			}
			System.out.println(" ");
		}

	}

}
