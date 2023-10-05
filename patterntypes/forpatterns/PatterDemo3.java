package com.kn.forpatterns;
// in the pattern we need to put the value of char and the print it.
public class PatterDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print((char)(j+64));
//				System.out.println(" ");
//				System.out.print((char)(i+64));

			}
			System.out.println(" ");
		}

	}

}
