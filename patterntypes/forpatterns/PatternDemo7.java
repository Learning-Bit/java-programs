package com.kn.forpatterns;
// To Print the value of the char in row and colum wise.
/*output will be display :
 * EDCBA 
EDCBA 
EDCBA 
EDCBA 
EDCBA*/
public class PatternDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i= 1;i<=5;i++) {
			for(j=5;j>=1;j--) {
				System.out.print((char)(j+64));
			}
			System.out.println(" ");
		}


	}

}
