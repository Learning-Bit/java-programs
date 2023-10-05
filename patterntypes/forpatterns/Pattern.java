package com.kn.forpatterns;
// WAJP to display ******* 
/* [******* 
*******] */
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPatterns();
		

	}

	 static void FindPatterns() {
		 for(int i =1;i<=3;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");

			 }
			 System.out.println(" ");
		 }
		
	}

}


//OUTPUT
/* 
******* 
******* 
******* 
*/
