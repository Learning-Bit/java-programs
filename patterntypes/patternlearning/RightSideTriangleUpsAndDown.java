package com.kn.patternlearning;
// WAJP using pattern and create a pattern 
/*
 *     
**    
***   
****  
***** 
****  
***   
**    
*     
*/
public class RightSideTriangleUpsAndDown {

	public static void main(String[] args) {
		int i, j, k=0;
		for (i = 1; i <= 9; i++) {
			if (i <= 5) {
				k++;
			} else {
				k--;
			}
			for (j = 1; j <= 5; j++) {
//				if (j==k||j==1)
				if(j<=k)
				{
					System.out.print("*");
//					System.out.print(j);
//					System.out.print(" ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");

		}

	}

}
/*
 *     
**    
* *   
*  *  [if(j==k||j==1)]
*   * 
*  *  
* *   
**    
*  */
