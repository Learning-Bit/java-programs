package com.kn.patternlearning;
// WAJP the pattern program and create a given pattern 
/*
********* 
 *******  
  *****   
   ***    
    *     
   ***    
  *****   
 *******  
********* 
 */
public class XPatternLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k=0;
		for (i = 1; i <= 9; i++) {
			if (i <= 5) {
				k++;
			} else {
				k--;
			}
			for (j = 1; j <= 9; j++) {
				if (j>=k && j<=10-k){
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




//Output


/*
********* 
 *******  
  *****   
   ***    
    *     
   ***    
  *****   
 *******  
********* 
*/
