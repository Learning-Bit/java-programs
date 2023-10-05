package com.kn.forpatterns;
// WAJP for pattern to print the value as the pattern will give like  
/* [55555 
4444 
333 
22 
1 ]
[***** 
**** 
*** 
** 
*] 
 */
public class PatternDemo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=5;i>=1;i--) {
			for(j=1;j<=5;j++) {
				if(i>=j) {
					//System.out.print("*");// if you want to print the *
					//System.out.print(i);//if you want to print the value of the i
					System.out.print(i);//if you want to print the value of the j
				}
			}
			System.out.println(" ");
		}

	}

}


// Output
/*
***** 
**** 
*** 
** 
* 
*/