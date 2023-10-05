package com.kn.patternlearning;

public class PatternTwoDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j>=(6-i))
				//if((i+j)>=6) 
					{
//					System.out.print(i);
//					System.out.print(j);
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


/*
 ----5 
---44 
--333 
-2222 
11111 


----1 
---21 
--321 
-4321 
54321 

----1 
---22 
--333 
-4444 
55555

----5 
---45 
--345 
-2345 
12345

*/
