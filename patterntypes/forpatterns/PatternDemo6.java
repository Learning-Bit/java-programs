package com.kn.forpatterns;
//To Print the value of the char in row and colum wise.
/*output will be display :
*EEEEE 
DDDDD 
CCCCC 
BBBBB 
AAAAA*/
public class PatternDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i= 5;i>=1;i--) {
			for(j=1;j<=5;j++) {
				System.out.print((char)(i+64));
			}
			System.out.println(" ");
		}

	}

}
